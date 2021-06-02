package com.innovationT.inno.admin.adminMember.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.innovationT.inno.admin.adminMember.service.AdminIService;
import com.innovationT.inno.admin.adminMember.vo.AdminDefaultVO;
import com.innovationT.inno.admin.adminMember.vo.AdminVO;

@Controller
public class AdminController {
	
    @Autowired
    private AdminIService adminService;
	
    @RequestMapping(value="**")
    public String selectAdminList(AdminDefaultVO searchVO, Model model) throws Exception {
    	//페이징 처리 코드 삽입하거나 vo에 삽입
        List<AdminVO> adminList = adminService.selectAdminList(searchVO);
        
        model.addAttribute("adminList", adminList);
        
        return "**List";
    } 
    
    @RequestMapping("**")
    public String addAdmin(AdminVO adminVO) throws Exception {
    	//정보 암호화 코드 삽입
        adminService.insertAdmin(adminVO);

        return "forward:**";
    }

    @RequestMapping("/**")
    public AdminVO selectAdmin(AdminVO adminVO) throws Exception {
        return adminService.selectAdmin(adminVO);
    }

    @RequestMapping("**")
    public String updateAdmin(AdminVO adminVO) throws Exception {
    	//변경사항 암호화 코드 삽입
        adminService.updateAdmin(adminVO);
        
        return "forward:**";
    }
    
    @RequestMapping("**")
    public String deleteAdmin(AdminVO adminVO) throws Exception {
        adminService.deleteAdmin(adminVO);
        
        return "forward:**";
    }
}
