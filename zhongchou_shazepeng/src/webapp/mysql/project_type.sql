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

 Date: 27/03/2019 17:43:00
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for project_type
-- ----------------------------
DROP TABLE IF EXISTS `project_type`;
CREATE TABLE `project_type`  (
  `project_id` int(11) NOT NULL AUTO_INCREMENT,
  `project_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `project_info` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY USING BTREE (`project_id`)
) ENGINE = InnoDB AUTO_INCREMENT = 4 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of project_type
-- ----------------------------
INSERT INTO `project_type` VALUES (1, '科技', '***');
INSERT INTO `project_type` VALUES (2, '农业', '***');
INSERT INTO `project_type` VALUES (3, '电子', '***');

SET FOREIGN_KEY_CHECKS = 1;
