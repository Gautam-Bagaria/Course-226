drop table R1;
CREATE TABLE IF NOT EXISTS`R1` (
 `K` int(10) NOT NULL,
  `A` int(10) NOT NULL,
  `B` int(10) NOT NULL,
  `C` int(10) NOT NULL,
  PRIMARY KEY  (`K`));
insert into R1 values (4,2,0,6),
(5,2,0,5),(1,1,3,8),(2,1,3,7),(3,2,3,3);
 
drop table R2;
CREATE TABLE IF NOT EXISTS `R2` (
 `K` int(11) NOT NULL,
  `D` int(11) NOT NULL,
  `E` int(50) NOT NULL,
  PRIMARY KEY  (`K`));
insert into R2 values (4,1,6),
(5,1,5),(1,1,8),(2,1,7),(3,1,3);

drop table R3;
CREATE TABLE IF NOT EXISTS`R3` (
 `A` int(11) NOT NULL,
  `A1` int(11) NOT NULL,
  `A2` int(50) NOT NULL,
  `A3` int(50) NOT NULL
  );
insert into R3 values (2,4,6,8),
(2,4,6,8),(1,2,3,4),(1,2,3,4),(2,4,6,8);

drop table R4;
CREATE TABLE IF NOT EXISTS`R4` (
 `B` int(11) NOT NULL,
  `B1` int(11) NOT NULL,
  `B2` int(50) NOT NULL
);
insert into R4 values (0,0,0),
(0,0,0),(3,9,27),(3,9,27),(3,9,27);

drop table R5;
CREATE TABLE IF NOT EXISTS `R5` (
 `C` int(11) NOT NULL,
  `C1` int(11) NOT NULL,
  `C2` int(50) NOT NULL,
  `C3` int(50) NOT NULL,
  `C4` int(50) NOT NULL,
  `C5` int(50) NOT NULL,
 PRIMARY KEY  (`C`));
insert into R5 values (4,2,0,6,1,6),
(5,2,0,5,1,5),(1,1,3,8,1,8),(2,1,3,7,1,7),(3,1,3,3,1,3);

