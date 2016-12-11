package com.og.localhost.vo;

public class BookingVO {
	private int no;
	private int totalPrice;
	private String checkIn;
	private String checkOut;
	private int commission; // 수수료금액
	private int houseNo; // 사용자가 예약한 숙소테이블 번호
	private int host_userNo; // 호스트 번호
	private int guest_userNo; // 게스트 번호
	private String regDate; // 예약한 날짜
	private int status; // 0이면 예약대기, 1이면 예약완료, -1이면 예약취소, 2이면 거래완료 (게스트가 체크인할때
								// 상태변화))
	private int matchNo; // 외래키, null 허용 ( null일시 매치 거부), 매치테이블 번호

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public int getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(int totalPrice) {
		this.totalPrice = totalPrice;
	}

	public String getCheckIn() {
		return checkIn;
	}

	public void setCheckIn(String checkIn) {
		this.checkIn = checkIn;
	}

	public String getCheckOut() {
		return checkOut;
	}

	public void setCheckOut(String checkOut) {
		this.checkOut = checkOut;
	}

	public int getCommission() {
		return commission;
	}

	public void setCommission(int commission) {
		this.commission = commission;
	}

	public int getHouseNo() {
		return houseNo;
	}

	public void setHouseNo(int houseNo) {
		this.houseNo = houseNo;
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

	public int getMatchNo() {
		return matchNo;
	}

	public void setMatchNo(int matchNo) {
		this.matchNo = matchNo;
	}

}
