drop table R1;
CREATE TABLE IF NOT EXISTS`R1` (
 `K` int(11) NOT NULL,
  `A` int(11) NOT NULL,
  `B` int(50) NOT NULL,
  `C` int(50) NOT NULL,
  PRIMARY KEY  (`K`));
insert into R1 values (1,1,1,1),
(2,3,4,5),(3,4,5,3),(4,4,5,2),(5,5,6,7);
 
CREATE TABLE IF NOT EXISTS `R2` (
 `K` int(11) NOT NULL,
  `D` int(11) NOT NULL,
  `E` int(50) NOT NULL,
  PRIMARY KEY  (`K`));
insert into R2 values (1,1,1),
(2,3,4),(3,4,5),(4,4,5),(5,5,6);

CREATE TABLE IF NOT EXISTS`R3` (
 `A` int(11) NOT NULL,
  `A1` int(11) NOT NULL,
  `A2` int(50) NOT NULL,
  `A3` int(50) NOT NULL,
  PRIMARY KEY  (`A`));
insert into R3 values (1,1,1,1),
(2,3,4,5),(3,4,5,3),(4,4,5,2),(5,5,6,7);

CREATE TABLE IF NOT EXISTS`R4` (
 `B` int(11) NOT NULL,
  `B1` int(11) NOT NULL,
  `B2` int(50) NOT NULL,
  PRIMARY KEY  (`B`));
insert into R4 values (1,1,1),
(2,3,4),(3,4,5),(4,4,5),(5,5,6);


CREATE TABLE IF NOT EXISTS `R5` (
 `C` int(11) NOT NULL,
  `C1` int(11) NOT NULL,
  `C2` int(50) NOT NULL,
  `C3` int(50) NOT NULL,
	`C4` int(50) NOT NULL,
 PRIMARY KEY  (`C`));
insert into R5 values (1,1,1,1,1),
(2,3,4,5,9),(3,4,5,3,7),(4,4,5,2,0),(5,5,6,7,9);

