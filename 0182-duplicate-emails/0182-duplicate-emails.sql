# Write your MySQL query statement below
select email AS Email from Person
group by email HAVING COUNT(email)>1;

