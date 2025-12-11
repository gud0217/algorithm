/**
동물 보호소에 가장 먼저 들어온 동물의 이름 조회
**/

select name
from animal_ins
order by datetime asc
limit 1;