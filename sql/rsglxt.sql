

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for t_department
-- ----------------------------
DROP TABLE IF EXISTS `t_department`;
CREATE TABLE `t_department`  (
  `F_bno` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL,
  `F_bname` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL,
  `F_fuzeren` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL,
  PRIMARY KEY (`F_bno`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Records of t_department
-- ----------------------------
INSERT INTO `t_department` VALUES ('1', '1', '1');
INSERT INTO `t_department` VALUES ('A1001', '运维', '李白');
INSERT INTO `t_department` VALUES ('C1001', '前台', '王维');
INSERT INTO `t_department` VALUES ('D1001', '美工', '吴道子');
INSERT INTO `t_department` VALUES ('S1001', '后勤', '杜甫');
INSERT INTO `t_department` VALUES ('T800', '安保', '终结者');

-- ----------------------------
-- Table structure for t_hunyin
-- ----------------------------
DROP TABLE IF EXISTS `t_hunyin`;
CREATE TABLE `t_hunyin`  (
  `F_yno` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL,
  `F_hunyinzhuangkuang` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL,
  `F_airenname` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL,
  `F_jiehunshijian` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL,
  `F_kids` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL,
  `F_airenzhiye` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL,
  PRIMARY KEY (`F_yno`) USING BTREE,
  CONSTRAINT `F_yno` FOREIGN KEY (`F_yno`) REFERENCES `t_yuangong` (`F_yno`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Records of t_hunyin
-- ----------------------------
INSERT INTO `t_hunyin` VALUES ('A001', '未婚', '无', '无', '无', '无');
INSERT INTO `t_hunyin` VALUES ('A002', '未婚', '无', '无', '无', '无');
INSERT INTO `t_hunyin` VALUES ('C001', '未婚', '无', '无', '无', '无');
INSERT INTO `t_hunyin` VALUES ('D001', '未婚', '无', '无', '无', '无');
INSERT INTO `t_hunyin` VALUES ('S001', '未婚', '无', '无', '无', '无');
INSERT INTO `t_hunyin` VALUES ('T800', '未婚', '无', '无', '无', '无');

-- ----------------------------
-- Table structure for t_renyuandiaodong
-- ----------------------------
DROP TABLE IF EXISTS `t_renyuandiaodong`;
CREATE TABLE `t_renyuandiaodong`  (
  `F_dno` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL,
  `F_yno` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL,
  `F_bno` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL,
  `F_yuangangwei` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL,
  `F_diaodonggangwei` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL,
  `F_diaodongyuanyin` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL,
  `F_diaodongshijian` date NOT NULL,
  PRIMARY KEY (`F_dno`, `F_yno`, `F_bno`) USING BTREE,
  INDEX `F_bno_diaodong`(`F_bno` ASC) USING BTREE,
  INDEX `F_yno_diaodong`(`F_yno` ASC) USING BTREE,
  CONSTRAINT `F_bno_diaodong` FOREIGN KEY (`F_bno`) REFERENCES `t_department` (`F_bno`) ON DELETE RESTRICT ON UPDATE RESTRICT,
  CONSTRAINT `F_yno_diaodong` FOREIGN KEY (`F_yno`) REFERENCES `t_yuangong` (`F_yno`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Records of t_renyuandiaodong
-- ----------------------------
INSERT INTO `t_renyuandiaodong` VALUES ('001', 'A002', 'A1001', '助理', '经理', '丈夫因公殉职，特此补偿', '2023-07-19');

-- ----------------------------
-- Table structure for t_user
-- ----------------------------
DROP TABLE IF EXISTS `t_user`;
CREATE TABLE `t_user`  (
  `t_username` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL,
  `t_password` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL,
  `t_admin` int NOT NULL,
  PRIMARY KEY (`t_username`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Records of t_user
-- ----------------------------
INSERT INTO `t_user` VALUES ('A001', '123456', 1);
INSERT INTO `t_user` VALUES ('A002', '123456', 0);
INSERT INTO `t_user` VALUES ('C001', '123456', 1);
INSERT INTO `t_user` VALUES ('D001', '123456', 1);
INSERT INTO `t_user` VALUES ('S001', '123456', 1);
INSERT INTO `t_user` VALUES ('T800', '123456', 0);

-- ----------------------------
-- Table structure for t_xueli
-- ----------------------------
DROP TABLE IF EXISTS `t_xueli`;
CREATE TABLE `t_xueli`  (
  `F_yno` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL,
  `F_school` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL,
  `F_waiyuqingkuang` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL,
  `F_biyeshijian` date NOT NULL,
  `F_xueli` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL,
  `F_zhuanye` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL,
  PRIMARY KEY (`F_yno`) USING BTREE,
  CONSTRAINT `F_yno_xueli` FOREIGN KEY (`F_yno`) REFERENCES `t_yuangong` (`F_yno`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Records of t_xueli
-- ----------------------------
INSERT INTO `t_xueli` VALUES ('A001', '唐代名校', '英语八级', '2023-06-01', '博士', '诗词设计');
INSERT INTO `t_xueli` VALUES ('A002', '1', '1', '2023-07-05', '1', '1');
INSERT INTO `t_xueli` VALUES ('C001', '唐代高校', '英语六级', '2023-06-30', '本科', '工程管理');
INSERT INTO `t_xueli` VALUES ('D001', '汉朝名校', '汉语八级', '2023-07-01', '硕士', '美工');
INSERT INTO `t_xueli` VALUES ('S001', '宋代高校', '英语四级', '2023-07-08', '硕士', '财会管理');
INSERT INTO `t_xueli` VALUES ('T800', '无', '无', '2023-07-04', '无', '无');

-- ----------------------------
-- Table structure for t_yuangong
-- ----------------------------
DROP TABLE IF EXISTS `t_yuangong`;
CREATE TABLE `t_yuangong`  (
  `F_yno` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL,
  `F_bno` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL,
  `F_id` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL,
  `F_yname` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL,
  `F_sex` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL,
  `F_gangwei` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL,
  `F_zhicheng` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL,
  `F_canjiagongzuoshijian` date NOT NULL,
  PRIMARY KEY (`F_yno`, `F_bno`) USING BTREE,
  INDEX `F_bno`(`F_bno` ASC) USING BTREE,
  INDEX `F_yno`(`F_yno` ASC) USING BTREE,
  CONSTRAINT `F_bno` FOREIGN KEY (`F_bno`) REFERENCES `t_department` (`F_bno`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Records of t_yuangong
-- ----------------------------
INSERT INTO `t_yuangong` VALUES ('A001', 'A1001', '153201200203215135', '李白', '男', '经理', '高级设计师', '2023-07-04');
INSERT INTO `t_yuangong` VALUES ('A002', 'A1001', '1256859653256325146', '李清照', '女', '助理', '中级设计师', '2023-08-25');
INSERT INTO `t_yuangong` VALUES ('C001', 'C1001', '124268222203125645', '王维', '男', '主管', '中级工程师', '2023-07-07');
INSERT INTO `t_yuangong` VALUES ('D001', 'D1001', '352625200103255468', '吴道子', '男', '经理', '高级美工师', '2023-06-01');
INSERT INTO `t_yuangong` VALUES ('S001', 'S1001', '54652620020321546', '杜甫', '男', '助理', '低级会计师', '2023-06-15');
INSERT INTO `t_yuangong` VALUES ('T800', 'T800', 'T800', '终结者', '无', '无', '无', '2023-06-01');

SET FOREIGN_KEY_CHECKS = 1;
