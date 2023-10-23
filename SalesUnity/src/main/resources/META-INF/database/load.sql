INSERT INTO Cliente (email, nome_cliente, historico) VALUES ('cliente1@email.com', 'Cliente 1', 'Histórico do Cliente 1');
INSERT INTO Cliente (email, nome_cliente, historico) VALUES ('cliente2@email.com', 'Cliente 2', 'Histórico do Cliente 2');


INSERT INTO Produto (nome_produto, prc_unitario, descricao_produto, unidade_medida) VALUES ('Produto 1', 50.00, 'Descrição do Produto 1', 10.0);
INSERT INTO Produto (nome_produto, prc_unitario, descricao_produto, unidade_medida) VALUES ('Produto 2', 75.00, 'Descrição do Produto 2', 5.0);

INSERT INTO Fornecedor (nome_empresa, categoria_prd_fornecidos) VALUES ('Fornecedor A', 'Categoria 1');
INSERT INTO Fornecedor (nome_empresa, categoria_prd_fornecidos) VALUES ('Fornecedor B', 'Categoria 2');

INSERT INTO Transportadora (nome_transportadora, email, tipos_servico) VALUES ('Transportadora X', 'transportadora1@email.com', 'Serviço 1');
INSERT INTO Transportadora (nome_transportadora, email, tipos_servico) VALUES ('Transportadora Y', 'transportadora2@email.com', 'Serviço 2');

INSERT INTO Usuario (email, nome_usuario, senha, perfil_usuario) VALUES ('usuario1@email.com', 'Usuário 1', 'senha123', 'Perfil 1');
INSERT INTO Usuario (email, nome_usuario, senha, perfil_usuario) VALUES ('usuario2@email.com', 'Usuário 2', 'senha456', 'Perfil 2');


INSERT INTO Cotacao (status_cotacao, data_cotacao, FK_fornecedor_ID, FK_usuario_ID) VALUES ('Em andamento', TO_DATE('2023-10-20', 'YYYY-MM-DD'), 1, 'usuario1@email.com');
INSERT INTO Cotacao (status_cotacao, data_cotacao, FK_fornecedor_ID, FK_usuario_ID) VALUES ('Fechado', TO_DATE('2020-09-20', 'YYYY-MM-DD'), 2, 'usuario2@email.com');

INSERT INTO Compra (quantidade, preco_compra, FK_transportadora_ID, FK_cliente_ID) VALUES (5, 100.00, 1,'cliente1@email.com');
INSERT INTO Compra (quantidade, preco_compra, FK_transportadora_ID, FK_cliente_ID) VALUES (5, 100.00, 2,'cliente2@email.com');