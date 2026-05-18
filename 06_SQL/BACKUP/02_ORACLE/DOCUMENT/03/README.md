# CONSTRAINT

---
PK
---
> 예제
```

-- PK 설정 기본1
create table TEST_01(
userid char(10) primary key,
name char(10) not null
);
-- PK 설정 기본2
create table TEST_02(
userid char(10),
name char(10) not null,
primary key(userid)
);

-- 제약 조건 확인(C : not null , P : Primary key) - 데이터 사전 이용한 것 (-- 데이터 사전 싸이트 (https://clipper0317.tistory.com/16)
SELECT CONSTRAINT_NAME, CONSTRAINT_TYPE, TABLE_NAME, A.*
FROM ALL_CONSTRAINTS A
WHERE TABLE_NAME = 'TEST_03';


--컬럼별 제약조건을 조회하는 쿼리
select *  FROM ALL_CONS_COLUMNS WHERE CONSTRAINT_NAME = 'PK_PRODTBL_PROCODE_PRODID';


-- 제약 조건 삭제
alter table TEST_01 drop primary key;


-- 제약 조건 추가
alter table TEST_01 add constraint PK_username primary key (name);


-- 여러 키열을 기본키로 설정
create table TEST_03
( 
prodCode char(3) not null,
prodId char(4) not null,
prodCur char(10) null
);

alter table TEST_03
add constraint pk_prodTbl_proCode_prodId
primary key (prodCode,ProdId);


commit;
```
> 문제
```
```

---
FK
---
> 예제
```
drop table buy_tbl;
drop table prod_tbl;
desc prod_tbl;
desc buy_tbl;
commit;

-- 외래키 제약조건 설정
create table prod_tbl
(
    prod_id number primary key,
    prod_name varchar(40)
);

desc prod_tbl;

create table buy_tbl
(
    buy_id number,
    prod_id number,
    order_date date,
    constraint FK_prodTbl_buyTbl foreign key(prod_id) references prod_tbl(prod_id)
);
desc buy_tbl;
commit;


-- 제약 조건 확인(C : check,not null , P : Primary key, R : foreign key , U : Unique)
SELECT * FROM ALL_CONSTRAINTS where TABLE_NAME='BUY_TBL';

--컬럼별 제약조건을 조회하는 쿼리
select *  FROM ALL_CONS_COLUMNS WHERE CONSTRAINT_NAME = 'FK_PRODTBL_BUYTBL';


-- 외래키 삭제
ALTER TABLE buy_tbl DROP CONSTRAINT FK_prodTbl_buyTbl;

-- 제약 조건 확인(C : check,not null , P : Primary key, R : foreign key , U : Unique)
SELECT * FROM ALL_CONSTRAINTS where TABLE_NAME='BUY_TBL';



-- 외래키 추가
ALTER TABLE buy_tbl ADD CONSTRAINT FK_prodTbl_buyTbl_RE FOREIGN KEY (prod_id) REFERENCES Prod_tbl(prod_id);
-- 제약 조건 확인(C : check,not null , P : Primary key, R : foreign key , U : Unique)
SELECT * FROM ALL_CONSTRAINTS where TABLE_NAME='BUY_TBL';

-- 옵션 추가
ALTER TABLE buy_tbl DROP CONSTRAINT FK_prodTbl_buyTbl_RE;
commit;

ALTER TABLE buy_tbl 
ADD CONSTRAINT FK_prodTbl_buyTbl_RE_Op 
FOREIGN KEY (prod_id) 
REFERENCES Prod_tbl(prod_id)
on delete cascade; -- on update cascade 는 오라클에서 지원하지않는다 트리거 설정을 통해서 처리해야됨


-- 제약 조건 확인(C : check,not null , P : Primary key, R : foreign key , U : Unique)
SELECT * FROM ALL_CONSTRAINTS where TABLE_NAME='BUY_TBL';
```

> 문제
```
```

---
UNIQUE
---
> 예제
```
create table TEST_06
(
    userid char(8) not null primary key,
    name varchar(10) not null,
    birthYear int not null,
    email char(30) null unique
);

-- 제약 조건 확인(C : check,not null , P : Primary key, R : foreign key , U : Unique)
SELECT * FROM ALL_CONSTRAINTS where TABLE_NAME='TEST_06';
select *  FROM ALL_CONS_COLUMNS WHERE CONSTRAINT_NAME = 'SYS_C007454';

create table TEST_07
(
    userid char(8) not null primary key,
    name varchar(10) not null,
    birthyear int not null,
    email char(30) null,
    constraint ak_email unique (email)
);

```
> 문제
```
```

---
CHECK
---
> 예제
```
create table TEST_09
(
	userid char(8) primary key,
	name varchar(10),
    birthyear int check (birthYear >= 1900 and birthYear <=2023),
    mobile1 char(3) null,
    constraint CK_name CHECK (name is NOT NULL)
);

-- 제약 조건 확인(C : check,not null , P : Primary key, R : foreign key , U : Unique)
SELECT * FROM ALL_CONSTRAINTS where TABLE_NAME='TEST_09';
select *  FROM ALL_CONS_COLUMNS WHERE CONSTRAINT_NAME = 'SYS_C007455';


-- 제약조건 확인 
select * from information_schema.table_constraints
where table_name='usertbl' ;
```
> 문제
```
```

---
Default 설정
---
> 예제
```
desc test_01;
ALTER TABLE test_01 MODIFY (name DEFAULT '없음');
commit;

insert into test_01 values('aaa',default);
select * from test_01;
commit;
-- 제약 조건 확인(C : check,not null , P : Primary key, R : foreign key , U : Unique)
SELECT * FROM ALL_CONSTRAINTS where TABLE_NAME='test_01';
select *  FROM ALL_CONS_COLUMNS WHERE CONSTRAINT_NAME = 'SYS_C007455';


--------------------------------------------------------------------------------
--ALTER TABLE WEX001M MODIFY (FNC_SNO NOT NULL);
--ALTER TABLE WEX001M MODIFY (REG_DT NOT NULL);
--ALTER TABLE WEX001M MODIFY (REG_DT DEFAULT SYSDATE);
--ALTER TABLE WEX001M MODIFY (RGR_ID NOT NULL);
--ALTER TABLE WEX001M MODIFY (RGR_ID DEFAULT 'ADMIN');
--ALTER TABLE WEX001M MODIFY (UPD_DT NOT NULL);
--ALTER TABLE WEX001M MODIFY (UPD_DT DEFAULT SYSDATE);
--ALTER TABLE WEX001M MODIFY (UPDR_ID NOT NULL);
--ALTER TABLE WEX001M MODIFY (UPDR_ID DEFAULT 'ADMIN');
--------------------------------------------------------------------------------


--1. DEFAULT 설정

--ALTER TABLE [테이블명] MODIFY ([컬럼명] DEFAULT [설정할 DEFAULT]);

--설정할 DEFAULT가 SYSDATE, 숫자의 경우 ' ' 없이 사용

--설정할 DEFAULT가 문자일 경우 ' '로 묶어서 사용
--EX) ALTER TABLE WEX001M MODIFY (REG_DT DEFAULT SYSDATE);
--EX) ALTER TABLE WEX001M MODIFY (UPDR_ID DEFAULT 0);
--EX) ALTER TABLE WEX001M MODIFY (UPDR_ID DEFAULT 'ADMIN');

-- 컬럼 1개에 NOT NULL, DEFAULT를 설정하고 싶으면 위처럼 명령문을 실행하면 된다.
-- 2. NULL, NOT NULL설정
ALTER TABLE [테이블명] MODIFY ([컬럼명] NULL);
ALTER TABLE [테이블명] MODIFY ([컬럼명] NOT NULL);
```
> 문제
```
```
