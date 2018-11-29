CREATE TABLE `sfpost_delivery_detail` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `waybill_no` varchar(50) NOT NULL,
  `delivery_time` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;
