drop database my_app;
create database my_app;
use my_app;

drop table if exists users_tbl;

create table users_tbl(
user_id INT auto_increment,
user_firstname VARCHAR(40) not null,
user_lastname VARCHAR(40) not null,
user_email VARCHAR(60) not null,
user_password varbinary(256),
primary key(user_id)
);
select* from users_tbl;

drop table if exists categories;
create table categories(
category_id INT auto_increment,
category_name  VARCHAR(40) not null,
primary key(category_id)
);
select * from categories;

drop table if exists products;
create table products(
product_id INT auto_increment,
category_id INT,
product_name VARCHAR(40) not null,
product_value float,
primary key(product_id),
foreign key(category_id)
references categories(category_id)
);
select * from products;

