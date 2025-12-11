/**
강원도에 위치
공장 id, 공장 이름, 주소 조회
공장 id 기준 오름차순 정렬
**/

select factory_id, factory_name, address
from food_factory
where address like '강원도%'
order by factory_id asc