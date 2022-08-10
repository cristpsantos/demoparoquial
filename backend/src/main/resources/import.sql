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
INSERT INTO tb_comunidades(nome, endereco, paroquia_id, cidade_id) VALUES ('Matriz', 'Av. Pq Atheneu Unidade 205', 1, 1);
INSERT INTO tb_comunidades(nome, endereco, paroquia_id, cidade_id) VALUES ('San Damiano', 'Avenida Bela Vista', 1, 2);

INSERT INTO tb_missas(horario) VALUES ('07:30');
INSERT INTO tb_missas(horario) VALUES ('10:00');
INSERT INTO tb_missas(horario) VALUES ('19:30');

INSERT INTO tb_dizimistas(nome, endereco, telefone, nascimento, cidade_id) VALUES ('Cristiano Pontes', 'Av. Parque Atheneu', '62 99999-9999', '1981-11-15', 1);
INSERT INTO tb_dizimistas(nome, endereco, telefone, nascimento, cidade_id) VALUES ('Larissa Pontes', 'Av. Parque Atheneu', '62 99999-9998', '1986-05-25', 1);
INSERT INTO tb_dizimistas(nome, endereco, telefone, nascimento, cidade_id) VALUES ('Marilda Pontes', 'Rua 11 lote 21 Unidade 203 Parque Atheneu', '62 99999-9997', '1956-05-20', 6);

INSERT INTO tb_lancamentoreceitas(data_devolucao, mes_referente, tipo_receita, valor, dizimista_id, missa_id, comunidade_id, usuario_id) VALUES ('2022-07-31', '2022-06-01', 0, 50.00, 2, 1, 3, 4);
INSERT INTO tb_lancamentoreceitas(data_devolucao, mes_referente, tipo_receita, valor, dizimista_id, missa_id, comunidade_id, usuario_id) VALUES ('2022-07-31', '2022-05-01', 0, 50.00, 2, 1, 3, 4);
INSERT INTO tb_lancamentoreceitas(data_devolucao, mes_referente, tipo_receita, valor, dizimista_id, missa_id, comunidade_id, usuario_id) VALUES ('2022-07-31', '2022-07-01', 0, 100.00, 1, 1, 3, 3);
INSERT INTO tb_lancamentoreceitas(data_devolucao, mes_referente, tipo_receita, valor, dizimista_id, missa_id, comunidade_id, usuario_id) VALUES ('2022-08-07', '2022-03-01', 0, 150.00, 1, 2, 2, 3);