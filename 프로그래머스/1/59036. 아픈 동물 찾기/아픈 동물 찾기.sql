/**
아픈 동물(intake_condition = 'Sick')
아이디, 이름 조회
아이디 순 정렬
**/

select animal_id, name
from animal_ins
where intake_condition = 'Sick'
order by animal_id