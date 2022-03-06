-- 使用db3数据库
USE db3;

-- 创建一个product商品表
CREATE TABLE product(
	id INT,				-- 商品编号
	NAME VARCHAR(30),	-- 商品名称
	price DOUBLE,		-- 商品价格
	stock INT,			-- 商品库存
	insert_time DATE    -- 上架时间
);

DESC product;
-- 复制product表到product2表
CREATE TABLE product2 LIKE product;

-- 修改product2表名为product3
ALTER TABLE product2 RENAME TO product3;

-- 查看db3数据库中product3数据表字符集
SHOW TABLE STATUS FROM db3 LIKE 'product3';

-- 修改product3数据表字符集为gbk
ALTER TABLE product3 CHARACTER SET gbk;

-- 查看db3数据库中product3数据表字符集
SHOW TABLE STATUS FROM db3 LIKE 'product3';

-- 给product3表添加一列color
ALTER TABLE product3 ADD color VARCHAR(10);

-- 将color数据类型修改为int
ALTER TABLE product3 MODIFY color INT;
-- 查看product3表详细信息
DESC product3;

-- 将color修改为address,数据类型为varchar
ALTER TABLE product3 CHANGE color address VARCHAR(30);
-- 查看product3表详细信息
DESC product3;