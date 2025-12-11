/**
12세 이하, 여자환자
환자이름, 환자번호, 성별코드, 나이, 전화번호
- 전화번호가 없다면 NONE
나이 기준 내림차순, 같다면 환자 이름 오름차순
**/

select pt_name, pt_no, gend_cd, age, IFNULL(tlno, 'NONE') AS tlno
from patient
where age <= 12 and gend_cd = 'W'
order by age DESC, pt_name ASC