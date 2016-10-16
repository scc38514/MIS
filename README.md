# MIS
management information system</br>

###建表sql语句：
CREATE TABLE `保养人员` (<br/>
`保养人id` int(11) NOT NULL AUTO_INCREMENT,<br/>
`保养人名称` varchar(265) DEFAULT NULL,<br/>
`班组` varchar(265) DEFAULT NULL,<br/>
PRIMARY KEY (`保养人id`)
)<br/> 

CREATE TABLE `保养单` (<br/>
`保养id` int(11) NOT NULL AUTO_INCREMENT,<br/>
`保养人id` int(11) DEFAULT NULL,<br/>
`保养时间` date DEFAULT NULL,<br/>
PRIMARY KEY (`保养id`),<br/>
KEY `保养人ID_idx` (`保养人id`),<br/>
CONSTRAINT `保养人ID` FOREIGN KEY (`保养人id`) REFERENCES `保养人员` (`保养人id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) <br/>

CREATE TABLE `保养消耗` (<br/>
`保养消耗id` int(11) NOT NULL AUTO_INCREMENT,<br/>
`材料id` int(11) DEFAULT NULL,<br/>
`使用数量` int(11) DEFAULT NULL,<br/>
`单位` varchar(265) DEFAULT NULL,<br/>
PRIMARY KEY (`保养消耗id`),<br/>
KEY `材料ID_idx` (`材料id`),<br/>
CONSTRAINT `材料ID` FOREIGN KEY (`材料id`) REFERENCES `材料` (`材料id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) <br/>
 
CREATE TABLE `保养记录` (<br/>
`保养记录id` int(11) NOT NULL AUTO_INCREMENT,<br/>
`设备号` int(11) DEFAULT NULL,<br/>
`保养id` int(11) DEFAULT NULL,<br/>
`项目id` int(11) DEFAULT NULL,<br/>
`保养消耗id` int(11) DEFAULT NULL,<br/>
`完成情况` varchar(225) DEFAULT NULL,<br/>
`备注` varchar(225) DEFAULT NULL,<br/>
PRIMARY KEY (`保养记录id`),<br/>
KEY `设备号_idx` (`设备号`),<br/>
KEY `保养ID_idx` (`保养id`),<br/>
KEY `保养消耗_idx` (`保养消耗id`),<br/>
KEY `项目ID_idx` (`项目id`),<br/>
CONSTRAINT `保养ID` FOREIGN KEY (`保养id`) REFERENCES `保养单` (`保养id`) ON DELETE NO ACTION ON UPDATE NO ACTION,<br/>
CONSTRAINT `保养消耗` FOREIGN KEY (`保养消耗id`) REFERENCES `保养消耗` (`保养消耗id`) ON DELETE NO ACTION ON UPDATE NO ACTION,<br/>
CONSTRAINT `设备号` FOREIGN KEY (`设备号`) REFERENCES `设备` (`设备号`) ON DELETE NO ACTION ON UPDATE NO ACTION,<br/>
CONSTRAINT `项目ID` FOREIGN KEY (`项目id`) REFERENCES `保养项目` (`项目id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) <br/>

CREATE TABLE `保养项目` (<br/>
`项目id` int(11) NOT NULL AUTO_INCREMENT,<br/>
`设备id` int(11) NOT NULL,<br/>
`保养内容` varchar(265) NOT NULL,<br/>
PRIMARY KEY (`项目id`),<br/>
KEY `设备ID_idx` (`设备id`),<br/>
CONSTRAINT `设备ID` FOREIGN KEY (`设备id`) REFERENCES `设备类型` (`设备id`) ON DELETE NO ACTION ON UPDATE NO ACTION
)<br/>

CREATE TABLE `材料` (<br/>
`材料id` int(11) NOT NULL AUTO_INCREMENT,<br/>
`材料名称` varchar(225) DEFAULT NULL,<br/>
PRIMARY KEY (`材料id`)
) <br/>

CREATE TABLE `设备` (<br/>
`设备号` int(11) NOT NULL,<br/>
`设备id` int(11) NOT NULL,<br/>
`保养周期类型` varchar(265) DEFAULT NULL,<br/>
PRIMARY KEY (`设备号`),<br/>
KEY `设备id_idx` (`设备id`),<br/>
CONSTRAINT `设备id1` FOREIGN KEY (`设备id`) REFERENCES `设备类型` (`设备id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) <br/>

CREATE TABLE `设备类型` (<br/>
`设备id` int(11) NOT NULL AUTO_INCREMENT,<br/>
`设备类型` varchar(265) NOT NULL,<br/>
PRIMARY KEY (`设备id`)
) <br/>

查询：<br/>

查询设备保养信息:<br/>
SELECT* FROM 电器设备保养.保养记录 NATURAL<br/>
join 电器设备保养.保养消耗 NATURAL<br/> 
join 电器设备保养.材料NATURAL<br/>
join 电器设备保养.保养单 NATURAL<br/>
join 电器设备保养.保养人员 NATURAL<br/>
join 电器设备保养.设备 <br/>
where 设备号=1 and <br/>
保养消耗.材料id=材料.材料id and <br/>
保养记录.保养消耗id=保养消耗.保养消耗id and<br/>
保养记录.保养id=保养单.保养id;<br/>

截图：![设备保养信息]( http://pan.baidu.com/s/1pKIavzX /to/保养信息.jpg)

查询到期信息:<br/>
select 设备号 from 电器设备保养.保养记录 NATURAL join 电器设备保养.保养单<br/>
where 365 - datediff(CURDATE(),保养时间)<10;

截图：![到期设备]( http://pan.baidu.com/s/1kVS8jcF /to/到期设备.jpg)

E-R图：

![E-R图](../E-R图.jpg/to/ E-R图.jpg)

模型地址：(http://a4m0mm.axshare.com)

附件地址：(http://pan.baidu.com/s/1i5wNZ8p)



