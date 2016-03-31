package com.kitri.fpgw.model;

import java.util.Date;

public class RantMainDto {

	private String strRMYmd;			//����		20160218
	private String strRMGetUser;		//�����
	private Date datRMGetDate;			//��Ͻð�
	private String strRMEditUser;		//������
	private Date datRMEditDate;			//�����ð�
	private String strRMStartTime;		//���۽ð�
	private String strRMEndTime;		//����ð�
	private String strRMRantProd;		//�뿩ǰ
	private String strRMRantBcode;		//�뿩ǰ ����
	private String strRMReqUserCD;		//��û��
	private String strRMApproUser;		//������
	private String strRMReqMemo;		//��û����
	private String strRMMemo;			//�޸�
	
	private String strCMName;			//
	private String strUMPositionCD;
	private String strUMPositionNM;
	private String strRMReqUserNM;
	
	private String strCMNameRK;
	
	private RantDetailDto rantDetailDto;	//���� ���� �ڵ� �ҷ���
	
	private String strStartValue;
	private String strEndValue;
	
	private String strUMApprName;
	
	
	public RantMainDto() {
		
	}
	
	
	
	public RantMainDto(String strRMYmd, String strRMRantProd, String strRMRantBcode) {

		this.strRMYmd = strRMYmd;
		this.strRMRantProd = strRMRantProd;
		this.strRMRantBcode = strRMRantBcode;
	}



	public RantMainDto(String strRMYmd, String strRMStartTime, String strRMEndTime, String strRMRantProd,
			String strRMRantBcode, String strStartValue, String strEndValue) {

		this.strRMYmd = strRMYmd;
		this.strRMStartTime = strRMStartTime;
		this.strRMEndTime = strRMEndTime;
		this.strRMRantProd = strRMRantProd;
		this.strRMRantBcode = strRMRantBcode;
		this.strStartValue = strStartValue;
		this.strEndValue = strEndValue;
	}



	public RantMainDto(String strRMYmd, String strRMStartTime, String strRMEndTime, String strCMName, String strRMReqUserNM,
			String strRMReqUserCD, String strUMPositionCD, String strUMPositionNM, String strCMNameRK, String strRMReqMemo, RantDetailDto rantDetailDto){
		
		this.strRMYmd = strRMYmd;
		this.strRMStartTime = strRMStartTime;
		this.strRMEndTime = strRMEndTime;
		this.strCMName = strCMName;
		this.strRMReqUserNM = strRMReqUserNM;
		this.strRMReqUserCD = strRMReqUserCD;
		this.strUMPositionCD = strUMPositionCD;
		this.strUMPositionNM = strUMPositionNM;
		this.strCMNameRK = strCMNameRK;
		this.strRMReqMemo = strRMReqMemo;
		this.rantDetailDto = rantDetailDto;
	}
	
	public RantMainDto(String strRMYmd, String strRMGetUser, Date datRMGetDate, String strRMEditUser,
			Date datRMEditDate, String strRMStartTime, String strRMEndTime, String strRMRantProd, String strRMRantBcode,
			String strRMReqUserCD, String strRMApproUser, String strRMReqMemo, String strRMMemo) {

		this.strRMYmd = strRMYmd;
		this.strRMGetUser = strRMGetUser;
		this.datRMGetDate = datRMGetDate;
		this.strRMEditUser = strRMEditUser;
		this.datRMEditDate = datRMEditDate;
		this.strRMStartTime = strRMStartTime;
		this.strRMEndTime = strRMEndTime;
		this.strRMRantProd = strRMRantProd;
		this.strRMRantBcode = strRMRantBcode;
		this.strRMReqUserCD = strRMReqUserCD;
		this.strRMApproUser = strRMApproUser;
		this.strRMReqMemo = strRMReqMemo;
		this.strRMMemo = strRMMemo;
	}
	
	public RantMainDto(String strRMYmd, String strRMGetUser, Date datRMGetDate, String strRMEditUser,
			Date datRMEditDate, String strRMStartTime, String strRMEndTime, String strRMRantProd, String strRMRantBcode,
			String strRMReqUserCD, String strRMApproUser, String strRMReqMemo, String strRMMemo, String strCMName,
			String strUMPositionCD, String strUMPositionNM, String strRMReqUserNM, String strCMNameRK,
			RantDetailDto rantDetailDto, String strStartValue, String strEndValue, String strUMApprName) {

		this.strRMYmd = strRMYmd;
		this.strRMGetUser = strRMGetUser;
		this.datRMGetDate = datRMGetDate;
		this.strRMEditUser = strRMEditUser;
		this.datRMEditDate = datRMEditDate;
		this.strRMStartTime = strRMStartTime;
		this.strRMEndTime = strRMEndTime;
		this.strRMRantProd = strRMRantProd;
		this.strRMRantBcode = strRMRantBcode;
		this.strRMReqUserCD = strRMReqUserCD;
		this.strRMApproUser = strRMApproUser;
		this.strRMReqMemo = strRMReqMemo;
		this.strRMMemo = strRMMemo;
		this.strCMName = strCMName;
		this.strUMPositionCD = strUMPositionCD;
		this.strUMPositionNM = strUMPositionNM;
		this.strRMReqUserNM = strRMReqUserNM;
		this.strCMNameRK = strCMNameRK;
		this.rantDetailDto = rantDetailDto;
		this.strStartValue = strStartValue;
		this.strEndValue = strEndValue;
		this.strUMApprName = strUMApprName;
	}



	public String getStrRMYmd() {
		return strRMYmd;
	}

	public void setStrRMYmd(String strRMYmd) {
		this.strRMYmd = strRMYmd;
	}

	public String getStrRMGetUser() {
		return strRMGetUser;
	}

	public void setStrRMGetUser(String strRMGetUser) {
		
		this.strRMGetUser = strRMGetUser;
	}

	public Date getDatRMGetDate() {
		return datRMGetDate;
	}

	public void setDatRMGetDate(Date datRMGetDate) {
		this.datRMGetDate = datRMGetDate;
	}

	public String getStrRMEditUser() {
		return strRMEditUser;
	}

	public void setStrRMEditUser(String strRMEditUser) {
		this.strRMEditUser = strRMEditUser;
	}

	public Date getDatRMEditDate() {
		return datRMEditDate;
	}

	public void setDatRMEditDate(Date datRMEditDate) {
		this.datRMEditDate = datRMEditDate;
	}

	public String getStrRMStartTime() {
		return strRMStartTime;
	}

	public void setStrRMStartTime(String strRMStartTime) {
		this.strRMStartTime = strRMStartTime;
	}

	public String getStrRMEndTime() {
		return strRMEndTime;
	}

	public void setStrRMEndTime(String strRMEndTime) {
		this.strRMEndTime = strRMEndTime;
	}

	public String getStrRMRantProd() {
		return strRMRantProd;
	}

	public void setStrRMRantProd(String strRMRantProd) {
		this.strRMRantProd = strRMRantProd;
	}

	public String getStrRMRantBcode() {
		return strRMRantBcode;
	}

	public void setStrRMRantBcode(String strRMRantBcode) {
		this.strRMRantBcode = strRMRantBcode;
	}

	public String getStrRMReqUserCD() {
		return strRMReqUserCD;
	}

	public void setStrRMReqUser(String strRMReqUser) {

		this.strRMReqUserCD = strRMReqUser;
	}

	public String getStrRMApproUser() {
		return strRMApproUser;
	}

	public void setStrRMApproUser(String strRMApproUser) {
		this.strRMApproUser = strRMApproUser;
	}

	public String getStrRMReqMemo() {
		return strRMReqMemo;
	}

	public void setStrRMReqMemo(String strRMReqMemo) {
		this.strRMReqMemo = strRMReqMemo;
	}

	public String getStrRMMemo() {
		return strRMMemo;
	}

	public void setStrRMMemo(String strRMMemo) {
		this.strRMMemo = strRMMemo;
	}

	public String getStrCMName() {
		return strCMName;
	}

	public void setStrCMName(String strCMName) {
		this.strCMName = strCMName;
	}

	public String getStrUMPositionCD() {
		return strUMPositionCD;
	}

	public void setStrUMPositionCD(String strUMPositionCD) {
		this.strUMPositionCD = strUMPositionCD;
	}

	public String getStrUMPositionNM() {
		return strUMPositionNM;
	}

	public void setStrUMPositionNM(String strUMPositionNM) {
		this.strUMPositionNM = strUMPositionNM;
	}

	public String getStrRMReqUserNM() {
		return strRMReqUserNM;
	}

	public void setStrRMReqUserNM(String strRMReqUserNM) {
		this.strRMReqUserNM = strRMReqUserNM;
	}

	public String getStrCMNameRK() {
		return strCMNameRK;
	}

	public void setStrCMNameRK(String strCMNameRK) {
		this.strCMNameRK = strCMNameRK;
	}

	public void setStrRMReqUserCD(String strRMReqUserCD) {
		this.strRMReqUserCD = strRMReqUserCD;
	}

	public RantDetailDto getRantDetailDto() {
		return rantDetailDto;
	}

	public void setRantDetailDto(RantDetailDto rantDetailDto) {
		this.rantDetailDto = rantDetailDto;
	}
	
	public String getStrStartValue() {
		return strStartValue;
	}

	public void setStrStartValue(String strStartValue) {
		this.strStartValue = strStartValue;
	}
	
	public String getStrEndValue() {
		return strEndValue;
	}

	public void setStrEndValue(String strEndValue) {
		this.strEndValue = strEndValue;
	}



	public String getStrUMApprName() {
		return strUMApprName;
	}



	public void setStrUMApprName(String strUMApprName) {
		this.strUMApprName = strUMApprName;
	}
	
	
}
