package com.innovationT.inno.event.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.innovationT.inno.event.service.EventService;
import com.innovationT.inno.event.vo.EventDefaultVO;
import com.innovationT.inno.event.vo.EventFileVO;
import com.innovationT.inno.event.vo.EventVO;

@Controller
public class EventController {
	
	//**은 기능 혹은 분류가 들어갈 칸
    @Autowired
    private EventService eventService;
	
    //여러건 조회
    @RequestMapping(value="**")
    public String selectEventList(EventDefaultVO searchVO, Model model) throws Exception {
    	
    	int totCnt = eventService.selectEventListTotCnt();
    	
        List<EventVO> eventList = eventService.selectEventList(searchVO);
        
        model.addAttribute("eventList", eventList);
        
        return "**List";
    } 
    
    //입력
    @RequestMapping("**")
    public String addEvent(EventVO eventVO) throws Exception {
    	//파일 저장 서비스 기능 삽입 (추출해야 할것 = 변경된 파일명, 디렉토리)
    	try {
    		List<EventFileVO> eventFileVOList = eventService.saveEventFile(/* 이벤트 파일 매개변수 전달*/);
    		
    		//트랜잭션 처리 필요 
    		eventService.insertEvent(eventVO);
    		eventService.insertEventFileList(eventFileVOList);
    	}catch (Exception e) {
    		e.printStackTrace();
    		//저장된 이벤트 파일 목록 삭제 
		}
        
        return "forward:**";
    }

    @RequestMapping("/**") 
    public Map<String,List<EventVO>> selectEvent(EventVO eventVO) throws Exception {
    	Map<String,List<EventVO>> eventMap = new HashMap<String, List<EventVO>>();
    	
    	List<EventVO> event = eventService.selectEvent(eventVO);
    	List<EventVO> eventFileList = eventService.selectEventFileList(event.get(0).getEventIdx());
    	
    	eventMap.put("event", null) ;
    	eventMap.put("eventFileList", eventFileList);
    	
    	return  eventMap;
    }

	//수정
    @RequestMapping("**") 
    public String updateEvent(EventVO eventVO, @RequestParam("eventFileIdx") List<String> eventFileIdxList) throws Exception {
    	//프론트단에서 수정한 파일의 idx번호를 전송받는다.
    	//추후에 구현 가능한지 테스트
    	
		//사용자가 삭제한 파일 삭제 로직 
    	//트랜잭션 처리
    	//파일 디렉토리 설정에 따라서 db에서 디렉토리랑 파일명 추출 작업
    	if(eventFileIdxList != null) {
    		List<EventFileVO> deleteList = eventService.deleteEventFileList(eventFileIdxList);
    		eventService.deleteEventFiletoFoder(deleteList);
    		eventService.deleteEventFile(deleteList);
    	}
		    	
		//새로 저장된 파일이 있는지 로직 작성후 이프문으로 분기
		if(true) {
			List<EventFileVO> eventFileVOList = eventService.saveEventFile(/* 이벤트 파일 매개변수 전달*/);
			
			eventService.insertEventFileList(eventFileVOList);
		}
		
		eventService.updateEvent(eventVO);  
    	
    	return "forward:**"; 
    }
	
    @RequestMapping("**") 
    public String deleteEvent(EventVO eventVO) throws Exception { 
    	List<EventFileVO> deleteList = eventService.removeEventFileList(eventVO);
    	
    	eventService.deleteEventFiletoFoder(deleteList);
    	
    	eventService.deleteEvent(eventVO);
    	
    	return "forward:**"; 
    }
}