--                                        FKS

-- Cliente

alter table cliente add constraint fk_cliente_cidade foreign key(idcidade) references cidade(idcidade);

-- Vendedor


alter table vendedor add constraint fk_vendedor_cidade foreign key(idcidade) references cidade(idcidade);

alter table vendedor add constraint fk_vendedor_ramo foreign key(idramo) references ramoatv(idramo);

alter table vendedor add constraint fk_vendedor_serv foreign key(idserv) references servico(idserv);

-- Serviço

alter table servico add constraint fk_servico_ramo foreign key(idramo) references ramoatv(idramo);

--                                        Inserts

-- Clientes

insert into cliente values (0, 'Mariana Rove', 'foto', 'mariana@email.com', '2112', 'Mari', '2005-12-21', '(14)998030507', 'R. papapa', '11', null ,'121212', 1, 'Favorito');

insert into cliente values (0, 'Matheus Cola', 'foto', 'eocola@email.com', '0101', 'Cola', '2005-05-23', '(14)99867493', 'R. ranran', '1416', '61', '121212', 2, 'Favorito2');

-- Ramos

insert into ramoatv values (0, 'Dentista');

insert into ramoatv values (0, 'Técnico de Informática');


-- Servico

insert into servico values (0, 'Dente', 100.00, 'foto', 1);

insert into servico values (0, 'Formatação', 50.00, 'foto', 2);

-- Vendedor

insert into vendedor values (0, 'Vitor Lopes', 'foto', 'vitao@email.com', '1111', 'Vitao', '2005-08-04', '(14)999302010', 'R. bebebe', '61', null, 'doc', 'cnpj', 3, 1, 1, 1);

insert into vendedor values (0, 'Gabriela Silva', 'foto', 'gabi@email.com', '2121', 'Gabi', '2005-09-18', '(14)99050198', 'R. mememe', '71', '21', 'doc', 'cnpj', 4, 2, 2, 2);

