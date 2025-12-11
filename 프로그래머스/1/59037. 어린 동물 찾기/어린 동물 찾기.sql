/**
젊은 동물(intake_condition = 'Aged')가 아님
아이디, 이름 조회
아이디 순으로 조회
**/

select animal_id, name
from animal_ins
where intake_condition != 'Aged'
order by animal_id