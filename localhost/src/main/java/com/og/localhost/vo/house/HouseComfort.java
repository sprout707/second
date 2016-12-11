package com.og.localhost.vo.house;

public class HouseComfort {
	private int no;
	private int houseNo;
	private String type; // 수건, 비누, 화장지, 세탁기, 샴푸 등 편의시설

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
