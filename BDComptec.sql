create database comptec;
use comptec;
-- drop database comptec;

create table departamentos (
	id int(2) primary key auto_increment,
    nombre varchar(50),
    correo varchar(50),
    telefono varchar(30)
);

create table jefesDepto (
	id int(2) primary key auto_increment,
    nombre varchar(50),
    correo varchar(50),
    telefono varchar(30),
    tipoUsuario enum('Admin','Jefe'),
    usuario varchar(30),
    contraseña varchar(30),
    idDepto int(2),
    foreign key (idDepto) references departamentos(id) on delete cascade
);

create table equipos (
	id int(2) primary key auto_increment,
    noInvent int(2),
    noSerie int(2),
    modelo varchar(50),
    procesador varchar(30),
    ram varchar(10),
    discoDuro varchar(10),
    estado enum('Bueno','Regular','Defectuoso'),
    idDepto int(2),
    foreign key (idDepto) references departamentos(id) on delete cascade
);

create table reportes (
	idEquipo int(2),
    idDepto int(2),
	noSerie int(2),
    noInvent int(2),
    procesador varchar(30),
    ram varchar(10),
    discoDuro varchar(10),
    estado enum('Bueno','Regular','Defectuoso'),
    modelo varchar(50),
    primary key(idEquipo,idDepto),
    foreign key (idEquipo) references equipos(id),
    foreign key (idDepto) references departamentos(id)
);

delimiter //
create procedure login_validar (
usuario_E varchar(30),
clave_E varchar(30),
out tipouser varchar(10),
out idDepto_E int(2)
)
Begin
	set tipouser = (select tipoUsuario from jefesDepto where usuario = usuario_E and contraseña = clave_E);
    set idDepto_E = (select idDepto from jefesDepto where usuario = usuario_E and contraseña = clave_E);
end//
delimiter ;


-- Procedimientos departamentos
delimiter //
create procedure mostrar_departamentos (
)
begin
	select * from departamentos order by id;
end//
delimiter ;

delimiter //
create procedure buscar_departamento (
nombre_E varchar(50),
out mensaje varchar(50)
)
begin
	if exists(select * from departamentos where nombre like concat('%',nombre_E,'%')) then
		select * from departamentos where nombre like concat('%',nombre_E,'%');
		set mensaje = 'Se encontró el departamento';
	else
		set mensaje = 'No se encontró el departamento';
end if;
end//
delimiter ;

delimiter //
create procedure añadir_departamento (
nombre_E varchar(50),
correo_E varchar(50),
telefono_E varchar(30),
out mensaje varchar(50)
)
begin
		insert into departamentos(nombre,correo,telefono) values(nombre_E,correo_E,telefono_E);
		set mensaje = 'Se añadio el departamento';
end//
delimiter ;

delimiter //
create procedure modificar_departamento (
clave int(2),
nombre_E varchar(50),
correo_E varchar(50),
telefono_E varchar(30),
out mensaje varchar(50)
)
Begin
	if exists(select * from departamentos where id like clave) then
		update departamentos set nombre = nombre_E, correo = correo_E, telefono = telefono_E where id = clave;
        set mensaje = "Datos modificados";
	else
		set mensaje = "El departamento no existe";
end if;
end//
delimiter ;

delimiter //
create procedure eliminar_departamento (
clave int(2),
out mensaje varchar(50)
)
begin
	if exists (select * from departamentos where id like clave) then
		delete from departamentos where id = clave;
        set mensaje = 'Departamento eliminado';
	else
		set mensaje = 'No existe el departamento';
end if;
end//
delimiter ;




-- Procedimientos para equipos
delimiter //
create procedure mostrar_equipos (
idDepto_E int(2)
)
Begin
	if(idDepto_E=1) then
		select * from equipos order by id;
	else
		select equipos.id,equipos.noInvent,equipos.noSerie,equipos.modelo,equipos.procesador,equipos.ram,equipos.discoDuro,
        equipos.estado,equipos.idDepto from equipos join departamentos on equipos.idDepto = departamentos.id where equipos.idDepto = idDepto_E
        order by equipos.id;
	end if;
end//
delimiter ;

delimiter //
create procedure buscar_equipo (
clave int(2),
out mensaje varchar(50)
)
Begin
	if exists(select * from equipos where id = clave) then
		select * from equipos where id = clave;
        set mensaje = "Se encontró el equipo";
	else
        set mensaje = "No se encontró el equipo";
end if;
end//
delimiter ;

delimiter //
create procedure añadir_equipo (
noInvent_E int(2),
noSerie_E int(2),
modelo_E varchar(50),
procesador_E varchar(30),
ram_E varchar(10),
discoDuro_E varchar(10),
estado_E enum('Bueno','Regular','Defectuoso'),
idDepto_E int(2),
out mensaje varchar(50)
)
Begin
	if not exists(select * from equipos where noInvent = noInvent_E) then
		if exists(select * from departamentos where id like idDepto_E) then
			insert into equipos (noInvent,noSerie,modelo,procesador,ram,discoDuro,estado,idDepto)
            values(noInvent_E,noSerie_E,modelo_E,procesador_E,ram_E,discoDuro_E,estado_E,idDepto_E);
            set mensaje = 'Se añadió el equipo';
		else
			set mensaje = 'No existe el departamento';
	end if;
		else
			set mensaje = 'Equipo ya registrado';
	end if;
end//
delimiter ;

delimiter //
create procedure modificar_equipo (
clave int(2),
noInvent_E int(2),
noSerie_E int(2),
modelo_E varchar(50),
procesador_E varchar(30),
ram_E varchar(10),
discoDuro_E varchar(10),
estado_E enum('Bueno','Regular','Defectuoso'),
idDepto_E int(2),
out mensaje varchar(50)
)
Begin
		if exists(select * from equipos where id like clave) then
			if exists(select * from departamentos where id like idDepto_E) then
			update equipos set noInvent = noInvent_E, noSerie = noSerie_E, modelo = modelo_E, procesador = procesador_E,
			ram = ram_E, discoDuro = discoDuro_E, estado = estado_E, idDepto = idDepto_E where id = clave;
			set mensaje = "Datos modificados";
		else
			set mensaje = "El departamento no existe";
	end if;
		else
			set mensaje = 'El equipo no existe';
	end if;
end//
delimiter ;

delimiter //
create procedure eliminar_equipo (
clave int(2),
out mensaje varchar(50)
)
Begin
	if exists(select * from equipos where id like clave) then
		delete from equipos where id like clave;
        set mensaje = "Se eliminó el equipo";
	else
        set mensaje = "El equipo no existe";
end if;
end//
delimiter ;


-- Procedimientos para jefes de departamento

delimiter //
create procedure mostrar_jefes (
)
Begin
	select * from jefesDepto order by id;
end//
delimiter ;

delimiter //
create procedure buscar_jefe (
nombre_E varchar(50),
out mensaje varchar(50)
)
Begin
	if exists(select * from jefesDepto where nombre like concat('%',nombre_E,'%')) then
		select * from jefesDepto where nombre like concat('%',nombre_E,'%');
        set mensaje = "Se encontró al jefe";
	else
        set mensaje = "No se encontró al jefe";
end if;
end//
delimiter ;

delimiter //
create procedure añadir_jefe (
nombre_E varchar(50),
correo_E varchar(50),
telefono_E varchar(30),
tipoUsuario_E enum('Admin','Jefe'),
usuario_E varchar(30),
contraseña_E varchar(30),
idDepto_E int(2),
out mensaje varchar(50)
)
Begin
		if exists(select * from departamentos where id like idDepto_E) then
			if not exists(select * from jefesDepto where id like idDepto_E) then 
				insert into jefesDepto (nombre,correo,telefono,tipoUsuario,usuario,contraseña,idDepto)
				values(nombre_E,correo_E,telefono_E,tipoUsuario_E,usuario_E,contraseña_E,idDepto_E);
				set mensaje = 'Se añadió el jefe';
			else
				set mensaje = 'El departamento ya tiene un jefe';
		end if;
			else
				set mensaje = 'No existe el departamento';
		end if;
end//
delimiter ;

delimiter //
create procedure modificar_jefe (
clave int(2),
nombre_E varchar(50),
correo_E varchar(50),
telefono_E varchar(30),
tipoUsuario_E enum('Admin','Jefe'),
usuario_E varchar(30),
contraseña_E varchar(30),
idDepto_E int(2),
out mensaje varchar(50)
)
Begin
	if exists(select * from jefesDepto where id like clave) then
		if exists(select * from departamentos where id like idDepto_E) then
		update jefesDepto set nombre = nombre_E, correo = correo_E, telefono = telefono_E, tipoUsuario = tipoUsuario_E,
        usuario = usuario_E, contraseña = contraseña_E, idDepto = idDepto_E where id = clave;
		set mensaje = "Datos modificados";
	else
		set mensaje = "El departamento no existe";
end if;
	else
		set mensaje = 'El jefe no existe';
end if;
end//
delimiter ;

delimiter //
create procedure eliminar_jefe (
clave int(2),
out mensaje varchar(50)
)
Begin
	if exists(select * from jefesDepto where id like clave) then
		delete from jefesDepto where id like clave;
        set mensaje = "Se eliminó el jefe";
	else
        set mensaje = "El jefe no existe";
end if;
end//
delimiter ;



-- Procedimientos reportes
delimiter //
create procedure reporte_gral (
idDepto_E int(2)
)
begin
	if(idDepto_E = 1) then
		select departamentos.nombre AS 'Departamento',equipos.noInvent, equipos.noSerie, equipos.modelo, equipos.procesador, equipos.ram, 
		equipos.discoDuro, equipos.estado from equipos join departamentos on equipos.idDepto = departamentos.id;
    else 
		select departamentos.nombre AS 'Departamento',equipos.noInvent, equipos.noSerie, equipos.modelo, equipos.procesador, equipos.ram, 
		equipos.discoDuro, equipos.estado from equipos join departamentos on equipos.idDepto = departamentos.id where departamentos.id = idDepto_E;
	end if;
end//
delimiter ;

delimiter //
create procedure reporte_estado (
    estado_E enum('Bueno','Regular','Defectuoso'),
    idDepto_E int(2)
)
begin
	if(idDepto_E = 1) then
		select departamentos.nombre AS 'Departamento',equipos.noInvent, equipos.noSerie, equipos.modelo, equipos.procesador, equipos.ram, 
		equipos.discoDuro, equipos.estado from equipos join departamentos on equipos.idDepto = departamentos.id where equipos.estado = estado_E;
	else
		select departamentos.nombre AS 'Departamento',equipos.noInvent, equipos.noSerie, equipos.modelo, equipos.procesador, equipos.ram, 
		equipos.discoDuro, equipos.estado from equipos join departamentos on equipos.idDepto = departamentos.id where equipos.estado = estado_E 
        and departamentos.id = idDepto_E;
	end if;
end//
delimiter ;

-- drop database comptec;
-- delete from departamentos;
-- select * from equipos;

-- INSERTS DEPARTAMENTOS
insert into departamentos (nombre,correo,telefono) values('Administración de Comptec','comptec@gmail.com','8331921837');
insert into departamentos (nombre,correo,telefono) values('Sistemas y Computación','sistemas@itcm.edu.mx','8332109482');
insert into departamentos (nombre,correo,telefono) values('Ciencias Básicas','cbas_cdmadero@tecnm.mx','8339843010');
insert into departamentos (nombre,correo,telefono) values('Centro de Información','ci_ cdmadero@tecnm.mx','8335342060');
insert into departamentos (nombre,correo,telefono) values('Ingeniería Industrial','industrial@itcm.edu.mx ','8334213060');

-- INSERTS JEFES
insert into jefesDepto (nombre,correo,telefono,tipoUsuario,usuario,contraseña,idDepto) values('Administrador','admincomptec@gmail.com','8331827433','Admin','Admin','1234',1);
insert into jefesDepto (nombre,correo,telefono,tipoUsuario,usuario,contraseña,idDepto) values('M.C. Fausto Antonio Balderas Jaramillo','faustotec@gmail.com','8331832332','Jefe','FaustoISC','1234',2);
insert into jefesDepto (nombre,correo,telefono,tipoUsuario,usuario,contraseña,idDepto) values('Dra. Verónica Rodríguez Castillo','veronicatec@gmail.com','8338474785','Jefe','VeroBasic','1234',3);
insert into jefesDepto (nombre,correo,telefono,tipoUsuario,usuario,contraseña,idDepto) values('Dra. Margarita Zavala Arce','margaritatec@gmail.com','8331029840','Jefe','MargCI','1234',4);
insert into jefesDepto (nombre,correo,telefono,tipoUsuario,usuario,contraseña,idDepto) values('M.C. Juan Flavio Molar Orozco','juanftec@gmail.com','8334215538','Jefe','JuanIND','1234',5);

-- INSERTS EQUIPOS 
insert into equipos (noInvent,noSerie,modelo,procesador,ram,discoDuro,estado,idDepto) values(2005,54823,'HP Desktop 8000 SFF','Intel i3','8GB','800GB','Bueno',2);
insert into equipos (noInvent,noSerie,modelo,procesador,ram,discoDuro,estado,idDepto) values(2017,11348,'HP Pavilion 550','Intel i5','4GB','500GB','Bueno',2);
insert into equipos (noInvent,noSerie,modelo,procesador,ram,discoDuro,estado,idDepto) values(2074,94823,'HP Desktop 260-P1','Intel i3','4GB','800GB','Bueno',2);
insert into equipos (noInvent,noSerie,modelo,procesador,ram,discoDuro,estado,idDepto) values(2138,33324,'HP Pavilion P678','Intel i5','8GB','750GB','Bueno',2);
insert into equipos (noInvent,noSerie,modelo,procesador,ram,discoDuro,estado,idDepto) values(2234,46734,'Dell Inspiron 3470','Intel i3','4GB','800GB','Regular',2);
insert into equipos (noInvent,noSerie,modelo,procesador,ram,discoDuro,estado,idDepto) values(2398,27483,'Dell OptiPlex 360','Intel i7','8GB','1TB','Regular',2);
insert into equipos (noInvent,noSerie,modelo,procesador,ram,discoDuro,estado,idDepto) values(2455,92734,'Dell OptiPlex 360','Intel i3','4GB','800GB','Bueno',2);
insert into equipos (noInvent,noSerie,modelo,procesador,ram,discoDuro,estado,idDepto) values(2551,27468,'HP Pavilion 550','Intel i3','4GB','500GB','Bueno',2);
insert into equipos (noInvent,noSerie,modelo,procesador,ram,discoDuro,estado,idDepto) values(2847,11834,'HP Desktop 8000-SFF','Intel i5','4GB','800GB','Defectuoso',2);
insert into equipos (noInvent,noSerie,modelo,procesador,ram,discoDuro,estado,idDepto) values(2930,99283,'Dell Vostro 260','Intel i7','8GB','1TB','Defectuoso',2);

insert into equipos (noInvent,noSerie,modelo,procesador,ram,discoDuro,estado,idDepto) values(3123,39402,'Dell Vostro 260','Intel i3','4GB','800GB','Bueno',3);
insert into equipos (noInvent,noSerie,modelo,procesador,ram,discoDuro,estado,idDepto) values(3256,55555,'HP Pavilion P678','Intel i3','4GB','500GB','Bueno',3);
insert into equipos (noInvent,noSerie,modelo,procesador,ram,discoDuro,estado,idDepto) values(3444,32183,'Dell Inspiron 3470','Intel i7','8GB','500GB','Regular',3);
insert into equipos (noInvent,noSerie,modelo,procesador,ram,discoDuro,estado,idDepto) values(3502,11100,'Dell OptiPlex 360','Intel i5','4GB','500GB','Defectuoso',3);
insert into equipos (noInvent,noSerie,modelo,procesador,ram,discoDuro,estado,idDepto) values(3576,51934,'Dell Inspiron 3470','Intel i5','4GB','800GB','Regular',3);
insert into equipos (noInvent,noSerie,modelo,procesador,ram,discoDuro,estado,idDepto) values(3641,32001,'HP Pavilion 550','Intel i7','8GB','1TB','Bueno',3);
insert into equipos (noInvent,noSerie,modelo,procesador,ram,discoDuro,estado,idDepto) values(3787,20392,'HP Desktop 260-P1','Intel i3','4GB','1TB','Bueno',3);
insert into equipos (noInvent,noSerie,modelo,procesador,ram,discoDuro,estado,idDepto) values(3888,29333,'HP Desktop 8000-SFF','Intel i7','8GB','750GB','Defectuoso',3);
insert into equipos (noInvent,noSerie,modelo,procesador,ram,discoDuro,estado,idDepto) values(3906,10139,'Dell Vostro 260','Intel i5','4GB','800GB','Bueno',3);
insert into equipos (noInvent,noSerie,modelo,procesador,ram,discoDuro,estado,idDepto) values(3961,22111,'HP Pavilion P678','Intel i7','8GB','1TB','Bueno',3);

insert into equipos (noInvent,noSerie,modelo,procesador,ram,discoDuro,estado,idDepto) values(4020,40566,'Dell Inspiron 3470','Intel i3','4GB','800GB','Bueno',4);
insert into equipos (noInvent,noSerie,modelo,procesador,ram,discoDuro,estado,idDepto) values(4094,30294,'Dell Inspiron 3470','Intel i7','8GB','1TB','Bueno',4);
insert into equipos (noInvent,noSerie,modelo,procesador,ram,discoDuro,estado,idDepto) values(4129,20004,'HP Pavilion P678','Intel i5','4GB','800GB','Bueno',4);
insert into equipos (noInvent,noSerie,modelo,procesador,ram,discoDuro,estado,idDepto) values(4222,32102,'HP Desktop 260-P1','Intel i5','4GB','500GB','Defectuoso',4);
insert into equipos (noInvent,noSerie,modelo,procesador,ram,discoDuro,estado,idDepto) values(4383,91802,'Dell Vostro 260','Intel i3','4GB','700GB','Defectuoso',4);
insert into equipos (noInvent,noSerie,modelo,procesador,ram,discoDuro,estado,idDepto) values(4444,21110,'HP Pavilion 550','Intel i5','4GB','800GB','Bueno',4);
insert into equipos (noInvent,noSerie,modelo,procesador,ram,discoDuro,estado,idDepto) values(4519,99934,'Dell OptiPlex 360','Intel i7','8GB','1TB','Bueno',4);
insert into equipos (noInvent,noSerie,modelo,procesador,ram,discoDuro,estado,idDepto) values(4732,10004,'Dell OptiPlex 360','Intel i5','4GB','500GB','Bueno',4);
insert into equipos (noInvent,noSerie,modelo,procesador,ram,discoDuro,estado,idDepto) values(4820,66654,'HP Desktop 8000-SFF','Intel i7','8GB','800GB','Bueno',4);
insert into equipos (noInvent,noSerie,modelo,procesador,ram,discoDuro,estado,idDepto) values(4903,75430,'HP Pavilion P678','Intel i5','4GB','400GB','Regular',4);

insert into equipos (noInvent,noSerie,modelo,procesador,ram,discoDuro,estado,idDepto) values(5101,45677,'HP Pavilion P678','Intel i5','4GB','500GB','Regular',5);
insert into equipos (noInvent,noSerie,modelo,procesador,ram,discoDuro,estado,idDepto) values(5244,12119,'HP Desktop 8000-SFF','Intel i5','8GB','750GB','Bueno',5);
insert into equipos (noInvent,noSerie,modelo,procesador,ram,discoDuro,estado,idDepto) values(5256,75548,'HP Pavilion 550','Intel i3','4GB','500GB','Defectuoso',5);
insert into equipos (noInvent,noSerie,modelo,procesador,ram,discoDuro,estado,idDepto) values(5337,92154,'Dell Inspiron 3470','Intel i3','4GB','800GB','Bueno',5);
insert into equipos (noInvent,noSerie,modelo,procesador,ram,discoDuro,estado,idDepto) values(5400,50067,'Dell Vostro 260','Intel i5','4GB','800GB','Bueno',5);
insert into equipos (noInvent,noSerie,modelo,procesador,ram,discoDuro,estado,idDepto) values(5572,32888,'Dell Vostro 260','Intel i7','8GB','1TB','Bueno',5);
insert into equipos (noInvent,noSerie,modelo,procesador,ram,discoDuro,estado,idDepto) values(5677,71225,'Dell Inspiron 3470','Intel i7','8GB','800GB','Bueno',5);
insert into equipos (noInvent,noSerie,modelo,procesador,ram,discoDuro,estado,idDepto) values(5711,10094,'HP Desktop 260-P1','Intel i7','8GB','800GB','Regular',5);
insert into equipos (noInvent,noSerie,modelo,procesador,ram,discoDuro,estado,idDepto) values(5808,88846,'HP Pavilion P678','Intel i3','4GB','500GB','Defectuoso',5);
insert into equipos (noInvent,noSerie,modelo,procesador,ram,discoDuro,estado,idDepto) values(5835,22905,'Dell OptiPlex 360','Intel i7','8GB','1TB','Bueno',5);





/* use comptec;
delete from equipos;
delete from jefesDepto;
delete from departamentos;


call login_validar('Admin','1234',@tipouser);
select @tipouser;

call reporte_gral;
call reporte_estado('Bueno');

select * from equipos;
select * from departamentos;
select * from jefesDepto; */