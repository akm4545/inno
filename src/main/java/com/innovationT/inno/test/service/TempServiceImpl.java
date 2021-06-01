package jPlay.test;

@Service("**Service")
public class **ServiceImpl implements **Service {
       
    @Autowired
    private **Mapper **DAO;
    
    //삽입
    public String insert**(**VO vo) throws Exception {
    	**DAO.insert**(vo);
    	//TODO 해당 테이블 정보에 맞게 수정    	
        return null;
    }

    //수정
    public void update**(**VO vo) throws Exception {
        **DAO.update**(vo);
    }
    
    //삭제
    public void delete**(**VO vo) throws Exception {
        **DAO.delete**(vo);
    }

    //조회
    public **VO select**(**VO vo) throws Exception {
        **VO resultVO = **DAO.select**(vo);
        
        return resultVO;
    }

    //목록조회
    public List<**> select**List(**DefaultVO searchVO) throws Exception {
        return **DAO.select**List(searchVO);
    }

    //페이징 처리용 개수
    public int select**ListTotCnt(**DefaultVO searchVO) {
		return **DAO.select**ListTotCnt(searchVO);
	}
    
}
