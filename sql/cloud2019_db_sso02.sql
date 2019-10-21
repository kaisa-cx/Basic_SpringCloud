/*
 Navicat Premium Data Transfer

 Source Server         : 155.94.235.33
 Source Server Type    : MySQL
 Source Server Version : 80013
 Source Host           : 155.94.235.33:3306
 Source Schema         : cloud2019_db_sso02

 Target Server Type    : MySQL
 Target Server Version : 80013
 File Encoding         : 65001

 Date: 04/05/2019 12:41:41
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for dept
-- ----------------------------
DROP TABLE IF EXISTS `dept`;
CREATE TABLE `dept`  (
  `deptno` bigint(16) NOT NULL AUTO_INCREMENT,
  `dname` varchar(55) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL,
  `db_source` varchar(255) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL,
  PRIMARY KEY (`deptno`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 6 CHARACTER SET = utf8 COLLATE = utf8_bin ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of dept
-- ----------------------------
INSERT INTO `dept` VALUES (1, '开发部', 'cloud2019_db_sso02');
INSERT INTO `dept` VALUES (2, '人事部', 'cloud2019_db_sso02');
INSERT INTO `dept` VALUES (3, '财务部', 'cloud2019_db_sso02');
INSERT INTO `dept` VALUES (4, '市场部', 'cloud2019_db_sso02');
INSERT INTO `dept` VALUES (5, '运维部', 'cloud2019_db_sso02');

SET FOREIGN_KEY_CHECKS = 1;
