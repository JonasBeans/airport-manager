create table application.pilot(
	ID int generated by default as identity PRIMARY KEY NOT NULL,
	first_name varchar(50) NOT NULL,
	last_name varchar(50) NOT NULL
);


insert into application.pilot(first_name, last_name) values ('first_name_test', 'last_name_test')