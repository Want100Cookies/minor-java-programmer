-- CREATE DATABASE laptopshop;

CREATE TABLE `Laptops` (
    `id` INT NOT NULL AUTO_INCREMENT,
    `name` VARCHAR(255) NOT NULL,
    `base_price` FLOAT(4, 2) NOT NULL,
    PRIMARY KEY(id)
);

CREATE TABLE `LaptopComponents` (
    `id` INT NOT NULL AUTO_INCREMENT,
    `name` VARCHAR(255) NOT NULL,
    `message` VARCHAR(255) NOT NULL,
    `laptop_id` INT NOT NULL,
    FOREIGN KEY (laptop_id) REFERENCES Laptops(id),
    PRIMARY KEY (id)
);

CREATE TABLE `LaptopOptions` (
    id INT NOT NULL AUTO_INCREMENT,
    value VARCHAR(255) NOT NULL,
    price FLOAT(4,2) NOT NULL,
    component_id INT NOT NULL,
    FOREIGN KEY (component_id) REFERENCES LaptopComponents(id),
    PRIMARY KEY (id)
);

CREATE TABLE `Users` (
    id INT NOT NULL AUTO_INCREMENT,
    name VARCHAR(255) NULL,
    email VARCHAR(255) NULL,
    iban VARCHAR(255) NULL,
    address1 VARCHAR(255) NULL,
    address2 VARCHAR(255) NULL,
    postal_code VARCHAR(255) NULL,
    city VARCHAR(255) NULL,
    country VARCHAR(255) NULL,
    PRIMARY KEY (id)
);

CREATE TABLE `Orders` (
    id INT NOT NULL AUTO_INCREMENT,
    laptop_id INT NOT NULL,
    user_id INT NOT NULL,
    PRIMARY KEY (id),
    FOREIGN KEY (laptop_id) REFERENCES Laptops(id),
    FOREIGN KEY (user_id) REFERENCES Users(id)
);

CREATE TABLE `OrderComponentOptions` (
    id INT NOT NULL AUTO_INCREMENT,
    order_id INT NOT NULL,
    component_id INT NOT NULL,
    option_id INT NOT NULL,
    PRIMARY KEY (id),
    FOREIGN KEY (order_id) REFERENCES Orders(id),
    FOREIGN KEY (component_id) REFERENCES LaptopComponents(id),
    FOREIGN KEY (option_id) REFERENCES LaptopOptions(id)
);

INSERT INTO `Laptops` (`name`, `base_price`) VALUES 
("Some laptop", 1700),
("Another laptop", 900);