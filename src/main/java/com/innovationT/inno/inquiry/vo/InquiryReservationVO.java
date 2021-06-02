package com.innovationT.inno.inquiry.vo;

public class InquiryReservationVO extends Inquiry {
	
	private int inquiryReservationIdx;
	private int inquiryIdx;
	private String inquiryReservationType;
	
	public int getInquiryReservationIdx() {
		return inquiryReservationIdx;
	}
	public void setInquiryReservationIdx(int inquiryReservationIdx) {
		this.inquiryReservationIdx = inquiryReservationIdx;
	}
	public int getInquiryIdx() {
		return inquiryIdx;
	}
	public void setInquiryIdx(int inquiryIdx) {
		this.inquiryIdx = inquiryIdx;
	}
	public String getInquiryReservationType() {
		return inquiryReservationType;
	}
	public void setInquiryReservationType(String inquiryReservationType) {
		this.inquiryReservationType = inquiryReservationType;
	}
	
}
