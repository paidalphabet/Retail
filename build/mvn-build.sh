### Author mahavir 
#/bin/bash

TOMCAT_WEBAPPS_LOCATION="/d/apache-tomcat-7.0.52/webapps/"
TOMCAT_BIN_LOCATION="/d/apache-tomcat-7.0.52/bin/"
function buildCleanInstall(){
mvn clean install
cp target/*.war $TOMCAT_WEBAPPS_LOCATION
$TOMCAT_BIN_LOCATION/startup.bat
}


buildCleanInstall