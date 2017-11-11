/* create a new user 'demo' with password 'demo' */

CREATE USER 'demo'@'localhost' IDENTIFIED BY 'demo';

GRANT ALL PRIVILEGES ON * . * TO 'demo'@'localhost';