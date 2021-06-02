package com.innovationT.inno.inquiry.vo;

public class InquiryFileVO extends Inquiry{
	
	private int inquiryFileIdx;
	private String inquiryFileName;
	private String inquiryFileDir;
	private String inquiryFileOrigin;
	
	public int getInquiryFileIdx() {
		return inquiryFileIdx;
	}
	public void setInquiryFileIdx(int inquiryFileIdx) {
		this.inquiryFileIdx = inquiryFileIdx;
	}
	public String getInquiryFileName() {
		return inquiryFileName;
	}
	public void setInquiryFileName(String inquiryFileName) {
		this.inquiryFileName = inquiryFileName;
	}
	public String getInquiryFileDir() {
		return inquiryFileDir;
	}
	public void setInquiryFileDir(String inquiryFileDir) {
		this.inquiryFileDir = inquiryFileDir;
	}
	public String getInquiryFileOrigin() {
		return inquiryFileOrigin;
	}
	public void setInquiryFileOrigin(String inquiryFileOrigin) {
		this.inquiryFileOrigin = inquiryFileOrigin;
	}
	
	@Override
	public String toString() {
		return "InquiryFileVO [inquiryFileIdx=" + inquiryFileIdx + ", inquiryIdx=" + getInquiryIdx() + ", inquiryFileName="
				+ inquiryFileName + ", inquiryFileDir=" + inquiryFileDir + ", inquiryFileOrigin=" + inquiryFileOrigin
				+ "]";
	}
}
