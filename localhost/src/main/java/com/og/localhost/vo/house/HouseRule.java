package com.og.localhost.vo.house;

public class HouseRule {
	private int no;
	private int houseNo;
	private String type; // 유아, 어린이, 흡연가능, 반려동물 허용 등 숙소 규칙

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
