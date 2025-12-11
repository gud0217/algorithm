/**
진료과 흉부외과 or 일반외과
의사 이름, 의사ID, 진료과, 고용일자 조회
고용일자 기준 내림차순, 같다면 이름 기준 오름차순
**/

select dr_name, dr_id, mcdp_cd, DATE_FORMAT(hire_ymd, '%Y-%m-%d') as hire_ymd
from doctor
where mcdp_cd IN ('CS', 'GS')
order by hire_ymd desc, dr_name asc