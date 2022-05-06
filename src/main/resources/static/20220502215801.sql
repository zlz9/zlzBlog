/*
MySQL Backup
Database: blog
Backup Time: 2022-05-02 21:58:01
*/

SET FOREIGN_KEY_CHECKS=0;
DROP TABLE IF EXISTS `blog`.`article_body`;
DROP TABLE IF EXISTS `blog`.`article_tag`;
DROP TABLE IF EXISTS `blog`.`articles`;
DROP TABLE IF EXISTS `blog`.`category`;
DROP TABLE IF EXISTS `blog`.`tags`;
DROP TABLE IF EXISTS `blog`.`user`;
CREATE TABLE `article_body` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `content` longtext,
  `content_html` longtext,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=17 DEFAULT CHARSET=utf8mb4;
CREATE TABLE `article_tag` (
  `id` bigint(20) NOT NULL,
  `article_id` bigint(20) DEFAULT NULL,
  `tag_id` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `tag_id` (`tag_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;
CREATE TABLE `articles` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `comment_count` bigint(255) DEFAULT NULL,
  `create_time` bigint(255) DEFAULT NULL,
  `summary` varchar(255) DEFAULT NULL,
  `title` varchar(255) DEFAULT NULL,
  `view_counts` bigint(255) DEFAULT NULL,
  `weight` bigint(255) DEFAULT NULL,
  `author_id` bigint(255) DEFAULT NULL,
  `body_id` bigint(255) DEFAULT NULL,
  `tag_id` bigint(255) DEFAULT NULL,
  `category_id` bigint(255) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `tag_id` (`tag_id`),
  KEY `category_id` (`category_id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb4;
CREATE TABLE `category` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `category_name` varchar(255) DEFAULT NULL,
  `description` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`),
  CONSTRAINT `cate` FOREIGN KEY (`id`) REFERENCES `articles` (`category_id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4;
CREATE TABLE `tags` (
  `id` bigint(20) NOT NULL,
  `tag_name` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;
CREATE TABLE `user` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `account` varchar(255) DEFAULT NULL,
  `admin` bit(1) DEFAULT NULL,
  `avator` varchar(255) DEFAULT NULL,
  `deleted` varchar(255) DEFAULT NULL,
  `email` varchar(128) DEFAULT NULL,
  `last_login` bigint(255) DEFAULT NULL,
  `nick_name` varchar(20) DEFAULT NULL,
  `password` varchar(25) DEFAULT NULL,
  `status` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4;
BEGIN;
LOCK TABLES `blog`.`article_body` WRITE;
DELETE FROM `blog`.`article_body`;
INSERT INTO `blog`.`article_body` (`id`,`content`,`content_html`) VALUES (1, '测试一�?, '测试一�?),(2, '测试', '<p>测试</p>\n'),(3, '测试一下写�?, '<p>测试一下写�?/p>\n'),(4, '测试一下图�?[RC.jpg](http://ratzoxh34.hn-bkt.clouddn.com/dcb49589-c8d9-4dcc-937b-fb19032823d0.jpg)', '<p>测试一下图�?img src=\"http://ratzoxh34.hn-bkt.clouddn.com/dcb49589-c8d9-4dcc-937b-fb19032823d0.jpg\" alt=\"RC.jpg\" /></p>\n'),(7, '测试', '<p>测试</p>\n'),(12, '测试', '<p>测试</p>\n'),(16, '测试', '<p>测试</p>\n');
UNLOCK TABLES;
COMMIT;
BEGIN;
LOCK TABLES `blog`.`article_tag` WRITE;
DELETE FROM `blog`.`article_tag`;
INSERT INTO `blog`.`article_tag` (`id`,`article_id`,`tag_id`) VALUES (1, 1, 1),(2, 16, 2),(1521124655987023874, 2, 2),(1521124765030539265, 3, 5),(1521124956513099777, 4, 3),(1521124956571820034, 4, 1);
UNLOCK TABLES;
COMMIT;
BEGIN;
LOCK TABLES `blog`.`articles` WRITE;
DELETE FROM `blog`.`articles`;
INSERT INTO `blog`.`articles` (`id`,`comment_count`,`create_time`,`summary`,`title`,`view_counts`,`weight`,`author_id`,`body_id`,`tag_id`,`category_id`) VALUES (3, 0, 1651499379768, '测试一下写�?, '测试一下写�?, 0, 0, 1, 3, 3, 3),(4, 0, 1651499425430, '测试一下图�?, '测试一下图�?, 0, 0, 1, 4, 4, 4);
UNLOCK TABLES;
COMMIT;
BEGIN;
LOCK TABLES `blog`.`category` WRITE;
DELETE FROM `blog`.`category`;
UNLOCK TABLES;
COMMIT;
BEGIN;
LOCK TABLES `blog`.`tags` WRITE;
DELETE FROM `blog`.`tags`;
INSERT INTO `blog`.`tags` (`id`,`tag_name`) VALUES (1, 'java'),(2, 'vue'),(3, 'springboot'),(4, 'pytion'),(5, 'react');
UNLOCK TABLES;
COMMIT;
BEGIN;
LOCK TABLES `blog`.`user` WRITE;
DELETE FROM `blog`.`user`;
INSERT INTO `blog`.`user` (`id`,`account`,`admin`,`avator`,`deleted`,`email`,`last_login`,`nick_name`,`password`,`status`) VALUES (1, '周利�?, b'1', '饿啊哇撒�?, '1', '2334094446@qq.com', 3213132, 'xiaoz', 'admin123', '1');
UNLOCK TABLES;
COMMIT;
