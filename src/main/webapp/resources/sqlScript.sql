/*
 * Created by Ravikumar Chintada
 */

/*
 * One time stepes
 */
create database pfmt_db;
use pfmt_db;

CREATE TABLE TEAM_MEMBERS (
	teamMateId INTEGER AUTO_INCREMENT,
	userName varchar(255),
	dob BIGINT,
	password varchar(255),
	email varchar(255),
	mobileNo varchar(255),
	primary key (teamMateId)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;