CREATE TABLE INQUIRYUSERINFO (
	INQUIRYUSERINFO_IDX INT NOT NULL PRIMARY KEY AUTO_INCREMENT,		/* 문의유저 인덱스 */
	INQUIRY_IDX INT NOT NULL,											/* 문의 테이블 주키 (외래키) */
	INQUIRYUSERINFO_NAME CHAR(10) NOT NULL,								/* 고객 이름 */
	INQUIRYUSERINFO_COMPANY VARCHAR(20),								/* 고객 회사 */
	INQUIRYUSERINFO_NUMBER VARCHAR(15) NOT NULL,						/* 고객 전화번호 */
	INQUIRYUSERINFO_EMAIL VARCHAR(60) NOT NULL,							/* 고객 이메일 */
	INQUIRYUSERINFO_AGREE CHAR(1) NOT NULL,								/* 약관 동의 여부 동의 = T, 비동의 = F*/
	FOREIGN KEY (INQUIRY_IDX) REFERENCES INQUIRY (INQUIRY_IDX)
	ON DELETE CASCADE
);

ALTER TABLE INQUIRYUSERINFO CHANGE INQUIRYUSERINFO_NANE INQUIRYUSERINFO_NAME CHAR(10) NOT NULL;