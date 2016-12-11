package com.og.localhost.vo.house;

public class HouseSpace {
	private int no;
	private int houseNo;
	private String type; // 부엌, 주차장, 욕조, 수영장 등 숙소 공간

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
