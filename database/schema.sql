-- ClimateCode Database Schema
-- Create database and tables for climate data from SMHI
drop database if exists ClimateCode;
create database ClimateCode;
use ClimateCode;

-- Table for different measurement parameters (temperature, rain etc)
create table if not exists MeasurementParameters(
id int not null auto_increment primary key,
parameterType varchar(20) not null,
unit varchar(10) not null
);

-- Table for information about stations measuring the data
create table if not exists Stations(
id int not null auto_increment primary key,
stationName varchar(50),
stationNumber int,
location point not null srid 4326,
dataSource varchar(30) not null,
metersAboveSeaLevel float
);

-- Table for measurement data 
create table if not exists Measurements(
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

-- Indexes to optimize different searches
create index IX_measurementDate on Measurements(dataDate);
create index IX_measurementStation on Measurements(stationId);
create index IX_measurementParameters on Measurements(measurementParameterId);
