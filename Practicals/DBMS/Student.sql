show databases;
use mydatabase;
select * from student;
create table teachers(id int, name varchar(100), address varchar(200), email varchar(200));
desc teachers;
drop table teachers;
truncate table teachers;
insert into teachers values(2,'Nutan', 'vashi', 'nutan@gmail.com','PhD');

delete from teachers where id=2;
alter table teachers
add qualification varchar(100);

alter table teachers
modify column qualification varchar(200);

update teachers
set qualification='B Ed' where id=1;

ALTER table teachers
RENAME column name to Firstname;

ALTER table teachers
add Lastname varchar(200);

update teachers
set Lastname= 'gupta' where id=1;

update teachers
set Lastname= 'patil' where id=2;

ALTER table teachers
add age int not null;

update teachers
set age= 30 where id=1;

update teachers
set age= 35 where id=2;

create table staff(sid int not null, firstname varchar(200) not null, lastname varchar(200), age int not null, address varchar(200), email varchar(200), qualification varchar(200), constraint SK_staff primary key(sid,lastname));
select * from staff;
insert into staff values(1, 'suyesh', 'jadhav', 30, 'vashi', 'suyesh@gmail.com', 'BEd');


