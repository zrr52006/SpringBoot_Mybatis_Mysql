create table t_user(
id Integer,
name varchar(10),
address varchar(20),
createDate DateTime
)

insert into t_user (id,name,address,createDate ) values(1,'张然然','浙江宁波','2021-02-01 14:00:00');
insert into t_user (id,name,address,createDate ) values(2,'张小胖','浙江湖州','2021-02-01 14:00:00');
insert into t_user (id,name,address,createDate ) values(3,'赵思思','浙江衢州','2021-02-01 14:00:00');
insert into t_user (id,name,address,createDate ) values(4,'赵媛媛','安徽亳州','2021-02-01 14:00:00');

select * from t_user




create table t_users(
id Integer,
userName varchar(20),
passWord varchar(20),
realName varchar(20)
)


insert into t_users(id,userName,passWord,realName)values(1,'幻','Aa123456','张思思');
insert into t_users(id,userName,passWord,realName)values(2,'super','Aa123456','张媛媛');
insert into t_users(id,userName,passWord,realName)values(3,'hello','Aa123456','赵斯哲');


select * from t_users
