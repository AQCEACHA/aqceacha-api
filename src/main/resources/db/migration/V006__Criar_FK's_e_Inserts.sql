--                                        FKS

-- Cliente

alter table cliente add constraint fk_cliente_cidade foreign key(idcidade) references cidade(idcidade);

-- Vendedor


alter table vendedor add constraint fk_vendedor_cidade foreign key(idcidade) references cidade(idcidade);

alter table vendedor add constraint fk_vendedor_ramo foreign key(idramo) references ramoatv(idramo);

-- Venda

alter table venda add constraint fk_venda_cliente foreign key(idcli) references cliente(idcli);

alter table venda add constraint fk_venda_vendedor foreign key(idven) references vendedor(idven);


--                                        Inserts

insert into cidade values (0, 'Lençóis Paulista', 'SP');

insert into cidade values (0, 'Bauru', 'SP');

insert into ramoatv values (0, 'Dentista');

insert into ramoatv values (0, 'Técnico de Informática');

insert into cliente values (0, 'Mariana Rove', 'foto', 'mariana@email.com', '2112', 'Mari', '2005-12-21', '(14)998030507', 'R. papapa', null ,'121212', 1);

insert into vendedor values (0, 'Vitor Lopes', 'foto', 'fotos', 'vitao@email.com', '1111', 'Vitao', '2005-08-04', '(14)999302010', 'R. bebebe', '61' ,'99980', 'doc', 1, 1, 200.00);

insert into venda values (0, '2022-04-14', 1, 1, 1);

insert into venda values (0, '2023-05-09', 1, 1);
