--                                        FKS

-- Cliente

alter table cliente add constraint fk_cliente_cidade foreign key(idcidade) references cidade(idcidade);

alter table cliente add constraint fk_cliente_favorito foreign key(idfav) references favorito(idfav);

-- Favoritos

alter table favorito add constraint fk_favorito_vendedor foreign key(idven) references vendedor(idven);

-- Vendedor


alter table vendedor add constraint fk_vendedor_cidade foreign key(idcidade) references cidade(idcidade);

alter table vendedor add constraint fk_vendedor_ramo foreign key(idramo) references ramoatv(idramo);

alter table vendedor add constraint fk_vendedor_serv foreign key(idserv) references servico(idserv);

-- Serviço

alter table servico add constraint fk_servico_ramo foreign key(idramo) references ramoatv(idramo);

--                                        Inserts

-- Ramos

insert into ramoatv values (0, 'Dentista');

insert into ramoatv values (0, 'Técnico de Informática');


-- Servico

insert into servico values (0, 'Dente', 100.00, 'foto', 1);

insert into servico values (0, 'Formatação', 50.00, 'foto', 2);


-- Vendedor

insert into vendedor values (0, 'Vitor Lopes', 'https://scontent-gru1-2.xx.fbcdn.net/v/t39.30808-6/366982391_3108110796000014_624993821186213210_n.jpg?_nc_cat=110&ccb=1-7&_nc_sid=5f2048&_nc_aid=0&_nc_ohc=IruIMoRYOw4AX_JTpbi&_nc_ht=scontent-gru1-2.xx&oh=00_AfC2YQo69G232CyuCOUIYYoXomYw8ZUMkvaIMCTiDKCFGQ&oe=6551D8CF', 'fotopubli', 'vitao@email.com', '1111', 'Vitao', '2005-08-04', '(14)999302010', 'R. bebebe', '61', null, 'doc', 'cnpj', 3, 1, 1, 1);

insert into vendedor values (0, 'Gabriela Silva', 'https://scontent-gru1-2.xx.fbcdn.net/v/t39.30808-6/381349463_1676102659551534_130378750826186882_n.jpg?_nc_cat=108&ccb=1-7&_nc_sid=5f2048&_nc_eui2=AeHnmoBsVJn2GfE8MK--mKGr2Aixh7_RqG_YCLGHv9Gob7576ZVJHcqAcNYJJprsDRlrcr2z6ymsq3n-8nvzofud&_nc_ohc=-BegkuhTa94AX_o2ZnQ&_nc_ht=scontent-gru1-2.xx&oh=00_AfBIVd4WVa6tuUUPmZIoxLEM5SdenWyrDge6cKSeFJYsww&oe=655239B8', null, 'gabi@email.com', '2121', 'Gabi', '2005-09-18', '(14)99050198', 'R. mememe', '71', '21', 'doc', 'cnpj', 4, 2, 2, 2);

insert into vendedor values (0, 'Vinicius Nogueira', 'https://kanto.legiaodosherois.com.br/w760-h398-cfill/wp-content/uploads/2019/07/legiao_Dk5jiZKIvYP_nhEcd3JqFR6watUAeslCBGLpXz1MuW.png.webp', null, 'vini@email.com', '2121', 'Gabi', '2005-09-18', '(14)99050198', 'R. mememe', '71', '21', 'doc', 'cnpj', 4, 2, 2, 2);


-- Favorito

insert into favorito values (0, 1);

insert into favorito values (0, 2);

-- Clientes

insert into cliente values (0, 'Mariana Rove', 'foto', 'mariana@email.com', '2112', 'Mari', '2005-12-21', '(14)998030507', 'R. papapa', '11', null ,'121212', 1, 1);

insert into cliente values (0, 'Matheus Cola', 'foto', 'eocola@email.com', '0101', 'Cola', '2005-05-23', '(14)99867493', 'R. ranran', '1416', '61', '121212', 2, 2);





