package com.og.localhost.vo;

public class MatchVO {
	private int no; 
	private String content;       
	private int ageLine;	// 원하는 나이대
	private String gender; // 원하는 성별
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public int getAgeLine() {
		return ageLine;
	}
	public void setAgeLine(int ageLine) {
		this.ageLine = ageLine;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	
}
