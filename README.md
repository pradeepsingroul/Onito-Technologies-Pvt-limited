# Onito-Technologies-Pvt-limited

# Rock-Scissor-And-Paper
This is the game of Rock , Scissor and paper where two player exist one is computer and second is user user can pass the Rock/scissor/paper and computer automatically generate your value and then project compares both values and return the winner result based on the game rules.




![360_F_332862747_zb0oXy6txyqlopzJAW3UNQJCPxTg7eUx](https://github.com/pradeepsingroul/Onito-Technologies-Pvt-limited/files/11469833/ER.diagram.-.Page.3.pdf)


## ER Diagram
[ER diagram - Page 3.pdf](https://github.com/pradeepsingroul/Onito-Technologies-Pvt-limited/files/11469833/ER.diagram.-.Page.3.pdf)

## Features
 - User can register your self and login and then he/she can play the game
 
 ## Rest Api
 
 ```new movies 
PostMethod-
localhost:8080/api/v1/new-movies
```

```Longest duration movies
GetMethod-
http://localhost:8080/users/login](http://localhost:8080/api/v1/longest-duration-movies
```

```genre-movies-with-subtotals
GetMethod-
http://localhost:8080/api/v1/genre-movies-with-subtotals
```

```update runtime
GetMethod-
http://localhost:8080/api/v1/update-runtime-minutes
```

```update runtime
GetMethod-
http://localhost:8080/api/v1/top-rated-movies
```

 

## Tech Stack

- Core Java
- Spring Boot
- MySQL (RDBMS)
- Sql
- jpql
- Maven
- postman
- Giuhub


## Deployment

To deploy this project on localhost paste this below code in application.properties file in the 
resources and update according to your database name, username and password of your MySQL database.

```properties
 #changing the server port
server.port=8080

#db specific properties
spring.datasource.url=jdbc:mysql://localhost:3306/database
spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver
spring.datasource.username=username
spring.datasource.password=password



#ORM s/w specific properties
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true

spring.mvc.throw-exception-if-no-handler-found=true
spring.web.resources.add-mappings=false

spring.mvc.pathmatch.matching-strategy = ANT_PATH_MATCHER

```
### Swagger UI - Link

Use this link to run it on browser.
```swagger
http://localhost:8080/swagger-ui
```

## Authors
- [Pradeep Singroul (@pradeepsingroul) ](https://github.com/pradeepsingroul)
