package com.og.localhost.vo;

public class MessageVO {
	private int no;
	private int to_userNo; // 메시지를 받는 사용자 번호
	private int from_userNo; // 메시지를 보낸 사용자 번호
	private String title; // 메시지 제목
	private String content; // 메시지 내용
	private String regDate; // 메시지 작성일
	private int status; // 0이면 읽지않음 , 1이면 읽음, -1이면 삭제

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public int getTo_userNo() {
		return to_userNo;
	}

	public void setTo_userNo(int to_userNo) {
		this.to_userNo = to_userNo;
	}

	public int getFrom_userNo() {
		return from_userNo;
	}

	public void setFrom_userNo(int from_userNo) {
		this.from_userNo = from_userNo;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
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
