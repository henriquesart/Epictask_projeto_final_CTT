CREATE TABLE account (id INT PRIMARY KEY auto_increment, nome varchar(200), email varchar(200), senha varchar(200), githubuser varchar(200));

INSERT INTO account VALUES (1, 'Carla', 'Carla@email.com', 'Carla12345', 'carla');

INSERT INTO account VALUES (2, 'Junior', 'Junior@email.com', 'Junior54321','junior');

CREATE TABLE task (id INT PRIMARY KEY auto_increment, title varchar(200), description TEXT, points int,status int DEFAULT 0,user_id int);

INSERT INTO task (id, title, description, points, status, user_id) VALUES 
(1, 'Criar banco de dados', 'Criar o banco no mysql', 50, 10, 1);

INSERT INTO task (id, title, description, points, status) VALUES 
(2, 'Prototipação do sistema', 'Protótipo de alta fidelidade', 350, 60);

INSERT INTO task (id, title, description, points, status, user_id) VALUES 
(3, 'Modelagem de dados', 'Criar diagramas', 150, 90, 2);