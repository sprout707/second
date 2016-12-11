package com.og.localhost.util;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class MapGeocode {

	// 철진

	JSONObject jsonObj = null;

	public MapGeocode() {
	}

	public MapGeocode(String userAddr) {
		jsonObj = setAddr(userAddr);
	}

	// StringBuffer에 주소값을 담아 리턴해주는 메소드
	public JSONObject setAddr(String userAddr) {
		String clientId = "uqJG97hJ2iKOKdx8htrn";// 애플리케이션 클라이언트 아이디값";
		String clientSecret = "nbUDy09fTe";// 애플리케이션 클라이언트 시크릿값";
		
		if ("".equals(userAddr.trim())) {
			return null;
		}
		
		try {
			String addr = URLEncoder.encode(userAddr, "UTF-8");
			String apiURL = "https://openapi.naver.com/v1/map/geocode?query=" + addr;
			URL url = new URL(apiURL);
			HttpURLConnection con = (HttpURLConnection) url.openConnection();
			con.setRequestMethod("GET");
			con.setRequestProperty("X-Naver-Client-Id", clientId);
			con.setRequestProperty("X-Naver-Client-Secret", clientSecret);
			int responseCode = con.getResponseCode();
			BufferedReader br;
			if (responseCode == 200) { // 정상 호출
				br = new BufferedReader(new InputStreamReader(con.getInputStream()));
			} else { // 에러 발생
				br = new BufferedReader(new InputStreamReader(con.getErrorStream()));
			}
			String inputLine;
			StringBuffer response = new StringBuffer();
			while ((inputLine = br.readLine()) != null) {
				response.append(inputLine);
			}
			br.close();
			
			jsonObj = new JSONObject(response.toString());
			try {
				if(jsonObj.get("errorMessage") != null){
					System.out.println(jsonObj.get("errorMessage").toString());
					jsonObj = null;
					return null;
				}
			} catch (JSONException e) {
			}
			
			jsonObj = (JSONObject) jsonObj.get("result");
			int total = (Integer) jsonObj.get("total");
			if (total != 1) {
				// 좌표값 검색 결과가 여러개이거나 없을 경우에는 정확한 좌표를 리턴해줄수 없기 때문에
				// null 값을 리턴해 사용자가 직접 지도에서 설정하게 해야한다.
				System.out.println("주소가 정확하지 않습니다.");
				jsonObj = null;
				return null;
			}
			
			JSONArray jsonList = new JSONArray(jsonObj.get("items").toString());
			jsonObj = jsonList.getJSONObject(0);

			// x : 주소의 위도값
			// y : 주소의 경도값
			jsonObj = (JSONObject) jsonObj.get("point");

		} catch (Exception e) {
			System.out.println(e);
		}

		return jsonObj;
	}

	// 위도(x)를 리턴해주는 메소드
	public String getLatitude() {
		if (jsonObj == null) {
			// null이 리턴되면 사용자가 직접 지도에 위치를 지정하게 해야한다.
			return null;
		} else {
			return String.valueOf(jsonObj.get("x"));
		}
	}

	// 경도(y)를 리턴해주는 메소드
	public String getlongitude() {
		if (jsonObj == null) {
			// null이 리턴되면 사용자가 직접 지도에 위치를 지정하게 해야한다.
			return null;
		} else {
			return String.valueOf(jsonObj.get("y"));
		}
	}

	// 위도(x)를 리턴해주는 메소드
	public String getLatitude(String userAddr) {

		if (jsonObj == null) {
			jsonObj = setAddr(userAddr);
		}
		return String.valueOf(jsonObj.get("x"));
	}

	// 경도(y)를 리턴해주는 메소드
	public String getlongitude(String userAddr) {

		if (jsonObj == null) {
			jsonObj = setAddr(userAddr);
		}
		return String.valueOf(jsonObj.get("y"));
	}
}
