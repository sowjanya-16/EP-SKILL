create database ep;
show databases;
use ep;
create table Employee(ename varchar(20),eid int primary key,age int,department varchar(10),designation varchar(10),salary int,Adress varchar(20));
insert into Employee values('sowjanya',123,20,'cse','M.tech',50000,'vijayawada');
insert into Employee values('srinidhi',456,21,'ece','M.com',65000,'guntur');
insert into Employee values('Reshma',765,22,'BBA','MBA',70000,'vizag');
insert into Employee values('poojitha',976,20,'eee','B.com',35000,'hyderabad');
insert into Employee values('sindhu',675,25,'cse','Mtech',80000,'ongole');
delete from Employee where eid=675;
select * from Employee;
update Employee set ename='tejaswini' where eid=976;
desc Employee;



