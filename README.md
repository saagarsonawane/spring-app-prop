# spring-app-prop

1.  This application consists of spring's Web and JPA module
2.  This application shows usage of @Configuration, @PropertySource annotation and 'Environment' API
3.  This application shows usage of application.properties file per environment

# Execution

1. This application has application-stg.properties and application-prd.properties file for stage and production environment resptively.
2. To execute application in stage environment, you may supply -Dspring.profiles.active=stg as VM arg.
3. To execute application in prod environment, you may supply -Dspring.profiles.active=prd as VM arg.
