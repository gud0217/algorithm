/**
아이디, 이름, 보호 시작일
이름 순으로 조회, 이름 같으면 보호 내림차순
- 이름이 같은 동물 중에서는 보호를 나중에 시작 한 동물을 먼저 보여줘
**/

select animal_id, name, datetime
from animal_ins
order by name asc, datetime desc