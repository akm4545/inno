package com.innovationT.inno.event.vo;

public class EventVO extends EventFileVO{
	
	private int eventIdx;
	private	String eventTitle;
	private	String eventContent;
	private String eventDate;
	
	public int getEventIdx() {
		return eventIdx;
	}
	public void setEventIdx(int eventIdx) {
		this.eventIdx = eventIdx;
	}
	public String getEventTitle() {
		return eventTitle;
	}
	public void setEventTitle(String eventTitle) {
		this.eventTitle = eventTitle;
	}
	public String getEventContent() {
		return eventContent;
	}
	public void setEventContent(String eventContent) {
		this.eventContent = eventContent;
	}
	public String getEventDate() {
		return eventDate;
	}
	public void setEventDate(String eventDate) {
		this.eventDate = eventDate;
	}
	
	@Override
	public String toString() {
		return "EventVO [eventIdx=" + eventIdx + ", eventTitle=" + eventTitle + ", eventContent=" + eventContent
				+ ", eventDete=" + eventDate + "]";
	}
}
