package com.og.localhost.vo.house;

public class HouseReview {
	private int no;
	private int houseNo;
	private int bookingNo;
	private int host_userNo;
	private int guest_userNo;
	private int score; // default 1점 , 체크제약 ( 1~5 점 )
	private String content; // 리뷰 내용
	private String regDate; // 작성일
	private int status; // default 1, ( 0이면 삭제 )

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

	public int getBookingNo() {
		return bookingNo;
	}

	public void setBookingNo(int bookingNo) {
		this.bookingNo = bookingNo;
	}

	public int getHost_userNo() {
		return host_userNo;
	}

	public void setHost_userNo(int host_userNo) {
		this.host_userNo = host_userNo;
	}

	public int getGuest_userNo() {
		return guest_userNo;
	}

	public void setGuest_userNo(int guest_userNo) {
		this.guest_userNo = guest_userNo;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getRegDate() {
		return regDate;
	}

	public void setRegDate(String regDate) {
		this.regDate = regDate;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

}
