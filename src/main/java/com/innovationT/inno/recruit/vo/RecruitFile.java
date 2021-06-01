package com.innovationT.inno.recruit.vo;

public class RecruitFile {
	
	private int recruitFileIdx;
	private int recruitIdx;
	private String recruitFileDir;
	private String recruitFileName;
	private String recruitFileType;
	
	public int getRecruitFileIdx() {
		return recruitFileIdx;
	}
	public void setRecruitFileIdx(int recruitFileIdx) {
		this.recruitFileIdx = recruitFileIdx;
	}
	public int getRecruitIdx() {
		return recruitIdx;
	}
	public void setRecruitIdx(int recruitIdx) {
		this.recruitIdx = recruitIdx;
	}
	public String getRecruitFileDir() {
		return recruitFileDir;
	}
	public void setRecruitFileDir(String recruitFileDir) {
		this.recruitFileDir = recruitFileDir;
	}
	public String getRecruitFileName() {
		return recruitFileName;
	}
	public void setRecruitFileName(String recruitFileName) {
		this.recruitFileName = recruitFileName;
	}
	public String getRecruitFileType() {
		return recruitFileType;
	}
	public void setRecruitFileType(String recruitFileType) {
		this.recruitFileType = recruitFileType;
	}
	
	@Override
	public String toString() {
		return "RecruitFile [recruitFileIdx=" + recruitFileIdx + ", recruitIdx=" + recruitIdx + ", recruitFileDir="
				+ recruitFileDir + ", recruitFileName=" + recruitFileName + ", recruitFileType=" + recruitFileType
				+ "]";
	}
}
