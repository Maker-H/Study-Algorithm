
with processtimes as (
  select machine_id, process_id, sum(case when activity_type='end' then timestamp else -timestamp end) as p
  from Activity 
  group by machine_id, process_id 
)
select machine_id, round(avg(p), 3) as processing_time 
from processtimes
group by machine_id
