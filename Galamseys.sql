CREATE database Galamseys;
Use Galamseys;


Create table Observatory(
observatoryid int auto_increment,
observatoryName varchar(20),
country varchar(40),
yearofObservation int,
area double,
primary key(observatoryid)
);
select * from Observatory;


Create table Galamsey(
GalamseyId int auto_increment,
GalamseyName varchar(20),
vegetationColor varchar(90), 
Year_of_event varchar(20),
latitude varchar(20),
longitude varchar(30),
observatoryId int,
foreign key(observatoryId) references Observatory(observatoryId),
primary key(Galamseyid),
check(vegetationColor in ('brown','green','yellow'))
);
select * from Galamsey;

show tables;

drop table observatory;
drop database Galamseys;
