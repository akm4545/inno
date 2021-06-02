CREATE TABLE EVENT(
	EVENT_IDX INT NOT NULL PRIMARY KEY AUTO_INCREMENT,			/* 행사 인덱스 */
	EVENT_TITLE VARCHAR(40) NOT NULL, 							/* 행사 제목 */
	EVENT_CONTENT TEXT,											/* 행사 글 */
	EVENT_DATE DATETIME NOT NULL DEFAULT NOW()  				/* 행사 날짜 */
);