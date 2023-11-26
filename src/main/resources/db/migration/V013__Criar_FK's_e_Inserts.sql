--                                        FKS

-- Cliente

alter table cliente add constraint fk_cliente_cidade foreign key(idcidade) references cidade(idcidade);


-- Vendedor


alter table vendedor add constraint fk_vendedor_cidade foreign key(idcidade) references cidade(idcidade);

alter table vendedor add constraint fk_vendedor_ramo foreign key(idramo) references ramoatv(idramo);


-- Serviço Vendedor

alter table servicovendedor add constraint fk_servicovendedor foreign key(idserv) references servico(idserv);

alter table servicovendedor add constraint fk_vendedorservico foreign key(idven) references vendedor(idven);

-- Imagens Vendedor

alter table imagensvendedor add constraint fk_vendedorimagens foreign key(idimg) references imagens(idimg);

alter table imagensvendedor add constraint fk_imagensvendedor foreign key(idven) references vendedor(idven);

-- Favoritos

alter table favorito add constraint fk_favorito_vendedor foreign key(idven) references vendedor(idven);

-- Favorito Cliente

alter table favoritocliente add constraint fk_favoritocliente foreign key (idfav) references favorito(idfav);

alter table favoritocliente add constraint fk_clientefavorito foreign key (idcli) references cliente(idcli);


--                                        Inserts

-- Ramos

insert into ramoatv values (0, 'Fotógrafo', 'camera');

insert into ramoatv values (0, 'T.I.', 'cpu');

insert into ramoatv values (0, 'Mecânico', 'tool');

insert into ramoatv values (0, 'Advogado', 'briefcase');

insert into ramoatv values (0, 'Professor', 'clipboard');

insert into ramoatv values (0, 'Médico', 'plus');

insert into ramoatv values (0, 'Designer', 'edit');

insert into ramoatv values (0, 'Dentista', 'pen-tool');



-- Servico

-- 1 a 4 Rove

insert into servico values (0, 'Criação de logotipos', 2500.00, 'https://lh3.googleusercontent.com/pw/ADCreHdQTICkDwCaPd8TOvZGTPUa4SNIw4UA_tG-CNtfhiy3LFuewYhUJEZqx7T6IMlKghDWWejapThoxtN5UHxY5Kld1IyLbvggPGvk9WyJGVMcLMzUMqZG-IAoXcbku9kzXgkA17AInxrZxvhNzfKTfiSI=w657-h343-s-no-gm?authuser=0');

insert into servico values (0, 'Criação de peças publicitárias', 5000.00, 'https://lh3.googleusercontent.com/pw/ADCreHdQTICkDwCaPd8TOvZGTPUa4SNIw4UA_tG-CNtfhiy3LFuewYhUJEZqx7T6IMlKghDWWejapThoxtN5UHxY5Kld1IyLbvggPGvk9WyJGVMcLMzUMqZG-IAoXcbku9kzXgkA17AInxrZxvhNzfKTfiSI=w657-h343-s-no-gm?authuser=0');

insert into servico values (0, 'Criação de websites', 25000.00, 'https://lh3.googleusercontent.com/pw/ADCreHdQTICkDwCaPd8TOvZGTPUa4SNIw4UA_tG-CNtfhiy3LFuewYhUJEZqx7T6IMlKghDWWejapThoxtN5UHxY5Kld1IyLbvggPGvk9WyJGVMcLMzUMqZG-IAoXcbku9kzXgkA17AInxrZxvhNzfKTfiSI=w657-h343-s-no-gm?authuser=0');

insert into servico values (0, 'Design editorial', 25000.00, 'https://lh3.googleusercontent.com/pw/ADCreHdQTICkDwCaPd8TOvZGTPUa4SNIw4UA_tG-CNtfhiy3LFuewYhUJEZqx7T6IMlKghDWWejapThoxtN5UHxY5Kld1IyLbvggPGvk9WyJGVMcLMzUMqZG-IAoXcbku9kzXgkA17AInxrZxvhNzfKTfiSI=w657-h343-s-no-gm?authuser=0');

-- 5 a 7 Pepe

insert into servico values (0, 'Limpeza interna e externa do pc', 100.00, 'https://lh3.googleusercontent.com/pw/ADCreHeLXNQ1ORCX0EWDCrYbzGj_K4NmxttBbKwVNDpLQD_NHWqFCNxZIlfeZUCeYq6-EWOjb_PmNEDNcHTFuKGzfJv4lsGxl1OwankgoHjKGWdCuoQW6S8gFTaxy2SWESCZ1SdLz7Gm-eh_iz4KrYHjmt3S=w602-h326-s-no-gm?authuser=0');

insert into servico values (0, 'Backup de dados', 100.00, 'https://lh3.googleusercontent.com/pw/ADCreHeLXNQ1ORCX0EWDCrYbzGj_K4NmxttBbKwVNDpLQD_NHWqFCNxZIlfeZUCeYq6-EWOjb_PmNEDNcHTFuKGzfJv4lsGxl1OwankgoHjKGWdCuoQW6S8gFTaxy2SWESCZ1SdLz7Gm-eh_iz4KrYHjmt3S=w602-h326-s-no-gm?authuser=0');

insert into servico values (0, 'Reparação de danos físicos', 300.00, 'https://lh3.googleusercontent.com/pw/ADCreHeLXNQ1ORCX0EWDCrYbzGj_K4NmxttBbKwVNDpLQD_NHWqFCNxZIlfeZUCeYq6-EWOjb_PmNEDNcHTFuKGzfJv4lsGxl1OwankgoHjKGWdCuoQW6S8gFTaxy2SWESCZ1SdLz7Gm-eh_iz4KrYHjmt3S=w602-h326-s-no-gm?authuser=0');

-- 8 a 10 Fabi

insert into servico values (0, 'Clínica geral', 00.00, 'https://lh3.googleusercontent.com/pw/ADCreHcpt7H55JGgS2J3_Bgw9jtgQuV-rs5-weY63737sq9k-RXuetZAFwoBL5Yn_E5YmrgbfDueYaR8kbxzsDdupmcls1sIhzw7jcSO435VpkEwTZ4zSSZqEmeb8-4SR54AxtKepcfSFNC1lAU6L-kjWGUN=w1065-h939-s-no-gm?authuser=0');

insert into servico values (0, 'Cirurgia', 00.00, 'https://lh3.googleusercontent.com/pw/ADCreHcpt7H55JGgS2J3_Bgw9jtgQuV-rs5-weY63737sq9k-RXuetZAFwoBL5Yn_E5YmrgbfDueYaR8kbxzsDdupmcls1sIhzw7jcSO435VpkEwTZ4zSSZqEmeb8-4SR54AxtKepcfSFNC1lAU6L-kjWGUN=w1065-h939-s-no-gm?authuser=0');

insert into servico values (0, 'Ortodontia', 00.00, 'https://lh3.googleusercontent.com/pw/ADCreHcpt7H55JGgS2J3_Bgw9jtgQuV-rs5-weY63737sq9k-RXuetZAFwoBL5Yn_E5YmrgbfDueYaR8kbxzsDdupmcls1sIhzw7jcSO435VpkEwTZ4zSSZqEmeb8-4SR54AxtKepcfSFNC1lAU6L-kjWGUN=w1065-h939-s-no-gm?authuser=0');

-- 11 e 12 Victor

insert into servico values (0, 'Ensaio de fotos', 00.00, 'https://lh3.googleusercontent.com/pw/ADCreHeUoGNTkKqC2Z4YPxyDuUPuHmVkBIHkYfLgyzdBhx_2VwOmlvZ2TAi80mfUQ4hZVhI6nDIGqRE2EaRyXrICARYat32PwjBvTeMeps0uFdRKMn9gj4sovAZyaoh5n8wYWYfyY_pX9oQ_iBS70zcfOrPY=w669-h400-s-no-gm?authuser=0');

insert into servico values (0, 'Gravação de vídeo', 00.00, 'https://lh3.googleusercontent.com/pw/ADCreHcjUleeBg9U3Ulf57vxEU2uUgXGoEH1RjGP6wtkkk94X7K7EbdyvCslxznH3VdN7xLMxx5eSqaBY0ckCXzAYhn9wGcQEW-sEsOYDBrk2Qz5ccF5WKo43diFF9kJGoD4A9TfHpasJIEpw6ddijvPKAAw=w646-h440-s-no-gm?authuser=0');





-- Vendedor

insert into vendedor values (0, 'Mari Rove', 'https://lh3.googleusercontent.com/pw/ADCreHeWc1xZnZoF56eLeHtXyyzQSnaFx1vhKEvY2xLxj6BuBv7EgtPYKpfK5WiWI2746jMenksIoouc0WN-UQ1Me3wX2bVY40oyhdMj2NqfXBw9KJH25SDKsTLuC03wOtYpmKxp_CFCt1xJqPfzSQwkPdfT=w727-h458-s-no-gm?authuser=0', null, 'marirove@email.com', '1111', 'Roves Designer', '2005-12-21', '(14)988103938', 'R. bebebe', '61', null, 'doc', 'cnpj', 5, 5010, 7);

insert into vendedor values (0, 'Pedro Henrique Ribeiro', 'https://lh3.googleusercontent.com/pw/ADCreHeXEeIWLlOf0U_NEziBMl003ibkBnZJSITfc34-NGTcZxtqkjFZNx4tVJCbAjKOPG-T4ofx-FMN3Cwcb9JhT3am6m4T4Rar_9SRIzLxXuzWZiNbhckYWdeyOf1wTX025h_g6HLuaPZ39tib8fU9XtSg=w484-h498-s-no-gm?authuser=0', null, 'pepe@email.com', '2121', 'Pepe Manutenções', '2005-09-18', '(14)99050198', 'R. mememe', '71', '21', 'doc', 'cnpj', 4, 5010, 2);

insert into vendedor values (0, 'Fabiana Chiquito', 'https://lh3.googleusercontent.com/pw/ADCreHcpt7H55JGgS2J3_Bgw9jtgQuV-rs5-weY63737sq9k-RXuetZAFwoBL5Yn_E5YmrgbfDueYaR8kbxzsDdupmcls1sIhzw7jcSO435VpkEwTZ4zSSZqEmeb8-4SR54AxtKepcfSFNC1lAU6L-kjWGUN=w1065-h939-s-no-gm?authuser=0', null, 'fabiana@email.com', '2121', 'Dentista Fabiana', '2005-09-18', '(14)99050198', 'R. mememe', '71', '21', 'doc', 'cnpj', 4.5, 5010, 8);

insert into vendedor values (0, 'Victor Carbelotti', 'https://lh3.googleusercontent.com/pw/ADCreHdj93n7VM1rK-s_-VvdAMVhM-m4ke0DLGiMIdUFtidOu1T6vMdb1r94fVwOOCjsTPEXZa7Ge8tax9IbTUZke4b2vZ6AiKGI_fKFBhcL1TyjYJrvqxm2DqcqhH24TczJBP8Y9AjhStSYjzCLGMDcI1uJ=w459-h496-s-no-gm?authuser=0', null, 'victor@email.com', '1234', 'Cameraman', '2005-06-03', '(14)998040306', 'R. mememe', '71', null, 'doc', 'cnpj', 5, 5010, 1);


-- Clientes

insert into cliente values (0, 'Mariana Rove', 'foto', 'mariana@email.com', '2112', 'Mari', '2005-12-21', '(14)998030507', 'R. papapa', '11', null ,'121212', 1);

-- Favorito

insert into favorito values (0, 1);

insert into favorito values (0, 2);

-- Servico Vendedor

insert into servicovendedor values (0, 1, 1);

insert into servicovendedor values (0, 2, 1);

insert into servicovendedor values (0, 3, 1);

insert into servicovendedor values (0, 4, 1);

insert into servicovendedor values (0, 5, 2);

insert into servicovendedor values (0, 6, 2);

insert into servicovendedor values (0, 7, 2);

insert into servicovendedor values (0, 8, 3);

insert into servicovendedor values (0, 9, 3);

insert into servicovendedor values (0, 10, 3);

insert into servicovendedor values (0, 11, 4);

insert into servicovendedor values (0, 12, 4);

-- Favorito Cliente

insert into favoritocliente values (0, 1, 1);

insert into favoritocliente values (0, 2, 1);

-- Imagens

-- 1 e 2 Rove

insert into imagens values (0, 'https://lh3.googleusercontent.com/pw/ADCreHetEE-C1oYi--f8cQzb5oPz4Bn5u0h6nmuqlRVyqlMgGpdMTUfSBGrYYqh4M2d7PIGy4Zar9mhTYqyvdQblYJtEhWcuAVTpyLxVq7mZzQjGhRV1OnHQjwtXCkjbDt5oAAJxfl_flFDzWUuRqqR4YPMZ=w214-h433-s-no-gm?authuser=0');

insert into imagens values (0, 'https://lh3.googleusercontent.com/pw/ADCreHcOEy0IhTJaSs9-v6Q2UyS2cEL8xg370tT40Y6B1qJJFnmZFTK0zf26gdLY4NZv6h5WrGWoEwH3TB5Dbzjsd61ojYuM9pshkgzySWAXVAKOM465ol0i4YfIZqeMn3CYWnCHzgdub1_RYwj3pf6-OfRN=w738-h495-s-no-gm?authuser=0');

-- 3 e 4 Pepe

insert into imagens values (0, 'https://lh3.googleusercontent.com/pw/ADCreHeU8gWfpWJg8bcCh8M8PGivKw1QLUS1MENwBdbmbx_jtiHka4vowGWBBuJX6f3d-xISocyq_RmhH2bNR1p781PMh2hUJSf_6L8QRkXfQvcn2N6I0R4ysKTw3UZDthz93G-DpS3Ny4zrH1Q_5CbqMpLh=w275-h183-s-no-gm?authuser=0');

insert into imagens values (0, 'https://lh3.googleusercontent.com/pw/ADCreHc0tRliHdgvxlb8rwaWOK1NGqPwTXbu1-Nr5XsTg2KcknosLh0eDq1TBBhwu3mtzDgxkWb0DeGOA2jd0bWP3QP-wgomoZOiwmEyiBDK3bBJIL0qwe3X4LiwaJ90apGTjAo2JKzCvtmuJ-yGmzVmNOCb=w800-h600-s-no-gm?authuser=0');

-- 5 e 6 Fab

insert into imagens values (0, 'https://cptstatic.s3.amazonaws.com/imagens/enviadas/materias/materia10708/slide/instrumentos-odontologicos-cursos-cpt.jpg');

insert into imagens values (0, 'https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRyOMnYnk9s11FhjOadEkpsF_W69GMCvh7f-A&usqp=CAU');

-- 7 e 8 Victor

insert into imagens values (0, 'https://lh3.googleusercontent.com/pw/ADCreHf-Z7tgwIyeEesm6a2HB62cqRWOjShRjpMoHk98oiq4Ci_PRA8ETaXW125voRrB19xfuAW8QMExVHbWFwVZnI3qFuH8CabjtR-2mmJ-Y-7rbDLehr08WMpxJb06eIsHThEmYOSQ19p1B8V7QWZpr1vL=w856-h805-s-no-gm?authuser=0');

insert into imagens values (0, 'https://lh3.googleusercontent.com/pw/ADCreHf1YfKw9IRJe5rNS25Xqq3hALQ2b5USNoBWqU6SxYRSz4q9dnrkIHw-Hc9AyRS_pNVfxe1ZZ8FONTgYptHD3zL4EJ8s4QBgy299oKSKvmL9p1n9a33hCwvtNnjIeWx9YGkqtBeEbI6Wbw6zCiqqUxbJ=w850-h851-s-no-gm?authuser=0    ');


-- Imagens Vendedor

insert into imagensvendedor values (0, 1, 1);

insert into imagensvendedor values (0, 2, 1);

insert into imagensvendedor values (0, 3, 2);

insert into imagensvendedor values (0, 4, 2);

insert into imagensvendedor values (0, 5, 3);

insert into imagensvendedor values (0, 6, 3);

insert into imagensvendedor values (0, 7, 4);

insert into imagensvendedor values (0, 8, 4);

