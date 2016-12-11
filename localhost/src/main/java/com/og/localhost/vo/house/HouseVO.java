package com.og.localhost.vo.house;

import java.util.List;

public class HouseVO {
	private int no; // 기본키
	private int house_roomNo; // 방 유형, 외래키, 1인실, 다인실 , 개인실
	private int house_typeNo; // 집 유형, 외래키, 아파트, 빌라, 주택...
	private int person; // 허용 가능 인원수
	private String addr; // 주소
	private String detailAddr; // 상세주소
	private String latitude; // 위도
	private String longitude; // 경도
	private int bed; // 침대갯수
	private int bathroom; // 화장실 수
	private String thumbnail; // 썸네일 사진, not null
	private String content; // 설명, not null
	private String title; // 제목
	private String merit; // 숙소의 장점
	private int host_userNo; // 호스트의 유저 번호
	private String bookType; // 즉시예약, 일반예약
	private int price; // 1박 기준 가격
	private String regDate; // 등록일
	private int status; // 0이면 가등록, 1이면 등록
	private List<HouseComfort> houseComfort;
	private List<HouseRule> houseRule;
	private List<HouseSpace> houseSpace;
	private List<HouseGuest> houseGuest;
	private List<HouseStayInfo> houseStayInfo;
	private List<HouseImg> houseImg;
	private List<HouseReview> houseReview;

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public int getHouse_roomNo() {
		return house_roomNo;
	}

	public void setHouse_roomNo(int house_roomNo) {
		this.house_roomNo = house_roomNo;
	}

	public int getHouse_typeNo() {
		return house_typeNo;
	}

	public void setHouse_typeNo(int house_typeNo) {
		this.house_typeNo = house_typeNo;
	}

	public int getPerson() {
		return person;
	}

	public void setPerson(int person) {
		this.person = person;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

	public String getDetailAddr() {
		return detailAddr;
	}

	public void setDetailAddr(String detailAddr) {
		this.detailAddr = detailAddr;
	}

	public String getLatitude() {
		return latitude;
	}

	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}

	public String getLongitude() {
		return longitude;
	}

	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}

	public int getBed() {
		return bed;
	}

	public void setBed(int bed) {
		this.bed = bed;
	}

	public int getBathroom() {
		return bathroom;
	}

	public void setBathroom(int bathroom) {
		this.bathroom = bathroom;
	}

	public String getThumbnail() {
		return thumbnail;
	}

	public void setThumbnail(String thumbnail) {
		this.thumbnail = thumbnail;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getMerit() {
		return merit;
	}

	public void setMerit(String merit) {
		this.merit = merit;
	}

	public int getHost_userNo() {
		return host_userNo;
	}

	public void setHost_userNo(int host_userNo) {
		this.host_userNo = host_userNo;
	}

	public String getBookType() {
		return bookType;
	}

	public void setBookType(String bookType) {
		this.bookType = bookType;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
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

	public List<HouseComfort> getHouseComfort() {
		return houseComfort;
	}

	public void setHouseComfort(List<HouseComfort> houseComfort) {
		this.houseComfort = houseComfort;
	}

	public List<HouseRule> getHouseRule() {
		return houseRule;
	}

	public void setHouseRule(List<HouseRule> houseRule) {
		this.houseRule = houseRule;
	}

	public List<HouseSpace> getHouseSpace() {
		return houseSpace;
	}

	public void setHouseSpace(List<HouseSpace> houseSpace) {
		this.houseSpace = houseSpace;
	}

	public List<HouseGuest> getHouseGuest() {
		return houseGuest;
	}

	public void setHouseGuest(List<HouseGuest> houseGuest) {
		this.houseGuest = houseGuest;
	}

	public List<HouseStayInfo> getHouseStayInfo() {
		return houseStayInfo;
	}

	public void setHouseStayInfo(List<HouseStayInfo> houseStayInfo) {
		this.houseStayInfo = houseStayInfo;
	}

	public List<HouseImg> getHouseImg() {
		return houseImg;
	}

	public void setHouseImg(List<HouseImg> houseImg) {
		this.houseImg = houseImg;
	}

	public List<HouseReview> getHouseReview() {
		return houseReview;
	}

	public void setHouseReview(List<HouseReview> houseReview) {
		this.houseReview = houseReview;
	}

}
