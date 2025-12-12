/*
부모의 형질을 모두 보유한
id, genotype, parent_genotype 출력
id 기준 오름차순
*/

select 
    m.id as id,
    m.genotype as genotype,
    p.genotype as parent_genotype
from ecoli_data m
join ecoli_data p
    on m.parent_id = p.id
where m.genotype & p.genotype = p.genotype
order by m.id;