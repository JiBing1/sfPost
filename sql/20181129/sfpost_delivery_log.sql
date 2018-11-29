CREATE TABLE `sfpost_delivery_log` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `monthly_card_no` varchar(255) NOT NULL,
  `phone_number` varchar(11) NOT NULL,
  `begin_time` datetime DEFAULT NULL,
  `end_time` datetime DEFAULT NULL,
  `delivery_nums` int(11) DEFAULT NULL,
  `remark` varchar(1000) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;