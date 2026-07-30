# Write your MySQL query statement below
select Firstname,Lastname,City,State from person left join Address on person.personId=address.PersonId;
