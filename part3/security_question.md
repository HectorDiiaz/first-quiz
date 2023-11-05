## System Security

Teniendo en cuenta OWASP TOP 10, considero que para hacer el sistema mas seguro, se deben tomar acciones en cuanto:

1)Validar e implementar autenticación y autorización en los microservicios, podria ser con la implementación de un API Gateway para la administracion de los microservicios, y que solo desde esta se puedan acceder a ellos, con el fin de minimizar riesgos de accesos indebidos. 

Aunque es primordial buscar una estrategia de seguridad con respecto a la autenticacion y autorizacion que este centraba y vaya de la mano con la arquitectura.

2) No todo esta del lado de la arquitectura, es importante tener en cuenta que el personal tiene acceso directo a los servicios, es de suma importancia minimizar accesos, con el fin de que los empleados solo tengan acceso a ciertas cosas que para su cargo sean relevantes, adicional fomentar una cultura de seguridad con los empleados para evitar ataques en base al desconocimiento.

3)Los datos que se almacenan en base de datos deberian de tener una proteccion, aplicando alguna encriptación asi evitando exponer datos sensibles.

4)Validar las aplicaciones del lado del cliente, evitando que desde estas se puedan realizar ataques en los campos de entrada de la informacion, implementando validacion de campos y evitar situaciones comunes que facilitan un ataque por inyeccion SQL

5)Asegurar que los diferentes servicios de la nube tengan una comunicacion cifrada, entre contenedores y el servicio en la nube para el deploy.

7)Mantenerse actualizado sobre diferentes vulnerabilidades, cada dia surgen nuevas tecnologias y a su vez problemas de seguridad, se debe tratar de estar al dia con estos problemas, con el fin de mitigarlos en los proximos incrementos.

Considero que son puntos importantes a tener en cuenta, aunque para mi la mas importante es el fomentar la cultura de ciberseguridad con todos los empleados de la compañia, pues es el punto mas vulnerable.