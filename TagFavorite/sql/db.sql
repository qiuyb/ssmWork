create table Tag(
       t_id int primary key,--编号
       t_name varchar2(1000) not null,--标签名
       t_count int --标签下所对应的网址数量
)
insert into Tag values(seq_Tag_tid.nextval,'Java',2);
insert into Tag values(seq_Tag_tid.nextval,'Struts',1);
insert into Tag values(seq_Tag_tid.nextval,'Oracle',1);
select * from Tag
create sequence seq_Tag_tid
       START WITH 10000    -- 从1000开始计数 
       INCREMENT BY 1;
select * from Tag;
drop table Tag;
drop sequence seq_Tag_tid;
drop sequence  seq_Favorite_fid;
insert into Tag values(seq_Tag_tid.Nextval,'Java',2);
insert into Tag values(seq_Tag_tid.Nextval,'Struts',1);
insert into Tag values(seq_Tag_tid.Nextval,'oracle',1);
create table Favorite(
       f_id int primary key,--网址编号
       f_label varchar2(1000),--网站名
       f_url varchar2(300) not null,--地址
       f_tags varchar2(1000) ,--分类标签名
       f_desc varchar2(2000)--描述
)

select * from Favorite where f_tags like '%Java%'

select * from Favorite where f_tags like 'oracle'
create sequence seq_Favorite_fid
       START WITH 20000    -- 从1000开始计数 
       INCREMENT BY 1; 
insert into Favorite values(seq_Favorite_fid.Nextval,'Apache Struts','http://www.apache.org/struts/','Java,Struts','Struts官方站点');
insert into Favorite values(seq_Favorite_fid.Nextval,'oracle','http://www.oracle.com','Java,oracle','oracle官方站点');

commit
select * from Favorite;
select * from Tag
drop table Favorite;
select * from Tag
select * from Favorite where f_tags is NULL
select * from Favorite where f_tags =0
delete from Favorite where f_id=20046
delete from Tag where t_id=10025