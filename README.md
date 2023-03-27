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

Sure, here's a sample implementation in Java using the Spring Boot framework and MongoDB for storing the data:

1. First, we need to set up the project with the necessary dependencies. We'll use Maven as our build tool, so we'll add the following dependencies to the    pom.xml file:

2. Next, we'll define the Server model class to represent our server objects:
3. Now we'll define the ServerRepository interface that extends MongoRepository to provide basic CRUD operations for our Server objects:
4. With our model and repository in place, we can now define the REST endpoints for our API:
5. Finally, we'll set up the MongoDB connection by adding the following properties to the application.properties file:

This assumes that you have MongoDB running on the default port and that you've created a database named "server-manager".

With these steps complete, you should be able to run the application and use Postman, curl, or any other HTTP client to interact with the REST API
