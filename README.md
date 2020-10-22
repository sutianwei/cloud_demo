就在这里更新数据吧
-- ----------------------------
DROP TABLE IF EXISTS `company`;
CREATE TABLE `company` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `com_holding` varchar(12) DEFAULT NULL,
  `com_id` varchar(32) DEFAULT NULL,
  `com_local` varchar(255) DEFAULT NULL,
  `com_name` varchar(12) DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `prName` (`com_name`),
  KEY `prId` (`com_id`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- ----------------------------
-- Records of company
-- ----------------------------
INSERT INTO `company` VALUES ('7', '22', 'a8f7b3fdba234e918bf5c94f528f0100', 'dd', '2134');

-- ----------------------------
-- Table structure for star_admin
-- ----------------------------
DROP TABLE IF EXISTS `star_admin`;
CREATE TABLE `star_admin` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `uid` varchar(32) DEFAULT NULL,
  `name` varchar(12) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  `sex` varchar(12) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- ----------------------------
-- Records of star_admin
-- ----------------------------
INSERT INTO `star_admin` VALUES ('1', '12', 'sdf', 'ds', 'sad');
INSERT INTO `star_admin` VALUES ('2', '345', 'su', 'nan', 'pass');
INSERT INTO `star_admin` VALUES ('3', '345', 'su', 'nan', 'pass');
INSERT INTO `star_admin` VALUES ('4', '0c50b1d35cbf43c0ade6af5a87b92dc2', 'su', 'nan', 'pass');

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `name` varchar(10) NOT NULL,
  `password` varchar(100) NOT NULL,
  `role` varchar(15) DEFAULT NULL COMMENT '角色权限',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=32 DEFAULT CHARSET=utf8;