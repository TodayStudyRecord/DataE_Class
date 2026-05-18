# DB ERROR NOTE

INDEX
---
### [파일업로드] - 2024-02-02

[DESCRIPTION]  <br>
my.ini 파일 수정 후 mysql80 서비스 미동작 문제

<br>
[ERROR] <br>
 <br>
 
![MYSQL 파일업로드](https://github.com/EM-ORG-2023-12-27/03_DATABASE/assets/84259104/6e412dac-cbd5-4ab5-9d12-483ed05e58de)

<br><br>
[STATUS-OK] <br>
원인 : my.ini 설정이후 c:\sql 폴더 미생성으로 인한 오류<br/>
해결방안-01 : 폴더 생성<br/>


[Reference] <br>
.
 
---

### [SELECT] - 2023-01-30

[DESCRIPTION]  <br>
Select group by 사용관련 오류 문제  
<br>
[ERROR] <br>
select userid,prodname,sum(price*amount) from buytbl group by prodname   Error Code: 1055. Expression #1 of SELECT list is not in GROUP BY clause and contains nonaggregated column 'shopdb.buytbl.userID' which is not functionally dependent on columns in GROUP BY clause; this is incompatible with sql_mode=only_full_group_by   0.000 sec
<br><br>
[STATUS-OK] <br>
원인 : MYSQL 5.7 이후 발생문제 , group by 시 특정 컬럼 대상항목으로 포함되어지지 않는경우 모호해지는 문제<br/>
해결방안-01 : Sql 쿼리창에서 다음 전역변수 명령어 사용(set @@sql_mode="STRICT_TRANS_TABLES,NO_ENGINE_SUBSTITUTION";)<br/>
해결방안-02 : my.ini 설정파일 내에서 해당 코드 삽입

[Reference] <br>
https://velog.io/@morningstar/only-full-group-by <br>


