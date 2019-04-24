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

 Date: 27/03/2019 17:42:31
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for menuinfo
-- ----------------------------
DROP TABLE IF EXISTS `menuinfo`;
CREATE TABLE `menuinfo`  (
  `menuid` int(11) NOT NULL AUTO_INCREMENT COMMENT '菜单id',
  `menuname` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '菜单名称',
  `url` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '跳转地址',
  `icon` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '菜单图标',
  `upid` int(11) NULL DEFAULT NULL COMMENT '上级菜单id',
  PRIMARY KEY USING BTREE (`menuid`)
) ENGINE = InnoDB AUTO_INCREMENT = 19 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of menuinfo
-- ----------------------------
INSERT INTO `menuinfo` VALUES (1, '控制面板', '', 'glyphicon glyphicon-dashboard', 0);
INSERT INTO `menuinfo` VALUES (2, '权限管理', '', 'glyphicon glyphicon glyphicon-tasks', 0);
INSERT INTO `menuinfo` VALUES (3, '用户管理', 'user.html', 'glyphicon glyphicon-user', 2);
INSERT INTO `menuinfo` VALUES (4, '角色管理', 'role.html', 'glyphicon glyphicon-king', 2);
INSERT INTO `menuinfo` VALUES (5, '许可管理', 'permission.html', 'glyphicon glyphicon-lock', 2);
INSERT INTO `menuinfo` VALUES (6, '业务审核', NULL, 'glyphicon glyphicon-ok', 0);
INSERT INTO `menuinfo` VALUES (7, '实名认证审核', 'auth_cert.html', 'glyphicon glyphicon-check', 6);
INSERT INTO `menuinfo` VALUES (8, '广告审核', 'auth_adv.html', 'glyphicon glyphicon-check', 6);
INSERT INTO `menuinfo` VALUES (9, '项目审核', 'auth_project.html', 'glyphicon glyphicon-check', 6);
INSERT INTO `menuinfo` VALUES (10, '业务管理', NULL, 'glyphicon glyphicon-th-large', 0);
INSERT INTO `menuinfo` VALUES (11, '资质维护', 'cert.html', 'glyphicon glyphicon-picture', 10);
INSERT INTO `menuinfo` VALUES (12, '分类管理', 'type.html', 'glyphicon glyphicon-equalizer', 10);
INSERT INTO `menuinfo` VALUES (13, '流程管理', 'process.html', 'glyphicon glyphicon-random', 10);
INSERT INTO `menuinfo` VALUES (14, '广告管理', 'advertisement.html', 'glyphicon glyphicon-hdd', 10);
INSERT INTO `menuinfo` VALUES (15, '消息模板', 'message.html', 'glyphicon glyphicon-comment', 10);
INSERT INTO `menuinfo` VALUES (16, '项目分类', 'project_type.html', 'glyphicon glyphicon-list', 10);
INSERT INTO `menuinfo` VALUES (17, '项目标签', 'tag.html', 'glyphicon glyphicon-tags', 10);
INSERT INTO `menuinfo` VALUES (18, '参数管理', NULL, 'glyphicon glyphicon-list-alt', 0);

SET FOREIGN_KEY_CHECKS = 1;
