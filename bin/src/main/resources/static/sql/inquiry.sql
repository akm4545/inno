CREATE TABLE INQUIRY(
	INQUIRY_IDX INT NOT NULL PRIMARY KEY AUTO_INCREMENT,		/* 문의 인덱스 */
	INQUIRY_PAGENUMBER INT, 									/* 개발, 유지보수 페이지 수*/
	INQUIRY_PAY VARCHAR(30),                                    /* 예상 비용 */
	INQUIRY_CONTENT TEXT NOT NULL,                              /* 문의 내용 */
	INQUIRY_DATE DATETIME NOT NULL DEFAULT NOW(), 				/* 문의 날짜 */
	INQUIRY_CHECK CHAR(1) NOT NULL DEFAULT 'F'					/* 문의 처리 여부 처리 = T, 미처리 = F*/
);