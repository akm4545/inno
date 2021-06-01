CREATE TABLE INQUIRYTYPE(
	INQUIRYTYPE_IDX INT NOT NULL PRIMARY KEY AUTO_INCREMENT,		/* 문의 타입 인덱스 */
	INQUIRYTYPE_TYPE CHAR(1) NOT NULL								/* 문의 타입 쇼핑몰 = S, 홈페이지 = H, 반응형 웹 = R, 유지보수 = M, 기타 = E */
);
