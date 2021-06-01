CREATE TABLE COMPANY (
	COMPANY_IDX INT NOT NULL PRIMARY KEY AUTO_INCREMENT, /* 회사 인덱스 */
	COMPANY_DIR VARCHAR(100) NOT NULL,					 /* 파일 경로 */
	COMPANY_NAME VARCHAR(60) NOT NULL,					 /* 파일 이름 */
	COMPANY_TYPE CHAR(1) NOT NULL, 						 /* 파일 타입 M = 메인사진, C = 조직도, H = 인사말 이미지, F = 기업 소개서, T = 포토폴리오 썸네일, D = 포토폴리오 세부사항*/
	COMPANY_CONTENT TEXT 
);