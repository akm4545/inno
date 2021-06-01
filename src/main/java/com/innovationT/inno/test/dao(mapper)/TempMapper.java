package jPlay.test;

import java.util.List;

public interface **Mapper {
	
	//등록
    public void insert**(**VO vo) throws Exception;

    //수정
    public void update**(**VO vo) throws Exception;

    //삭제
    public void delete**(**VO vo) throws Exception;

    //조회
    public **VO select**(**VO vo) throws Exception;

    //목록조회
    public List<**> select**List(**DefaultVO searchVO) throws Exception;

    //개수조회
    public int select**ListTotCnt(**DefaultVO searchVO);

}
