-- 查询所有数据库
SHOW DATABASES;

-- 标准语法
-- SHOW CREATE DATABASE 数据库名称;

-- 查看mysql数据库的创建格式
SHOW CREATE DATABASE mysql;

-- 创建db1数据库
CREATE DATABASE db1;

-- 标准语法
-- CREATE DATABASE IF NOT EXISTS 数据库名称;

-- 创建数据库db2(判断，如果不存在则创建)
CREATE DATABASE IF NOT EXISTS db2;

-- 标准语法
CREATE DATABASE 数据库名称 CHARACTER SET 字符集名称;

-- 创建数据库、并指定字符集
-- 创建数据库db3、并指定字符集utf8
CREATE DATABASE db3 CHARACTER SET utf8;

-- 查看db3数据库的字符集
SHOW CREATE DATABASE db3;

-- 练习：创建db4数据库、如果不存在则创建，指定字符集为gbk
CREATE DATABASE IF NOT EXISTS db4 CHARACTER SET gbk;

SHOW CREATE DATABASE db4;

-- 修改数据库db4的字符集为utf8
ALTER DATABASE db4 CHARACTER SET utf8;

-- 查看db4数据库的字符集
SHOW CREATE DATABASE db4;

-- 删除db1数据库
DROP DATABASE db1;

-- 删除一个不存在的数据库会报错
-- 错误代码：1008  Can't drop database 'db1'; database doesn't exist
DROP DATABASE db1;


-- 删除数据库db2，如果存在
DROP DATABASE IF EXISTS db2;

-- 查询当前正在使用的数据库
SELECT DATABASE();

-- 使用db4数据库
USE db4;

-- 使用mysql数据库
USE mysql;

-- 查询库中所有的表
SHOW TABLES;

-- 查询user表结构
DESC USER;

-- 查看mysql数据库中user表字符集
SHOW TABLE STATUS FROM mysql LIKE 'user';