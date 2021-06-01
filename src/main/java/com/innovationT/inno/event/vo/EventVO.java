package com.innovationT.inno.event.vo;

public class EventVO {
	
	private int eventIdx;
	private	String eventTitle;
	private	String eventContent;
	private String eventDete;
	
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
	public String getEventDete() {
		return eventDete;
	}
	public void setEventDete(String eventDete) {
		this.eventDete = eventDete;
	}
	
	@Override
	public String toString() {
		return "EventVO [eventIdx=" + eventIdx + ", eventTitle=" + eventTitle + ", eventContent=" + eventContent
				+ ", eventDete=" + eventDete + "]";
	}
}
