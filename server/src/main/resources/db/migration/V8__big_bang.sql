DROP TABLE addresses;

DROP TABLE wishlist;

DROP TABLE products;

DROP TABLE categories;

DROP TABLE profiles;

DROP TABLE user_tags;

DROP TABLE tags;

DROP TABLE users;

CREATE TABLE members (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(255) NOT NULL,
    email VARCHAR(255) NOT NULL,
    age INT NOT NULL
);