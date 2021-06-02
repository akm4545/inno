package com.innovationT.inno.admin.adminMember.vo;

public class AdminVO extends AdminDefaultVO{
	
	private int adminIdx;
	private String adminId;
	private String adminPassword;
	private int adminGrade;
	
	public int getAdminIdx() {
		return adminIdx;
	}
	public void setAdminIdx(int adminIdx) {
		this.adminIdx = adminIdx;
	}
	public String getAdminId() {
		return adminId;
	}
	public void setAdminId(String adminId) {
		this.adminId = adminId;
	}
	public String getAdminPassword() {
		return adminPassword;
	}
	public void setAdminPassword(String adminPassword) {
		this.adminPassword = adminPassword;
	}
	public int getAdminGrade() {
		return adminGrade;
	}
	public void setAdminGrade(int adminGrade) {
		this.adminGrade = adminGrade;
	}
	
	@Override
	public String toString() {
		return "AdminVO [adminIdx=" + adminIdx + ", adminId=" + adminId + ", adminPassword=" + adminPassword
				+ ", adminGrade=" + adminGrade + "]";
	}
}
