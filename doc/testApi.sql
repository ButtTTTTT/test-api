create database if not exists testApi;
use testApi;
CREATE TABLE `user` (
  `user_id` varchar(255) NOT NULL,
  `username` varchar(255) DEFAULT NULL,
  `create_time` datetime DEFAULT NULL,
  PRIMARY KEY (`user_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
INSERT INTO `user` (`user_id`, `username`, `create_time`) VALUES (replace(uuid(),'-',''), 'Alice', '2022-01-01 00:00:00');
INSERT INTO `user` (`user_id`, `username`, `create_time`) VALUES (replace(uuid(),'-',''), 'Bob', '2022-01-02 00:01:00');
INSERT INTO `user` (`user_id`, `username`, `create_time`) VALUES (replace(uuid(),'-',''), 'Charlie', '2022-01-03 00:02:00');
INSERT INTO `user` (`user_id`, `username`, `create_time`) VALUES (replace(uuid(),'-',''), 'David', '2022-01-04 00:03:00');
INSERT INTO `user` (`user_id`, `username`, `create_time`) VALUES (replace(uuid(),'-',''), 'Eva', '2022-01-05 00:04:00');
