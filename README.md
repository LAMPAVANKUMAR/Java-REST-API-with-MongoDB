# Java-REST-API-with-MongoDB
Implement an application in java which provides a REST API with endpoints for searching, creating and deleting “server” objects:
● GET servers. Should return all the servers if no parameters are passed. When server id
is passed as a parameter - return a single server or 404 if there’s no such a server.
● PUT a server. The server object is passed as a json-encoded message body. Here’s an
example:
{
“name”: ”my centos”,
“id”: “123”,
“language”:”java”,
“framework”:”django”
}
● DELETE a server. The parameter is a server ID.
● GET (find) servers by name. The parameter is a string. Must check if a server name
contains this string and return one or more servers found. Return 404 if nothing is found.
“Server” objects should be stored in MongoDB database.
Be sure that you can show how your application responds to requests using postman, curl or
any other HTTP client.





To implement the REST API in Java with MongoDB database, we need to use a framework that supports both. Here, we will use Spring Boot framework, which has in-built support for RESTful web services and MongoDB.

Steps to implement the application:

1. Create a new Spring Boot project using Spring Initializr.
2. Add the required dependencies for MongoDB and Spring Web in the pom.xml file.
3. Create a MongoDB configuration class to connect to the database.
4. Create a Server model class with fields like name, id, language, and framework.
5. Create a ServerRepository interface that extends MongoRepository<Server, String> to perform database operations.
6. Create a ServerService class to implement the business logic for searching, creating, and deleting server objects.
7. Create a REST API controller with endpoints for GET, PUT, and DELETE operations on server objects.
8. Test the API using Postman or any other HTTP client.
