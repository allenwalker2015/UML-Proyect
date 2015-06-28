drop database if exists hotelBobbie;

create database hotelBobbie;

use hotelBobbie;


create table cliente(
	idCliente int not null,
	nombreCliente varchar(15),
	apellidoCliente varchar(15),
	tarjetaCredito varchar(25),
        PRIMARY KEY (idCliente)
);

create table reserva(
	idReserva int not null,
	idCliente int,
	codHabitacion varchar(4),
	fechaReserva varchar(10),
	numeroDiasReservas int(2),
	idEstReserva int(1),
        PRIMARY KEY (idReserva)
);

create table estadoReserva(
	idEstReserva int(1) primary key,
	nomEstado varchar(9)
);


create table habitacion(
	codHabitacion varchar(4) primary key,
	precioHabitacion double(5,2),
	idDispHabitacion int(1)
);

create table disponibilidadHabitacion(
	idDispHabitacion int(1) primary key,
	nomDisponibilidad varchar(17)
);


ALTER TABLE reserva ADD FOREIGN KEY(idCliente) REFERENCES cliente(idCliente);
ALTER TABLE reserva ADD FOREIGN KEY(codHabitacion) REFERENCES habitacion(codHabitacion);
ALTER TABLE reserva ADD FOREIGN KEY(idEstReserva) REFERENCES estadoReserva(idEstReserva);
ALTER TABLE habitacion ADD FOREIGN KEY(idDispHabitacion) REFERENCES disponibilidadHabitacion(idDispHabitacion);


insert into estadoReserva values (1,'Enviada');
insert into estadoReserva values (2,'Recibida');
insert into estadoReserva values (3,'Guardada');
insert into estadoReserva values (4,'Eliminada');

insert into disponibilidadHabitacion values (1, 'Disponible');
insert into disponibilidadHabitacion values (2, 'Ocupada');
insert into disponibilidadHabitacion values (3, 'En Mantenimiento');

insert into cliente (idCliente,nombreCliente,apellidoCliente,tarjetaCredito) values (1,'Jesus', 'Rodriguez', '9865 3265 7458 1598');
insert into cliente (idCliente,nombreCliente,apellidoCliente,tarjetaCredito) values (2,'Winnie', 'Pofe', '5987 3265 1574 3695');
insert into cliente (idCliente,nombreCliente,apellidoCliente,tarjetaCredito) values (3,'Kevin', 'Perez', '1554 6545 1572 5656');
insert into cliente (idCliente,nombreCliente,apellidoCliente,tarjetaCredito) values (4,'Alejandra', 'Hernandez', '8451 1555 1257 3945');
insert into cliente (idCliente,nombreCliente,apellidoCliente,tarjetaCredito) values (5,'Sofia', 'de Rodriguez', '4258 3695 3215 7895');
insert into cliente (idCliente,nombreCliente,apellidoCliente,tarjetaCredito) values (6,'Bobbie', 'Pesas', '9876 3698 7412 8462');

insert into habitacion values (1000, 100.35,1);
insert into habitacion values (1001, 78.99, 3);
insert into habitacion values (1010, 50.49, 2);
insert into habitacion values (1011, 150.00, 1);
insert into habitacion values (1100, 80.01, 1);

insert into reserva (idReserva,idCliente,codHabitacion,fechaReserva,numeroDiasReservas,idEstReserva) values (1,5,1011,'11/11/2015',5,3);
insert into reserva (idReserva,idCliente,codHabitacion,fechaReserva,numeroDiasReservas,idEstReserva) values (2,4,1010,'07/11/2015',2,1);
insert into reserva (idReserva,idCliente,codHabitacion,fechaReserva,numeroDiasReservas,idEstReserva) values (3,1,1010,'28/11/2015',2,2);
insert into reserva (idReserva,idCliente,codHabitacion,fechaReserva,numeroDiasReservas,idEstReserva) values (4,2,1100,'17/10/2015',2,4);
insert into reserva (idReserva,idCliente,codHabitacion,fechaReserva,numeroDiasReservas,idEstReserva) values (5,3,1000,'01/11/2015',3,1);
insert into reserva (idReserva,idCliente,codHabitacion,fechaReserva,numeroDiasReservas,idEstReserva) values (6,5,1001,'25/06/2015',14,3);
