CREATE DATABASE IF NOT EXISTS `student_tracker`;
USE `student_tracker`;

DROP TABLE IF EXISTS `student`;

CREATE TABLE `student` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `first_name` varchar(45) DEFAULT NULL,
  `last_name` varchar(45) DEFAULT NULL,
  `email` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=latin1;

LOCK TABLES `student` WRITE;
INSERT INTO `student` VALUES
	(1,'Mary','Public','mary@luv2code.com'),
    (2,'John','Doe','john@luv2code.com'),
    (3,'Ajay','Rao','ajay@luv2code.com'),
    (4,'Bill','Neely','bill@luv2code.com'),
    (5,'Maxwell','Dixon','max@luv2code.com');
UNLOCK TABLES;