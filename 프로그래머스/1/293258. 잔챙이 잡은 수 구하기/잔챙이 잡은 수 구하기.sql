/*
길이가 10cm 이하인 물고기 출력
컬럼명 fish_count
*/

select count(*) as fish_count
from fish_info
where length is null;