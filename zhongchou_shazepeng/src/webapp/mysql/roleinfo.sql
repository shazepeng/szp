/*
 Navicat Premium Data Transfer

 Source Server         : 111
 Source Server Type    : MySQL
 Source Server Version : 50096
 Source Host           : localhost:3306
 Source Schema         : zhongchou_shazepeng

 Target Server Type    : MySQL
 Target Server Version : 50096
 File Encoding         : 65001

 Date: 27/03/2019 17:43:22
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for roleinfo
-- ----------------------------
DROP TABLE IF EXISTS `roleinfo`;
CREATE TABLE `roleinfo`  (
  `roleid` int(11) NOT NULL AUTO_INCREMENT COMMENT '角色编号',
  `rolename` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '角色名称',
  `state` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '角色状态：',
  PRIMARY KEY USING BTREE (`roleid`)
) ENGINE = InnoDB AUTO_INCREMENT = 9 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of roleinfo
-- ----------------------------
INSERT INTO `roleinfo` VALUES (1, '项目经理', '可用');
INSERT INTO `roleinfo` VALUES (2, '软件工程师', '可用');
INSERT INTO `roleinfo` VALUES (3, '程序员', '可用');
INSERT INTO `roleinfo` VALUES (4, '组长', '可用');
INSERT INTO `roleinfo` VALUES (5, '品质保证', '失效');
INSERT INTO `roleinfo` VALUES (6, '品质控制', '失效');
INSERT INTO `roleinfo` VALUES (7, '软件架构师', '失效');
INSERT INTO `roleinfo` VALUES (8, '配置管理员', '失效');

SET FOREIGN_KEY_CHECKS = 1;
