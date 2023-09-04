select i.REST_ID, i.REST_NAME, i.FOOD_TYPE, i.FAVORITES, i.ADDRESS, ROUND(AVG(r.REVIEW_SCORE), 2) as SCORE
from REST_INFO as i
join REST_REVIEW as r
on i.REST_ID=r.REST_ID
group by i.REST_NAME
having i.ADDRESS like '서울%'
order by SCORE desc, i.FAVORITES desc
