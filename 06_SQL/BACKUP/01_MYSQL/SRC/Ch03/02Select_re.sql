-- 01 select group by 
use shopdb;

-- Userid별 amount 총합(sum)
select userid,sum(amount) as '구매총량' from buytbl group by userid;
-- userid별 amount*price 의 총합(sum)
select userid, sum(amount*price) as '구매총액' from buytbl group by userid;
-- avg 를 이용
select userid,avg(amount) as '구매평균값' from buytbl group by userid;
select userid, truncate(avg(amount*price),2)  as '구매평균액' from buytbl group by userid;
-- max(),min()
select max(height) from usertbl;
select min(height) from usertbl;

-- 가장 큰키를 가지는 user의 모든 열의값 확인
select * from usertbl where height=(select max(height) from usertbl);
-- 가장 작은키를 가지는 user의 모든 열의값 확인
select * from usertbl where height=(select min(height) from usertbl);
-- 가장 큰키와 가장 작은키의 값만 확인
select * from usertbl where 
height=(select max(height) from usertbl)
or
height=(select min(height) from usertbl);

-- 문제 
-- 1 buytbl에서 userid 별로 구매량(amount)의 합을 출력하세요
-- 2 usertbl에서 키의 평균값을 구하세요
-- 3 buy테이블에서 최대구매량과 최소구매량을 userid와함께 출력하세요
-- 4 buytbl의 groupname 의 개수를 출력하세요
-- 문제(classicmodels db로 이동 이후 작업하세요)
-- 1 customers테이블의 city 를 그룹으로 creditLimit의 평균을 구하세요 
-- 2 orderdetails테이블의 orderNumber를 그룹으로quntityOrdered의 총합을 출력하세요
-- 3 products테이블의 productVendor를 그룹으로quantityInStock의 총합을 출력하세요 


-- 02 select group by + having
use shopdb;
select userid,sum(amount) as '구매총량' from buytbl  group by userid having sum(amount)>5; -- o
select userid,sum(amount) as '구매총량' from buytbl  group by userid having '구매총량'>5; -- x
select userid, truncate(avg(amount*price),2)  as '구매평균액' 
from buytbl 
group by userid;






 


