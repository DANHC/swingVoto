SET default_storage_engine=INNODB;

CREATE DATABASE sistemaVoto;

USE sistemaVoto;

CREATE TABLE Voto(
	id INT NOT NULL AUTO_INCREMENT,
    id_junta INT NOT NULL,
    id_candidato INT NOT NULL,
    CONSTRAINT PK_Voto PRIMARY KEY (id)
);

CREATE INDEX Voto_IX ON Voto (id);

CREATE TABLE Partido(
	id INT NOT NULL AUTO_INCREMENT,
    nombre VARCHAR(100) NOT NULL,
    CONSTRAINT PK_Partido PRIMARY KEY(id)
);
CREATE INDEX Partido_IX ON Partido (id);
-----------------------------------

CREATE TABLE UsuariosSistema(
	id_empleado INT NOT NULL,
    usuario VARCHAR(50) NOT NULL,
    pass VARCHAR(200) NOT NULL,
    tipo VARCHAR(100) NOT NULL,
    activo INT NOT NULL DEFAULT 1,
    CONSTRAINT PK_Usuarios PRIMARY KEY(id_empleado)
);

CREATE INDEX Usuarios_IX ON UsuariosSistema (id_empleado);

CREATE TABLE Departamento(
	id INT NOT NULL AUTO_INCREMENT,
    nombre VARCHAR(100) NOT NULL,
    CONSTRAINT PK_Departamento PRIMARY KEY(id)
);

CREATE INDEX Departamento_IX ON Departamento (id);

CREATE TABLE Municipio(
	id INT NOT NULL AUTO_INCREMENT,
    id_departamento INT NOT NULL,
    nombre VARCHAR(120) NOT NULL,
    CONSTRAINT PK_Municipio PRIMARY KEY(id)
);

CREATE INDEX Municipio_IX ON Municipio (id);

CREATE TABLE centroVotacion(
	id INT NOT NULL AUTO_INCREMENT,
    id_municipio INT NOT NULL,
    CONSTRAINT PK_Centro PRIMARY KEY(id)
);

CREATE INDEX centro_IX ON centroVotacion (id);

CREATE TABLE Empleado(
	id INT NOT NULL AUTO_INCREMENT,
    nombres VARCHAR(70) NOT NULL,
    apellidos VARCHAR(70) NOT NULL,
    edad INT NOT NULL,
    DUI VARCHAR(20) NOT NULL,
    direccion VARCHAR(200) NOT NULL,
    sexo CHAR NOT NULL,
    telefono VARCHAR(50) NOT NULL,
    tipo INT NOT NULL,
    activo INT NOT NULL DEFAULT 1,
    CONSTRAINT PK_Empleado PRIMARY KEY(id)
);

CREATE INDEX Empleado_IX ON Empleado (id);

CREATE TABLE TipoEmpleado(
	id INT NOT NULL AUTO_INCREMENT,
    nombreTipo VARCHAR(100) NOT NULL,
    CONSTRAINT PK_TipoEmpleado PRIMARY KEY(id)
);


CREATE TABLE Padron(
	id INT NOT NULL AUTO_INCREMENT,
    duiVotante VARCHAR(10) NOT NULL,
    idMunicipio INT NOT NULL,
    activo INT NOT NULL DEFAULT 1,
    CONSTRAINT PK_Padron PRIMARY KEY(id)
);

CREATE INDEX Padron_IX ON Padron (id);

CREATE TABLE VigilantePartido(
	id INT NOT NULL AUTO_INCREMENT,
    nombres VARCHAR(120) NOT NULL,
    apellidos VARCHAR(120) NOT NULL,
    edad INT NOT NULL,
    sexo CHAR NOT NULL,
    id_partido INT NOT NULL,
    DUI VARCHAR(45) NOT NULL,
    activo INT NOT NULL DEFAULT 1,
    CONSTRAINT PK_Vigilante PRIMARY KEY(id)
);

CREATE INDEX VigilantePartido_IX ON VigilantePartido (id);

CREATE TABLE Candidato(
	id INT NOT NULL AUTO_INCREMENT,
    id_partido INT NOT NULL,
    DUI VARCHAR(50) NOT NULL,
    nombres VARCHAR(120) NOT NULL,
    apellidos VARCHAR(120) NOT NULL,
    edad INT NOT NULL,
    sexo CHAR NOT NULL,
    activo INT NOT NULL DEFAULT 1,
    CONSTRAINT PK_Candidato PRIMARY KEY(id)
);

CREATE INDEX Candidato_IX ON Candidato (id);

CREATE TABLE JuntaReceptora(
	id INT NOT NULL AUTO_INCREMENT,
    codigo INT NOT NULL,
    id_centroVotacion INT NOT NULL,
    CONSTRAINT PK_Junta PRIMARY KEY(id)
);

CREATE INDEX JuntaRep_IX ON JuntaReceptora (id);

CREATE TABLE Votante(
    DUI VARCHAR(10) NOT NULL,
    nombres VARCHAR(120) NOT NULL,
    apellidos VARCHAR(120) NOT NULL,
    conocidoPor VARCHAR(200) NULL,
    residencia VARCHAR(200) NOT NULL,
    salvadorenoPor VARCHAR(200) NOT NULL,
    fechaNacimiento DATE NOT NULL,
    departamentoNaci VARCHAR(100) NOT NULL,
    municipioNaci VARCHAR(100) NOT NULL,
    fechaExpedicion DATE NOT NULL,
    departamentoExpe VARCHAR(100) NOT NULL,
    municipioExpe VARCHAR(100) NOT NULL,
    fechaExpiracion DATE NOT NULL,
    departamentoResidencia VARCHAR(100) NOT NULL,
    municipioResidencia INT NOT NULL,
    NIT VARCHAR(100) NOT NULL,
    NombreMadre VARCHAR(200) NOT NULL,
    NombrePadre VARCHAR(200) NOT NULL,
    codigoZona VARCHAR(200) NOT NULL,
    estadoFamiliar VARCHAR(200) NOT NULL,
    conyugeNombre VARCHAR(200) NULL,
    tipoSangre VARCHAR(200) NULL,
    profesion VARCHAR(200) NOT NULL,
    sexo CHAR NOT NULL,
    activo INT NOT NULL DEFAULT 1,
    CONSTRAINT PK_Votante PRIMARY KEY(DUI)
);

CREATE INDEX Votante_IX ON Votante (DUI);

CREATE TABLE SupervisorCentroVotacion(
	id INT NOT NULL AUTO_INCREMENT,
    nombres VARCHAR(120) NOT NULL,
    apellidos VARCHAR(120) NOT NULL,
    edad INT NOT NULL,
    sexo CHAR NOT NULL,
    id_centroVotacion INT NOT NULL,
    DUI VARCHAR(45) NOT NULL,
    activo INT NOT NULL DEFAULT 1,
    CONSTRAINT PK_Supervisor PRIMARY KEY(id)
);

CREATE INDEX Supervisor_IX ON SupervisorCentroVotacion (id);

-----
ALTER TABLE Voto ADD CONSTRAINT fk_JuntaVoto FOREIGN KEY(id_junta) REFERENCES JuntaReceptora(id);
ALTER TABLE Voto ADD CONSTRAINT fk_JuntaCandidato FOREIGN KEY(id_candidato) REFERENCES Candidato(id);
ALTER TABLE UsuariosSistema ADD CONSTRAINT fk_UsuariosEmpleado FOREIGN KEY(id_empleado) REFERENCES Empleado(id);

ALTER TABLE centroVotacion ADD CONSTRAINT fk_CentroMunicipio FOREIGN KEY(id_municipio) REFERENCES Municipio(id);

ALTER TABLE Empleado ADD CONSTRAINT fk_EmpleadoMunicipio FOREIGN KEY(id_municipio) REFERENCES Municipio(id);

ALTER TABLE Municipio ADD CONSTRAINT fk_MunicipioDepartamento FOREIGN KEY(id_departamento) REFERENCES Departamento(id);

ALTER TABLE Padron ADD CONSTRAINT fk_PadronMunicipio FOREIGN KEY(idMunicipio) REFERENCES Municipio(id);
ALTER TABLE Padron ADD CONSTRAINT fk_PadronVotante FOREIGN KEY(duiVotante) REFERENCES Votante(DUI);

ALTER TABLE VigilantePartido ADD CONSTRAINT fk_VigilantePartido FOREIGN KEY(id_partido) REFERENCES Partido(id);

ALTER TABLE Candidato ADD CONSTRAINT fk_CandidatoPartido FOREIGN KEY(id_partido) REFERENCES Partido(id);

ALTER TABLE JuntaReceptora ADD CONSTRAINT fk_JuntaCentro FOREIGN KEY(id_centroVotacion) REFERENCES centroVotacion(id);


ALTER TABLE SupervisorCentroVotacion ADD CONSTRAINT fk_SupervisorCentro FOREIGN KEY(id_centroVotacion) REFERENCES centroVotacion(id);

ALTER TABLE Empleado ADD CONSTRAINT fk_Empleado_Tipo FOREIGN KEY(tipo) REFERENCES TipoEmpleado(id);

ALTER TABLE Votante ADD CONSTRAINT fk_Votante_Municipio foreign key(municipioResidencia) references Municipio(id);

-- ver ganador
select concat(C.nombres, " ", C.apellidos) AS Candidato, P.nombre AS Partido, max(V.id_candidato) AS Votos FROM candidato C
join partido P on C.id_partido = P.id
join voto V on V.id_candidato = C.id;

delimiter //
create procedure insertarVotante(
	DUI varchar(10),
    Nombres varchar(120),
    Apellidos varchar(120), 
    ConocidoPor varchar(200), 
	Residencia varchar(200), 
    SalvadorenoPor varchar(200), 
    FechaNacimiento date, 
    DepartamentoNaci varchar(100), 
    MunicipioNaci varchar(100),
	FechaExpedicion date, 
	DepartamentoExpe varchar(100), 
	MunicipioExpe varchar(100), 
	FechaExpiracion date, 
	DepartamentoResidencia varchar(100),
	MunicipioResidencia varchar(100), 
	NIT varchar(100), 
	NombreMadre varchar(200), 
	NombrePadre varchar(200), 
	CodigoZona varchar(200), 
	EstadoFamiliar varchar(200),
	ConyugeNombre varchar(200), 
	TipoSangre varchar(200), 
	Profesion varchar(200), 
	Sexo char, 
	Activo int
)

begin
	insert into Votante(DUI , nombres, apellidos, conocidoPor, residencia, salvadorenoPor, fechaNacimiento, departamentoNaci, municipioNaci,
	fechaExpedicion, departamentoExpe, municipioExpe, fechaExpiracion, departamentoResidencia, municipioResidencia, NIT, nombreMadre, nombrePadre, codigoZona,
	estadoFamiliar, conyugeNombre, tipoSangre, profesion, sexo, activo) 

	values(DUI , Nombres, Apellidos, ConocidoPor, Residencia, SalvadorenoPor, FechaNacimiento, DepartamentoNaci, MunicipioNaci,
	FechaExpedicion, DepartamentoExpe, MunicipioExpe, FechaExpiracion, DepartamentoResidencia, MunicipioResidencia, NIT, NombreMadre, NombrePadre, CodigoZona,
	EstadoFamiliar, ConyugeNombre, TipoSangre, Profesion, Sexo, Activo);
    
	insert into Padron(DUI, municipioResidencia) 
    values(DUI, MunicipioResidencia);
    
end //
delimiter ;

delimiter //
create procedure actualizarVotante(
	DUI1 varchar(10),
    Nombres varchar(120),
    Apellidos varchar(120),
    Residencia varchar(200),
    DepartamentoResidencia varchar(100),
	MunicipioResidencia varchar(100)

)

begin
	update Votante set nombres = Nombres, apellidos=Apellidos, residencia=Residencia,departamentoResidencia=DepartamentoResidencia,municipioResidencia=MunicipioResidencia where DUI = DUI1;
end //
delimiter ;

delimiter //
create procedure borrarVotante(
	DUI1 varchar(10)
  
)

begin
	delete from Votante  where DUI = DUI1;
end //
delimiter ;



delimiter //
create procedure insertarPartido(
 
 Nombre varchar(200)
 )
 
 begin
 insert into Partido(nombre) values (Nombre);
 end //
 delimiter ;


delimiter //
create procedure ActualizarPartido(
Nombre varchar(200),
Id int 
)
begin
update Partido set nombre=Nombre where id=Id; 
end //
delimiter ;



drop procedure BorrarPartido;
delimiter //
create procedure BorrarPartido(
Id int 
)
begin
delete from Partido where id=Id; 
end //
delimiter ;




