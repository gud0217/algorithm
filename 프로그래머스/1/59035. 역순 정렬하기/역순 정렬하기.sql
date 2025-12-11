/**
동물 이름, 보호 시작일 조회
역순으로 정렬
**/

select name, datetime
from animal_ins
order by animal_id desc