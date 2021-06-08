DROP TABLE infodata IF EXISTS;

CREATE TABLE infodata  (
    infodata_id BIGINT IDENTITY NOT NULL PRIMARY KEY,
    text1 VARCHAR(20),
    text2 VARCHAR(20)
);

INSERT INTO infodata (text1, text2) VALUES ('text1', 'text11');
INSERT INTO infodata (text1, text2) VALUES ('text2', 'text22');





