use mydatabase;
CREATE TABLE PRODUCT
           ( ProductID   VARCHAR(10) NOT NULL, 
             ProductNAME  VARCHAR(128), 
             supplierId  varchar(200),
             PRICE       DECIMAL(30,2),
             quantity int,
             PRIMARY KEY (ProductID) );
select * from product;
insert into product values (1,'Laptop', 23, 40000, 1);
insert into product values (2,'Destop', 2, 60000, 14);
insert into product values (3,'TV', 3, 80000, 8);
insert into product values (4,'Headphones', 65, 10000, 19);
insert into product values (5,'Mobile', 1,  70000, 14);

SELECT SUM(Quantity)
FROM product;

SELECT SUM(Quantity) AS total
FROM product;

SELECT SUM(Quantity * 10)
FROM product;

SELECT AVG(Price)
FROM Product;