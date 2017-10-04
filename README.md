# Created this small ToDo Application for Emirates Assessment, as part of interview.

## Frameworks

### Front-end

#### Twitter Bootstrap

#### AngularJS
AngularJS is a MVC based framework for web applications, written in JavaScript. It makes it possible to use the Model-View-Controller pattern on the front-end. It also comes with several additional modules. I'm also using **angular-resource**, which is a simple factory-pattern based module for creating REST clients.

### Back-end

#### Database
HSQLDB as dependency for Spring-Boot.

#### Spring Boot
One of the hassles while creating web applications using the Spring Framework is that it involves a lot of configuration. Spring Boot makes it possible to write configuration-less web application because it does a lot for you out of the box.
For example, if you add HSQLDB as a dependency to your application, it will automatically provide a datasource to it.
If you add the spring-boot-starter-web dependency, then you can start writing controllers for creating a web application.


#### Spring Data JPA
Spring Data JPA allows you to create repositories for your data without even having to write a lot of code. The only code you need is a simple interface that extends from another interface and then you're done.
With Spring Boot you can even leave the configuration behind for configuring Spring Data JPA, so now it's even easier.


## Installation

#Pre-Requiste
Bower
Maven
JDK 1.8 or above

Installation is quite easy, first you will have to install some front-end dependencies using Bower:
```
bower install
```

Then you can run Maven to package the application:
```
mvn clean package
```

Now you can run the Java application quite easily:
```
cd target
java -jar ToDoApplication-1.0.0.jar
```

## Running the Application without installation.

#Pre-Requiste
JDK 1.8 or above


If One doesn't want to do the above installation, please download the jar in the below location in Google Drive.
https://drive.google.com/open?id=0B_gABTyRlEoqWnJTRGNROFVYVHM

Once downloaded if the file is available in the below location
```
C:\Downloads\ToDoApplication-1.0.0.jar
```
Please execute the below command in the command prompt.

```
cd C:\Downloads
java -jar ToDoApplication-1.0.0.jar
```

## Screen Shots

![Settings Window](https://github.com/AnupamSinha/ToDoApplication/blob/master/screenshot/ToDo-List-Emirates-Assessment-1.png)


## To be done later point of time
### Validation of the feilds. 
As there was limited time, the validation hasn't been done, as I was more concentrated in the creating the application and managing the success flow.