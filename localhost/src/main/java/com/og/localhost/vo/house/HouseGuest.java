package com.og.localhost.vo.house;

public class HouseGuest {
	private int no;
	private int houseNo;
	private String type; // 커플, 혼자, 출장, 가족, 단체 등 게스트 유형

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public int getHouseNo() {
		return houseNo;
	}

	public void setHouseNo(int houseNo) {
		this.houseNo = houseNo;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

}
