

#Here we can create a file to give instruction for docker to create a docker image

#base image version of Java 
FROM openjdk:11

#we can specify the jar file available in target
#usr/app/ default location in docker 
COPY target/SpringBoot_Docker_App.jar /usr/app/

#set the work directory where jar is available
WORKDIR /usr/app

#for container creation
ENTRYPOINT ["java","-jar","SpringBoot_Docker_App.jar"]