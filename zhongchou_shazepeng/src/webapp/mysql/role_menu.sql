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

 Date: 27/03/2019 17:43:15
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for role_menu
-- ----------------------------
DROP TABLE IF EXISTS `role_menu`;
CREATE TABLE `role_menu`  (
  `rmid` int(11) NOT NULL AUTO_INCREMENT COMMENT '角色菜单中间表id',
  `rid` int(255) NULL DEFAULT NULL COMMENT '角色id',
  `mid` int(255) NULL DEFAULT NULL COMMENT '菜单id',
  PRIMARY KEY USING BTREE (`rmid`)
) ENGINE = InnoDB AUTO_INCREMENT = 482 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of role_menu
-- ----------------------------
INSERT INTO `role_menu` VALUES (418, 2, 6);
INSERT INTO `role_menu` VALUES (419, 2, 7);
INSERT INTO `role_menu` VALUES (420, 2, 8);
INSERT INTO `role_menu` VALUES (421, 2, 9);
INSERT INTO `role_menu` VALUES (422, 2, 10);
INSERT INTO `role_menu` VALUES (423, 2, 11);
INSERT INTO `role_menu` VALUES (424, 2, 12);
INSERT INTO `role_menu` VALUES (425, 2, 13);
INSERT INTO `role_menu` VALUES (426, 2, 14);
INSERT INTO `role_menu` VALUES (427, 2, 15);
INSERT INTO `role_menu` VALUES (428, 2, 16);
INSERT INTO `role_menu` VALUES (429, 2, 17);
INSERT INTO `role_menu` VALUES (466, 1, 2);
INSERT INTO `role_menu` VALUES (467, 1, 3);
INSERT INTO `role_menu` VALUES (468, 1, 4);
INSERT INTO `role_menu` VALUES (469, 1, 5);
INSERT INTO `role_menu` VALUES (470, 1, 6);
INSERT INTO `role_menu` VALUES (471, 1, 7);
INSERT INTO `role_menu` VALUES (472, 1, 8);
INSERT INTO `role_menu` VALUES (473, 1, 9);
INSERT INTO `role_menu` VALUES (474, 1, 10);
INSERT INTO `role_menu` VALUES (475, 1, 11);
INSERT INTO `role_menu` VALUES (476, 1, 12);
INSERT INTO `role_menu` VALUES (477, 1, 13);
INSERT INTO `role_menu` VALUES (478, 1, 14);
INSERT INTO `role_menu` VALUES (479, 1, 15);
INSERT INTO `role_menu` VALUES (480, 1, 16);
INSERT INTO `role_menu` VALUES (481, 1, 17);

SET FOREIGN_KEY_CHECKS = 1;
