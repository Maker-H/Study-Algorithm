select i.FLAVOR
from ICECREAM_INFO as i 
join FIRST_HALF as f
on i.flavor=f.flavor 
where f.TOTAL_ORDER > 3000 and i.INGREDIENT_TYPE="fruit_based"
order by f.TOTAL_ORDER desc