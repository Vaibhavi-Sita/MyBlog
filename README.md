# My Blog - A Profile Links Page

<table>
  <tr>
  <td>This is a simple CRUD Spring Boot Application.<br>
    Displays your blog/profile links in a single page   
  <td><img src="https://user-images.githubusercontent.com/52885102/216930012-a69134c9-3700-4d49-aa3c-00ebeba34a55.png" style="width:300px;">
  </tr>
</table>

## An experiment with Thymeleaf

Thymeleaf is a modern, flexible, and easy-to-use template engine that is used for building dynamic web applications  
Its simple syntax, integration with Spring, and good documentation made it an ideal choice to develop this basic app.   
You may visit my <a href="https://vaibhavigs.wixsite.com/epoch">blog</a> that provides on overview of thymeleaf: <a href="https://vaibhavigs.wixsite.com/epoch/post/a-full-stack-shortcut"> A Full Stack Shortcut</a>

### Requirements
<img src="https://badgen.net/badge/Java/17/green"> <img src="https://badgen.net/badge/Spring Boot/3.0.2/green"> <img src="https://badgen.net/badge/Thymeleaf/3.1/green">  

### Usage 
#### I. Docker
1. Verify Docker version and also login to <a href="https://hub.docker.com/repository/docker/vaibhavisita/myblog" target="_blank">Docker Hub</a>
```
docker version
docker login
```
2. Pull Image from Docker Hub
```
docker pull vaibhavisita/myblog:latest
```
3. Run the downloaded Docker Image & Access the Application
```
docker run --name myblog -p8777:8080 -d vaibhavisita/myblog:latest
```
  
#### II. ...or Clone the project
1. Clone the repository using the following command:
```
git clone https://github.com/Vaibhavi-Sita/ThymeleafDemo.git
```
2. Navigate to the cloned directory and build the project using the following command:
```
./mvnw clean install
```
3. Start the application using the following command:
```
./mvnw spring-boot:run
```
4. Access the application in your web browser at http://localhost:8080.

<br>

### Contributing
If you would like to contribute to the project, please follow the steps below:

1. Fork the repository
2. Create a new branch for your changes
3. Commit your changes and push the branch to your fork
4. Create a pull request against the master branch of this repository



