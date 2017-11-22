CREATE TABLE PERSON (
	id numeric,
	first_name varchar(255) not null,
	last_name varchar(255) not null,
	PRIMARY KEY (id)
);



insert into PERSON (id, first_name, last_name) values (1, 'Gustavo', 'Lira');