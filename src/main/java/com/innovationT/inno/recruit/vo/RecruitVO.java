package com.innovationT.inno.recruit.vo;

public class RecruitVO {
	
	private int recruitIdx;
	private String recruitType;
	private String recruitTitle;
	private String recruitContent;
	private int adminIdx;
	private int recruitHit;
	private String recruitDate;
	private String recruitIng;
	
	public int getRecruitIdx() {
		return recruitIdx;
	}
	public void setRecruitIdx(int recruitIdx) {
		this.recruitIdx = recruitIdx;
	}
	public String getRecruitType() {
		return recruitType;
	}
	public void setRecruitType(String recruitType) {
		this.recruitType = recruitType;
	}
	public String getRecruitTitle() {
		return recruitTitle;
	}
	public void setRecruitTitle(String recruitTitle) {
		this.recruitTitle = recruitTitle;
	}
	public String getRecruitContent() {
		return recruitContent;
	}
	public void setRecruitContent(String recruitContent) {
		this.recruitContent = recruitContent;
	}
	public int getAdminIdx() {
		return adminIdx;
	}
	public void setAdminIdx(int adminIdx) {
		this.adminIdx = adminIdx;
	}
	public int getRecruitHit() {
		return recruitHit;
	}
	public void setRecruitHit(int recruitHit) {
		this.recruitHit = recruitHit;
	}
	public String getRecruitDate() {
		return recruitDate;
	}
	public void setRecruitDate(String recruitDate) {
		this.recruitDate = recruitDate;
	}
	public String getRecruitIng() {
		return recruitIng;
	}
	public void setRecruitIng(String recruitIng) {
		this.recruitIng = recruitIng;
	}
	
	@Override
	public String toString() {
		return "RecruitVO [recruitIdx=" + recruitIdx + ", recruitType=" + recruitType + ", recruitTitle=" + recruitTitle
				+ ", recruitContent=" + recruitContent + ", adminIdx=" + adminIdx + ", recruitHit=" + recruitHit
				+ ", recruitDate=" + recruitDate + ", recruitIng=" + recruitIng + "]";
	}
}
