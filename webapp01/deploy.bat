::DEPLOY TO APP SERVER
::mvn clean tomcat7:redeploy

::RUN LOCAL TOMCAT SERVER
mvn clean tomcat7:run-war

::OPEN TO WEB BROWSER
::http://[ip-address]:8080/webapp01