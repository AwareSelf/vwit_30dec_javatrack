use mydb1;

select c_no,substring_index(transaction,' ',1) amt, substring_index(transaction,' ',-1) country from transaction;
select substring_index(transaction,' ',-1) country ,c_no,sum(convert(substring_index(transaction,' ',1),SIGNED integer)) amt from transaction
group by country,c_no;

create table xyz
as 
select substring_index(transaction,' ',-1) country ,c_no,sum(convert(substring_index(transaction,' ',1),SIGNED integer)) amt from transaction
group by country,c_no;

select * from xyz;

select c_no,
max(case when country='USD' then  amt end) as 'USD',
max(case when country='EUR' then  amt end) as 'EUR'
from xyz
group by c_no;

select * from card;



select * from card;

select * from transaction;

select accountno,USD,ifnull(EUR ,0) EUR
from card, (select c_no,
max(case when country='USD' then  amt end) as 'USD',
max(case when country='EUR' then  amt end) as 'EUR'
from ( select substring_index(transaction,' ',-1) country ,
			  c_no, sum(convert(substring_index(transaction,' ',1),SIGNED integer)) amt 
       from transaction
       group by country,c_no) xyz
group by c_no ) abc
where card.c_no = abc.c_no;