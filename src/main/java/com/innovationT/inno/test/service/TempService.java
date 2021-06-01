package jPlay.test;

public interface **Service {
	//삽입
    String insert**(**VO vo) throws Exception;
    //수정
    void update**(**VO vo) throws Exception;
    //삭제
    void delete**(**VO vo) throws Exception;
    //개별조회
    **VO select**(**VO vo) throws Exception;
    //전체조회
    List select**List(**DefaultVO searchVO) throws Exception;
    //개수
    int select**ListTotCnt(**DefaultVO searchVO);
    
}
