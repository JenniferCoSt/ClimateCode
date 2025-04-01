drop database if exists ClimateCode;
create database ClimateCode;
use ClimateCode;

create table MeasurementParameters(
id int not null auto_increment primary key,
parameterType varchar(20) not null,
unit varchar(10) not null
);

create table Stations(
id int not null auto_increment primary key,
stationName varchar(50),
stationNumber int,
location point not null srid 4326,
dataSource varchar(30) not null,
metersAboveSeaLevel float
);

create table Measurements(
id int not null auto_increment primary key,
stationId int,
measurementParameterId int,
dataDate date not null,
dataValue float not null,
qualityCode varchar(10),
measurementType varchar(10) not null,
startTime datetime,
endTime datetime,
registered timestamp default current_timestamp not null,
foreign key (stationId) references Stations(id) on delete set null,
foreign key (measurementParameterId) references MeasurementParameters(id) on delete set null
);

create index IX_measurementDate on Measurements(dataDate);
create index IX_measurementStation on Measurements(stationId);
create index IX_measurementParameters on Measurements(measurementParameterId);
