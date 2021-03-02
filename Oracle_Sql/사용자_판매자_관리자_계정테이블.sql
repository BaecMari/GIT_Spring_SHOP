-- ??? ??? --
-- 2021.03.02 (?) 22:20 --
create table User_Members
(
    userid varchar2(15) not null,
    passwd varchar2(16) not null,
    name nvarchar2(10) not null,
    birthdate int not null,
    cellphone int not null,
    gender int not null,
    address nvarchar2(50) not null
);

-- ??? ??? -- 
-- 2021.03.02 (?) 22:20 --
create table Seller_Members
(
    sellerid varchar2(15) not null,
    sellerpasswd varchar2(16) not null,
    sellername nvarchar2(10) not null,
    companyname nvarchar2(30) not null,
    cellphone int not null,
    companyaddress nvarchar2(50) not null
);

-- ??? ??? --
-- 2021.03.02 (?) 22:20 --
create table Admin_Member
(
    adminid varchar(15) not null,
    adminpwd varchar(16) not null
);
