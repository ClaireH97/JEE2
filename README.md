# JEE2
<h1>JEE Project Version 2</h1>
By <br>
Guillaume Billès <br>
Guillaume Farge <br>
Morgan Wolf <br>
Vincent Roche <br>
Claire Huang <br>

After cloning the project at this address : 
https://github.com/ClaireH97/JEE2.git
Step 1 : Clean and build the project
Step 2 : Run the project

In this version, you have the following functionalities : 
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
Indeed, here, we can see how the software is build and all its dependencies.<br>

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
