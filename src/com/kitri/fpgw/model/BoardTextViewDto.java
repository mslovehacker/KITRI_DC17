package com.kitri.fpgw.model;

import java.util.Date;

public class BoardTextViewDto {

	private int intBmSeq;
	private int intBvSeq;
	private String strGet_User_Cd;
	private String strGet_User_Nm;
	private Date datGet_Date;
	
	public BoardTextViewDto() {
	}

	public BoardTextViewDto(int intBmSeq, int intBvSeq, String strGet_User_Cd, String strGet_User_Nm,
			Date datGet_Date) {
		this.intBmSeq = intBmSeq;
		this.intBvSeq = intBvSeq;
		this.strGet_User_Cd = strGet_User_Cd;
		this.strGet_User_Nm = strGet_User_Nm;
		this.datGet_Date = datGet_Date;
	}

	public int getIntBmSeq() {
		return intBmSeq;
	}

	public void setIntBmSeq(int intBmSeq) {
		this.intBmSeq = intBmSeq;
	}

	public int getIntBvSeq() {
		return intBvSeq;
	}

	public void setIntBvSeq(int intBvSeq) {
		this.intBvSeq = intBvSeq;
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

	@Override
	public String toString() {
		return "BoardTextViewDto [intBmSeq=" + intBmSeq + ", intBvSeq=" + intBvSeq + ", strGet_User_Cd="
				+ strGet_User_Cd + ", strGet_User_Nm=" + strGet_User_Nm + ", datGet_Date=" + datGet_Date + "]";
	}

	
	
}
