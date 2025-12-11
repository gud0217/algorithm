/**
생일이 3월, 여성
id, 이름, 성별, 생년월일 조회
- 전화번호가 null인경우 출력 x
회원id 오름차순
**/

select member_id, member_name, gender, date_format(date_of_birth, '%Y-%m-%d') as date_of_birth
from member_profile
where MONTH(date_of_birth) = 03 AND gender = 'W' AND TLNO IS NOT NULL
order by member_id asc