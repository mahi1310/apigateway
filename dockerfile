FROM openjdk:17-oracle
COPY ./target/APIGateway-0.0.1-SNAPSHOT.jar APIGateway.jar
CMD ["java","-jar","APIGateway.jar"]