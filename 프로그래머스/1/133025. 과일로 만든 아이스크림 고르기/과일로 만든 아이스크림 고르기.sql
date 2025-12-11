/**
총 주문량 3000 이상, 주성분 과일
아이스크림 맛
총 주문량 큰 순서대로 조회
**/

select half.flavor as falvor
from first_half as half join icecream_info info on half.flavor = info.flavor
where half.total_order >= 3000 and ingredient_type = 'fruit_based'
order by total_order desc
