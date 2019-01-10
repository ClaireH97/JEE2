# JEE Project
By <br>
Guillaume Billès | Guillaume Farge | Morgan Wolf | Vincent Roche | Claire Huang<br>

<h1>functionalities</h1>

<b>Login Page</b><br>
- Connection of an user <br>
- Error message login or password incorrect <br>
- Error if login or password not entered <br>

<b>The default login : admin | password : admin</b>

<b>Employees List Page</b><br>
1) A click on Delete will remove the selected member from the database and will reload the updated list of employees<br>
2) A selection of one member and a click on Details will send the user to the Member details page<br>
3) A click on Add will redirect the user to an empty Member details  page<br>
4) If you delete all the members the following message is displayed (in blue & bold) : The club has no members!<br> 

<b>Employees Details Page</b><br>
1) A click on Save will update the information about the current member and will redirect to the list page<br>
2) A click on Cancel will redirect to the list page without updating information about the current member<br>

<b>General functionalities</b>
On the upper right of each page (except the login page obviously) show : <br>
1) "Your session is active" <br>
2) The icon that allows the user to logout (leave the session)<br>
<br>
1) Good bye page<br>
2) All the constant are in the folder utils, in the file Constants.java<br>
3) Our database if configured as <br>
Base : PROJET<br>
User : adm<br>
Password : adm<br>
4) We have a script with 10 employees<br>

<h1>Version 1</h1>

<br>
After cloning the project at this address : <br>
https://github.com/VincentRoche/JEE.git<br>
Step 1 : Clean and build the project<br>
Step 2 : Run the project

In this version, you have the following Parameters : 
o JSP (scriptlets accepted) + Java Beans + Servlet + JDBC
o db.properties file to store information about the database 
o SQL script in /WEB-INF
o All the JSPs in /WEB-INF 
o SGBD = Java DB

<h2>Jsp, java beans, servlet, jdbc</h2>
Jsp are located in the web/WEB-INF folder<br>
Java beans are located in the jee/model folder<br>
In this version, the database used is the one from netbeans Java DB
<h2>.properties</h2>
db.properties file is located in the src/java/utils folder<br>


<h1>Version 2</h1>

<br>
After cloning the project at this address : <br>
https://github.com/ClaireH97/JEE2.git<br>
Step 1 : Clean and build the project<br>
Step 2 : Run the project

In this version, you have the following Parameters : 
o Maven project <br>
o JSP  (EL et JSTL only / Please no Java code in your JSPs)<br>
o Java Beans <br>
o Servlet <br>
o Persistance with JPA<br>
o SGBD : MySQL <br>
o Continuous delivery pipeline with Jenkins using that version<br>

<h2>Maven project :</h2>
This project had been created as a Maven Project in order to have a build automation.<br>
Maven project is a little bit different compared to a webApplication.<br>
Indeed, here, we can see how the software is build and all its dependencies (in Pom.xml).<br>

<h2>JSP, java server pages</h2>
In order to give access to the user to the different contents of our web application, all the pages are .jsp are presented in the WEB-INF folder.

<h2>JavaBeans</h2>
In order to respect the MVC model, you can find our javaBeans in the source package, folder : group2jee.projet2.jee.<b>model</b>

<h2>Servlet</h2>

<h2>Persistance with JPA </h2>
You can find our Persistance file at this path : src/main/resources/META-INF<br>
This Persistance file will be used by EmployeesSessionBean.java<br>

<h2>Continuous delivery pipeline with Jenkins</h2>
Please follow the different steps presented in the file<b>"How to create the pipeline.pdf"</b>
