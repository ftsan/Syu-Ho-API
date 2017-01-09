CREATE TABLE `twitter_oauth` (
  `twitter_oauth_id` int(11) NOT NULL AUTO_INCREMENT,
  `user_id` int(11) NOT NULL,
  `token_key` varchar(255) NOT NULL,
  `seecret_token` varchar(255) NOT NULL,
  `screen_name` varchar(255) NOT NULL,
  `created_datetime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `updated_datetime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`twitter_oauth_id`),
  KEY `user_id_idx` (`user_id`),
  KEY `seecret_token_idx` (`seecret_token`),
  KEY `token_key_idx` (`token_key`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4
;