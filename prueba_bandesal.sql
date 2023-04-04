create database prueba_bandesal

use prueba_bandesal;

create table reader
(
	Id int auto_increment primary key,
	Name varchar(50) not null
);


create table blog
(
	Id int auto_increment primary key,
	Title varchar(50) not null
);

/* Tabla de detalle de readers por blog */
create table blog_reader
(
	Id int auto_increment primary key,
	IdReader int not null,
	IdBlog int not null
);


create table usuario
(
	Id int auto_increment primary key,
	usuario varchar(50) not null,
	clave varchar(100) not null,
	nombre varchar(50) not null,
	apellido varchar(50)
);

insert into usuario values(null,'admin','admin123','Stephen','Melendez');


alter table blog_reader add constraint fk_reader
foreign key (IdReader) references reader(Id);

alter table blog_reader add constraint fk_blog 
foreign key (IdBlog) references blog(Id);

