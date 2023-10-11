show databases;
use mydatabase;
create table Person
( pid int,
 hid int,
name varchar(100),
address varchar(100),
city varchar(100),
foreign key (hid) references home(hid)
);
drop table person;
insert into person values(10,"priya","uran","navi-Mumbai");
select * from Person;
alter table person
add age int;
update person
set age=38 where pid=10;
select * from Person;
SELECT * FROM person
WHERE name LIKE '__y%';
SELECT max(age)
FROM person;

SELECT MIN(age)
FROM person;

SELECT * FROM person
WHERE NOT city = 'vashi';

SELECT * FROM person
ORDER BY address asc, name desc;

SELECT * FROM person
WHERE city = 'Navi-Mumbai'
AND address = 'vashi'
and age=30;

SELECT * FROM person
WHERE age>30;
create table Person
( pid int,
 hid int,
name varchar(100),
address varchar(100),
city varchar(100),
foreign key (hid) references home(hid)
);

create table home(hid int primary key,hname varchar(100));
insert into home values(1,"home1");
drop table home;
select * from home;

use mydatabase;
CREATE TABLE Persons (
    ID int NOT NULL,
    LastName varchar(255) NOT NULL,
    FirstName varchar(255),
    Age int,
    City varchar(255) DEFAULT 'Sandnes'
);
select * from persons;
insert into persons values(1,"sharma","priya",22,"navi-Mumbai");
insert into persons values(1,"sharma","priya",22,"Sandnes");
insert into persons values(2,"sharma","priya",22,"vashi");
insert into persons values(3,"sharma","priya",22,DEFAULT);
CREATE INDEX index_LastName
ON persons (LastName);