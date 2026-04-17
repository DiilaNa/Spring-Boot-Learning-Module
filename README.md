# Spring Framework Practice Repository

This repository is a set of standalone Maven modules built for learning Spring Framework concepts step by step. Each folder focuses on one topic, with small demo classes and configuration code that can be run independently.

**Author:** Dilan Liyanaarachchi

## What is inside

The repo covers Spring Core, bean lifecycle, dependency injection, configuration styles, runtime values, environment properties, Spring MVC, REST controllers, and a small Hibernate import example.

Most source files are demo-oriented and some classes contain commented alternative approaches for learning purposes. The descriptions below reflect the active code currently in the repository.

## Stack

- Java
- Spring Framework 7.x
- Maven
- Jakarta Servlet API 6.1 for web modules
- Lombok and Jackson for REST examples

## Module Overview

### 01-Spring_Core

This module demonstrates the basics of Spring bean registration and component scanning.

- `AppConfig` enables component scanning for `lk.ijse.project.bean` and declares a `MyConnection` bean with prototype scope under the bean id `getConnection`.
- `SpringBean`, `TestBean01`, and `TestBean02` are component beans used to show default bean behavior and scope differences.
- `AppInitializer` shows how to create an `AnnotationConfigApplicationContext`, register the config class, retrieve beans, and close the context with a shutdown hook.

### 02-Spring_Bean_LifeCycle

This module focuses on the Spring bean lifecycle.

- `TestBean1` implements `DisposableBean` to demonstrate the destroy callback.
- `MyConnection` implements `DisposableBean`, `BeanNameAware`, `BeanFactoryAware`, `ApplicationContextAware`, and `InitializingBean` to show the lifecycle callback order.
- `Main` starts the application context, retrieves `MyConnection`, and registers a shutdown hook.

### 03-Dependency_Injection

This module demonstrates dependency injection with interfaces, `@Autowired`, and `@Qualifier`.

- `Agreement` is the contract used by `Boy`, `Girl01`, and `Girl02`.
- `Girl01` and `Girl02` are component beans; both implement `Agreement`.
- `Boy` injects an `Agreement` implementation using `@Autowired` and `@Qualifier("girl01")`.
- `DI`, `DIInterface`, `Test01`, and `Test02` show a second injection example where `Test02` receives a `DI` bean and calls `sayHello()`.
- `AppInitializer` currently runs the `Test02` example.

### 04-FullMode_vs_LightMode

This module demonstrates bean creation and lifecycle-aware classes in a more manual configuration style.

- `AppConfig` component-scans the bean package.
- `SpringBeanThree` is a component that defines `@Bean` methods for `SpringBeanOne` and `SpringBeanTwo`.
- `SpringBeanOne` and `SpringBeanTwo` both implement the common Spring lifecycle-aware interfaces and print callback messages.
- `AppInitializer` creates the context and registers a shutdown hook.

### 05-Configuration

This module shows how multiple configuration classes can be combined.

- `AppConfigOne` defines `SpringBeanOne` as a bean.
- `AppConfigTwo` defines `SpringBeanTwo` as a bean.
- `AppInitializer` registers both configuration classes in the same application context and then retrieves the beans.

### 06-Runtime_Values

This module demonstrates literal runtime value injection.

- `SpringBean` uses `@Value("Dilan")` to inject a literal string into a field.
- `afterPropertiesSet()` prints the injected value after bean initialization.
- `AppConfig` only enables component scanning for the bean package.

### 07-Spring_Environment

This module demonstrates reading values from the environment and property files.

- `AppConfig` adds `@PropertySource("classpath:application.properties")`.
- `application.properties` currently defines `db.name=spring_prd`.
- `SpringBean` injects `@Value("${os.name}")` and `@Value("${db.name}")` and prints both values in `afterPropertiesSet()`.
- `AppInitializer` starts the context and contains commented code for printing environment variables and system properties.

### 08-SpringMVC

This module is a traditional Spring MVC web application that returns server-side views.

- `WebAppInitializer` registers `WebRootConfig` as the root context and `WebAppConfig` as the servlet context, and maps the DispatcherServlet to `/`.
- `WebAppConfig` enables Spring MVC, scans the bean package, imports `HelloController`, configures a resource handler for `/views/**`, and creates an `InternalResourceViewResolver` with the `/views/` prefix and a final suffix of `.jsp`.
- `HelloController` maps requests under `/hello` and returns view names.

View files in `web/views/`:

- `index.jsp`
- `customer.jsp`
- `index.html`

Active controller mappings:

- `GET /hello` -> `index`
- `GET /hello/customer` -> `customer`
- `GET /hello/index` -> `index`

### 09-REST_Controllers

This module demonstrates REST-style controller mappings, request binding, and JSON input/output.

- `WebAppInitializer` is the servlet bootstrap class.
- `WebAppConfig` enables Spring MVC and scans `lk.ijse.project.controller`.
- `WebRootConfig` is currently empty.
- `UserDto`, `CityDTO`, and `City` are the DTO classes used for form and JSON examples.
- Lombok is used to generate boilerplate code for the DTOs.
- Jackson is used for JSON serialization and deserialization.

Controller summary:

- `HelloController`
	- `GET /hello` returns `GET`
	- `POST /hello/postMapping` returns `POST`
	- `PUT /hello` returns `PUT`
	- `DELETE /hello` returns `DELETE`
	- `PATCH /hello` returns `PATCH`
- `PathVariableController`
	- `GET /path/{id}`
	- `GET /path/{name}/{age}`
	- `GET /path/customer/{id:[I][0-9]{3}}`
	- `GET /path/item/{code}/branch/{city}`
	- an additional regex-style mapping is also declared in the code for the `item/.../branch/...` pattern
- `RequestParamController`
	- `GET /param?id=...`
	- `GET /param?id=...&name=...`
	- `GET /param/{code}?id=...&name=...`
- `JSONController`
	- `POST /json/save` consumes JSON and binds it to `UserDto`
	- `GET /json/get` produces JSON and returns a populated `CityDTO`
- `FormController`
	- `POST /form/save` binds form data to `UserDto` using `@ModelAttribute`
- `ExactMapping`
	- `GET /api`
	- `GET /api/exact02`
	- `GET /api/exact03`
- `WildCardMapping`
	- `GET /wild/test/*/hello`
	- `GET /wild/test/*/*`
- `CharacterMappingController`
	- `GET /char/item/I???`
	- `GET /char/????/search`

### Test01

This module combines configuration imports, external XML import, and bean registration.

- `AppConfigOne` scans the bean package, imports `AppConfig1` and `AppConfig2`, imports `hibernate.cfg.xml`, and defines bean `E`.
- `AppConfig1` defines beans `A` and `B`.
- `AppConfig2` defines beans `C` and `D`.
- `AppInitializer` only registers `AppConfigOne`; the imported configs and XML are pulled in transitively.
- `hibernate.cfg.xml` currently contains placeholder connection properties and no active database credentials.

## Notes

- Each numbered folder is a separate Maven project with its own `pom.xml`.
- The web modules use programmatic servlet initialization instead of `web.xml` configuration.
- `web.xml` is currently empty in the web modules and exists only as a placeholder.
- Several source files contain commented examples that were kept for learning and comparison.

## Running the demos

- Open the module you want to explore in an IDE and run its main class, usually `AppInitializer` or `Main`.
- For the web modules, deploy the project to a Servlet 6.1 compatible container such as Tomcat 10.1 or newer.
- Make sure the Maven dependencies are downloaded before running the examples.
