/**
2021년에 가입, 나이가 20세 이상, 29세 이하
몇명인지 출력
**/

select count(*)
from user_info
where YEAR(joined) = 2021 AND age >= 20 AND age <= 29