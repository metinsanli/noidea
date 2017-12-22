::deploy
::mvn clean tomcat7:deploy

::run
mvn clean tomcat7:run

::set /p tmp="Hit enter to close"