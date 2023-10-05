Create Table cliente(
    idcli bigint not null auto_increment primary key,
    nomecli varchar(60) not null,
    imgcli varchar(255) not null,
    emailcli varchar(60) not null,
    senhacli varchar(20) not null,
    apelidocli varchar(20) not null,
    nascimentocli date not null,
    telefonecli varchar(15) not null,
    enderecocli varchar(40) not null,
    numerocli varchar(6) not null,
    complementocli varchar(6) null,
    documentocli varchar(60) not null,
    idcidade bigint not null,
    fav varchar(60) null,
    unique(emailcli)
);
