CREATE DATABASE ssmblog;

USE ssmblog;

CREATE TABLE blog(
  id BIGINT NOT NULL AUTO_INCREMENT COMMENT '博客id',
  title varchar(100) NOT NULL COMMENT '博客名',
  content varchar(2000) NOT NULL COMMENT '博客内容',
  cate_id BIGINT COMMENT '博客所属类别',
  create_time TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  PRIMARY KEY(id)
)AUTO_INCREMENT=1000 DEFAULT CHARSET=utf8 COMMENT='博客记录表';


INSERT  INTO
  blog(title,content,cate_id)
VALUES
  ('agile development', 'agile development agile developmentagile developmentagile development', 100),
  ('scrum development', 'scrum development scrum development scrum development', 200),
  ('lean development', 'lean development lean development lean development', 300);

USE ssmblog;

CREATE TABLE category(
  id BIGINT NOT NULL AUTO_INCREMENT COMMENT 'category id',
  name varchar(100) NOT NULL COMMENT 'category name',
  PRIMARY KEY(id)
)AUTO_INCREMENT=1 DEFAULT CHARSET=utf8 COMMENT='category';

INSERT  INTO
  category(name)
VALUES
  ('agile development'),
  ('development'),
  ('research');

USE ssmblog;

CREATE TABLE comment(
  id BIGINT NOT NULL AUTO_INCREMENT COMMENT 'comment id',
  user_id BIGINT NOT NULL COMMENT 'user id',
  comment varchar(100) NOT NULL COMMENT 'comment content',
  blog_id BIGINT NOT NULL COMMENT 'blog id',
  PRIMARY KEY(id)
)AUTO_INCREMENT=1 DEFAULT CHARSET=utf8 COMMENT='comment';

INSERT  INTO
  comment(user_id, comment, blog_id)
VALUES
  (101, 'well', 1001),
  (102, 'development', 1002),
  (103, 'research', 1003);

USE ssmblog;

CREATE TABLE user(
  id BIGINT NOT NULL AUTO_INCREMENT COMMENT 'user id',
  username varchar(30) NOT NULL COMMENT 'username',
  password varchar(30) NOT NULL COMMENT 'user password',
  status enum('active','frozen') NOT NULL COMMENT 'user status',
  permission enum('admin','user','guest') NOT NULL COMMENT 'user permission/level',
  create_time TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT 'create time',
  PRIMARY KEY(id)
)AUTO_INCREMENT=100 DEFAULT CHARSET=utf8 COMMENT='user';

INSERT  INTO
  user(username, password, status, permission)
VALUES
  ('test_user1', '001', 'active', 'admin'),
  ('test_user2', '001', 'active', 'user'),
  ('test_user3', '003', 'frozen', 'guest');

mysql -u root -p