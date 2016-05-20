create sequence seq_profile;
drop sequence seq_profile
drop table profile
create table profile(
     id int primary key,
     name varchar2(20) not null, 
     birthday varchar2(20)not null, 
     gender varchar2(4), 
     career varchar2(20), 
     address varchar2(50), 
     mobile varchar2(20)
)



insert into profile values(seq_profile.nextval,'张三','1982-07-07','男','程序员','湖南','1234566');
insert into profile values(seq_profile.nextval,'张四','1982-07-07','男','程序员','湖南','1234566');
insert into profile values(seq_profile.nextval,'张五','1982-07-07','男','程序员','湖南','1234566');
insert into profile values(seq_profile.nextval,'张六','1982-07-07','男','程序员','湖南','1234566');

commit;

select * from profile;