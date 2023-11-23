--                                        FKS

-- Cliente

alter table cliente add constraint fk_cliente_cidade foreign key(idcidade) references cidade(idcidade);

alter table cliente add constraint fk_cliente_favorito foreign key(idfav) references favorito(idfav);

-- Favoritos

alter table favorito add constraint fk_favorito_vendedor foreign key(idven) references vendedor(idven);

-- Vendedor


alter table vendedor add constraint fk_vendedor_cidade foreign key(idcidade) references cidade(idcidade);

alter table vendedor add constraint fk_vendedor_ramo foreign key(idramo) references ramoatv(idramo);

-- Serviço

alter table servico add constraint fk_servico_ramo foreign key(idramo) references ramoatv(idramo);

-- Serviço Vendedor

alter table servicovendedor add constraint fk_servicovendedor foreign key(idserv) references servico(idserv);

alter table servicovendedor add constraint fk_vendedorservico foreign key(idven) references vendedor(idven);

--Imagens Vendedor

alter table imagensservico add constraint fk_servicoimagens foreign key(idimg) references imagens(idimg);

alter table imagensservico add constraint fk_imagensservico foreign key(idserv) references servico(idserv);

--                                        Inserts

-- Ramos

insert into ramoatv values (0, 'Fotógrafo', 'camera');

insert into ramoatv values (0, 'T.I.', 'cpu');

insert into ramoatv values (0, 'Mecânico', 'tool');

insert into ramoatv values (0, 'Advogado', 'briefcase');

insert into ramoatv values (0, 'Professor', 'clipboard');

insert into ramoatv values (0, 'Médico', 'plus');

-- Servico

insert into servico values (0, 'Dente', 100.00, 'https://centroconscientia.com.br/wp-content/uploads/2019/08/alexander-kopelman-4fa6.jpg', 1);

insert into servico values (0, 'Formatação', 50.00, 'https://www.oficinadanet.com.br/imagens/post/14237/manutencao_pc.jpg', 2);

-- Image

insert into imagens values (0, 'https://centroconscientia.com.br/wp-content/uploads/2019/08/alexander-kopelman-4fa6.jpg');

insert into imagens values (0, 'https://www.oficinadanet.com.br/imagens/post/14237/manutencao_pc.jpg');

-- Vendedor

insert into vendedor values (0, 'Vitor Lopes', 'https://revolucaonerd.com/wordpress/wp-content/files/revolucaonerd.com/2023/04/law.webp', 'fotopubli', 'vitao@email.com', '1111', 'Vitao', '2005-08-04', '(14)999302010', 'R. bebebe', '61', null, 'doc', 'cnpj', 3, 1, 1);

insert into vendedor values (0, 'Gabriela Silva', 'https://img.quizur.com/f/img63d966885af0d3.87555390.jpg?lastEdited=1675191962', null, 'gabi@email.com', '2121', 'Gabi', '2005-09-18', '(14)99050198', 'R. mememe', '71', '21', 'doc', 'cnpj', 4, 2, 2);

insert into vendedor values (0, 'Vinicius Nogueira', 'https://kanto.legiaodosherois.com.br/w760-h398-cfill/wp-content/uploads/2019/07/legiao_Dk5jiZKIvYP_nhEcd3JqFR6watUAeslCBGLpXz1MuW.png.webp', null, 'vini@email.com', '2121', 'Vini', '2005-09-18', '(14)99050198', 'R. mememe', '71', '21', 'doc', 'cnpj', 4, 2, 2);

-- Servico Vendedor

insert into servicovendedor values (0, 1, 1);

insert into servicovendedor values (0, 2, 1);

-- Image Servico

insert into imagensservico values (0, 1, 1);

insert into imagensservico values (0, 2, 2);

-- Favorito

insert into favorito values (0, 1);

insert into favorito values (0, 2);

-- Clientes

insert into cliente values (0, 'Mariana Rove', 'foto', 'mariana@email.com', '2112', 'Mari', '2005-12-21', '(14)998030507', 'R. papapa', '11', null ,'121212', 1, 1);

-- Imagens




