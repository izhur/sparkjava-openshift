Sparkjava - Openshift Starter
=====================

Prerequisite:
- Java JDK 8
- Apache maven

This project is using maven for install and run do following:

```bash
$ mvn clean install
```
creating classes and jar with  

to package jar
```bash
$ mvn package
```

to run with exec-maven-plugin
```bash
$ mvn exec:java
```

to run from  jar 
```bash
$ java -jar target/gfs-project-1.0.jar
```

tomcat-maven-plugin
mvn clean package tomcat:deploy

The OpenShift `diy` cartridge documentation can be found at:

http://openshift.github.io/documentation/oo_cartridge_guide.html
