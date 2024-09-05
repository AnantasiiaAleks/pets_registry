CREATE DATABASE human_friends;
USE human_friends;

CREATE TABLE type_of_animal (
id_type INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
type VARCHAR(20) NOT NULL );
INSERT INTO type_of_animal (type) VALUES ('home_animal'), ('pack_animal');


CREATE TABLE home_animals (
id INT PRIMARY KEY AUTO_INCREMENT,
animal VARCHAR(20) NOT NULL, 
type_num INT,
FOREIGN KEY (type_num) REFERENCES type_of_animal (id_type) );
INSERT INTO home_animals (animal, type_num) VALUES ('dog', 1), ('cat', 1), ('hamster', 1);


CREATE TABLE pack_animals (
id INT PRIMARY KEY AUTO_INCREMENT,
animal VARCHAR(20) NOT NULL,
type_num INT,
FOREIGN KEY (type_num) REFERENCES type_of_animal (id_type) );
INSERT INTO pack_animals (animal, type_num) VALUES ('horse', 2), ('camel', 2), ('donkey', 2);


CREATE TABLE commands (
id INT PRIMARY KEY AUTO_INCREMENT NOT NULL,
command VARCHAR(20) );
INSERT INTO commands (command)
VALUES ('Sit'), ('Down'), ('Stand'), ('Place'),
('Speak'), ('Come'), ('Drop-it'), ('Leave-it'),
('Stop'), ('Crawl'), ('Attack');


CREATE TABLE dogs (
id INT PRIMARY KEY AUTO_INCREMENT NOT NULL,
name VARCHAR(20),
birth_date DATE,
id_type INT,
id_home_animal INT,
id_command INT,
FOREIGN KEY (id_type) REFERENCES type_of_animal (id_type),
FOREIGN KEY (id_home_animal) REFERENCES home_animals (id),
FOREIGN KEY (id_command) REFERENCES commands (id) );
INSERT INTO dogs (name, birth_date, id_type, id_home_animal, id_command)
VALUES ('Sharik', '2010-05-01', 1, 1, 11), ('Varya', '2021-11-15', 1, 1, 5);

CREATE TABLE cats (
id INT PRIMARY KEY AUTO_INCREMENT NOT NULL,
name VARCHAR(20),
birth_date DATE,
id_type INT,
id_home_animal INT,
id_command INT,
FOREIGN KEY (id_type) REFERENCES type_of_animal (id_type),
FOREIGN KEY (id_home_animal) REFERENCES home_animals (id),
FOREIGN KEY (id_command) REFERENCES commands (id) );
INSERT INTO cats (name, birth_date, id_type, id_home_animal, id_command)
VALUES ('Vaska', '2023-08-23', 1, 2, 6), ('Isabella', '2024-01-02', 1, 2, 2);

CREATE TABLE hamsters (
id INT PRIMARY KEY AUTO_INCREMENT NOT NULL,
name VARCHAR(20),
birth_date DATE,
id_type INT,
id_home_animal INT,
id_command INT,
FOREIGN KEY (id_type) REFERENCES type_of_animal (id_type),
FOREIGN KEY (id_home_animal) REFERENCES home_animals (id),
FOREIGN KEY (id_command) REFERENCES commands (id) );
INSERT INTO hamsters (name, birth_date, id_type, id_home_animal, id_command)
VALUES ('George', '2021-12-14', 1, 3, 1), ('Petra', '2023-10-01', 1, 3, 3);

CREATE TABLE horses (
id INT PRIMARY KEY AUTO_INCREMENT NOT NULL,
name VARCHAR(20),
birth_date DATE,
id_type INT,
id_pack_animal INT,
id_command INT,
FOREIGN KEY (id_type) REFERENCES type_of_animal (id_type),
FOREIGN KEY (id_pack_animal) REFERENCES pack_animals (id),
FOREIGN KEY (id_command) REFERENCES commands (id) );
INSERT INTO horses (name, birth_date, id_type, id_pack_animal, id_command)
VALUES ('Starlight', '2019-09-03', 2, 1, 7), ('Kashtan', '2023-11-01', 2, 1, 6);

CREATE TABLE camels (
id INT PRIMARY KEY AUTO_INCREMENT NOT NULL,
name VARCHAR(20),
birth_date DATE,
id_type INT,
id_pack_animal INT,
id_command INT,
FOREIGN KEY (id_type) REFERENCES type_of_animal (id_type),
FOREIGN KEY (id_pack_animal) REFERENCES pack_animals (id),
FOREIGN KEY (id_command) REFERENCES commands (id) );
INSERT INTO camels (name, birth_date, id_type, id_pack_animal, id_command)
VALUES ('Donald', '2020-03-18', 2, 2, 8), ('Igor', '2024-02-01', 2, 3, 9);

CREATE TABLE donkeys (
id INT PRIMARY KEY AUTO_INCREMENT NOT NULL,
name VARCHAR(20),
birth_date DATE,
id_type INT,
id_pack_animal INT,
id_command INT,
FOREIGN KEY (id_type) REFERENCES type_of_animal (id_type),
FOREIGN KEY (id_pack_animal) REFERENCES pack_animals (id),
FOREIGN KEY (id_command) REFERENCES commands (id) );
INSERT INTO donkeys (name, birth_date, id_type, id_pack_animal, id_command)
VALUES ('Stepan', '2022-09-03', 2, 3, 10), ('Oleg', '2020-11-01', 2, 3, 3);

DROP TABLE camels;
DELETE FROM pack_animals WHERE animal = 'camel';

CREATE TABLE farm_pets
SELECT * FROM horses
UNION ALL
SELECT * FROM donkeys;
select * from farm_pets;

CREATE TABLE home_pets
SELECT * FROM dogs UNION ALL
SELECT * FROM cats UNION ALL
SELECT * FROM hamsters;
select * from home_pets;

CREATE TABLE young_animals
SELECT animal, name, birth_date, datediff(curdate(),birth_date) DIV 31 as 'age/monts'
FROM home_pets
LEFT JOIN home_animals ON home_animals.id = home_pets.id_home_animal
WHERE (datediff(curdate(),birth_date) DIV 31) <= 36
UNION ALL
SELECT animal, name, birth_date, datediff(curdate(),birth_date) DIV 31 as 'age/monts'
FROM farm_pets
LEFT JOIN pack_animals ON pack_animals.id = farm_pets.id_pack_animal
WHERE (datediff(curdate(),birth_date) DIV 31) <= 36;

select * from young_animals;

CREATE TABLE all_animals
SELECT type, animal, name, birth_date, command
FROM home_pets
LEFT JOIN type_of_animal ON type_of_animal.id_type = home_pets.id_type
LEFT JOIN home_animals ON home_animals.id = home_pets.id_home_animal
LEFT JOIN commands ON commands.id = home_pets.id_command
UNION ALL
SELECT type, animal, name, birth_date, command
FROM farm_pets
LEFT JOIN type_of_animal ON type_of_animal.id_type = farm_pets.id_type
LEFT JOIN pack_animals ON pack_animals.id = farm_pets.id_pack_animal
LEFT JOIN commands ON commands.id = farm_pets.id_command;

SELECT * FROM all_animals;