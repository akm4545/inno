package com.innovationT.inno.inquiry.vo;

public class InquiryVO extends Inquiry {
	
	private int inquiryIdx;
	private int inquiryPageNumber;
	private String inquiryPay;
	private String inquiryContent;
	private String inquiryDate;
	private String inquiryCheck;
	
	public int getInquiryIdx() {
		return inquiryIdx;
	}
	public void setInquiryIdx(int inquiryIdx) {
		this.inquiryIdx = inquiryIdx;
	}
	public int getInquiryPageNumber() {
		return inquiryPageNumber;
	}
	public void setInquiryPageNumber(int inquiryPageNumber) {
		this.inquiryPageNumber = inquiryPageNumber;
	}
	public String getInquiryPay() {
		return inquiryPay;
	}
	public void setInquiryPay(String inquiryPay) {
		this.inquiryPay = inquiryPay;
	}
	public String getInquiryContent() {
		return inquiryContent;
	}
	public void setInquiryContent(String inquiryContent) {
		this.inquiryContent = inquiryContent;
	}
	public String getInquiryDate() {
		return inquiryDate;
	}
	public void setInquiryDate(String inquiryDate) {
		this.inquiryDate = inquiryDate;
	}
	public String getInquiryCheck() {
		return inquiryCheck;
	}
	public void setInquiryCheck(String inquiryCheck) {
		this.inquiryCheck = inquiryCheck;
	}
	
	@Override
	public String toString() {
		return "InquiryVO [inquiryIdx=" + inquiryIdx + ", inquiryPageNumber=" + inquiryPageNumber + ", inquiryPay="
				+ inquiryPay + ", inquiryContent=" + inquiryContent + ", inquiryDate=" + inquiryDate + ", inquiryCheck="
				+ inquiryCheck + "]";
	}
}
