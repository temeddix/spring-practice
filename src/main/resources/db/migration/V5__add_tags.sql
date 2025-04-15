create table
  `tags` (
    `id` int unsigned not null auto_increment,
    `name` VARCHAR(255) not null,
    primary key (`id`)
  );

create table
  `user_tags` (
    `user_id` int unsigned not null,
    `tag_id` int unsigned not null,
    primary key (`user_id`, `tag_id`),
    CONSTRAINT `tags_relation_1` FOREIGN KEY (`user_id`) REFERENCES `users` (`id`) ON DELETE CASCADE ON UPDATE CASCADE,
    CONSTRAINT `tags_relation_2` FOREIGN KEY (`tag_id`) REFERENCES `tags` (`id`) ON DELETE CASCADE ON UPDATE CASCADE
  );