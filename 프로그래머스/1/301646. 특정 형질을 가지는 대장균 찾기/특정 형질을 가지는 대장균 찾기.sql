/*
2번 형질 보유하지 않으며, 1 or 3 보유
하는 개체의 수 출력
*/

select count(*) as count
from ecoli_data
where (genotype & 2) = 0
  and (genotype & 1 > 0 or genotype & 4 > 0);