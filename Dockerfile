FROM azul/zulu-openjdk-alpine:21
ENV eureka.client.serviceUrl.defaultZone eureka.client.serviceUrl.defaultZone
EXPOSE 8080
COPY target/*.jar hackaton-gateway-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/hackaton-gateway-0.0.1-SNAPSHOT.jar"]
