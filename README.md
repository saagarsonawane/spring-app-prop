# spring-app-prop

**This application shows loading profile-specific properties into spring context

1.  This application consists of spring's Web and JPA module
2.  This application uses @Configuration, @PropertySource annotation and 'Environment' API to load profile specific properties.
application-{profile}.properties

# Execution

This application has application-stg.properties and application-prd.properties file for stage and production environment resptively.
1. To execute application in stage environment - 
    a.  you may supply -Dspring.profiles.active=stg as VM arg
    b.  you may add spring.profiles.active=stg in default application.properties file
    c.  **Shell scripts details to be added 

2. To execute application in prod environment - 
    a.  you may supply -Dspring.profiles.active=prd as VM arg.
    b.  you may add spring.profiles.active=prd in default application.properties file
    c.  **Shell scripts details to be added  
