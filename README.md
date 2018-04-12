# spring-app-prop

**This application shows loading profile-specific properties into spring context**

1.  This application consists of spring's Web and JPA module
2.  This application uses @Configuration, @PropertySource annotation and 'Environment' API to load profile specific properties.
application-{profile}.properties

## Execution

This application has application-stg.properties and application-prd.properties file for stage and production environment resptively.
1. To execute application in stage environment - 
-   you may supply -Dspring.profiles.active=stg as VM arg
-   you may add spring.profiles.active=stg in default application.properties file
-   you may add --spring.profiles.active=stg as a program argument
    -   java -jar spring-app-prop.jar --spring.profiles.active=stg
    

2. To execute application in prod environment - 
-   you may supply -Dspring.profiles.active=prd as VM arg.
-   you may add spring.profiles.active=prd in default application.properties file
-   you may add --spring.profiles.active=prd as a program argument
    -   java -jar spring-app-prop.jar --spring.profiles.active=prd
