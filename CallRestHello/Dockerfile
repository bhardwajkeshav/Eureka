
FROM openjdk:8-jdk-alpine
ARG JAVA_OPTS
ENV JAVA_OPTS=$JAVA_OPTS
ADD target/CallRestHello-0.0.1-SNAPSHOT.jar callresthello.jar
ENTRYPOINT exec java $JAVA_OPTS -jar callresthello.jar
# For Spring-Boot project, use the entrypoint below to reduce Tomcat startup time.
#ENTRYPOINT exec java $JAVA_OPTS -Djava.security.egd=file:/dev/./urandom -jar callresthello.jar
