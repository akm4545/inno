package com.innovationT.inno.inquiry.vo;

public class InquiryTypeLinkVO extends Inquiry {

	private int inquiryTypeIdx;
	
	public int getInquiryTypeIdx() {
		return inquiryTypeIdx;
	}
	public void setInquiryTypeIdx(int inquiryTypeIdx) {
		this.inquiryTypeIdx = inquiryTypeIdx;
	}
	
	@Override
	public String toString() {
		return "InquiryTypeLinkVO [inquiryTypeIdx=" + inquiryTypeIdx + ", inquiryIdx=" + getInquiryIdx() + "]";
	}
}
