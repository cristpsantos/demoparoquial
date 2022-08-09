INSERT INTO tb_estados(nome) VALUES ('Goiás');
INSERT INTO tb_estados(nome) VALUES ('Minas Gerais');
INSERT INTO tb_estados(nome) VALUES ('Tocantins');

INSERT INTO tb_cidades(nome, estado_id) VALUES ('Goiânia', 1);
INSERT INTO tb_cidades(nome, estado_id) VALUES ('Aparecida de Goiânia', 1);
INSERT INTO tb_cidades(nome, estado_id) VALUES ('Uberlândia', 2);
INSERT INTO tb_cidades(nome, estado_id) VALUES ('Araxá', 2);
INSERT INTO tb_cidades(nome, estado_id) VALUES ('Palmas', 3);
INSERT INTO tb_cidades(nome, estado_id) VALUES ('Arraias', 3);

INSERT INTO tb_usuarios(nome, login, senha) VALUES ('Cristiano Pontes', 'cristiano', '123456');
INSERT INTO tb_usuarios(nome, login, senha) VALUES ('Larissa Damasceno', 'larissa', '123456');
INSERT INTO tb_usuarios(nome, login, senha) VALUES ('Lanna Beatriz', 'lanna', '123456');
INSERT INTO tb_usuarios(nome, login, senha) VALUES ('Laura Damasceno', 'laura', '123456');

INSERT INTO tb_paroquias(nome, endereco, cidade_id) VALUES ('Paroquia Cristo Rei', 'Av. Pq. Atheneu Unidade 205', 1);

INSERT INTO tb_comunidades(nome, endereco, paroquia_id, cidade_id) VALUES ('Nossa Senhora Aparecida', 'Praça da Feira Unidade 101', 1, 1);