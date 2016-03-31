package com.kitri.fpgw.model;

import java.util.Date;

public class BoardTextCommentDto {

	private int intSeq;
	private int intPSeq;
	private String strGroup_Cd;
	private String strKind_Cd;
	private String strTitle;
	private String strDetail_Comment;
	private String strGet_User_Cd;
	private String strGet_User_Nm;
	private Date datGet_Date;
	private String strEdit_User_Cd;
	private String strEdit_User_Nm;
	private Date datEdit_Date;
		
	public BoardTextCommentDto() {
	}

	public BoardTextCommentDto(int intSeq, int intPSeq, String strGroup_Cd, String strKind_Cd, String strTitle,
			String strDetail_Comment, String strGet_User_Cd, String strGet_User_Nm, Date datGet_Date,
			String strEdit_User_Cd, String strEdit_User_Nm, Date datEdit_Date) {
		this.intSeq = intSeq;
		this.intPSeq = intPSeq;
		this.strGroup_Cd = strGroup_Cd;
		this.strKind_Cd = strKind_Cd;
		this.strTitle = strTitle;
		this.strDetail_Comment = strDetail_Comment;
		this.strGet_User_Cd = strGet_User_Cd;
		this.strGet_User_Nm = strGet_User_Nm;
		this.datGet_Date = datGet_Date;
		this.strEdit_User_Cd = strEdit_User_Cd;
		this.strEdit_User_Nm = strEdit_User_Nm;
		this.datEdit_Date = datEdit_Date;
	}

	public int getIntSeq() {
		return intSeq;
	}

	public void setIntSeq(int intSeq) {
		this.intSeq = intSeq;
	}

	public int getIntPSeq() {
		return intPSeq;
	}

	public void setIntPSeq(int intPSeq) {
		this.intPSeq = intPSeq;
	}

	public String getStrGroup_Cd() {
		return strGroup_Cd;
	}

	public void setStrGroup_Cd(String strGroup_Cd) {
		this.strGroup_Cd = strGroup_Cd;
	}

	public String getStrKind_Cd() {
		return strKind_Cd;
	}

	public void setStrKind_Cd(String strKind_Cd) {
		this.strKind_Cd = strKind_Cd;
	}

	public String getStrTitle() {
		return strTitle;
	}

	public void setStrTitle(String strTitle) {
		this.strTitle = strTitle;
	}

	public String getStrDetail_Comment() {
		return strDetail_Comment;
	}

	public void setStrDetail_Comment(String strDetail_Comment) {
		this.strDetail_Comment = strDetail_Comment;
	}

	public String getStrGet_User_Cd() {
		return strGet_User_Cd;
	}

	public void setStrGet_User_Cd(String strGet_User_Cd) {
		this.strGet_User_Cd = strGet_User_Cd;
	}

	public String getStrGet_User_Nm() {
		return strGet_User_Nm;
	}

	public void setStrGet_User_Nm(String strGet_User_Nm) {
		this.strGet_User_Nm = strGet_User_Nm;
	}

	public Date getDatGet_Date() {
		return datGet_Date;
	}

	public void setDatGet_Date(Date datGet_Date) {
		this.datGet_Date = datGet_Date;
	}

	public String getStrEdit_User_Cd() {
		return strEdit_User_Cd;
	}

	public void setStrEdit_User_Cd(String strEdit_User_Cd) {
		this.strEdit_User_Cd = strEdit_User_Cd;
	}

	public String getStrEdit_User_Nm() {
		return strEdit_User_Nm;
	}

	public void setStrEdit_User_Nm(String strEdit_User_Nm) {
		this.strEdit_User_Nm = strEdit_User_Nm;
	}

	public Date getDatEdit_Date() {
		return datEdit_Date;
	}

	public void setDatEdit_Date(Date datEdit_Date) {
		this.datEdit_Date = datEdit_Date;
	}

	@Override
	public String toString() {
		return "BoardTextCommentDto [intSeq=" + intSeq + ", intPSeq=" + intPSeq + ", strGroup_Cd=" + strGroup_Cd
				+ ", strKind_Cd=" + strKind_Cd + ", strTitle=" + strTitle + ", strDetail_Comment=" + strDetail_Comment
				+ ", strGet_User_Cd=" + strGet_User_Cd + ", strGet_User_Nm=" + strGet_User_Nm + ", datGet_Date="
				+ datGet_Date + ", strEdit_User_Cd=" + strEdit_User_Cd + ", strEdit_User_Nm=" + strEdit_User_Nm
				+ ", datEdit_Date=" + datEdit_Date + "]";
	}

	
	
}
