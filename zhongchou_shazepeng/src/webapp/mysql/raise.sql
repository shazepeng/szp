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

 Date: 27/03/2019 17:43:07
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for raise
-- ----------------------------
DROP TABLE IF EXISTS `raise`;
CREATE TABLE `raise`  (
  `raiseid` int(11) NOT NULL AUTO_INCREMENT,
  `raiseType` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `raiseName` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `raiseInfo` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `raiseMoney` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `raiseDay` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `mySelf` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `dateiled` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `contactNumber` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `serviceTel` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `reportType` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `reportMoney` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `reportContent` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `reportNumber` varchar(11) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `singlePurchase` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `freight` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `invoice` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `reportTime` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `userid` int(11) NULL DEFAULT NULL,
  `raiseCheck` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `raisePic` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY USING BTREE (`raiseid`)
) ENGINE = InnoDB AUTO_INCREMENT = 13 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of raise
-- ----------------------------
INSERT INTO `raise` VALUES (2, '科技', '电子科技', '机器人', '1000000', '30', '你好啊', '你好啊******', '13589134513', '13589134513', '实物回报', '100000', '机器人', '2', '1', '0', '可开发票', '30', 2, '通过', 'apply\\15533131674911.png');
INSERT INTO `raise` VALUES (3, '农业', '羊驼养殖场', '专业养羊驼', '500000', '30', '你好', '你好****', '13457816472', '13457816472', '虚拟物品回报', '50000', '送羊驼', '1', '1', '0', '可开发票', '7', 5, '通过', 'apply\\15533131674911.png');
INSERT INTO `raise` VALUES (11, '电子', '电子科技', '机器', '1000000', '30', '你好', '你哈', '123456', '1231654', '实物回报', '100000', '那几个', '6', '1', '0', '可开发票', '7', 5, '通过', 'apply\\15533131674911.png');
INSERT INTO `raise` VALUES (12, '科技', '机器人', '生产制造机器人', '1000000', '30', '我是机器人', 'dfghjkiuytr', '13518794456', '13248774618', '实物回报', '1000', '无', '0', '1', '0', '可开发票', '10', 6, '未通过', 'apply/15535178205491.jpg');

SET FOREIGN_KEY_CHECKS = 1;
