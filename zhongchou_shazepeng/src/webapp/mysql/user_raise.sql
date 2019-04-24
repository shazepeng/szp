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

 Date: 27/03/2019 17:43:29
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for user_raise
-- ----------------------------
DROP TABLE IF EXISTS `user_raise`;
CREATE TABLE `user_raise`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `userid` int(11) NULL DEFAULT NULL,
  `raiseid` int(11) NULL DEFAULT NULL,
  PRIMARY KEY USING BTREE (`id`)
) ENGINE = InnoDB AUTO_INCREMENT = 14 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of user_raise
-- ----------------------------
INSERT INTO `user_raise` VALUES (1, 2, 2);
INSERT INTO `user_raise` VALUES (2, 4, 2);
INSERT INTO `user_raise` VALUES (3, 6, 2);
INSERT INTO `user_raise` VALUES (5, 6, 3);
INSERT INTO `user_raise` VALUES (6, 5, 2);
INSERT INTO `user_raise` VALUES (7, 5, 4);
INSERT INTO `user_raise` VALUES (8, 5, 4);
INSERT INTO `user_raise` VALUES (10, 8, 2);
INSERT INTO `user_raise` VALUES (11, 11, 2);
INSERT INTO `user_raise` VALUES (12, 11, 3);
INSERT INTO `user_raise` VALUES (13, 9, 2);

SET FOREIGN_KEY_CHECKS = 1;
