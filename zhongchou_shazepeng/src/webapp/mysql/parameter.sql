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

 Date: 27/03/2019 17:42:40
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for parameter
-- ----------------------------
DROP TABLE IF EXISTS `parameter`;
CREATE TABLE `parameter`  (
  `parameterId` int(11) NOT NULL AUTO_INCREMENT,
  `parameterName` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `parameterCode` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `parameterValue` int(11) NULL DEFAULT NULL,
  PRIMARY KEY USING BTREE (`parameterId`)
) ENGINE = InnoDB AUTO_INCREMENT = 3 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of parameter
-- ----------------------------
INSERT INTO `parameter` VALUES (1, '项目列表显示数量	', '	project-list-size', 4);
INSERT INTO `parameter` VALUES (2, '首页项目显示数量', 'home-project-list-size', 4);

SET FOREIGN_KEY_CHECKS = 1;
