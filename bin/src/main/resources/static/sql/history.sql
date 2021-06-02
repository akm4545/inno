CREATE TABLE HISTORY (
	HISTORY_IDX INT NOT NULL PRIMARY KEY AUTO_INCREMENT, /* 연혁 인덱스 */
	HISTORY_DATE DATETIME NOT NULL DEFAULT NOW(),        /* 연혁 날짜 */
	HISTORY_CONTENT TEXT NOT NULL                        /* 연혁 내용 */ 
);