/*
Navicat MySQL Data Transfer

Source Server         : beyondboy
Source Server Version : 50630
Source Host           : localhost:3306
Source Database       : lifeapp

Target Server Type    : MYSQL
Target Server Version : 50630
File Encoding         : 65001

Date: 2017-01-04 10:46:18
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
) ENGINE=InnoDB AUTO_INCREMENT=23 DEFAULT CHARSET=utf8;

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
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8;

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
) ENGINE=InnoDB AUTO_INCREMENT=17 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for user_token
-- ----------------------------
DROP TABLE IF EXISTS `user_token`;
CREATE TABLE `user_token` (
  `user_id` bigint(20) NOT NULL,
  `user_token` varchar(1024) DEFAULT NULL,
  PRIMARY KEY (`user_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
