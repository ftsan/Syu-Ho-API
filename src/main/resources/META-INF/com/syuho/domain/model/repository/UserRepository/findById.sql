select
    u.user_id,
    u.created_datetime,
    u.updated_datetime,
    toa.screen_name user_name
from
    user u
    inner join
        twitter_oauth toa
        on u.user_id = toa.user_id
where
    u.user_id = /* id */0