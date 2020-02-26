drop table if exists todo;

create table todo(
    id int primary key,
    username varchar(200),
    description varchar(200),
    target_date Date,
    is_done boolean
);

insert into todo( id, username, description, target_date, is_done)values
(10001,'agustin', 'Learn JPA', sysdate(), false),
(10002,'agustin', 'Learn Java', sysdate(), false),
(10003,'agustin', 'Learn React', sysdate(), false)