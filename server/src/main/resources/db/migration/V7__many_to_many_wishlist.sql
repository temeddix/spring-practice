CREATE TABLE wishlist (
  product_id INT UNSIGNED NOT NULL,
  user_id INT UNSIGNED NOT NULL,
  CONSTRAINT pk_wishlist PRIMARY KEY (product_id, user_id)
);

ALTER TABLE wishlist
ADD CONSTRAINT fk_wishlist_on_user
  FOREIGN KEY (user_id) REFERENCES users (id);

ALTER TABLE wishlist
ADD CONSTRAINT fk_wishlist_on_product
  FOREIGN KEY (product_id) REFERENCES products (id);