select
    HOUR(DATETIME) as HOUR,
    count(*)
from
    ANIMAL_OUTS
where
    HOUR(DATETIME) between 9 and 20
group by
    HOUR
order by
    HOUR