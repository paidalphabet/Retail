### Author mahavir 
#/bin/bash

TOMCAT_WEBAPPS_LOCATION="/d/apache-tomcat-7.0.52/webapps/"
TOMCAT_BIN_LOCATION="/d/apache-tomcat-7.0.52/bin/"
function buildCleanInstall(){
mvn clean install

echo "############ Copying war to `$TOMCAT_WEBAPPS_LOCATION` #############"
cp target/*.war $TOMCAT_WEBAPPS_LOCATION
#cp build/extract-all.bat $TOMCAT_WEBAPPS_LOCATION/extract-all.bat
#jar xvf $TOMCAT_WEBAPPS_LOCATION/RTMS.war $TOMCAT_WEBAPPS_LOCATION/
#$TOMCAT_WEBAPPS_LOCATION/extract-all.bat
$TOMCAT_BIN_LOCATION/startup.bat
echo "Script ends "
}


buildCleanInstall