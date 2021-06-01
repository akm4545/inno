package com.innovationT.inno.event.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.innovationT.inno.event.vo.EventDefaultVO;
import com.innovationT.inno.event.vo.EventFileVO;
import com.innovationT.inno.event.vo.EventVO;

public interface EventMapper {

	int selectEventListTotCnt() throws Exception;
	
	List<EventVO> selectEventList(EventDefaultVO searchVO) throws Exception;

	void insertEvent(EventVO eventVO) throws Exception;

	void insertEventFileList(List<EventFileVO> eventFileVOList) throws Exception;

	List<EventVO> selectEvent(EventVO eventVO) throws Exception;

	List<EventVO> selectEventFileList(@Param("eventIdx") int eventIdx) throws Exception;

	Object updateEvent(EventVO eventVO) throws Exception;

	void deleteEventFile(List<EventFileVO> deleteList) throws Exception;

	List<EventFileVO> deleteEventFileList(List<String> eventFileIdxList) throws Exception;

	void deleteEvent(EventVO eventVO) throws Exception;

	List<EventFileVO> removeEventFileList(EventVO eventVO) throws Exception;

}
