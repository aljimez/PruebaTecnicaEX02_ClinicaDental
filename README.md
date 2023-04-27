# PruebaTecnicaEX02_ClinicaDental
### Uso de Spring Framework administrando peticiones CRUD para gestionar Clientes, Odontologos y Visitas de un dentista, podremos crear citas, modificarlas, anularlas, consultarlas como cliente, ver todas las citas


## Entre las tecnologías usadas:
 - MySql
 - MySQlWorkBench
 - SpringBootApp
 - Java 8
 - Maven
 - JPA
 
 
 ## Postman
 
 #### Clientes
 
 - Consulta de todos los clientes [GET]
 - localhost:8080/api/clients
 - consulta por id [GET]
 - localhost:8080/api/clients/1
 - creacion de cliente [POST]
 - localhost:8080/api/clients
{
        "id": 6,
        "dni": "1283848H",
        "name": "Aledro",
        "phoneNum": 1718923,
        "email": "ajimenezal01@gmail.com"
    }
 - borrar cliente [DELETE]
 -localhost:8080/api/clients/1
 -Actualizar cliente [PUT]
 ~~~~~~~~~~~~~~~
{
        "dni": "128233848H",
        "name": "Alerrro",
        "phoneNum": 1718923,
        "email": "ajimenezal01@gmail.com"
      }
~~~~~~~~~~~~~~~      
      
#### Odonotologos
 - Consultar odontologos [GET]
 - localhost:8080/api/odontologo
 - Consultar ododntologos por id [GET]
 - localhost:8080/api/odontologo/1
 - Crear odontologo [POST]
 - localhost:8080/api/odontologo
~~~~~~~~~~~~~~~
   {
        "codigo": 7,
        "dni": "190394A",
        "name": "Eva Castro Porres",
        "phoneNum": 26283904,
        "email": "evacapo@gmail.com"
    }
~~~~~~~~~~~~~~~
 - borrar odontologo [DELETE]
 -localhost:8080/api/odontologo/2
 -Actualizar odontologo [PUT]
 ~~~~~~~~~~~~~~~
   {
        "dni": "190394A",
        "name": "Eva Castro Porres",
        "phoneNum": 26283904,
        "email": "evacapo@gmail.com"
    }
~~~~~~~~~~~~~~~
#### Visitas
 - Consultar visitas [GET]
 - localhost:8080/api/visitas
 - Consultar visitas por id [GET]
 - localhost:8080/api/visitas/1
 - Crear visitas [POST]
 - localhost:8080/api/visitas
 ~~~~~~~~~~~~~~~
 {
        "id": 5,
        "proceso": "Coronas",
        "time": "2022-04-25T09:05:00",
        "prices": 300.0,
        "odontologist": {
            "codigo": 3,
            "dni": "188181940S",
            "name": "Teresa",
            "phoneNum": 0,
            "email": "cifuentes@gmail.com",
            "odontologo": null
        }
~~~~~~~~~~~~~~~
 - eliminar visitas [DELETE]
 - localhost:8080/api/visitas/2
 - Actualizar visitas [PUT]
 - localhost:8080/api/visitas/5
 ~~~~~~~~~~~~~~~
{
        "proceso": "Coronas",
        "time": "2022-04-25T09:05:00",
        "prices": 300.0,
        "odontologist": {
            "codigo": 3,
            "dni": "181940S",
            "name": "Ixabel",
            "phoneNum": 0,
            "email": "ixabixa@gmail.com",
            "odontologo": null
        }
~~~~~~~~~~~~~~~
