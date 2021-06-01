package com.innovationT.inno.event.service;

import java.util.List;

import com.innovationT.inno.event.vo.EventDefaultVO;
import com.innovationT.inno.event.vo.EventFileVO;
import com.innovationT.inno.event.vo.EventVO;

public interface EventService {

	int selectEventListTotCnt() throws Exception;
	
	List<EventVO> selectEventList(EventDefaultVO searchVO) throws Exception;

	List<EventFileVO> saveEventFile() throws Exception;

	void insertEvent(EventVO eventVO) throws Exception;

	void insertEventFileList(List<EventFileVO> eventFileVOList) throws Exception;

	List<EventVO> selectEvent(EventVO eventVO) throws Exception;

	List<EventVO> selectEventFileList(int eventIdx) throws Exception;

	void updateEvent(EventVO eventVO) throws Exception;

	void deleteEventFiletoFoder(List<EventFileVO> deleteList) throws Exception;

	void deleteEventFile(List<EventFileVO> deleteList) throws Exception;

	List<EventFileVO> deleteEventFileList(List<String> eventFileIdxList) throws Exception;

	void deleteEvent(EventVO eventVO) throws Exception;

	List<EventFileVO> removeEventFileList(EventVO eventVO) throws Exception;
}
