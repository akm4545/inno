package com.innovationT.inno.inquiry.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.innovationT.inno.inquiry.dao.InquiryMapper;
import com.innovationT.inno.inquiry.vo.Inquiry;
import com.innovationT.inno.inquiry.vo.InquiryDefaultVO;
import com.innovationT.inno.inquiry.vo.InquiryFileVO;
import com.innovationT.inno.inquiry.vo.InquiryReservationVO;
import com.innovationT.inno.inquiry.vo.InquirySiteVO;
import com.innovationT.inno.inquiry.vo.InquiryTemplateVO;
import com.innovationT.inno.inquiry.vo.InquiryTypeLinkVO;
import com.innovationT.inno.inquiry.vo.InquiryUserInfoVO;
import com.innovationT.inno.inquiry.vo.InquiryVO;

@Service("inquiryService")
public class InquiryServiceImpl implements InquiryService{

	@Autowired
	private InquiryMapper inquiryDAO;
	
//	public String insertInquiry(HashMap<String, Inquiry> map) throws Exception {
//		inquiryDAO.insertInquiry(map);
//		return null;
//	}
	
//	@Override
//	public void insertInquiryVO(InquiryVO inquiryVO) throws Exception {
//		inquiryDAO.insertInquiry(inquiryVO);
//	}
	
//	@Override
//	public void insertInquiry(int inquiryIdx, Inquiry inquiry) throws Exception {
//		inquiryDAO.insertInquiry(inquiryIdx, inquiry);
//	}
	
	@Override
	public void insertInquiry(InquiryVO inquiryVO) throws Exception {
		inquiryDAO.insertInquiryVO(inquiryVO);
	}
	
	@Override
	public void insertInquiry(InquiryFileVO inquiryFileVO) throws Exception {
		inquiryDAO.insertInquiryFileVO(inquiryFileVO);
		
	}

	@Override
	public void insertInquiry(InquiryReservationVO inquiryReservationVO) throws Exception {
		inquiryDAO.insertInquiryReservationVO(inquiryReservationVO);
		
	}

	@Override
	public void insertInquiry(InquirySiteVO inquirySiteVO) throws Exception {
		inquiryDAO.insertInquirySiteVO(inquirySiteVO);
		
	}

	@Override
	public void insertInquiry(InquiryTypeLinkVO inquiryTypeLinkVO) throws Exception {
		inquiryDAO.insertInquiryTypeLinkVO(inquiryTypeLinkVO);
		
	}

	@Override
	public void insertInquiry(InquiryUserInfoVO inquiryUserInfoVO) throws Exception {
		inquiryDAO.insertInquiryUserInfoVO(inquiryUserInfoVO);
		
	}

	@Override
	public void insertInquiryList(int inquiryIdx, List<? extends Inquiry> inquiryList) throws Exception {
		for (int i = 0; i < inquiryList.size(); i++) {
			if (inquiryList.get(i) instanceof InquiryFileVO) {
				InquiryFileVO tmpVO = (InquiryFileVO)inquiryList.get(i);
				tmpVO.setInquiryIdx(inquiryIdx);
				insertInquiry(tmpVO);
			} else if (inquiryList.get(i) instanceof InquirySiteVO) {
				InquirySiteVO tmpVO = (InquirySiteVO)inquiryList.get(i);
				tmpVO.setInquiryIdx(inquiryIdx);
				insertInquiry(tmpVO);
			} else if (inquiryList.get(i) instanceof InquiryTypeLinkVO) {
				InquiryTypeLinkVO tmpVO = (InquiryTypeLinkVO)inquiryList.get(i);
				tmpVO.setInquiryIdx(inquiryIdx);
				insertInquiry(tmpVO);
			}
		}
//		inquiryDAO.insertInquiryList(inquiryIdx, inquiryList);
	}

	@Override
	public void updateInquiry(InquiryTemplateVO inquiryTemplateVO) throws Exception {
		
		// 트랜잭션 처리 필요
		deleteAndinsertList(inquiryTemplateVO.getInquiryFileVOList());
		inquiryDAO.updateInquiryVO(inquiryTemplateVO.getInquiryVO());
//		List<Integer> inquiryFileIdxList = inquiryDAO.selectIdxList(inquiryFileVOList);
//		for (int i = 0; i < inquiryFileVOList.size(); i++) {
//			InquiryFileVO inquiryFileVO = inquiryFileVOList.get(i);
//			for (int j = 0; j < inquiryFileIdxList.size(); j++) {
//				if (inquiryFileVO.getInquiryFileIdx() == 0) {
//					inquiryDAO.insertInquiry(inquiryFileVO.getInquiryIdx(), inquiryFileVO);
//				} else if (inquiryFileIdxList.contains(inquiryFileVO.getInquiryIdx())) {
//					inquiryDAO.updateInquiry(inquiryFileVO);
//				}
//			}
//		}
//		inquiryDAO.deleteInquiryList(inquiryFileVOList.get(0));
//		for (int i = 0; i < inquiryFileVOList.size(); i++) {
//			InquiryFileVO inquiryFileVO = inquiryFileVOList.get(i);
//			inquiryDAO.insertInquiry(inquiryFileVO.getInquiryIdx(), inquiryFileVO);
//		}
		deleteAndinsertList(inquiryTemplateVO.getInquiryTypeLinkVOList());
		inquiryDAO.updateInquiryUserInfoVO(inquiryTemplateVO.getInquiryUserInfoVO());
		deleteAndinsertList(inquiryTemplateVO.getInquirySiteVOList());
		inquiryDAO.updateInquiryReservationVO(inquiryTemplateVO.getInquiryReservationVO());
	}

	@Override
	public void deleteInquiry(InquiryVO inquiryVO) throws Exception {
		inquiryDAO.deleteInquiry(inquiryVO);
	}

	@Override
	public InquiryTemplateVO selectInquiry(Inquiry inquiry) throws Exception {
		
		// 트랜잭션 필요
		InquiryTemplateVO result = new InquiryTemplateVO();
//		InquiryVO inquiryVO = inquiryDAO.selectInquiry(inquiry);
//		InquiryUserInfoVO inquiryUserInfoVO = inquiryDAO.selectInquiryUserInfo(inquiry);
//		InquiryReservationVO inquiryReservationVO = inquiryDAO.selectInquiryReservation(inquiry);
//		List<InquiryFileVO> inquiryFileVOList = inquiryDAO.selectInquiryFileList(inquiry);
//		List<InquiryTypeLinkVO> inquiryTypeLinkVOList = inquiryDAO.selectInquiryTypeLinkList(inquiry);
//		List<InquirySiteVO> inquirySiteVOList = inquiryDAO.selectInquirySiteList(inquiry);
		
//		result.setInquiryVO(inquiryVO);
//		result.setInquiryUserInfoVO(inquiryUserInfoVO);
//		result.setInquiryReservationVO(inquiryReservationVO);
//		result.setInquiryFileVOList(inquiryFileVOList);
//		result.setInquiryTypeLinkVOList(inquiryTypeLinkVOList);
//		result.setInquirySiteVOList(inquirySiteVOList);
		
		int inquiryIdx = inquiry.getInquiryIdx();
		
		result.setInquiryVO(inquiryDAO.selectInquiry(inquiryIdx));
		result.setInquiryUserInfoVO(inquiryDAO.selectInquiryUserInfo(inquiryIdx));
		result.setInquiryReservationVO(inquiryDAO.selectInquiryReservation(inquiryIdx));
		result.setInquiryFileVOList(inquiryDAO.selectInquiryFileList(inquiryIdx));
		result.setInquiryTypeLinkVOList(inquiryDAO.selectInquiryTypeLinkList(inquiryIdx));
		result.setInquirySiteVOList(inquiryDAO.selectInquirySiteList(inquiryIdx));
		
		return result;
	}

	@Override
	public List<InquiryTemplateVO> selectInquiryList(InquiryDefaultVO searchVO) throws Exception {
		return inquiryDAO.selectBoardList(searchVO);
	}

	@Override
	public int selectInquiryListTotCnt(InquiryDefaultVO searchVO) throws Exception {
		return inquiryDAO.selectInquiryListTotCnt(searchVO);
	}
	
	@Override
	public void deleteAndinsertList(List<? extends Inquiry> inquiryList) throws Exception{
		if (inquiryList.size() != 0) {
			for (int i = 0; i < inquiryList.size(); i++) {
				if (inquiryList.get(i) instanceof InquiryFileVO) {
					
					InquiryFileVO tmpVO = (InquiryFileVO)inquiryList.get(i);
					
					if (i == 0) {
						inquiryDAO.deleteInquiryFileList(tmpVO.getInquiryIdx());
					}
					
					inquiryDAO.insertInquiryFileVO(tmpVO);
				} else if (inquiryList.get(i) instanceof InquiryTypeLinkVO) {

					InquiryTypeLinkVO tmpVO = (InquiryTypeLinkVO)inquiryList.get(i);
					
					if (i == 0) {
						inquiryDAO.deleteInquiryTypeLinkList(tmpVO.getInquiryIdx());
					}
					
					inquiryDAO.insertInquiryTypeLinkVO(tmpVO);
				} else if (inquiryList.get(i) instanceof InquirySiteVO) {

					InquirySiteVO tmpVO = (InquirySiteVO)inquiryList.get(i);
					
					if (i == 0) {
						inquiryDAO.deleteInquirySiteList(tmpVO.getInquiryIdx());
					}
					
					inquiryDAO.insertInquirySiteVO(tmpVO);
				}
			}
		}
	}

	@Override
	public void updateToCheck(int inquiryIdx) throws Exception {
		inquiryDAO.updateToCheck(inquiryIdx);
	}
	
}
