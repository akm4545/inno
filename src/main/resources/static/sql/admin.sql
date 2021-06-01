CREATE TABLE ADMIN (
	ADMIN_IDX INT NOT NULL PRIMARY KEY AUTO_INCREMENT,		/* 관리자 테이블 인덱스 */
	ADMIN_ID VARCHAR(30) NOT NULL,							/* 관리자 아이디 */
	ADMIN_PASSWORD VARCHAR(60) NOT NULL,					/* 관리자 비밀번호 */
	ADMIN_GRADE INT NOT NULL								/* 관리자 등급 관리자 = 1 ... 오름차순*/
);