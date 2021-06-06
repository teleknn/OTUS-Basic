FROM openjdk:16-jdk-alpine
ADD HelloWordDocker.java .
RUN javac HelloWordDocker.java
CMD ["java" , "HelloWordDocker"]