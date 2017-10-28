# How Spring-boot Works #
# pom.xml: Bill of Material- Pick the Version of Parent and Spring/Maven pulls the right versions of JAR having Spring MVC, Tomcat etc
	- parent: spring-boot-starter-parent: Defines all the versions of jars to be pulled for Spring MVC
	- one dependency manages all spring MVC dependencies: spring-boot-starter-web
	
# Embedded Tomcat Servlet Container
	- Convenience
	- Standalone application
	- Servlet container config(web.xml) is now application config
	- Useful for microservices architecture from deployment perspective	

# SpringBootApplication
	- Define a class and annotate with @SpringBootApplication
	- Write main() method and invoke
	- SpringApplication.run(x.class, args)
# Run as Java Application
	- Run Above class having main method
	- It does all the bootstrping
	- Loads Configs, Scans classpaths, starts Tomcat etc
# Spring MVC Controller / RESTController
	- @RestController: Class Level Spring MVC Annotation
	- Maps URI & HTTP method to Java Method/functionality
	- Annotate(Spring MVC annotation) Java-method with URI & HTTP Method
	
# Java object to JSON conversion & Vice-Versa
	- Spring MVC detects that its RESTController and converts Java object to Json & vice versa
	
# Business Service: Singleton
	- @Service : Class Level Spring MVC Annotation
	
# HTTP Methods
	- 
	
	
	
	
	