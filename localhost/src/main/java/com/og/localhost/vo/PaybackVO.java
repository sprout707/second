package com.og.localhost.vo;

public class PaybackVO {
	private int no;
	private int point; // 출금 신청한 금액
	private int userNo; // 출금 신청한 사용자 번호
	private int status; // 0이면 출금대기, 1이면 출금승인 (출금완료), -1이면 출금거절
	private String regDate; // 출금 신청일

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public int getPoint() {
		return point;
	}

	public void setPoint(int point) {
		this.point = point;
	}

	public int getUserNo() {
		return userNo;
	}

	public void setUserNo(int userNo) {
		this.userNo = userNo;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public String getRegDate() {
		return regDate;
	}

	public void setRegDate(String regDate) {
		this.regDate = regDate;
	}

}
