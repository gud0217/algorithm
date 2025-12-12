
/*
developers 테이블에서, Python이나 C# 스킬을 가진 개발자의 정보를 조회
개발자의 id, 이메일, 이름, 성 조회
id 기준 오름차순 정렬
*/

select id, email, first_name, last_name
from developers
where skill_code & (select sum(code)
                    from skillcodes
                    where name in ('C#', 'Python')
                   )
order by id asc;