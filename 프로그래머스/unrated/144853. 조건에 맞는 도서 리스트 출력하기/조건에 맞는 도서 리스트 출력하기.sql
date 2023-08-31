select book_id, date_format(PUBLISHED_DATE, '%Y-%m-%d') as published_date from BOOK b 
where CATEGORY in ('인문') and year(PUBLISHED_DATE) in ('2021')
order by PUBLISHED_DATE