package com.innovationT.inno.company.vo;

public class CompanyVO {
	
	private int companyIdx;
	private String companyDir;
	private String companyName;
	private String companyType;
	private	String companyContent;
	public int getCompanyIdx() {
		return companyIdx;
	}
	public void setCompanyIdx(int companyIdx) {
		this.companyIdx = companyIdx;
	}
	public String getCompanyDir() {
		return companyDir;
	}
	public void setCompanyDir(String companyDir) {
		this.companyDir = companyDir;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getCompanyType() {
		return companyType;
	}
	public void setCompanyType(String companyType) {
		this.companyType = companyType;
	}
	public String getCompanyContent() {
		return companyContent;
	}
	public void setCompanyContent(String companyContent) {
		this.companyContent = companyContent;
	}
	
	@Override
	public String toString() {
		return "CompanyVO [companyIdx=" + companyIdx + ", companyDir=" + companyDir + ", companyName=" + companyName
				+ ", companyType=" + companyType + ", companyContent=" + companyContent + "]";
	}
}
