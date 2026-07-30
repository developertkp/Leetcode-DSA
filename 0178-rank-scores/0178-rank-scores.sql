# Write your MySQL_ query statement below
select score,dense_rank() over(order by score desc) as 'rank' from scores;