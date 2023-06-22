select
    MCDP_CD,
    count(*) as count
from
    APPOINTMENT
where
    APNT_YMD like "2022-05%"
group by
    MCDP_CD
order by
    count, MCDP_CD