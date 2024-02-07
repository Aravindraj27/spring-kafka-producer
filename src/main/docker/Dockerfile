FROM azul/zulu-openjdk-alpine:17-jre-latest AS spring-boot-kafka-producer-gar
LABEL authors="aravindrajganesan"  version="1.0"
LABEL description="Spring boot producer application to explore the various funtionalities spring offers for kakfa"
ARG JAR_FILE=*.jar
COPY ${JAR_FILE} application.jar

ENTRYPOINT ["java", "-jar", "application.jar"]

HEALTHCHECK --interval=5m --timeout=3s \
  CMD curl -f http://localhost/ || exit 1