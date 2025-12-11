select book_id, date_format(published_date, '%Y-%m-%d') as published_date
from book
where category = '인문' AND YEAR(published_date) = 2021
order by published_date ASC