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

 Date: 27/03/2019 17:43:44
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for userinfo
-- ----------------------------
DROP TABLE IF EXISTS `userinfo`;
CREATE TABLE `userinfo`  (
  `userid` int(11) NOT NULL AUTO_INCREMENT COMMENT '用户编号',
  `username` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '用户名',
  `account` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '用户登录账号',
  `password` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '用户登录密码',
  `state` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '用户状态:lock冻结,unlock未冻结',
  `email` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '邮箱',
  `grade` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '管理或会员',
  PRIMARY KEY USING BTREE (`userid`)
) ENGINE = InnoDB AUTO_INCREMENT = 13 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of userinfo
-- ----------------------------
INSERT INTO `userinfo` VALUES (1, '管理员', 'admin', '000000', 'unlock', 'admin@qq,com', '管理');
INSERT INTO `userinfo` VALUES (2, '张三', 'zhangsan', '000000', 'unlock', 'zs@qq.com', '会员');
INSERT INTO `userinfo` VALUES (3, '沙泽鹏', 'shazepeng', '000000', 'lock', 'szp@qq.com', '会员');
INSERT INTO `userinfo` VALUES (4, '王振博', 'wangzhenbo', '000000', 'lock', 'wzb@qq.com', '会员');
INSERT INTO `userinfo` VALUES (5, '李四', 'lisi', '000000', 'unlock', 'ls@qq.com', '会员');
INSERT INTO `userinfo` VALUES (6, '啊啊', 'aaaaaa', '000000', 'unlock', 'aa@qq.com', '会员');
INSERT INTO `userinfo` VALUES (7, '哔哔', 'bbbbbb', '000000', 'unlock', 'bb@qq.com', '会员');
INSERT INTO `userinfo` VALUES (12, 'aaa', 'xxxxxx', '000000', 'unlock', 'qq@qq.com', '会员');

SET FOREIGN_KEY_CHECKS = 1;
