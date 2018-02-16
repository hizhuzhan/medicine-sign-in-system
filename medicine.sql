#CREATE SOURCE

#MEETING LIST
CREATE TABLE DATA_MEETING_LIST (
  `MEETING_ID` VARCHAR(50) PRIMARY KEY NOT NULL , #会议ID
  `MEETING_NAME` VARCHAR(100),     #会议名称
  `CTEATE_TIME` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,   #创建时间
  `LAST_MODIFY_TIME` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,    #最后修改时间
  `METTING_START_TIME` TIMESTAMP,   #会议开始时间
  `METTING_SIT` VARCHAR(255)    #会议地点
);
#MEEETING VALUES
INSERT INTO `data_meeting_list` (`MEETING_ID`,`MEETING_NAME`,`METTING_START_TIME`,`METTING_SIT`)
VALUES
  ('1','测试会议一', '2018-02-01 01:22:56', '测试地点一'),
  ('2','测试会议二', '2018-02-01 01:22:56', '测试地点二'),
  ('3','测试会议三', '2018-02-01 01:22:56', '测试地点三'),
  ('4','测试会议四', '2018-02-01 01:22:56', '测试地点四'),
  ('5','测试会议五', '2018-02-01 01:22:56', '测试地点五'),
  ('6','测试会议六', '2018-02-01 01:22:56', '测试地点六'),
  ('7','测试会议七', '2018-02-01 01:22:56', '测试地点七'),
  ('8','测试会议八', '2018-02-01 01:22:56', '测试地点八'),
  ('9','测试会议九', '2018-02-01 01:22:56', '测试地点九'),
  ('10','测试会议十', '2018-02-01 01:22:56', '测试地点十'),
  ('11','测试会议十一', '2018-02-01 01:22:56', '测试地点十一'),
  ('12','测试会议十二', '2018-02-01 01:22:56', '测试地点十二'),
  ('13','测试会议十三', '2018-02-01 01:22:56', '测试地点十三'),
  ('14','测试会议十四', '2018-02-01 01:22:56', '测试地点十四'),
  ('15','测试会议十五', '2018-02-01 01:22:56', '测试地点十五'),
  ('16','测试会议十六', '2018-02-01 01:22:56', '测试地点十六'),
  ('17','测试会议十七', '2018-02-01 01:22:56', '测试地点十七'),
  ('18','测试会议十八', '2018-02-01 01:22:56', '测试地点十八'),
  ('19','测试会议十九', '2018-02-01 01:22:56', '测试地点十九'),
  ('20','测试会议二十', '2018-02-01 01:22:56', '测试地点二十'),
  ('21','测试会议二十一', '2018-02-01 01:22:56', '测试地点二十一');


#MENU TRABLE
CREATE TABLE SYS_MENU (
  `MENU_ID` VARCHAR(50) PRIMARY KEY NOT NULL, #唯一Id
  `TITLE` VARCHAR(50), #标题
  `ICON` VARCHAR(50), #图标
  `HREF` VARCHAR(255), #连接
  `SPREAD` BOOLEAN, #初始化时是否展开
  `CHILDREN` VARCHAR(1000) #下级子节点
);
#MENU VALUES
INSERT INTO SYS_MENU VALUES ('1', '首页', 'icon-computer', 'test', false, '');
INSERT INTO SYS_MENU VALUES ('2', '添加会议', 'icon-computer', 'test', false, '');
INSERT INTO SYS_MENU VALUES ('3', '进行签到', 'icon-computer', 'test', false, '');
INSERT INTO SYS_MENU VALUES ('4', '签到状态', 'icon-computer', 'test', false, '');
INSERT INTO SYS_MENU VALUES ('5', '会议统计', 'icon-computer', 'test', false, '');