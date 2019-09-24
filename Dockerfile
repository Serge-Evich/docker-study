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

FROM nginx
EXPOSE 80
COPY --from=builder /app/target/docker-study-1.0-SNAPSHOT.jar /usr/share/nginx/jar
