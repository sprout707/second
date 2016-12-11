package com.og.localhost.vo;

public class AccuseVO {

	private int no;
	private int typeNo; // 숙소테이블이나 거래내역테이블에 있는 번호 참조
	private int def_userNo; // 신고당한 유저번호
	private int atk_userNo; // 신고한 유저번호
	private String content; // 신고내용
	private String regDate; // 신고일
	private int status; // default 0 (0이면 신고접수대기, 1이면 신고 접수완료, -1 이면 신고 반려 )
	private int accuse_CategoryNo; // accuse_Category 번호
	private String type; // accuse_Category 타입 ( 숙소테이블인지, 거래내역 테이블인지 )

	
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public int getTypeNo() {
		return typeNo;
	}

	public void setTypeNo(int typeNo) {
		this.typeNo = typeNo;
	}

	public int getDef_userNo() {
		return def_userNo;
	}

	public void setDef_userNo(int def_userNo) {
		this.def_userNo = def_userNo;
	}

	public int getAtk_userNo() {
		return atk_userNo;
	}

	public void setAtk_userNo(int atk_userNo) {
		this.atk_userNo = atk_userNo;
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

	public int getAccuse_CategoryNo() {
		return accuse_CategoryNo;
	}

	public void setAccuse_CategoryNo(int accuse_CategoryNo) {
		this.accuse_CategoryNo = accuse_CategoryNo;
	}

}
