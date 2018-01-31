ALTER TABLE users.contacts ADD COLUMN createdate TIMESTAMP;  
ALTER TABLE users.users DROP CONSTRAINT FK_contact_users;
