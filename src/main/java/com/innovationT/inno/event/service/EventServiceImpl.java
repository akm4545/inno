package com.innovationT.inno.event.service;

import java.util.List;

import org.springframework.aop.ThrowsAdvice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.innovationT.inno.event.dao.EventMapper;
import com.innovationT.inno.event.vo.EventDefaultVO;
import com.innovationT.inno.event.vo.EventFileVO;
import com.innovationT.inno.event.vo.EventVO;

@Service("eventService")
public class EventServiceImpl implements EventService{

	@Autowired
	EventMapper eventDAO;
	
	@Override
	public int selectEventListTotCnt() throws Exception {
		return eventDAO.selectEventListTotCnt();
	}
	
	@Override
	public List<EventVO> selectEventList(EventDefaultVO searchVO) throws Exception {
		return eventDAO.selectEventList(searchVO);
	}

	@Override
	public List<EventFileVO> saveEventFile() throws Exception {
		// 이벤트 파일 저장 로직 반환값 이벤트 파일 타입, 이벤트 파일 디렉토리, 이벤트 파일 난수화 이름을 담은 vo
		return null;
	}

	@Override
	public void insertEvent(EventVO eventVO) throws Exception {
		eventDAO.insertEvent(eventVO);
	}

	@Override
	public void insertEventFileList(List<EventFileVO> eventFileVOList) throws Exception {
		eventDAO.insertEventFileList(eventFileVOList);
	}

	@Override
	public List<EventVO> selectEvent(EventVO eventVO) throws Exception {
		return eventDAO.selectEvent(eventVO);
	}

	@Override
	public List<EventVO> selectEventFileList(int eventIdx) throws Exception {
		return eventDAO.selectEventFileList(eventIdx);
	}

	@Override
	public void updateEvent(EventVO eventVO) throws Exception {
		eventDAO.updateEvent(eventVO);
	}

	@Override
	public void deleteEventFiletoFoder(List<EventFileVO> deleteList) throws Exception {
		//파일 삭제 로직
	}

	@Override
	public void deleteEventFile(List<EventFileVO> deleteList) throws Exception {
		eventDAO.deleteEventFile(deleteList);
	}

	@Override
	public List<EventFileVO> deleteEventFileList(List<String> eventFileIdxList) throws Exception {
		return eventDAO.deleteEventFileList(eventFileIdxList);
	}

	@Override
	public void deleteEvent(EventVO eventVO) throws Exception {
		eventDAO.deleteEvent(eventVO);
	}

	@Override
	public List<EventFileVO> removeEventFileList(EventVO eventVO) throws Exception {
		return eventDAO.removeEventFileList(eventVO);
	}

}
