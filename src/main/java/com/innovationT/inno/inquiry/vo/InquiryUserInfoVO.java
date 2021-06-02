package com.innovationT.inno.inquiry.vo;

public class InquiryUserInfoVO extends Inquiry {
	
	private int inquiryUserInfoIdx;
	private String inquiryUserInfoName;
	private String inquiryUserInfoCompany;
	private String inquiryUserInfoNumber;
	private String inquiryUserInfoEmail;
	private String inquiryUserInfoAgree;
	
	public int getInquiryUserInfoIdx() {
		return inquiryUserInfoIdx;
	}
	public void setInquiryUserInfoIdx(int inquiryUserInfoIdx) {
		this.inquiryUserInfoIdx = inquiryUserInfoIdx;
	}
	public String getInquiryUserInfoName() {
		return inquiryUserInfoName;
	}
	public void setInquiryUserInfoName(String inquiryUserInfoName) {
		this.inquiryUserInfoName = inquiryUserInfoName;
	}
	public String getInquiryUserInfoCompany() {
		return inquiryUserInfoCompany;
	}
	public void setInquiryUserInfoCompany(String inquiryUserInfoCompany) {
		this.inquiryUserInfoCompany = inquiryUserInfoCompany;
	}
	public String getInquiryUserInfoNumber() {
		return inquiryUserInfoNumber;
	}
	public void setInquiryUserInfoNumber(String inquiryUserInfoNumber) {
		this.inquiryUserInfoNumber = inquiryUserInfoNumber;
	}
	public String getInquiryUserInfoEmail() {
		return inquiryUserInfoEmail;
	}
	public void setInquiryUserInfoEmail(String inquiryUserInfoEmail) {
		this.inquiryUserInfoEmail = inquiryUserInfoEmail;
	}
	public String getInquiryUserInfoAgree() {
		return inquiryUserInfoAgree;
	}
	public void setInquiryUserInfoAgree(String inquiryUserInfoAgree) {
		this.inquiryUserInfoAgree = inquiryUserInfoAgree;
	}
	@Override
	public String toString() {
		return "InquiryUserInfoVO [inquiryUserInfoIdx=" + inquiryUserInfoIdx + ", inquiryIdx=" + getInquiryIdx() + ", inquiryUserInfoName="
				+ inquiryUserInfoName + ", inquiryUserInfoCompany=" + inquiryUserInfoCompany + ", inquiryUserInfoNumber=" + inquiryUserInfoNumber
				+ ", inquiryUserInfoEmail=" + inquiryUserInfoEmail + ", inquiryUserInfoAgree=" + inquiryUserInfoAgree + "]";
	}
}
