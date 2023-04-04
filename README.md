# BANCO DE DESARROLLO DE EL SALVADOR
## _Prueba práctica para candidatos a desarrollador Java_

La prueba esta desarrollada en el lenguaje JAVA y su framework JSF, esta consiste en la creacion de tres CRUD (dos tipo catalogo y una con dos relaciones), manejo de sesiones de seguridad, persistencia de datos y desarrollo de EndPoints de Servicios Web.

| Recursos | Version |
| ------ | ------ |
| JAVA | JDK 1.8 |
| JAVA EE | 7 web |
| JSF | 2.2 |
| Primefaces | 8.0 |
| GlassFish Server | 4.1.1 |
| MariaDB | 10.4.27 |
| NetBeans IDE | 8.2 |

## Features

- Inicio de sesion desde base de datos
- CRUDs con uso de persistencia de datos y patron de diseño _Facade_
- WS con uso de persistencia de datos y patron de diseño _Facade_
- Diseño de pantallas con Primefaces

## Tech
Listado de tecnologias utilizadas:

| Recursos |
| ------ |
| JSF |
| JPA | 
| EJB |
| JAX WS (for Rest API) |
| MySQL |

## Installation

Descarga de proyecto con git
```sh
git clone https://github.com/stephen-tif/pruebaTecnicaBandesalJava.git
cd pruebaTecnicaBandesalJava
git checkout master
```

**En la raiz del proyecto se encuentra el script inicial de la base de datos MySQL _prueba_bandesal.sql_**

_Abrir proyecto con NetBeans IDE 8.2 de preferencia..._

- Se debe configurar configurar el pool de conexion y posteriormente verificar la conectividad en el archivo _persistence.xml_
- La aplicacion se debera ejecutar de preferencia en el servidor de aplicaciones GlassFish debido a que fue configurado inicialmente en este, sin embargo, se podria configurar en cualquier otro si asi se desea.


## Consumo de WebService
Al desplegar la aplicacion, a demas de poder utilizar el portal, tambien se levantan los servicios web para los procesos externos que requieran de la misma informacion.

### Endpoints para informacion de Blogs
| Metodo | URL | Descripcion |
| ------ | ------ | ------|
| GET | **http://localhost:16271/pruebaTecnicaBandesal/webresources/ws_blog** | Sirve para extraer todos los registros |
| GET | **http://localhost:16271/pruebaTecnicaBandesal/webresources/ws_blog/{id}** | Sirve para extraer la informacion de un registro filtrado por su Id |
| GET | **http://localhost:16271/pruebaTecnicaBandesal/webresources/ws_blog/{from}/{to}** | Sirve para extraer la informacion de un registro filtrado por rango |
| GET | **http://localhost:16271/pruebaTecnicaBandesal/webresources/ws_blog/count** | Sirve para obtener el numero de registros existentes |
| POST | **http://localhost:16271/pruebaTecnicaBandesal/webresources/ws_blog** | Sirve para crear un nuevo registro |
| PUT | **http://localhost:16271/pruebaTecnicaBandesal/webresources/ws_blog/{id}** | Sirve para modificar un nuevo registro |
| DELETE | **http://localhost:16271/pruebaTecnicaBandesal/webresources/ws_blog/{id}** | Sirve para eliminar un nuevo registro |

### Endpoints para informacion de Readers
| Metodo | URL | Descripcion |
| ------ | ------ | ------|
| GET | **http://localhost:16271/pruebaTecnicaBandesal/webresources/ws_reader** | Sirve para extraer todos los registros |
| GET | **http://localhost:16271/pruebaTecnicaBandesal/webresources/ws_reader/{id}** | Sirve para extraer la informacion de un registro filtrado por su Id |
| GET | **http://localhost:16271/pruebaTecnicaBandesal/webresources/ws_reader/{from}/{to}** | Sirve para extraer la informacion de un registro filtrado por rango |
| GET | **http://localhost:16271/pruebaTecnicaBandesal/webresources/ws_reader/count** | Sirve para obtener el numero de registros existentes |
| POST | **http://localhost:16271/pruebaTecnicaBandesal/webresources/ws_reader** | Sirve para crear un nuevo registro |
| PUT | **http://localhost:16271/pruebaTecnicaBandesal/webresources/ws_reader/{id}** | Sirve para modificar un nuevo registro |
| DELETE | **http://localhost:16271/pruebaTecnicaBandesal/webresources/ws_reader/{id}** | Sirve para eliminar un nuevo registro |

### Endpoints para informacion de Readers y Blogs relacionados
| Metodo | URL | Descripcion |
| ------ | ------ | ------|
| GET | **http://localhost:16271/pruebaTecnicaBandesal/webresources/ws_blogreader** | Sirve para extraer todos los registros |
| GET | **http://localhost:16271/pruebaTecnicaBandesal/webresources/ws_blogreader/{id}** | Sirve para extraer la informacion de un registro filtrado por su Id |
| GET | **http://localhost:16271/pruebaTecnicaBandesal/webresources/ws_blogreader/{from}/{to}** | Sirve para extraer la informacion de un registro filtrado por rango |
| GET | **http://localhost:16271/pruebaTecnicaBandesal/webresources/ws_blogreader/count** | Sirve para obtener el numero de registros existentes |
| POST | **http://localhost:16271/pruebaTecnicaBandesal/webresources/ws_blogreader** | Sirve para crear un nuevo registro |
| PUT | **http://localhost:16271/pruebaTecnicaBandesal/webresources/ws_blogreader/{id}** | Sirve para modificar un nuevo registro |
| DELETE | **http://localhost:16271/pruebaTecnicaBandesal/webresources/ws_blogreader/{id}** | Sirve para eliminar un nuevo registro |

