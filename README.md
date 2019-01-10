# JEE2
<h1>JEE Project Version 2</h1>
Guillaume Billès
Guillaume Farge
Morgan Wolf
Vincent Roche
Claire Huang 


After cloning the project at this address : 
https://github.com/ClaireH97/JEE2.git
Step 1 : Clean and build the project
Step 2 : Run the project

In this version, you have the following functionalities : 
o Maven project
o JSP  (EL et JSTL only / Please no Java code in your JSPs)
o Java Beans 
o Servlet 
o Persistance with JPA
o SGBD : MySQL 
o Continuous delivery pipeline with Jenkins using that version

<h1>Maven project :</h1>
This project had been created as a Maven Project in order to have a build automation.
Maven project is a little bit different compared to a webApplication.
Indeed, here, we can see how the software is build and all its dependencies.

<h1>JSP, java server pages</h1>
In order to give access to the user to the different contents of our web application, all the pages are .jsp are presented in the WEB-INF folder.

<h1>JavaBeans</h1>
In order to respect the MVC model, you can find our javaBeans in the source package, folder : group2jee.projet2.jee.<b>model</b>

<h1>Servlet</h1>

<h1>Persistance with JPA </h1>
You can find our Persistance file at this path : src/main/resources/META-INF
This Persistance file will be used by <java>EmployeesSessionBean.java</java>

<h1>Continuous delivery pipeline with Jenkins</h1>
Please follow the different steps presented in the file  <a>How to create the pipeline.pdf</a>
