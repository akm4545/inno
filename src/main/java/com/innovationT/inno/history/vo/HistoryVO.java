package com.innovationT.inno.history.vo;

public class HistoryVO {
	
	private int historyIdx;
	private String historyDate;
	private String historyContent;
	
	public int getHistoryIdx() {
		return historyIdx;
	}
	public void setHistoryIdx(int historyIdx) {
		this.historyIdx = historyIdx;
	}
	public String getHistoryDate() {
		return historyDate;
	}
	public void setHistoryDate(String historyDate) {
		this.historyDate = historyDate;
	}
	public String getHistoryContent() {
		return historyContent;
	}
	public void setHistoryContent(String historyContent) {
		this.historyContent = historyContent;
	}
	
	@Override
	public String toString() {
		return "HistoryVO [historyIdx=" + historyIdx + ", historyDate=" + historyDate + ", historyContent="
				+ historyContent + "]";
	}
}
