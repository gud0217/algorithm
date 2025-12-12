/**
RAGE인 아이템들의
모든 다음 업그레이드 아이템의 아이템id, 아이템 명, 희귀도를 출력
아이템id 기준 내림차순 정렬
**/

select
    i.item_id as item_id,
    i.item_name as item_name,
    i.rarity as rarity
from item_info i join item_tree t on i.item_id = t.item_id
where t.parent_item_id in (
    select item_id
    from item_info
    where rarity = 'RARE'
)
order by i.item_id desc