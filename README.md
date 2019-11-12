<center>
<h2>Spring + SpringMVC + MyBatis + Thymeleaf 整合示例</h2>
</center>



1. 数据库数据导入代码


```sql
create table t_account(
    username varchar(50) primary key ,
    balance integer not null
);

create table t_book(
    isbn varchar(20) primary key,
    book_name varchar(50) not null ,
    price integer not null
);

create table t_book_stock(
    id integer primary key auto_increment,
    isbn varchar(20) not null ,
    stock integer not null ,
    foreign key(isbn) references t_book(isbn)
);

insert into t_account(username, balance) VALUES ('codefreak', 200);
insert into t_book(isbn, book_name, price) VALUES ('0001', 'Java', 50);
insert into t_book_stock(isbn, stock) VALUES ('0001', 10);
```

