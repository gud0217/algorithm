/**
- 동일한 날짜, 회원ID, 상품ID 조합에 대해서는 하나의 데이터만 존재
동일한 회원이 동일한 상품을 재구매한 데이터
재구매한 회원 ID와 재구매한 상품 ID를 출력하는 SQL문 작성
회원 ID 기준 오름차순 정렬, 같다면 상품 ID 기준 내림차순 정렬
**/

select user_id, product_id
from online_sale
group by user_id, product_id
having count(*) > 1
order by user_id asc, product_id desc