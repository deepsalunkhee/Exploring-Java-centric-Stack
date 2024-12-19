### Note : This file will contain all the new things that I come to know while I work on this small prject (The order does not mean anything)


## Random
- To do right click use `shift + f10` 

## What is lombok?

- Lombok is a library that helps to reduce boilerplate code in Java classes.
- Example in the Model packege of mind I have a class called Product
- Here we define the schema of product
- But as this is class I may need to define funtion to set and get the data , like I need to define constructors but when I use some annotaion from lombok I don't need to define these functions
- ```java
    @Data
    public class Product {
        private String id;
        private String name;
        private String description;
        private double price;
    }
  ```
    - Here `@Data` is the annotation that is used from lombok
    - This will automatically generate the getters and setters for the class
    - Example : Imagine I have a object of Product class called `product` then I can use `product.getId()` to get the id of the product
    - This will also generate the constructor for the class
    - Example : `Product product = new Product("1", "name", "description", 100.0);`
- ```java
    @NoArgsConstructor
    @AllArgsConstructor
    public class Product {
        private String id;
        private String name;
        private String description;
        private double price;
    }
  ```
    - Here `@NoArgsConstructor` and `@AllArgsConstructor` are the annotation that is used from lombok
    - This will automatically generate the constructor for the class
    - Example : `Product product = new Product();` or `Product product = new Product("1", "name", "description", 100.0);`

### what is JPA?

- JPA stands for Java Persistence API
- JPA is a Java specification for managing, persisting and accessing data between Java objects / classes and a relational database.
- JPA is a part of the EJB 3.0 specification and it is a lightweight, POJO-based framework.
- We use `@Entity` annotation to define a class as a entity
- We use `@Id` annotation to define a field as a primary key
- We use `@GeneratedValue` annotation to define a field as a auto generated field
- We use `@Table` annotation to define the table name
- We use `@Column` annotation to define the column name
- We use `@OneToMany` annotation to define the one to many relationship
- We use `@ManyToOne` annotation to define the many to one relationship
- We use `@JoinTable` annotation to define the join table
- and so on , there are many more annotation that we can useW


## What is injection ?

- Injection is a process of injecting the object of a class into another class
- There are two types of injection
    - Constructor Injection
    - Setter Injection
- Example :
    - Constructor Injection
        ```java
        @Service
        public class ProductService {
            private final ProductRepository productRepository;

            @Autowired
            public ProductService(ProductRepository productRepository) {
                this.productRepository = productRepository;
            }
        }
        ```
        - Here we are injecting the object of ProductRepository into ProductService class
        - We are using `@Autowired` annotation to inject the object
    - Setter Injection
        ```java
        @Service
        public class ProductService {
            private ProductRepository productRepository;

            @Autowired
            public void setProductRepository(ProductRepository productRepository) {
                this.productRepository = productRepository;
            }
        }
        ```
        - Here we are injecting the object of ProductRepository into ProductService class
        - We are using `@Autowired` annotation to inject the object
        - We are using a setter method to inject the object
- Field Injection
    ```java
    @Service
    public class ProductService {
        @Autowired
        private ProductRepository productRepository;
    }
    ```
    - Here we are injecting the object of ProductRepository into ProductService class
    - We are using `@Autowired` annotation to inject the object
    - We are using a field to inject the object

  
  ### What is recommended way of injection ?

  - Constructor Injection is the recommended way of injection
  - This is because it makes the class immutable
  - It makes the class thread safe
  - It makes the class easy to test
  -(Truely speaking I dont get this thing in detail yet but we will get it as we go on 🤞🏽)


  ## What is `@Repository` annotation ?

  - `@Repository` is a Spring annotation that indicates that the decorated class is a repository
  - A repository is a mechanism for encapsulating storage, retrieval, and search behavior which emulates a collection of objects
  



