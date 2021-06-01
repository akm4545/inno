package com.innovationT.inno.inquiry.vo;

public class InquiryFileVO {
	
	private int inquiryFileIdx;
	private int inquiryIdx;
	private String inquiryFileName;
	private String inquiryFileDir;
	private String inquiryFileOrigin;
	
	public int getInquiryFileIdx() {
		return inquiryFileIdx;
	}
	public void setInquiryFileIdx(int inquiryFileIdx) {
		this.inquiryFileIdx = inquiryFileIdx;
	}
	public int getInquiryIdx() {
		return inquiryIdx;
	}
	public void setInquiryIdx(int inquiryIdx) {
		this.inquiryIdx = inquiryIdx;
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
		return "InquiryFileVO [inquiryFileIdx=" + inquiryFileIdx + ", inquiryIdx=" + inquiryIdx + ", inquiryFileName="
				+ inquiryFileName + ", inquiryFileDir=" + inquiryFileDir + ", inquiryFileOrigin=" + inquiryFileOrigin
				+ "]";
	}
}
