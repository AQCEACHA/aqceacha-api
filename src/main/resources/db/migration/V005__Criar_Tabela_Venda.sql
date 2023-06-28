Create Table venda(
  idvenda bigint not null auto_increment primary key,
  datavenda date not null,
  idcli bigint not null,
  idven bigint not null
);