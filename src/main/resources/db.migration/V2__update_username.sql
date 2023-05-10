ALTER TABLE user RENAME COLUMN name TO user_name;

ALTER TABLE user ADD UNIQUE (user_name);