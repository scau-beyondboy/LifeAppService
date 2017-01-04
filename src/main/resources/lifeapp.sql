/*
Navicat MySQL Data Transfer

Source Server         : beyondboy
Source Server Version : 50630
Source Host           : localhost:3306
Source Database       : lifeapp

Target Server Type    : MYSQL
Target Server Version : 50630
File Encoding         : 65001

Date: 2017-01-04 10:45:59
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
-- Records of club_info
-- ----------------------------
INSERT INTO `club_info` VALUES ('1', 'gfds', 'gsfdg', 'https://www.google.com/search?newwindow=1&q=spring%20mvc%E8%A1%A8%E5%8D%95%E6%8F%90%E4%BA%A4json&rct=j', null, null);
INSERT INTO `club_info` VALUES ('2', 'tfa', 'fafdas', 'http://www.cnblogs.com/luxh/archive/2013/03/14/2960152.html', 'http://www.cnblogs.com/luxh/archive/2013/03/14/2960152.html', 'gsgdsfg');
INSERT INTO `club_info` VALUES ('3', 'sfs', 'sdfds', 'http://www.cnblogs.com/luxh/archive/2013/03/14/2960152.html', 'http://www.cnblogs.com/luxh/archive/2013/03/14/2960152.html', 'fsaf');
INSERT INTO `club_info` VALUES ('4', 'fdd', 'dasDA', 'http://www.cnblogs.com/luxh/archive/2013/03/14/2960152.html', 'http://www.cnblogs.com/luxh/archive/2013/03/14/2960152.html', 'FDSFS');
INSERT INTO `club_info` VALUES ('5', 'fdsaf', 'afa', 'http://www.cnblogs.com/luxh/archive/2013/03/14/2960152.html', 'http://www.cnblogs.com/luxh/archive/2013/03/14/2960152.html', 'jjsalf');
INSERT INTO `club_info` VALUES ('6', 'fs', 'getg', 'http://www.cnblogs.com/luxh/archive/2013/03/14/2960152.html', 'http://www.cnblogs.com/luxh/archive/2013/03/14/2960152.html', 'fasf');
INSERT INTO `club_info` VALUES ('7', 'fdsaf', 'fsa', 'http://www.cnblogs.com/luxh/archive/2013/03/14/2960152.html', 'http://www.cnblogs.com/luxh/archive/2013/03/14/2960152.html', 'gsg');
INSERT INTO `club_info` VALUES ('8', 'gfg', 'gsd', 'http://blog.csdn.net/huileiforever/article/details/12163385', 'http://blog.csdn.net/huileiforever/article/details/12163385', ';gsdf');
INSERT INTO `club_info` VALUES ('9', 'ryeh', 'hgfd', 'http://blog.csdn.net/huileiforever/article/details/12163385', 'http://blog.csdn.net/huileiforever/article/details/12163385', 'dwr');
INSERT INTO `club_info` VALUES ('10', 'gvfsaz', 'gvfxzv', 'http://blog.csdn.net/huileiforever/article/details/12163385', 'http://blog.csdn.net/huileiforever/article/details/12163385', 'fs');
INSERT INTO `club_info` VALUES ('11', 'Dsa', 'ddas', 'http://blog.csdn.net/huileiforever/article/details/12163385', 'http://blog.csdn.net/huileiforever/article/details/12163385', 'fsd');
INSERT INTO `club_info` VALUES ('12', 'hgfh', 'hgf', 'http://blog.csdn.net/huileiforever/article/details/12163385', 'http://blog.csdn.net/huileiforever/article/details/12163385', 'gfdg');
INSERT INTO `club_info` VALUES ('13', null, null, null, null, null);
INSERT INTO `club_info` VALUES ('14', 'fdjlsaf', 'fas', 'http://bbs.csdn.net/topics/300108373', 'http://bbs.csdn.net/topics/300108373', 'lkdfsahjf');
INSERT INTO `club_info` VALUES ('15', 'rewr', 'rrew', 'http://bbs.csdn.net/topics/300108373', 'http://bbs.csdn.net/topics/300108373', 'fjds');
INSERT INTO `club_info` VALUES ('16', null, null, null, null, null);
INSERT INTO `club_info` VALUES ('17', 'gfsd', 'fsd', 'http://bbs.csdn.net/topics/300108373', 'http://bbs.csdn.net/topics/300108373', 'sdf');
INSERT INTO `club_info` VALUES ('18', 'dfg', 'gdf', 'http://bbs.csdn.net/topics/300108373', 'http://bbs.csdn.net/topics/300108373', 'csd');
INSERT INTO `club_info` VALUES ('19', 'fdfd', 'f', null, null, null);
INSERT INTO `club_info` VALUES ('20', 'gsdg', 'gsg', 'http://bbs.csdn.net/topics/300108373', 'http://bbs.csdn.net/topics/300108373', 'gsfg');
INSERT INTO `club_info` VALUES ('21', null, null, null, null, null);
INSERT INTO `club_info` VALUES ('22', null, null, null, null, null);

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
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of notice_info
-- ----------------------------
INSERT INTO `notice_info` VALUES ('1', 'fsfs', '2016-10-21', 'fsdfsf', 'dsfdsf', 'sdf');
INSERT INTO `notice_info` VALUES ('2', 'gfdg', '2016-10-21', 'dgdfgg', 'fdgg', 'dgfd');
INSERT INTO `notice_info` VALUES ('3', 'hgfh', '2016-10-21', 'fghfh', 'hgf', 'hgf');
INSERT INTO `notice_info` VALUES ('4', 'regf', '2016-10-21', 'sfgsdf', 'fsdfs', 'fsdf');
INSERT INTO `notice_info` VALUES ('5', 'fafaf', '2016-10-24', '我们在开发J2EE项目的时候，经常感觉Spring很方便，因此，当我们开发android的时候，自然而然会想有没有类似的框架。本次博客主要讲一下比较流行的android开发框架AndroidAnnotations,它除了有依赖注入的特性以外，还集成了Ormlite，Spring-android中的REST模板。使用起来非常方便，大大提高了开发效率。', 'gds', 'gsd');
INSERT INTO `notice_info` VALUES ('6', 'gfdg', '2016-10-24', '我们在开发J2EE项目的时候，经常感觉Spring很方便，因此，当我们开发android的时候，自然而然会想有没有类似的框架。本次博客主要讲一下比较流行的android开发框架AndroidAnnotations,它除了有依赖注入的特性以外，还集成了Ormlite，Spring-android中的REST模板。使用起来非常方便，大大提高了开发效率。', 'gfdfgddfgdf', 'gdfgdf');
INSERT INTO `notice_info` VALUES ('7', 'fdsfsdz', '2016-10-24', '我们在开发J2EE项目的时候，经常感觉Spring很方便，因此，当我们开发android的时候，自然而然会想有没有类似的框架。本次博客主要讲一下比较流行的android开发框架AndroidAnnotations,它除了有依赖注入的特性以外，还集成了Ormlite，Spring-android中的REST模板。使用起来非常方便，大大提高了开发效率。', 'getgdfgg', 'gdfgdf');
INSERT INTO `notice_info` VALUES ('8', 'fdsaff', '2016-10-24', 'asf', 'fas', 'fsa');
INSERT INTO `notice_info` VALUES ('9', 'vxv', '2016-10-24', 'vxc', 'vzx', 'vxz');
INSERT INTO `notice_info` VALUES ('10', 'bvx', '2016-10-24', 'fs', 'fs', 'fs');

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
INSERT INTO `user_detail` VALUES ('0', '201330340625', '1', '软件工程', null, 'R6');
INSERT INTO `user_detail` VALUES ('1', '201330340625', '1', '软件工程', null, 'R6');
INSERT INTO `user_detail` VALUES ('2', '201330340625', '1', '软件工程', null, 'R6');
INSERT INTO `user_detail` VALUES ('3', '201330340625', '1', '软件工程', 'l二dfjs', 'R6');
INSERT INTO `user_detail` VALUES ('8', '201330340625', '1', null, null, null);

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
-- Records of user_info
-- ----------------------------
INSERT INTO `user_info` VALUES ('1', '1000:7d19d686f9b026ef01cdf0f91bc89581e7c25256b5c28bde:9754f305a50fcea3a0bb9ce378a53cba9f31c3ed48b2a1e0', 'test', 'https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSW_KGKOiRg0oTNHgrCNCp4vyjHXQB0GhEAfqWLB3Yupf5LT36v3pPdqw', '1');
INSERT INTO `user_info` VALUES ('2', '1000:5c74bc3ab108ad3c2d4c7406e1693414ec2720fb1343d6f2:20902179ba47a542f2bdbe1c9a25dcc14b8b1e89cd174ccf', 'test1', 'https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSW_KGKOiRg0oTNHgrCNCp4vyjHXQB0GhEAfqWLB3Yupf5LT36v3pPdqw', '1');
INSERT INTO `user_info` VALUES ('3', '1000:0f87f43f9b332b0ae6206f6462f995f06a80850eb524b960:ff227fac2115d89eb5e82c00d2ae979ac53a60675435bf98', 'test2', 'https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSW_KGKOiRg0oTNHgrCNCp4vyjHXQB0GhEAfqWLB3Yupf5LT36v3pPdqw', '1');
INSERT INTO `user_info` VALUES ('4', '1000:86b83c06e38c0ffedceb47a85daa99d98ff197a8e277b02a:27403d82dee8208cc744e453dd795d570b5f04538bf07bca', 'test3', 'https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSW_KGKOiRg0oTNHgrCNCp4vyjHXQB0GhEAfqWLB3Yupf5LT36v3pPdqw', '1');
INSERT INTO `user_info` VALUES ('5', '1000:c486246a997154121c3292a20c23c8650a60fe99b3f15bd3:8bf2498147df9be2bb9fc713db9a274705cd1b959dd7988a', 'test4', 'https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSW_KGKOiRg0oTNHgrCNCp4vyjHXQB0GhEAfqWLB3Yupf5LT36v3pPdqw', '1');
INSERT INTO `user_info` VALUES ('6', '1000:0b270c1132f92d27069ad7dfb8a30d15ac3cc47be2e72561:1671bc805e6f876a246d8f2b9daa7442d7daf5a5726fa4eb', 'test5', 'https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSW_KGKOiRg0oTNHgrCNCp4vyjHXQB0GhEAfqWLB3Yupf5LT36v3pPdqw', '1');
INSERT INTO `user_info` VALUES ('7', '1000:0020b37939f3ee77ceba7abf62ac16b5545b003f6e37e1df:d5b9eb7697eb7b11b7503b6a3a348c69c506f68e290f4062', 'test6', 'https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSW_KGKOiRg0oTNHgrCNCp4vyjHXQB0GhEAfqWLB3Yupf5LT36v3pPdqw', '1');
INSERT INTO `user_info` VALUES ('8', '1000:2ef611274c7d7a28e563bcfc350723996b97bdc7b890d0c0:c29ec77bd43f45bc67c770807f9f69dc9c3d7f65b46d6161', '123', 'https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSW_KGKOiRg0oTNHgrCNCp4vyjHXQB0GhEAfqWLB3Yupf5LT36v3pPdqw', null);
INSERT INTO `user_info` VALUES ('9', '1000:9caf24b0fd45b0d4d814cd18e00c800e09a5f50efdca0a39:893e6a66681a5becdf483bd9fdb1828e95fa3186d36f49b0', '1234', 'https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSW_KGKOiRg0oTNHgrCNCp4vyjHXQB0GhEAfqWLB3Yupf5LT36v3pPdqw', '1');
INSERT INTO `user_info` VALUES ('10', '1000:97587c3dd629832bf2ec5c25be94256a1429d53ba9ca14e3:cd22a451a08596c1250a428ac4524b050e30c4b6220da2a3', '1', 'https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSW_KGKOiRg0oTNHgrCNCp4vyjHXQB0GhEAfqWLB3Yupf5LT36v3pPdqw', '1');
INSERT INTO `user_info` VALUES ('11', '1000:1221304b3e14d3ff30e2fb7840bfaefaf54732b6b47d0a89:05e5044ed2cc7bee791c27af60eb6828e28bc0c9ea4dc9ac', '2', 'https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSW_KGKOiRg0oTNHgrCNCp4vyjHXQB0GhEAfqWLB3Yupf5LT36v3pPdqw', '1');
INSERT INTO `user_info` VALUES ('12', '1000:657c171dfbcd0c152b50447e78fc2cc48e69d7b1dc3977ec:a728294e6ee6f46bf3e5f32d7f3cc266513b7e43d786e3e9', '123456', 'https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSW_KGKOiRg0oTNHgrCNCp4vyjHXQB0GhEAfqWLB3Yupf5LT36v3pPdqw', '1');
INSERT INTO `user_info` VALUES ('13', '1000:a1275f498396285cd66805c33ed8e4cf85e097cd73ae1045:fe5f6e50ba651477a3001ac60787ec6ad464036cb95b8ca0', '12345655', 'https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSW_KGKOiRg0oTNHgrCNCp4vyjHXQB0GhEAfqWLB3Yupf5LT36v3pPdqw', '1');
INSERT INTO `user_info` VALUES ('14', '1000:3bf42638dd257baf5599a86edc32229817012e6bf00384f5:106ee0a4a7275a18db7dc617787f80154943f9c9590334f2', '123456789', 'https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSW_KGKOiRg0oTNHgrCNCp4vyjHXQB0GhEAfqWLB3Yupf5LT36v3pPdqw', '1');
INSERT INTO `user_info` VALUES ('15', '1000:301ab15e989a1c5830c38e75e08c2f3e8c76c9682e438276:074ff7045941ea3d5e643c901e76a94a48ca789a305b523b', 'hsjsjsjs', 'https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSW_KGKOiRg0oTNHgrCNCp4vyjHXQB0GhEAfqWLB3Yupf5LT36v3pPdqw', '1');
INSERT INTO `user_info` VALUES ('16', '1000:33ced08e0678c287ee5cbfc8a1986a7d33aa9ba8575a6b71:24f91e04d7d70270bb075894dc6ddd5e54c6a2310486ac12', '123456hshsh', 'https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSW_KGKOiRg0oTNHgrCNCp4vyjHXQB0GhEAfqWLB3Yupf5LT36v3pPdqw', '1');

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
INSERT INTO `user_token` VALUES ('6', 'eyJhbGciOiJIUzUxMiJ9.eyJpZCI6NiwiYXVkIjoidGVzdDUiLCJpc3MiOiJiZXlvbmRib3kiLCJpYXQiOjE0NzYxNzAzOTI0Mjd9.gnRfylRNtAY3R6h_Yt5t9ChtHtEf668S5VHslQp2qOVSztarAzPQ6toayXZ4lBEC-mJ5Hy42UE9w3Rgy672G5w');
INSERT INTO `user_token` VALUES ('7', 'eyJhbGciOiJIUzUxMiJ9.eyJpZCI6NywiYXVkIjoidGVzdDYiLCJpc3MiOiJiZXlvbmRib3kiLCJpYXQiOjE0NzY2ODg2ODk1ODh9.yXZoEpwzFNHLLb5HRFRHH9aH2SHe-aYA39B9q0z_CrPZvlh39C_uqPooFn-l6c9hJFqHMz-SxIQks0aBVJK7ww');
INSERT INTO `user_token` VALUES ('8', 'eyJhbGciOiJIUzUxMiJ9.eyJpZCI6OCwiYXVkIjoiMTIzIiwiaXNzIjoiYmV5b25kYm95IiwiaWF0IjoxNDgzNDY1NzI3MDc3fQ.S9B1IlUG3b1LonR5tN0dr4zrH0nnCL6qcfaSi6_u-wuEteRibWCbKisHn9ABZmQON2vV9tPTuNOIB3VpuUsPxw');
INSERT INTO `user_token` VALUES ('9', 'eyJhbGciOiJIUzUxMiJ9.eyJpZCI6OSwiYXVkIjoiMTIzNCIsImlzcyI6ImJleW9uZGJveSIsImlhdCI6MTQ3NjY3NDk4NTE1Nn0.dFPKWyqTg5ILH6wqeWj2Rl85bCj83J5v46wM1sreSaE81fAxhdelSNW8-iBa3xUTbkCefbQg6P4j7436GWv2UQ');
INSERT INTO `user_token` VALUES ('10', 'eyJhbGciOiJIUzUxMiJ9.eyJpZCI6MTAsImF1ZCI6IjEiLCJpc3MiOiJiZXlvbmRib3kiLCJpYXQiOjE0NzY2ODc4NDQ4NDh9.k0x6oKSY70FNuRJBl5_Bc61JPpFVBY2VknzK4cTC5Nh2eiJr8XGbM9uW4dBqGtp_ujgKX62lBnc1JGPY-3k-KQ');
INSERT INTO `user_token` VALUES ('11', 'eyJhbGciOiJIUzUxMiJ9.eyJpZCI6MTEsImF1ZCI6IjIiLCJpc3MiOiJiZXlvbmRib3kiLCJpYXQiOjE0NzY2ODc5OTAwMjl9.C4mKY3z3DORi3NwhmxmiLrj6g8CO_5BbAP0OXGSVJtXtZCvuHReE_JMR_r_0fPCJQLwqm6-y5rSHiFD3mYlZKg');
INSERT INTO `user_token` VALUES ('12', 'eyJhbGciOiJIUzUxMiJ9.eyJpZCI6MTIsImF1ZCI6IjEyMzQ1NiIsImlzcyI6ImJleW9uZGJveSIsImlhdCI6MTQ4MzM1OTA2NDI1N30.9Fq2iG2uqBquhT3Quds6lak4ulR4393aXPc_72KF63KX4MPbS9gaPnYdrNlb7kYstcLmqaVeyp-04asoS2k8HA');
INSERT INTO `user_token` VALUES ('13', 'eyJhbGciOiJIUzUxMiJ9.eyJpZCI6MTMsImF1ZCI6IjEyMzQ1NjU1IiwiaXNzIjoiYmV5b25kYm95IiwiaWF0IjoxNDgzMzYwMjIwMjU1fQ.UC8cRELFmYPZom34zBInneXlaz_r0_fmnoz7yraOvbRB2WtyUFN8N4juF3QqDYfjXEKWlY3mY73MVYdq7R3qIA');
INSERT INTO `user_token` VALUES ('14', 'eyJhbGciOiJIUzUxMiJ9.eyJpZCI6MTQsImF1ZCI6IjEyMzQ1Njc4OSIsImlzcyI6ImJleW9uZGJveSIsImlhdCI6MTQ4MzM2MDI1NDQyN30.clYGgyh8iqFYY_oDKMXhi--kIdViBw0DME1OObj_L5cJMFKm_U33s2KZkmNmnDEseV0J4_hy5ewPfJ77_INg7Q');
INSERT INTO `user_token` VALUES ('15', 'eyJhbGciOiJIUzUxMiJ9.eyJpZCI6MTUsImF1ZCI6ImhzanNqc2pzIiwiaXNzIjoiYmV5b25kYm95IiwiaWF0IjoxNDgzMzYwNzE0ODAwfQ.w56ku-A0ID9MvOIOmAvy3VdHSAXv2r3OB9LDNv9-HHsp3fsmsKnfzJwr_vLOMf6TK39BZr-GcyPezxDscsxqxA');
INSERT INTO `user_token` VALUES ('16', 'eyJhbGciOiJIUzUxMiJ9.eyJpZCI6MTYsImF1ZCI6IjEyMzQ1NmhzaHNoIiwiaXNzIjoiYmV5b25kYm95IiwiaWF0IjoxNDgzMzYwOTczMjM0fQ.MB7l5sqxVC2JC_ML2NRcvptF6Lr_4rdexA6x7qdpS3TavXbIysclmmBT0g9-69JkAUNtQMO4CUsFWlhPryLE5g');
