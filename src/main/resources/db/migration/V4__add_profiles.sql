create table
  `profiles` (
    `id` int unsigned not null,
    `bio` VARCHAR(255) not null,
    `phone_number` varchar(255) not null,
    `date_of_birth` DATETIME not null,
    `loyalty_points` INT UNSIGNED not null default 0,
    primary key (`id`),
    KEY `profiles_relation_1` (`id`),
    CONSTRAINT `profiles_relation_1` FOREIGN KEY (`id`) REFERENCES `users` (`id`) ON DELETE CASCADE ON UPDATE CASCADE
  );