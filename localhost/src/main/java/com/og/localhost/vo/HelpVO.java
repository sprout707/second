package com.og.localhost.vo;

public class HelpVO {
	private int no;
	private String title; // 도움말 제목
	private String content; // 도움말 내용
	private String fileName; // 첨부한 파일 이름
	private int help_categoryNo; // 도움말 카테고리 번호
	private String type; // 도움말 카테고리 (이용안내, 신고하기, 예약방법 등등 ..)

	public HelpVO () {} 
	
	public HelpVO(int no, String title, String content, String fileName, int help_categoryNo, String type) {
		super();
		this.no = no;
		this.title = title;
		this.content = content;
		this.fileName = fileName;
		this.help_categoryNo = help_categoryNo;
		this.type = type;
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
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

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public int getHelp_categoryNo() {
		return help_categoryNo;
	}

	public void setHelp_categoryNo(int help_categoryNo) { 
		this.help_categoryNo = help_categoryNo;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

}






