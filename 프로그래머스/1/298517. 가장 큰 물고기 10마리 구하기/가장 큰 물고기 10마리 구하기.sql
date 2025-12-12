/*
가장 큰 물고기 10마리
id, 길이 출력
길이 기준 내림차순, 같다면 id 기준 오름차순
컬럼명 id, length
*/

select id, length
from fish_info
where length > 10
order by length desc
limit 10;