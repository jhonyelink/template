mysql -h127.0.01 -utemplate -p123456

create table test_user(
   id INT NOT NULL AUTO_INCREMENT,
   ctime DateTime NOT NULL,
   mtime DateTime NOT NULL,
   username varchar(32) NOT NULL COMMENT "user name",
   age tinyint(4) NOT NULL COMMENT "user age",
   extension varchar(512) DEFAULT "" COMMENT "other info",
   PRIMARY KEY (id)
);
