package com.innovationT.inno.inquiry.vo;

public class InquiryReservationVO extends Inquiry {
	
	private int inquiryReservationIdx;
	private String inquiryReservationType;
	
	public int getInquiryReservationIdx() {
		return inquiryReservationIdx;
	}
	public void setInquiryReservationIdx(int inquiryReservationIdx) {
		this.inquiryReservationIdx = inquiryReservationIdx;
	}
	public String getInquiryReservationType() {
		return inquiryReservationType;
	}
	public void setInquiryReservationType(String inquiryReservationType) {
		this.inquiryReservationType = inquiryReservationType;
	}
	
	@Override
	public String toString() {
		return "InquiryReservationVO [inquiryReservationIdx=" + inquiryReservationIdx + ", inquiryIdx=" + getInquiryIdx() + ", inquiryReservationType="
				+ inquiryReservationType + "]";
	}
}
