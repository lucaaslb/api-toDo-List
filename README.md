# API ToDo List :bookmark_tabs:
REST API for a to-do list. Used for study using technologies like Spring-boot, mongoDB, REST API, Docker ...

The project with the front end consuming the API is in the repository:


---
#### Execute

 - DEV: `mvn spring-boot:run -Dspring-boot.run.profiles=dev` 

---

#### HTTP Protocol examples
 
 
- GET ` curl -i -X GET -H "Accept: application/json" -H "Content-Type: application/json"  http://localhost:8081/task/ `

- POST `curl -i -X POST -H "Content-Type: application/json" -d '{
    "title":"Rest API",
    "description":"Estudar, criando uma api com Spring-boot, Maven, MongoDB, Docker",
    "completed":"false", 
    "tags":["spring-boot", "dev", "mongodb", "docker"], 
    "when":"01/01/2019"}' 
    http://localhost:8081/task/ `  

- POST ` curl -i -X POST -H "Content-Type: application/json" -d '{
    "title":"Front end",
    "description":"Estudar, criando um layout com React para consumir API REST", "completed":"false", 
    "tags":["react", "dev", "rest-api"], 
    "when":"01/02/2019"}' 
    http://localhost:8081/task/ `
 

- PUT  `curl -i -X PUT -H "Content-Type: application/json" -d '{"id":"5e20b08ca4ba6665b55905fe", "title":"Rest API","description":"Estudar, criando uma api com Spring-boot, MongoDB, Docker", "completed":"false", 
  "tags":["spring-boot", "dev", "mongodb", "docker"], "when":"13/01/2019"}' http://localhost:8081/task/ `


--- 
@Author: [Lucas Lacerda](https://www.linkedin.com/in/lucaaslb/)  :beer: :pizza: