/*
python 스킬을 가진 개발자의 id, 이메일 이름 성 조회
id 기준 오름차순 정렬
*/

select id, email, first_name, last_name
from developer_infos
where skill_1 = 'Python' OR skill_2 = 'Python' OR skill_3 = 'Python'
order by id;