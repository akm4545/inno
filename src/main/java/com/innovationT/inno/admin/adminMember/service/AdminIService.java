package com.innovationT.inno.admin.adminMember.service;

import java.util.List;

import com.innovationT.inno.admin.adminMember.vo.AdminDefaultVO;
import com.innovationT.inno.admin.adminMember.vo.AdminVO;

public interface AdminIService {

	List<AdminVO> selectAdminList(AdminDefaultVO searchVO) throws Exception;

	void insertAdmin(AdminVO adminVO) throws Exception;

	AdminVO selectAdmin(AdminVO adminVO) throws Exception;

	void updateAdmin(AdminVO adminVO) throws Exception;

	void deleteAdmin(AdminVO adminVO) throws Exception;

}
