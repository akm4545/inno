CREATE TABLE INQUIRYRESERVATION(
	INQUIRYRESERVATION_IDX INT NOT NULL PRIMARY KEY AUTO_INCREMENT,		/* 예약 테이블 인덱스 */
	INQUIRY_IDX INT NOT NULL,											/* 문의 테이블 주키(외래키) */
	INQUIRYRESERVATION_TYPE CHAR(1) NOT NULL DEFAULT 'N',				/* 예약 타입 선택안함 = N, 전화 = T, 방문 = V */
	FOREIGN KEY INQUIRY_IDX REFERENCES INQUIRY (INQUIRY_IDX)
	ON DELETE CASCADE
);