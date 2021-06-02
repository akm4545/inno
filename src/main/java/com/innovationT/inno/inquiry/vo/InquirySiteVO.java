package com.innovationT.inno.inquiry.vo;

public class InquirySiteVO extends Inquiry {

	private int inquirySiteIdx;
	private String inquirySiteSite;
	private String inquirySiteType;
	
	public int getInquirySiteIdx() {
		return inquirySiteIdx;
	}
	public void setInquirySiteIdx(int inquirySiteIdx) {
		this.inquirySiteIdx = inquirySiteIdx;
	}
	public String getInquirySiteSite() {
		return inquirySiteSite;
	}
	public void setInquirySiteSite(String inquirySiteSite) {
		this.inquirySiteSite = inquirySiteSite;
	}
	public String getInquirySiteType() {
		return inquirySiteType;
	}
	public void setInquirySiteType(String inquirySiteType) {
		this.inquirySiteType = inquirySiteType;
	}
	
	@Override
	public String toString() {
		return "InquirySiteVO [inquirySiteIdx=" + inquirySiteIdx + ", inquiryIdx=" + getInquiryIdx() + ", inquirySiteSite="
				+ inquirySiteSite + ", inquirySiteType=" + inquirySiteType + "]";
	}
}
