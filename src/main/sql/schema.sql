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

mysql -uroot -p