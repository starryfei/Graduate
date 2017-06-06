/*
Navicat MySQL Data Transfer

Source Server         : da
Source Server Version : 50527
Source Host           : localhost:3306
Source Database       : graduate

Target Server Type    : MYSQL
Target Server Version : 50527
File Encoding         : 65001

Date: 2017-05-30 10:09:44
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `administor`
-- ----------------------------
DROP TABLE IF EXISTS `administor`;
CREATE TABLE `administor` (
  `aNumber` varchar(20) NOT NULL,
  `Name` varchar(20) NOT NULL,
  `Pwd` varchar(15) NOT NULL,
  `status` int(1) NOT NULL,
  PRIMARY KEY (`aNumber`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of administor
-- ----------------------------
INSERT INTO `administor` VALUES ('001', 'adda', '123', '1');

-- ----------------------------
-- Table structure for `department`
-- ----------------------------
DROP TABLE IF EXISTS `department`;
CREATE TABLE `department` (
  `cNumber` varchar(20) NOT NULL,
  `dName` varchar(30) NOT NULL,
  `dDec` varchar(200) DEFAULT NULL,
  PRIMARY KEY (`cNumber`),
  KEY `dName` (`dName`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of department
-- ----------------------------
INSERT INTO `department` VALUES ('131', '耳鼻喉', '无');
INSERT INTO `department` VALUES ('132', '心脑科', '无');
INSERT INTO `department` VALUES ('133', '眼科', '暂无描述');
INSERT INTO `department` VALUES ('134', '护士科', '无');

-- ----------------------------
-- Table structure for `doctor`
-- ----------------------------
DROP TABLE IF EXISTS `doctor`;
CREATE TABLE `doctor` (
  `dNumber` varchar(20) NOT NULL,
  `name` varchar(20) NOT NULL,
  `dPwd` varchar(15) NOT NULL,
  `cNumber` varchar(20) NOT NULL,
  `dInfo` varchar(200) NOT NULL,
  `dResume` varchar(200) NOT NULL,
  `dTel` varchar(11) NOT NULL,
  `dEmail` varchar(30) NOT NULL,
  `image` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`dNumber`),
  KEY `name` (`cNumber`),
  CONSTRAINT `name` FOREIGN KEY (`cNumber`) REFERENCES `department` (`cNumber`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of doctor
-- ----------------------------
INSERT INTO `doctor` VALUES ('111', '秦亚飞', '123', '131', '无', '无', '2131', 'ad@163.com', null);
INSERT INTO `doctor` VALUES ('1235', '马力', '123', '134', '暂无', '护士', '1213', '13123@163.com', '\\1493895521721.jpg');
INSERT INTO `doctor` VALUES ('1322', '小雨', '123', '134', '暂无', '护士', '1232131313', '211@163.com', '\\1493895858318.jpg');
INSERT INTO `doctor` VALUES ('1323', '吴宇', '123', '134', '暂无', '初级护士', '2312423', '352@12932.com', '\\1493535987891.jpg');
INSERT INTO `doctor` VALUES ('1324', '王五', '123', '132', '副教授', '副教授', '1232131313', '1232131313@163.com', '\\1493895313948.jpg');
INSERT INTO `doctor` VALUES ('1326', '王赛', '123', '133', '主治医生', '教授', '12234232', '64535234@163.com', '\\upload\\1494512028205.jpg');
INSERT INTO `doctor` VALUES ('1329', '张明', '123', '131', '主治医生', '副教授', '12312311', '12312311@163.com', '\\upload\\1494555343042.jpg');
INSERT INTO `doctor` VALUES ('1330', '罗文畅', '123', '134', '实习生', '实习生', '13638', '123@163.com', '\\upload\\1495029289727.jpg');
INSERT INTO `doctor` VALUES ('137', 'feihfe', '123', '132', 'hahai', '教授', '12313123', '3213@163.com', '\\1494398228907.jpg');

-- ----------------------------
-- Table structure for `feedback`
-- ----------------------------
DROP TABLE IF EXISTS `feedback`;
CREATE TABLE `feedback` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `fname` varchar(20) NOT NULL DEFAULT '匿名',
  `ftime` varchar(30) NOT NULL,
  `message` varchar(200) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of feedback
-- ----------------------------
INSERT INTO `feedback` VALUES ('1', '匿名', '2017-04-25 17:22:50', '某个医生服务态度不好');
INSERT INTO `feedback` VALUES ('2', 'feii', '2017-05-05 20:14:00', '服务好');
INSERT INTO `feedback` VALUES ('3', '亚飞', '2017-04-25 17:22', '学生');
INSERT INTO `feedback` VALUES ('4', 'aa', '2017-05-09 16:46', '后鹅公对哦');
INSERT INTO `feedback` VALUES ('5', 'aa', '2017-05-09 16:59', '伊宁县');
INSERT INTO `feedback` VALUES ('6', 'aa', '2017-05-09 20:15', 'nnsncjs');
INSERT INTO `feedback` VALUES ('7', 'aa', '2017-05-12 10:07', '8股里');

-- ----------------------------
-- Table structure for `new`
-- ----------------------------
DROP TABLE IF EXISTS `new`;
CREATE TABLE `new` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `title` varchar(30) NOT NULL,
  `content` varchar(200) NOT NULL,
  `time` varchar(30) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of new
-- ----------------------------
INSERT INTO `new` VALUES ('3', '北京大学口腔医院调整放号周期通知', '北京大学口腔医院  在贯彻北京市卫生和计生委预约挂号服务过程中，针对我院爽约率一直较高，结合进一步改善医疗服务及患者多次要求我院缩短预约周期的建议，故我院于2017年3月29日起对各专业的主治医师以上号源周期从2周调整为1周、普通号源预约周期从3个月调整至2周，即各专业主治医师以上号源2017-04-06日开始更新、普通号源2017-06-15日开始更新。对您造成的不便敬请谅解', ' 2017-04-26 03:55');
INSERT INTO `new` VALUES ('4', '系统检修暂停服务的公告', '北京大学口腔医院  在贯彻北京市卫生和计生委预约挂号服务过程中，针对我院爽约率一直较高，结合进一步改善医疗服务及患者多次要求我院缩短预约周期的建议，故我院于2017年3月29日起对各专业的主治医师以上号源周期从2周调整为1周、普通号源预约周期从3个月调整至2周，即各专业主治医师以上号源2017-04-06日开始更新、普通号源2017-06-15日开始更新。对您造成的不便敬请谅解', ' 2017-04-26 03:58');
INSERT INTO `new` VALUES ('6', '系统升级', '即日起，系统升级中，大概时间预计到2017/5/10系统升级完毕', ' 2017-05-04 03:08');
INSERT INTO `new` VALUES ('7', '庆五一', '祝大家五一快乐', ' 2017-05-04 03:15');

-- ----------------------------
-- Table structure for `sche`
-- ----------------------------
DROP TABLE IF EXISTS `sche`;
CREATE TABLE `sche` (
  `sNumber` varchar(20) NOT NULL DEFAULT '1',
  `dNumber` varchar(20) NOT NULL DEFAULT '1',
  `cNumber` varchar(20) NOT NULL DEFAULT '1',
  `total` int(10) NOT NULL DEFAULT '0',
  `price` varchar(30) NOT NULL DEFAULT '0',
  `sTime` varchar(50) NOT NULL DEFAULT '1',
  `eTime` varchar(50) NOT NULL DEFAULT '1',
  `status` varchar(10) DEFAULT '停诊',
  PRIMARY KEY (`sNumber`),
  KEY `cN` (`cNumber`),
  KEY `dN` (`dNumber`),
  CONSTRAINT `cN` FOREIGN KEY (`cNumber`) REFERENCES `department` (`cNumber`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `dN` FOREIGN KEY (`dNumber`) REFERENCES `doctor` (`dNumber`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of sche
-- ----------------------------
INSERT INTO `sche` VALUES ('111', '111', '131', '12', '21', '2017-05-05 10:15', '2017-05-12 17:00', '停诊');
INSERT INTO `sche` VALUES ('1325', '1322', '134', '50', '15', '2017-05-12 10:10', '2017-05-12 19:00', '就诊');
INSERT INTO `sche` VALUES ('1326', '1326', '133', '15', '20', '2017-05-04 08:30', '2017-05-12 18:00', '就诊');
INSERT INTO `sche` VALUES ('1329', '1329', '131', '25', '20', '2017-05-04 08:30', '2017-05-12 18:00', '停诊');
INSERT INTO `sche` VALUES ('1330', '1330', '134', '12', '21', '2017-05-17 09:55', '2017-05-19 21:55', '就诊');

-- ----------------------------
-- Table structure for `uorder`
-- ----------------------------
DROP TABLE IF EXISTS `uorder`;
CREATE TABLE `uorder` (
  `oNumber` int(10) NOT NULL AUTO_INCREMENT,
  `sNumber` varchar(20) NOT NULL,
  `id` int(20) NOT NULL COMMENT 'yonghu di',
  `oTime` varchar(20) NOT NULL DEFAULT 'CURRENT_TIMESTAMP',
  `price` varchar(30) NOT NULL,
  `status` int(11) NOT NULL,
  PRIMARY KEY (`oNumber`),
  KEY `i` (`id`),
  KEY `sN` (`sNumber`),
  CONSTRAINT `i` FOREIGN KEY (`id`) REFERENCES `user` (`id`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `sN` FOREIGN KEY (`sNumber`) REFERENCES `sche` (`sNumber`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=142 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of uorder
-- ----------------------------
INSERT INTO `uorder` VALUES ('130', '111', '1', '2017-05-05 14:40:44', '12', '1');
INSERT INTO `uorder` VALUES ('131', '111', '1', '2017-05-04 22:34:00', '12', '1');
INSERT INTO `uorder` VALUES ('132', '111', '1', '2017-05-04 22:34:00', '12', '1');
INSERT INTO `uorder` VALUES ('133', '111', '3', '2017-05-04 22:34:00', '12', '1');
INSERT INTO `uorder` VALUES ('135', '111', '2', '2017-05-11 11:54', '12', '1');
INSERT INTO `uorder` VALUES ('136', '111', '2', '2017-05-11 11:56', '12', '1');
INSERT INTO `uorder` VALUES ('137', '111', '10', '2017-05-11 16:58', '12', '1');
INSERT INTO `uorder` VALUES ('138', '111', '5', '2017-05-11 17:17', '12', '1');
INSERT INTO `uorder` VALUES ('139', '111', '2', '2017-05-12 10:05', '12', '1');
INSERT INTO `uorder` VALUES ('140', '111', '5', '2017-05-17 23:09', '12', '1');
INSERT INTO `uorder` VALUES ('141', '1330', '5', '2017-05-17 23:35', '21', '1');

-- ----------------------------
-- Table structure for `user`
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id` int(20) NOT NULL AUTO_INCREMENT,
  `uname` varchar(20) NOT NULL,
  `pwd` varchar(15) NOT NULL,
  `tel` varchar(11) NOT NULL,
  `info` varchar(200) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `name` (`uname`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('1', '网速', '211', '15542820326', '学生');
INSERT INTO `user` VALUES ('2', 'as', '23', 'ew', '23134');
INSERT INTO `user` VALUES ('3', 'qinyafei', '12345', '15542820326', 'beiing');
INSERT INTO `user` VALUES ('4', 'feiii', '211', '15542820326', '学生');
INSERT INTO `user` VALUES ('5', 'sti', '211', '15542820326', '学生');
INSERT INTO `user` VALUES ('7', 'da', '123', '123', '123');
INSERT INTO `user` VALUES ('8', '11', '11', '12131231', '213');
INSERT INTO `user` VALUES ('9', 'yafei', '123', '15542820326', '暂无个人信息');
INSERT INTO `user` VALUES ('10', 'qinyafei', '123', '15542820326', '学生');
