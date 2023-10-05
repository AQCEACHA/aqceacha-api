--                                        FKS

-- Cliente

alter table cliente add constraint fk_cliente_cidade foreign key(idcidade) references cidade(idcidade);

-- Vendedor


alter table vendedor add constraint fk_vendedor_cidade foreign key(idcidade) references cidade(idcidade);

alter table vendedor add constraint fk_vendedor_ramo foreign key(idramo) references ramoatv(idramo);

alter table vendedor add constraint fk_vendedor_serv foreign key(idserv) references servico(idserv);


--                                        Inserts

-- Cidades

insert into cidade values (0, 'Lençóis Paulista', 'SP');

insert into cidade values (0, 'Bauru', 'SP');

-- Ramos

insert into ramoatv values (0, 'Dentista');

insert into ramoatv values (0, 'Técnico de Informática');

-- Clientes

insert into cliente values (0, 'Mariana Rove', 'foto', 'mariana@email.com', '2112', 'Mari', '2005-12-21', '(14)998030507', 'R. papapa', '11', null ,'121212', 1, 'Favorito');

insert into cliente values (0, 'Matheus Cola', 'foto', 'eocola@email.com', '0101', 'Cola', '2005-05-23', '(14)99867493', 'R. ranran', '1416', '61', '121212', 2, 'Favorito2');

-- Servico

insert into servico values (0, 1, 1, 100.00, 'foto');

insert into servico values (0, 2, 2, 50.00, 'foto');

-- Vendedor

insert into vendedor values (0, 'Vitor Lopes', 'foto', 'vitao@email.com', '1111', 'Vitao', '2005-08-04', '(14)999302010', 'R. bebebe', '61', null, 'doc', 'cnpj', 1, 1, 1, 3.5);

insert into vendedor values (0, 'Gabriela Silva', 'foto', 'gabi@email.com', '2121', 'Gabi', '2005-09-18', '(14)99050198', 'R. mememe', '71', '21', 'doc', 'cnpj', 2, 2, 2, 4);

