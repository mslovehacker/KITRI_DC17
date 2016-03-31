package com.kitri.fpgw.model;

import java.util.Date;

public class RantDetailDto {

	private String strRDYmd;			//����
	private String strRDGetUser;		//����� == ��û��
	private Date datRDGetDate;		//��Ͻð�
	private String strRDStartTime;	//���۽ð�
	private String strRDEndTime;		//����ð�
	private String strRDRantProd;		//�뿩ǰ
	private int strRDSeq;				//����
	private String strRDChkUser;		//Ȯ����
	private String strRDRKBcode;		//�뿩���౸��
	private String strRDRK;			//�뿩����
	private String strRDMemo;			//�޸�
	
	private String strStart;
	private String strEnd;
	private String title;
	
	public RantDetailDto(){
		
	}
	
	public RantDetailDto(String strRDRK, String strRDRKBcode){
		this.strRDRK = strRDRK;
		this.strRDRKBcode = strRDRKBcode;
	}
	
	
	public RantDetailDto(String strStart, String strEnd, String title) {

		this.strStart = strStart;
		this.strEnd = strEnd;
		this.title = title;
	}

	public RantDetailDto(String strRDYmd, String strRDGetUser, String strRDStartTime, String strRDEndTime,
			String strRDRantProd, String strRDChkUser, String strRDRKBcode, String strRDRK,
			String strRDMemo) {

		this.strRDYmd = strRDYmd;
		this.strRDGetUser = strRDGetUser;
		this.strRDStartTime = strRDStartTime;
		this.strRDEndTime = strRDEndTime;
		this.strRDRantProd = strRDRantProd;
		this.strRDChkUser = strRDChkUser;
		this.strRDRKBcode = strRDRKBcode;
		this.strRDRK = strRDRK;
		this.strRDMemo = strRDMemo;
	}

	public RantDetailDto(String strRDYmd, String strRDGetUser, Date datRDGetDate, String strRDStartTime,
			String strRDEndTime, String strRDRantProd, int strRDSeq, String strRDChkUser, String strRDRKBcode,
			String strRDRK, String strRDMemo) {

		this.strRDYmd = strRDYmd;
		this.strRDGetUser = strRDGetUser;
		this.datRDGetDate = datRDGetDate;
		this.strRDStartTime = strRDStartTime;
		this.strRDEndTime = strRDEndTime;
		this.strRDRantProd = strRDRantProd;
		this.strRDSeq = strRDSeq;
		this.strRDChkUser = strRDChkUser;
		this.strRDRKBcode = strRDRKBcode;
		this.strRDRK = strRDRK;
		this.strRDMemo = strRDMemo;
	}

	public String getStrRDYmd() {
		return strRDYmd;
	}

	public void setStrRDYmd(String strRDYmd) {
		this.strRDYmd = strRDYmd;
	}

	public String getStrRDGetUser() {
		return strRDGetUser;
	}

	public void setStrRDGetUser(String strRDGetUser) {
		this.strRDGetUser = strRDGetUser;
	}

	public Date getDatRDGetDate() {
		return datRDGetDate;
	}

	public void setDatRDGetDate(Date datRDGetDate) {
		this.datRDGetDate = datRDGetDate;
	}

	public String getStrRDStartTime() {
		return strRDStartTime;
	}

	public void setStrRDStartTime(String strRDStartTime) {
		this.strRDStartTime = strRDStartTime;
	}

	public String getStrRDEndTime() {
		return strRDEndTime;
	}

	public void setStrRDEndTime(String strRDEndTime) {
		this.strRDEndTime = strRDEndTime;
	}

	public String getStrRDRantProd() {
		return strRDRantProd;
	}

	public void setStrRDRantProd(String strRDRantProd) {
		this.strRDRantProd = strRDRantProd;
	}

	public int getStrRDSeq() {
		return strRDSeq;
	}

	public void setStrRDSeq(int strRDSeq) {
		this.strRDSeq = strRDSeq;
	}

	public String getStrRDChkUser() {
		return strRDChkUser;
	}

	public void setStrRDChkUser(String strRDChkUser) {
		this.strRDChkUser = strRDChkUser;
	}

	public String getStrRDRKBcode() {
		return strRDRKBcode;
	}

	public void setStrRDRKBcode(String strRDRKBcode) {
		this.strRDRKBcode = strRDRKBcode;
	}

	public String getStrRDRK() {
		return strRDRK;
	}

	public void setStrRDRK(String strRDRK) {
		this.strRDRK = strRDRK;
	}

	public String getStrRDMemo() {
		return strRDMemo;
	}

	public void setStrRDMemo(String strRDMemo) {
		this.strRDMemo = strRDMemo;
	}

	public String getStrStart() {
		return strStart;
	}

	public void setStrStart(String strStart) {
		this.strStart = strStart;
	}

	public String getStrEnd() {
		return strEnd;
	}

	public void setStrEnd(String strEnd) {
		this.strEnd = strEnd;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	
}
