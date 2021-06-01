package jPlay.test;

@Controller
public class **Controller {

	//**은 기능 혹은 분류가 들어갈 칸
    @Autowired
    private **Service **Service;
	
    //여러건 조회
    @RequestMapping(value="**")
    public String select**List(**DefaultVO searchVO, ModelMap model) throws Exception {
    	//페이징 처리 코드 삽입하거나 vo에 삽입
        List<클래스명> **List = **Service.select**List(searchVO);
        model.addAttribute("resultList", **List);
        
        return "**List";
    } 
    
    //입력
    @RequestMapping("**")
    public String addCex(**VO **VO, **DefaultVO searchVO) throws Exception {
        **Service.insert**(**VO);

        return "forward:**";
    }

    //한건조회
    @RequestMapping("/**")
    public **VO select**(**VO **VO, **DefaultVO searchVO) throws Exception {
        return **Service.select**(**VO);
    }

    //수정
    @RequestMapping("**")
    public String update**(**VO **VO, **DefaultVO searchVO) throws Exception {
        **Service.update**(**VO);
        
        return "forward:**";
    }
    
    //삭제
    @RequestMapping("**")
    public String delete**(**VO **VO, **DefaultVO searchVO) throws Exception {
        **Service.delete**(**VO);
        
        return "forward:**";
    }

}
