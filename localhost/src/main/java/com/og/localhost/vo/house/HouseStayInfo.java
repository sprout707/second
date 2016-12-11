package com.og.localhost.vo.house;

public class HouseStayInfo {
	private int no;
	private int houseNo;
	private int minStay; // 최소 1박이상, 최소 숙박 가능일
	private int maxStay; // 최대 숙박 가능일
	private String endDate; // 호스트가 설정한 숙박 예약 마감일
	private int inTime; // 입실시간
	private int outTime; // 퇴실시간

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

	public int getMinStay() {
		return minStay;
	}

	public void setMinStay(int minStay) {
		this.minStay = minStay;
	}

	public int getMaxStay() {
		return maxStay;
	}

	public void setMaxStay(int maxStay) {
		this.maxStay = maxStay;
	}

	public String getEndDate() {
		return endDate;
	}

	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}

	public int getInTime() {
		return inTime;
	}

	public void setInTime(int inTime) {
		this.inTime = inTime;
	}

	public int getOutTime() {
		return outTime;
	}

	public void setOutTime(int outTime) {
		this.outTime = outTime;
	}

}
