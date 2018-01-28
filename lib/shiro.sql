/*
Navicat MySQL Data Transfer

Source Server         : 127.0.0.1
Source Server Version : 50633
Source Host           : localhost:3306
Source Database       : shiro

Target Server Type    : MYSQL
Target Server Version : 50633
File Encoding         : 65001

Date: 2018-01-28 12:00:30
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for permissions
-- ----------------------------
DROP TABLE IF EXISTS `permissions`;
CREATE TABLE `permissions` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `execute` varchar(64) DEFAULT NULL,
  `description` varchar(255) DEFAULT NULL,
  `other` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `permis_execute` (`execute`) USING HASH
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of permissions
-- ----------------------------
INSERT INTO `permissions` VALUES ('1', 'read', '读权限', 'one');
INSERT INTO `permissions` VALUES ('2', 'write', '写权限', 'two');
INSERT INTO `permissions` VALUES ('3', 'execute', '执行权限', 'three');

-- ----------------------------
-- Table structure for roles
-- ----------------------------
DROP TABLE IF EXISTS `roles`;
CREATE TABLE `roles` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `name` varchar(64) DEFAULT NULL,
  `code` varchar(64) DEFAULT NULL,
  `next` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `roles_name` (`name`) USING HASH,
  UNIQUE KEY `roles_code` (`code`) USING HASH
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of roles
-- ----------------------------
INSERT INTO `roles` VALUES ('1', '普通用户', 'common', 'one');
INSERT INTO `roles` VALUES ('2', '管理员', 'admin', 'two');
INSERT INTO `roles` VALUES ('3', '超级管理员', 'root', 'three');

-- ----------------------------
-- Table structure for roles_permissions
-- ----------------------------
DROP TABLE IF EXISTS `roles_permissions`;
CREATE TABLE `roles_permissions` (
  `roles_id` bigint(20) DEFAULT NULL,
  `permissions_id` bigint(20) DEFAULT NULL,
  `create_time` timestamp NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP,
  `next` varchar(255) DEFAULT NULL,
  KEY `ROLES_KEY` (`roles_id`),
  KEY `PERMIS_KEY` (`permissions_id`),
  CONSTRAINT `PERMIS_KEY` FOREIGN KEY (`permissions_id`) REFERENCES `permissions` (`id`),
  CONSTRAINT `ROLES_KEY` FOREIGN KEY (`roles_id`) REFERENCES `roles` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of roles_permissions
-- ----------------------------
INSERT INTO `roles_permissions` VALUES ('1', '1', '2018-01-27 17:34:14', null);
INSERT INTO `roles_permissions` VALUES ('2', '1', '2018-01-27 17:34:29', null);
INSERT INTO `roles_permissions` VALUES ('2', '2', '2018-01-27 17:34:45', null);
INSERT INTO `roles_permissions` VALUES ('3', '1', '2018-01-27 17:34:55', null);
INSERT INTO `roles_permissions` VALUES ('3', '2', '2018-01-27 17:35:11', null);
INSERT INTO `roles_permissions` VALUES ('3', '3', '2018-01-27 17:35:22', null);

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `username` varchar(64) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL,
  `create_time` timestamp NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP,
  `other` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `user_name` (`username`) USING HASH
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('1', '张三', '123', '2018-01-27 17:26:21', 'one');
INSERT INTO `user` VALUES ('2', '李四', '456', '2018-01-27 17:26:39', 'two');
INSERT INTO `user` VALUES ('3', '王二', '789', '2018-01-27 17:26:56', 'three');

-- ----------------------------
-- Table structure for user_roles
-- ----------------------------
DROP TABLE IF EXISTS `user_roles`;
CREATE TABLE `user_roles` (
  `user_id` bigint(20) DEFAULT NULL,
  `roles_id` bigint(20) DEFAULT NULL,
  `create_time` timestamp NOT NULL DEFAULT '0000-00-00 00:00:00' ON UPDATE CURRENT_TIMESTAMP,
  `next` varchar(255) DEFAULT NULL,
  KEY `USER_ID_KEY` (`user_id`),
  KEY `ROLES_ID_KEY` (`roles_id`),
  CONSTRAINT `ROLES_ID_KEY` FOREIGN KEY (`roles_id`) REFERENCES `roles` (`id`),
  CONSTRAINT `USER_ID_KEY` FOREIGN KEY (`user_id`) REFERENCES `user` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user_roles
-- ----------------------------
INSERT INTO `user_roles` VALUES ('1', '3', '2018-01-27 17:33:27', '');
INSERT INTO `user_roles` VALUES ('2', '2', '2018-01-27 17:33:38', null);
INSERT INTO `user_roles` VALUES ('3', '1', '2018-01-27 17:33:52', null);
INSERT INTO `user_roles` VALUES ('1', '2', '2018-01-28 01:50:40', null);
INSERT INTO `user_roles` VALUES ('1', '1', '2018-01-28 01:50:42', null);
