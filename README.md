#RUN DEV Mode

## DEV PROFILE
### ./mvnw spring-boot:run -Drun.profiles=dev

##PROD PROFILE
### ./mvnw spring-boot:run -Drun.profiles=prod


#RUN PACKAGE MODE

## DEV PROFILE
### java -Dspring.profiles.active=dev -jar dexter.jar

## PROD PROFILE
### java -Dspring.profiles.active=prod -jar dexter.jar


#Deploy no Wildfly

### ./mvn clean wildfly:deploy -P dev -DskipTests




