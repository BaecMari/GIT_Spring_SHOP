-- ?? ??? ??
create table sampletable as select * from USER_MEMBERS;

-- ?? ??? ? ??
delete USER_MEMBERS;
-- ??
commit;

-- (?? ?? ??) ?? ??? ??? ?? ??
Alter table USER_MEMBERS MODIFY (cellphone varchar(12));

-- ?? ??? ????? ?? ??
select * from sampletable select * from USER_MEMBERS;

-- ?? ??? ?? ? ??
delete SAMPLETABLE;
commit;