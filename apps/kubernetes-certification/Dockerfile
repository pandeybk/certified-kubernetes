FROM openjdk:11 as BUILDER
RUN mkdir -p /usr/src/app
WORKDIR /usr/src/app
COPY . /usr/src/app
RUN ./gradlew assemble 

FROM openjdk:11
RUN mkdir -p /usr/src/app
WORKDIR /usr/src/app
COPY --from=BUILDER /usr/src/app/build/libs/kubernetes-certification-0.1.war /usr/src/app/app.war
CMD ["java", "-jar", "/usr/src/app/app.war"] 
