# INSERT/UPDATE/DELETE

---
INSERT
---
> 예제
```
CREATE TABLE testTbl1 (id int,userName char(10),age int);

INSERT INTO testTbl1 VALUES (1,'홍길동',25); -- 모든열 데이터 입력
INSERT INTO testTbl1(id,userName) VALUES(2,'강동원'); -- 특정열 데이터 입력
INSERT INTO testTbl1(username,age,id) VALUES('이수근',26,3); --순서변경;
SELECT * FROM testTbl1;
```

---
오라클 시퀀스
---
```
-- 1) 예제 테이블 생성
create table tmp(
    idx_tmp number(10),
    name    varchar(1000)
);

-- 2) 시퀀스 생성 
CREATE SEQUENCE tmp_seq START WITH 1 
INCREMENT BY 1 
MAXVALUE 100 
CYCLE NOCACHE;


-- 3) 시퀀스를 사용한 값 삽입
INSERT INTO tmp values(tmp_seq.NEXTVAL, 'tmptmp1');
INSERT INTO tmp values(tmp_seq.NEXTVAL, 'tmptmp2');
INSERT INTO tmp values(tmp_seq.NEXTVAL, 'tmptmp3');

-- 4) 값 조회
select * from tmp;

-- 정의된 시퀀스 확인
select * from user_sequences;

```
