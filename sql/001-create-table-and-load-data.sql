DROP TABLE IF EXISTS names;

CREATE TABLE names (
    id int unsigned AUTO_INCREMENT,
    name VARCHAR(20) NOT NULL,
    PRIMARY KEY(id)
  );

INSERT INTO names (id, name) VALUES (1, "フランク・ダラボン");
INSERT INTO names (id, name) VALUES (2, "片渕須直");
INSERT INTO names (id, name) VALUES (3, "宮崎駿");
INSERT INTO names (id, name) VALUES (4, "鶴橋康夫 ");