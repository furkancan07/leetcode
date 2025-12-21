# Write your MySQL query statement below
# select email as Email from person group by email having  count(*)>1
 select DISTINCT a.email as Email from person a join person b on a.email=b.email where a.id!=b.id