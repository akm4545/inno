CREATE TABLE EVENTFILE (
	EVENTFILE_IDX INT NOT NULL PRIMARY KEY AUTO_INCREMENT,		/* 행사파일 인덱스 */
	EVENT_IDX INT NOT NULL,										/* 행사 테이블 주키(외래키) */
	EVENTFILE_DIR VARCHAR(100) NOT NULL, 						/* 행사파일 경로 */
	EVENTFILE_NAME VARCHAR(60) NOT NULL,						/* 파일 이름 */
	EVENTFILE_TYPE CHAR(1) NOT NULL DEFAULT 'F', 				/* 썸네일 파일 = T, 나머지 = F */
	FOREIGN KEY (EVENT_IDX) REFERENCES EVENT (EVENT_IDX)
	ON DELETE CASCADE
);

ALTER TABLE EVENTFILE CHANGE COLUMN EVNETFILR_TYPE EVENTFILE_TYPE CHAR(1) NOT NULL DEFAULT 'F';