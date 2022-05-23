## Интервью с SBI Bank ##

Swagger расположен:<br>
http://localhost:8080/swagger-ui/
<br><br>
Проблему с преобразованием float в int решил так:<br>
Добавил в application.properties:<br>
spring.jackson.deserialization.accept_float_as_int=false