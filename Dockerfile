FROM alpine as builder
RUN apk add --update maven
RUN apk update
RUN apk fetch openjdk8
RUN apk add openjdk8
ENV JAVA_HOME=/usr/lib/jvm/java-1.8-openjdk
ENV PATH="$JAVA_HOME/bin:${PATH}"

WORKDIR '/app'

COPY . .
RUN mvn clean test package
EXPOSE 8080
CMD ["java", "-jar", "./target/docker-study-1.0-SNAPSHOT.jar"]
