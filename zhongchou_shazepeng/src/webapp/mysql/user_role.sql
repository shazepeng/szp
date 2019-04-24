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

 Date: 27/03/2019 17:43:36
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for user_role
-- ----------------------------
DROP TABLE IF EXISTS `user_role`;
CREATE TABLE `user_role`  (
  `urid` int(11) NOT NULL AUTO_INCREMENT COMMENT '用户角色中间表id',
  `uid` int(11) NULL DEFAULT NULL COMMENT '用户id',
  `rid` int(11) NULL DEFAULT NULL COMMENT '角色id',
  PRIMARY KEY USING BTREE (`urid`)
) ENGINE = InnoDB AUTO_INCREMENT = 13 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of user_role
-- ----------------------------
INSERT INTO `user_role` VALUES (1, 1, 1);
INSERT INTO `user_role` VALUES (2, 2, 2);
INSERT INTO `user_role` VALUES (8, 2, 3);
INSERT INTO `user_role` VALUES (9, 5, 2);
INSERT INTO `user_role` VALUES (10, 5, 4);
INSERT INTO `user_role` VALUES (11, 6, 5);
INSERT INTO `user_role` VALUES (12, 7, 6);

SET FOREIGN_KEY_CHECKS = 1;
