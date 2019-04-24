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

 Date: 27/03/2019 17:42:22
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for cret
-- ----------------------------
DROP TABLE IF EXISTS `cret`;
CREATE TABLE `cret`  (
  `cretid` int(11) NOT NULL AUTO_INCREMENT,
  `cretname` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY USING BTREE (`cretid`)
) ENGINE = InnoDB AUTO_INCREMENT = 8 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of cret
-- ----------------------------
INSERT INTO `cret` VALUES (1, '营业执照副本');
INSERT INTO `cret` VALUES (2, '税务登记证');
INSERT INTO `cret` VALUES (3, '组织机构代码证');
INSERT INTO `cret` VALUES (4, '单位登记证件');
INSERT INTO `cret` VALUES (5, '法定代表人证件');
INSERT INTO `cret` VALUES (6, '经营者证件');
INSERT INTO `cret` VALUES (7, '手执身份证照片');

SET FOREIGN_KEY_CHECKS = 1;
