Spring Cloud Network, using Spring boot 2, 2.1.0.BUILD-SNAPSHOT and Finchley.BUILD-SNAPSHOT
-------------------------------------------------------------------------------------------

All projects are working in localhost.

Run projects using NetBeans.

Dependencies: JDK 1.8 and Apache Maven.


Eureka server
   ---------------------------

1. Run eureka server
   Access http://localhost:8761/
   
Config server   
   ---------------------------
   Just run

Hystrix
   ---------------------------  
   Just run  
   Access http://localhost:8082/hystrix
   
Turbine
   ---------------------------  
   Just run  
   Access http://localhost:8083/turbine.stream
   Hystrix + Turbine access link    http://localhost:8082/hystrix/monitor?stream=http%3A%2F%2Flocalhost%3A8083%2Fturbine.stream
   

Zipkin
   ---------------------------  
   Just run  
   Access http://localhost:9411
      
   
   
   
Wiki service
   ---------------------------
   Application using webflux and undertow. Configuration: reactive using Servlet API, because swagger does not support Spring boot netty reactive stack
      
   
   Full access: http://localhost:8081/swagger-ui.html

a. Access

   http://localhost:8081/api/v1/wiki/secret/message

b. Change "message" property in config server wiki.yml, re run config server


c. Send empty POST request to (use restlet_client chrome plugin)

   http://localhost:8081/actuator/refresh

d. Access again, output will change

   http://localhost:8081/api/v1/wiki/secret/message
   
   Check also ZIPKIN http://localhost:9411   

   Additional Information  https://andressanchezblog.wordpress.com/2016/09/15/refresh-scope-in-spring-cloud/
