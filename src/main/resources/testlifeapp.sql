/*
Navicat MySQL Data Transfer

Source Server         : beyondboy
Source Server Version : 50630
Source Host           : localhost:3306
Source Database       : lifeapp

Target Server Type    : MYSQL
Target Server Version : 50630
File Encoding         : 65001

Date: 2017-01-04 14:42:23
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for club_info
-- ----------------------------
DROP TABLE IF EXISTS `club_info`;
CREATE TABLE `club_info` (
  `club_id` bigint(20) NOT NULL AUTO_INCREMENT,
  `club_name` varchar(255) DEFAULT NULL,
  `club_desc` text,
  `club_logo` varchar(255) DEFAULT NULL,
  `club_website` varchar(255) DEFAULT NULL,
  `club_weixin_num` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`club_id`)
) ENGINE=InnoDB AUTO_INCREMENT=27 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of club_info
-- ----------------------------
INSERT INTO `club_info` VALUES ('1', '华南农业大学学生会', '华南农业大学学生会，简称校学生会或校会。她是广大同学根本利益的忠实代表，是联系学校党政部门与广大同学的桥梁与纽带。她坚持以“自我教育，自我管理，自我服务”为原则', 'http://su.scau.edu.cn/wp-content/uploads/2012/10/3.png', 'http://su.scau.edu.cn/', 'scau1454588');
INSERT INTO `club_info` VALUES ('25', '华南农业大学学生社团联合会', '华农社联在校党委领导，校团委的直接领导、管理和监督下开展工作，以实现各学生社团的“自我教育，自我管理，自我服务”为目的，协调学生社团活动的开展、促进学生社团的发', 'http://xy.scau.edu.cn/xtw/shelian/system/slider/admin_2015%E5%B9%B43%E6%9C%888%E6%97%A512%E6%97%B654%E5%88%8658%E7%A7%92.jpg', 'http://xy.scau.edu.cn/xtw/shelian/index.asp', 'scaushelian4584');
INSERT INTO `club_info` VALUES ('26', '红满堂工作室', '红满堂工作室是致力于服务华农学子的校级学生组织，目前由技术组、美工组、运营和版主组成。加入我们，它未来的成功将由你来书写。', 'http://hometown.scau.edu.cn/official/img/logo.png', 'http://hometown.scau.edu.cn/official/index.html', 'hometown454');

-- ----------------------------
-- Table structure for lost_info
-- ----------------------------
DROP TABLE IF EXISTS `lost_info`;
CREATE TABLE `lost_info` (
  `lost_id` bigint(20) NOT NULL AUTO_INCREMENT,
  `lost_image` text,
  `lost_owner` varchar(255) DEFAULT NULL,
  `lost_phone` varchar(255) DEFAULT NULL,
  `lost_card_num` bigint(20) DEFAULT NULL,
  `lost_desc` text,
  `lost_date` date DEFAULT NULL,
  PRIMARY KEY (`lost_id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of lost_info
-- ----------------------------
INSERT INTO `lost_info` VALUES ('1', null, null, null, null, null, null);
INSERT INTO `lost_info` VALUES ('2', null, null, null, null, null, null);
INSERT INTO `lost_info` VALUES ('3', null, null, null, null, null, null);
INSERT INTO `lost_info` VALUES ('4', null, null, null, null, null, null);
INSERT INTO `lost_info` VALUES ('5', null, null, null, null, null, null);
INSERT INTO `lost_info` VALUES ('6', 'haha', 'guoli', '188843434', '2013303024050', 'huo\'qu获取wu\'pin', '2016-12-26');

-- ----------------------------
-- Table structure for notice_info
-- ----------------------------
DROP TABLE IF EXISTS `notice_info`;
CREATE TABLE `notice_info` (
  `notice_id` bigint(20) NOT NULL AUTO_INCREMENT,
  `notice_title` varchar(255) DEFAULT NULL,
  `notice_date` date DEFAULT NULL,
  `notice_desc` text,
  `notice_editor` varchar(255) DEFAULT NULL,
  `notice_iden` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`notice_id`)
) ENGINE=InnoDB AUTO_INCREMENT=14 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of notice_info
-- ----------------------------
INSERT INTO `notice_info` VALUES ('12', '互动式英语教学策略工作坊在我院成功举行', '2017-01-04', '12月1日，Susanna Aafjes受教务处教师教学发展中心和外国语学院教师教学发展分中心的邀请，来我校开设工作坊，畅谈互动式英语教学心得。外国语学院副院长李舸出席；来自各学院的60名教师参加了这次工作坊。\r\n    针对中国大学英语教学课堂的“班级大、掌控难、学生水准参差不齐”的症结，Susanna Aafjes用她擅长的互动式教学，结合自己从教三十五年以来对第二语言教学的经验，成功地讲述了如何运用分组策略、择选领队、设计互动任务、塑造以学生为教学核心、语言能力训练为导向的课堂氛围。Susanna Aafjies特别强调，语言学习者分属于视觉、听觉、行动三种学习类型，如何设计出适合所在班级学习者学习类型的教学任务，非常考验语言教师的经验、底蕴和人文素养。另外，Susanna Aafjies还现场展示了如何用肢体语言和小道具来调控课堂气氛，如何用简单的任务来调整临场授课状态等等。最后，针对现场的提问，Susanna Aafjies还一一做出了解答，众位与会教师意犹未尽，印象深刻。', '吴章欣', '外国语学院');
INSERT INTO `notice_info` VALUES ('13', '省教育厅到我校调研本科实践教学基地建设', '2017-01-04', '11 月22日下午，广东省教育厅高教处处长郑文、调研员吴念香等一行6人到我校调研本科实践教学基地建设情况。学校教务处全体领导班子成员、试验中心、农事训练中心正副主任等陪同了调研。\r\n　　调研组一行在听取了我校教务处处长张永亮介绍的学校本科实践教学基地的建设情况，试验中心（农事训练中心）主任谢正生介绍的学校增城教学科研基地的建设发展情况后，实地考察了果园示范基地、国家植物航天育种中心试验基地、农业设施园区和光学农业基地等。\r\n　　郑文对我校实践教学基地建设的分区规划、预期目标和取得的成果给予了充分肯定，并对如何充分利用已有的教学科研基地服务本科实践教学提出了指导性的意见和建议。', '刘改莲', '教务处');

-- ----------------------------
-- Table structure for pickup_info
-- ----------------------------
DROP TABLE IF EXISTS `pickup_info`;
CREATE TABLE `pickup_info` (
  `pickup_id` bigint(20) NOT NULL AUTO_INCREMENT,
  `pickup_image` text,
  `pickup_phone` varchar(255) DEFAULT NULL,
  `pickup_card_num` bigint(20) DEFAULT NULL,
  `pickup_desc` text,
  `pickup_date` date DEFAULT NULL,
  PRIMARY KEY (`pickup_id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of pickup_info
-- ----------------------------
INSERT INTO `pickup_info` VALUES ('1', 'haha', '188843434', '2013303024050', 'huo\'qu获取wu\'pin', '2016-12-26');
INSERT INTO `pickup_info` VALUES ('2', 'haha', '188843434', '2013303024050', 'huo\'qu获取wu\'pin', '2016-12-26');
INSERT INTO `pickup_info` VALUES ('3', null, '18813752548', '201330340625', '工民建', '2017-01-02');

-- ----------------------------
-- Table structure for user_detail
-- ----------------------------
DROP TABLE IF EXISTS `user_detail`;
CREATE TABLE `user_detail` (
  `user_id` bigint(20) NOT NULL,
  `user_num` bigint(20) DEFAULT NULL,
  `user_iden` int(255) DEFAULT '1',
  `user_major` varchar(255) DEFAULT NULL,
  `user_gradle` varchar(255) DEFAULT NULL,
  `user_class` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`user_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user_detail
-- ----------------------------
INSERT INTO `user_detail` VALUES ('17', null, null, null, null, null);

-- ----------------------------
-- Table structure for user_info
-- ----------------------------
DROP TABLE IF EXISTS `user_info`;
CREATE TABLE `user_info` (
  `user_id` bigint(20) NOT NULL AUTO_INCREMENT,
  `user_password` varchar(1024) NOT NULL,
  `user_nickname` varchar(255) NOT NULL,
  `user_avatar` varchar(255) DEFAULT NULL,
  `user_sex` int(255) DEFAULT '0',
  PRIMARY KEY (`user_id`)
) ENGINE=InnoDB AUTO_INCREMENT=18 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user_info
-- ----------------------------
INSERT INTO `user_info` VALUES ('17', '1000:26a5401616016b682c8f7fdfa5165ca18e15ec62f27860eb:0aff1478b43b26da7b34a45911c7face56e820f28ec23b7c', '123456', 'https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSW_KGKOiRg0oTNHgrCNCp4vyjHXQB0GhEAfqWLB3Yupf5LT36v3pPdqw', '1');

-- ----------------------------
-- Table structure for user_token
-- ----------------------------
DROP TABLE IF EXISTS `user_token`;
CREATE TABLE `user_token` (
  `user_id` bigint(20) NOT NULL,
  `user_token` varchar(1024) DEFAULT NULL,
  PRIMARY KEY (`user_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user_token
-- ----------------------------
INSERT INTO `user_token` VALUES ('17', 'eyJhbGciOiJIUzUxMiJ9.eyJpZCI6MTcsImF1ZCI6IjEyMzQ1NiIsImlzcyI6ImJleW9uZGJveSIsImlhdCI6MTQ4MzUxMTg1MTkxOH0.sKWEEU9C_1ZfaHG5Dt6PNAo0QRsjGBpJC3fxVoZia8MTiN-2HBy0mDPa7Dn8LCX1RaIUFVVegIAR6PNmWOybiw');
