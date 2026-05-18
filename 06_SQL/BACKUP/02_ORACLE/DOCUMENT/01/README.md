#SELECT 

---
INIT
---
> 기본환경 설정
```
-- 기존 테이블 삭제
drop table buytbl;
drop table userTbl;

-- UserTbl 만들기
CREATE TABLE userTbl( -- 회원테이블
userID CHAR(8) NOT NULL PRIMARY KEY, -- 사용자아이디
name VARCHAR(10) NOT NULL, -- 이름
birthYear INT NOT NULL, -- 출생년도
addr NCHAR(2) NOT NULL, --지역(2글자만 입력, 경남,서울,경기..)
mobile1 CHAR(3), -- 휴대폰의 국번(011,016...)
mobile2 CHAR(8), -- 휴대폰의 나머지 전화번호
height SMALLINT, -- 키
mDate DATE --회원가입일
);

-- Buytbl 만들기
CREATE TABLE buyTbl( -- 회원 구매 테이블
num INT NOT NULL PRIMARY KEY, -- 순번(PK) 
userID CHAR(8) NOT NULL, --
prodName CHAR(15) NOT NULL, -- 물품명
groupName CHAR(15), -- 분류
price INT NOT NULL, -- 단가
amount SMALLINT NOT NULL, -- 수량
FOREIGN KEY (userID) REFERENCES userTbl(userID)
);

-- Usertbl 값삽입
INSERT INTO userTbl VALUES('LSG','이승기',1987,'서울','011','1111111',182,'2008-8-8');
INSERT INTO userTbl VALUES('KBS','김범수',1979,'경남','011','2222222',173,'2012-4-4');
INSERT INTO userTbl VALUES('KKH','김경호',1971,'전남','019','3333333',177,'2007-7-7');
INSERT INTO userTbl VALUES('JYP','조용필',1950,'경기','011','4444444',166,'2009-4-4');
INSERT INTO userTbl VALUES('SSK','성시경',1979,'서울',NULL,NULL,186,'2013-12-12');
INSERT INTO userTbl VALUES('LJB','임재범',1963,'서울','016','6666666',182,'2009-9-9');
INSERT INTO userTbl VALUES('YJS','윤종신',1969,'경남',NULL,NULL,170,'2005-5-5');
INSERT INTO userTbl VALUES('EJW','은지원',1972,'경북','011','8888888',174,'2014-3-3');
INSERT INTO userTbl VALUES('JKW','조관우',1965,'경기','018','9999999',172,'2010-10-10');
INSERT INTO userTbl VALUES('BBK','바비킴',1973,'서울','010','0000000',176,'2013-5-5');

select * from usertbl;

-- Buytbl 값 삽입

INSERT INTO buyTbl VALUES(1,'KBS','운동화',NULL,30,2);
INSERT INTO buyTbl VALUES(2,'KBS','노트북','전자',1000,1);
INSERT INTO buyTbl VALUES(3,'JYP','모니터','전자',200,1);
INSERT INTO buyTbl VALUES(4,'BBK','모니터','전자',200,5);
INSERT INTO buyTbl VALUES(5,'KBS','청바지','의류',50,3);
INSERT INTO buyTbl VALUES(6,'BBK','메모리','전자',80,10);
INSERT INTO buyTbl VALUES(7,'SSK','책','서적',15,5);
INSERT INTO buyTbl VALUES(8,'EJW','책','서적',15,2);
INSERT INTO buyTbl VALUES(9,'EJW','청바지','의류',50,1);
INSERT INTO buyTbl VALUES(10,'BBK','운동화',NULL,30,2);
INSERT INTO buyTbl VALUES(11,'EJW','책','서적',15,1);
INSERT INTO buyTbl VALUES(12,'BBK','운동화',NULL,30,2);

-- buytbl 확인
select * from buytbl;

-- 테이블 조회(모든 테이블 확인, all_tables 라는 System View 사용)
select * from all_tables;

-- 테이블 조회(유저가 생성한 테이블 확인, user_tables 라는 System View 사용)
select * from user_tables;

```

---
1 SELECT 기본
---
> 예제
```
-- 조건절 추가
select * from usertbl;
select * from usertbl where name='김경호';

-- 조건절 + 관계연산자
select * from usertbl where birthyear >=1970 and height>=182;
select * from usertbl where birthyear >=1970 or height>=182;

-- BetWeen..And
SELECT Name,height FROM userTbl WHERE height BETWEEN 180 AND 183;

-- IN
SELECT Name,height FROM userTbl WHERE addr IN('경남','전남','경북');

-- LIKE
SELECT Name,height FROM userTbl WHERE name LIKE '김%';
SELECT Name,height FROM userTbl WHERE name LIKE '_재범';
```

> 문제
```
[buyTbl]

1 구매양(amount)가 5개 이상인 행을 출력
2 가격이(price) 50 이상 500 이하인 행의 UserID와 prodName   만 출력
3 구매양(price)이 10 이상 이거나 가격이 100 이상인 행 출력
4 UserID 가 K로 시작하는 행 출력
5 ‘서적’ 이거나 ‘전자’ 인 행 출력
6 상품(prodName)이 책이거나 userID가  W로 끝나는 행출력 
```
---
2 SELECT 서브쿼리
---
> 예제
```
-- 서브쿼리
SELECT Name,height FROM userTbl 
WHERE height < (SELECT height FROM userTbl WHERE Name='김경호');

-- 서브쿼리(하나이상의 결과물 - 오류)
SELECT Name,height FROM userTbl 
WHERE height < (SELECT height FROM userTbl WHERE addr='경남');

-- 서브쿼리 + ANY
SELECT Name, height FROM userTbl
 WHERE height >= ANY (SELECT height FROM userTbl WHERE addr='경남');

-- 서브쿼리 + ALL
SELECT Name, height FROM userTbl
 WHERE height >= ALL (SELECT height FROM userTbl WHERE addr='경남');
```
> 문제
```
[buyTbl]

1 amount가 10인 행의 price보다 큰 행을 출력하세요(서브쿼리)
2 userID 가 K로 시작하는 행의 amount 보다 큰 행을 출력하세요(서브쿼리 + ANY)
3 amount 가 5인 행의 price보다 큰 행을 출력하세요(서브쿼리 + ALL)

```

---
3 SELECT 정렬
---
> 예제
```
-- 오름차순
SELECT Name , mDate FROM userTbl ORDER BY mDate;

-- 내림차순
SELECT Name , mDate FROM userTbl ORDER BY mDate DESC;

-- 오름+내림
 SELECT Name, height FROM userTbl ORDER BY height DESC, name ASC;

-- DISTINCT
SELECT DISTINCT addr FROM userTbl;

-- Rownum(LIMIT) 행마다 기본적으로 부여되는 num 

select * from (select rownum as RN, usertbl.* from usertbl) where RN=2;
select * from (select rownum as RN, usertbl.* from usertbl) where RN>=2 and RN<=4;
```

---
4 테이블 복사
---
> 예제
```
-- 테이블 복사하기 스키마 & 데이터
create table buytbl2 as select * from buytbl;
select * from buytbl2;
desc buytbl2;

-- 테이블 구조만 복사하기
create table buytbl3 as select * from buytbl
where 1=2;
select * from buytbl3;
desc buytbl3;

-- 데이터만 복사(테이블 구조 동일시)
insert into buytbl3 select * from buytbl;
select * from buytbl3;
```
> 문제
```
[buyTbl]

1 userId 순으로 오름차순 정렬
2 price 순으로 내림차순 정렬
3 amount 순으로 오름차순 prodName으로 내림차순정렬
4 prodName을 오름차순으로 정렬시 중복 제거
5 userID열의 검색시 중복된 아이디제거하고 select
6 구매양(amount)가 3이상인 행을 prodName 내림차순으로 정렬
7 usertbl의 addr 가 서울,경기인 값들을 CUsertbl에 복사

```
---
5 GROUP BY
---
> 예제
```
-- Group by 기본
SELECT userID,amount FROM buyTbl ORDER BY userID;
SELECT userID,SUM(amount) FROM buyTbl GROUP BY userID;

-- Group by +  별칭
SELECT userID,SUM(amount) as "별칭"  FROM buyTbl GROUP BY userID;
select userID AS "사용자 아이디" , sum(price*amount) AS "총구매액" from buytbl group by userid;

-- AVG()
select AVG(amount) as "평균 구매 개수" from buytbl;
select userid,AVG(amount) as "평균 구매 개수" from buytbl group by userid;

-- MAX(),MIN()
SELECT AVG(amount*1.0) AS "평균구매 개수" FROM buyTbl;

-- Trunc 소수점 자르기
SELECT trunc(AVG(amount),5) AS "평균구매 개수" FROM buyTbl;

-- 큰키 / 작은키
select name,height from usertbl where height=(select Max(height) from usertbl)
or height=(select min(height) from usertbl);

-- Count(*)
select count(*) from usertbl;  -- count(*) 전체 행개수
select count(mobile1) as "휴대폰이 있는 사용자" from usertbl; 
```
> 문제
```
1 buytbl에서 userid 별로 구매량(amount)의 합을 출력하세요
2 usertbl에서 키의 평균값을 구하세요
3 buy테이블에서 최대구매량과 최소구매량을 userid와함께 출력하세요
4 buytbl의 groupname 의 개수를 출력하세요
```
---
6 HAVING
---
> 예제
```
-- group by 시 where 대신 having 을 조건절로 하지 않으면 오류발생
select userid,sum(price*amount) as "총구매액" from buytbl  where sum(price*mount) >1000 group by userid ;

-- Having 으로 변경
select userid,sum(price*amount) as "총구매액" from buytbl   group by userid Having sum(price*amount) > 1000;

-- Having + Order by
select userid,sum(price*amount) as "총구매액" from buytbl   group by userid having sum(price*amount) > 1000
order by Sum(price*amount);

-- ROLLUP(소합계 + 총합계)
select  num,groupName, SUM(price*amount) AS "비용" FROM buyTbl 
GROUP BY Rollup(groupName,num);

-- ROLLUP(총합계)
select  groupName, SUM(price*amount) AS "비용" FROM buyTbl 
GROUP BY Rollup(groupName);
```
> 문제
```
1. prodName별로 그룹화 한뒤 userID / prodName/Price*amount 순으로 출력될 수 있도록 설정
2. 1 번 명령어에서 price*amount 값이 1000이상인 행만 출력
3. price 가격이 가장 큰 행과 작은 행의 userid , prodName,price을 출력
4. 다음 행중에 그룹네임이 있는 행만 출력
5 prodName 별로 총합을 구해보세요(ROLLUP 사용)SELECT prodName ,SUM(price*aOM 
```
