create table servico(
idserv bigint not null auto_increment primary key,
nomeserv varchar(255) not null,
precovenda decimal(8,2) not null,
imgserv varchar(255) null,
idramo bigint not null
);
