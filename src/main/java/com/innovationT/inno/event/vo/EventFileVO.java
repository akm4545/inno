package com.innovationT.inno.event.vo;

public class EventFileVO extends EventDefaultVO{
	
	private int eventFileIdx;
	private int eventIdx;
	private	String eventFileDir;
	private String eventFileName;
	private String eventFileType;
	
	public int getEventFileIdx() {
		return eventFileIdx;
	}
	public void setEventFileIdx(int eventFileIdx) {
		this.eventFileIdx = eventFileIdx;
	}
	public int getEventIdx() {
		return eventIdx;
	}
	public void setEventIdx(int eventIdx) {
		this.eventIdx = eventIdx;
	}
	public String getEventFileDir() {
		return eventFileDir;
	}
	public void setEventFileDir(String eventFileDir) {
		this.eventFileDir = eventFileDir;
	}
	public String getEventFileName() {
		return eventFileName;
	}
	public void setEventFileName(String eventFileName) {
		this.eventFileName = eventFileName;
	}
	public String getEventFileType() {
		return eventFileType;
	}
	public void setEventFileType(String eventFileType) {
		this.eventFileType = eventFileType;
	}
	
	@Override
	public String toString() {
		return "EventFile [eventFileIdx=" + eventFileIdx + ", eventIdx=" + eventIdx + ", eventFileDir=" + eventFileDir
				+ ", eventFileName=" + eventFileName + ", eventFileType=" + eventFileType + "]";
	}
}
