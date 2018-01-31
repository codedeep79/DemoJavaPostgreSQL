use DemoDb;

CREATE TABLE users.contacts (
 contact_id serial PRIMARY KEY,
 email VARCHAR (25) NOT NULL,
 phone VARCHAR (20) NOT NULL,
 address VARCHAR (250),
 work_at VARCHAR (200),
 user_id int4
);

CREATE TABLE users.users(
	user_id serial PRIMARY KEY,
    full_name VARCHAR(255) NOT NULL,
    password VARCHAR(22) NOT NULL,
    createddate TIMESTAMP
);