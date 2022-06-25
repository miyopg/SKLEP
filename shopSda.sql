CREATE DATABASE sdashop;
create table sdashop.oils (
id 			INT AUTO_INCREMENT,
brand 		VARCHAR(32) NOT NULL,
oil_type 	VARCHAR(32) NOT NULL,
capacity 	VARCHAR(32) NOT NULL,
price 		DECIMAL(6,2) NOT NULL,
quantity 	INT,
PRIMARY KEY (id)
);
create table sdashop.clients (
id 				INT AUTO_INCREMENT,
first_name 		VARCHAR(32) NOT NULL,
last_name 		VARCHAR(32) NOT NULL,
email 			VARCHAR(64) NOT NULL UNIQUE,
phone_number 	VARCHAR(9) NOT NULL UNIQUE,
street 			VARCHAR(62) NOT NULL,
post_code 		VARCHAR(6) NOT NULL,
city 			VARCHAR(64) NOT NULL,
PRIMARY KEY (id)
);
create table sdashop.order_history (
id 				INT AUTO_INCREMENT,
customer 		INT NOT NULL,
order_date 		DATE NOT NULL,
products 		INT NOT NULL,
PRIMARY KEY (id),
FOREIGN KEY (products) REFERENCES oils(id),
FOREIGN KEY (customer) REFERENCES clients(id)
);
