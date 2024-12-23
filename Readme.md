## What is Spring Frmaework?

- Spring is a powerful lightweight application development framework used for Enterprise Java (JEE).
- Spring is an open source framework created to address the complexity of enterprise application development.
- One of the chief advantages of the Spring framework is its layered architecture, which allows you to be selective about which of its components you use while also providing a cohesive framework for J2EE application development.


## Prerequisites and tools required for spring.

- First of all you need to have a good understanding of Java programming language.
- You need to have a good understanding of Java EE technologies like Servlets, JSP, and EJB.
- You need to have a good understanding of Java Database connectivity (JDBC).
- You need to have a good understanding of Java EE application servers like Tomcat, JBoss, WebSphere, and WebLogic.
- You need to have a good understanding of Integrated Development Environment (IDE) like Eclipse, NetBeans, and IntelliJ IDEA.
- You need to have a good understanding of build tools like Ant  ,Maven and Gradle.
- You need to have a good understanding of version control systems like Git, SVN, and CVS.
- Hibernate ORM framework, JPA, and JTA.
- (These things are enough for now and lets get started with them)

### What is Servlets, JSP, and EJB?

- Servlets are Java classes that are used to extend the capabilities of servers that host applications accessed by means of a request-response programming model.
- JSP (JavaServer Pages) is a technology that helps software developers create dynamically generated web pages based on HTML, XML, or other document types.
- EJB (Enterprise JavaBeans) is a server-side software component that encapsulates the business logic of an application.

### What is JDBC?

- JDBC (Java Database Connectivity) is a Java API that is used to connect and execute query to the database.

### What is Java EE application servers?

- Java EE application servers are a type of middleware software that hosts Java applications (including servlets, JSP, and EJB) and provides various services in a distributed multi-tier application environment.
- Some of the popular Java EE application servers are Tomcat, JBoss, WebSphere, and WebLogic.

### What are Build tools?

- Build tools are software tools that are used to automate the process of compiling source code into binary code, packaging binary code, and deploying binary code to a server.
- Some of the popular build tools are Ant, Maven, and Gradle.
- Before these tools, developers used to compile and package the code manually.

## What is IOC and DI in Spring?

- IOC (Inversion of Control) is a design principle in which the control of object creation and lifecycle is transferred to a container or framework.
- DI (Dependency Injection) is a design pattern in which an object's dependencies are injected into the object by an external entity (like a container or framework).

## What is Spring Boot?

- Spring Boot is a project that is built on the top of the Spring framework. It provides a simpler and faster way to set up, configure, and run both simple and web-based applications.
- Spring Boot is a microservices-based framework and making it easy to create stand-alone, production-grade Spring-based Applications that you can "just run".

## Dependency Injection in Spring Boot

- Dependency Injection is a design pattern in which an object's dependencies are injected into the object by an external entity (like a container or framework).
- Spring Boot uses DI to manage the components that make up an application.
- Normally while uisng normal Java we create objects using the new keyword, which are created in JVM itself. But in Spring Boot, we create objects using the Spring container, which is responsible for managing the lifecycle of the objects.
- The Spring container uses DI to inject the dependencies of an object into the object itself.
- The Spring container uses annotations like @Autowired, @Component, @Service, @Repository, and @Controller to manage the components of an application.

### Types of Dependency Injection in Spring Boot

- There are two types of Dependency Injection in Spring Boot:
  - Constructor-based DI
  - Setter-based DI

### Constructor-based DI 

- In Constructor-based DI, the dependencies of an object are injected into the object's constructor.
- The Spring container uses the constructor to create an object and inject the dependencies into the object.
- The Spring container uses the @Autowired annotation to inject the dependencies into the object's constructor.

### Setter-based DI     

- In Setter-based DI, the dependencies of an object are injected into the object's setter methods.
- The Spring container uses the setter methods to create an object and inject the dependencies into the object.
- The Spring container uses the @Autowired annotation to inject the dependencies into the object's setter methods.



## Front controler?

![frontController](./readmeImages/1.png)

- This is some one who know which request to send to which controller as we may have multiple controller in a file
- some exaples of controlers

- a Baic hello world controller
```java
@RestController//this tell spring that this is a rest controller
public class HelloWorldController {
    @RequestMapping("/")//mapping to a particular end points
    public String sayHello() {
        return "Hello, World!";
    }
}
```
- If you remove "rest" from the restcontroller it will try to find a file named hello world in the templates folder and return the html file(like the old days)





## What is Spring Boot MVC?


### Note: The MVC video was great but too many things to procees so I guess I will go in detail as I go forward not point in sitting here
- Spring Boot MVC is a model-view-controller (MVC) framework that is built on the top of the Spring framework.
- Spring Boot MVC is used to develop web-based applications.
- Spring Boot MVC provides a way to separate the business logic, presentation logic, and navigation logic of an application.
- Spring Boot MVC uses the @Controller annotation to create a controller class, which is responsible for handling the HTTP requests and responses of an application.
- Spring Boot MVC uses the @RequestMapping annotation to map the HTTP requests to the methods of a controller class.
- Spring Boot MVC uses the @ResponseBody annotation to return the response of an HTTP request in JSON or XML format.
- Spring Boot MVC uses the @PathVariable annotation to extract the values of the URI template variables from the URI of an HTTP request.
- Spring Boot MVC uses the @RequestParam annotation to extract the values of the query parameters from the URI of an HTTP request.
- Spring Boot MVC uses the @ModelAttribute annotation to bind the form data to the model object of an application.
- Spring Boot MVC uses the @Valid annotation to validate the form data of an application.
- Spring Boot MVC uses the @ExceptionHandler annotation to handle the exceptions that occur during the execution of an application.
- Spring Boot MVC uses the @ControllerAdvice annotation to create a global exception handler for an application.
- Spring Boot MVC uses the @RestController annotation to create a RESTful web service in an application.

### Some points about MVC

- MVC stands for Model-View-Controller.
- Model: It represents the data of an application its like schima of the data
- its a package that contains the classes that are used to store the data of an application.
- Controller: It represents the business logic of an application,but normaly we use service layer to do this i.e logic part and controller to handle the request and response
- its a package that contains the classes that are used to handle the HTTP requests and responses of an application.
- View: It represents the presentation logic of an application


## Get and Post request

- Get request is used to get the data from the server(Baisc stuff)
- Post request is used to send the data to the server(Baisc stuff)

examples:

- Get request
```java
@GetMapping("/hello")//this is a get request
public String sayHello() {
    return "Hello, World!";
}
```

- Post request
```java
@PostMapping("/hello")//this is a post request
public String sayHello() {
    return "Hello, World!";
}
```

- get request for a particular id
```java
@GetMapping("/hello/{id}")//this is a get request
public String sayHello(@PathVariable int id) {
    return "Hello, World!";
}
```

- similar stuff for put and delete request


## What is Spring Boot Data JPA?

- Spring Boot Data JPA is a project that is built on the top of the Spring framework.
- Spring Boot Data JPA is used to develop data access layer of an application.
- Spring Boot Data JPA provides a way to interact with the database of an application.
- Hibernate ORM is one of the popular implementations of the JPA specification.
- ORM stands for Object-Relational Mapping like we have mongoose in nodejs for mongodb

## What is H2?

- H2 is an in-memory database that is used to develop and test the data access layer of an application.
- H2 is a lightweight database that is written in Java.
- H2 provides a web-based console to interact with the database of an application.









