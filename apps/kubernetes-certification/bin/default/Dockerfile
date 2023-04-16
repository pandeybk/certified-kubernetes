FROM openjdk:8 AS BUILDER
COPY . /usr/src/app
WORKDIR /usr/src/app
RUN chmod 755 gradlew
RUN ./gradlew assemble

FROM openjdk:8-jre
RUN mkdir -p /usr/src/app
WORKDIR /usr/src/app
COPY --from=BUILDER  /usr/src/app/build/libs/kubernetes-certification-0.1.war /usr/src/app/app.war
CMD [ "java", "-jar", "-Dgrails.env=prod", "/usr/src/app/app.war" ]
