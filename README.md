# BookingManagerApp

This project is about developing a Bookmark manager, an application that’s similar to how bookmarking is performed in a browser. This app will allow you to bookmark URLs and organize them in different folders.
This project explore knowledge of Relational Database Management (RDBM) design. In this project I have used these following frameworks and technologies here below:

Tools & Technologies :
Intelij Ultimate
Spring Boot and Hibernate
Java Persistence Api (JPA)
React Framework
Postgrelsql
MySQL
H2 In-memory Db
JUnit5 + Mockito (For testing the Srvice Layers, Controllers and Repositories)

Main Functionalities: 
1. It allows Users to perform CRUD Operation on the Books
2. It also allows users to create, Read, Update and Delete Folders

Hint: Picture references of the test coverage can be seen from the attached pictures.

Important Remarks: This project was organised by Integrify Finland, one of the leading Software Development Consultancy Companies in Finland.

To run this program follow these steps below:
1. Create a work directory on your computer
2. clone and extract the zip file in the directory you created.
3. Load the extracted file into your VS Code IDE or Intelij Community or Ultimate, or any IDE of your choice.

Important: Navigate through the extended project and update the application property section and do these:

Change the configuration Setting to that of your prefered Database

For Postgresql
spring.datasource.username=root
spring.datasource.password=root

Create a database in your Postgresql first and name it, bookmarkingDb2

For MySQL
spring.datasource.username=root
spring.datasource.password=root

The Database will be Automatically Created because of this :
?useUnicode=true&useLegacyDatetimeCode=false&serverTimezone\=UTC&createDatabaseIfNotExist=true&allowPublicKeyRetrieval=true&useSSL=true

used database is bookmarkingDb1

After the Application properties Section has been completed ( Click on Run button ) and begin to test the crud functionality.

To extract the executable Jar file use this command on the CLI 
mvn clean install. 

Then you can ship it for production. Thank you 



