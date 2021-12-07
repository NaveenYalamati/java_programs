# java_programs

 insert into mydb.tutorials_tbl values (1,'Ravi','siva');
insert into mydb.tutorials_tbl(tutorial_title, tutorial_author) values ('Raju','Ramu');
UPDATE mydb.tutorials_tbl  SET price = 300 WHERE tutorial_id = 1;
ALTER TABLE mydb.tutorials_tbl ADD Email varchar(255);
ALTER TABLE mydb.tutorials_tbl DROP COLUMN Email;
ALTER TABLE mydb.tutorials_tbl MODIFY COLUMN price int;
SELECT * FROM mydb.tutorials_tbl;

test