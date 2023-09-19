FROM adoptopenjdk:11-jre-hotspot
EXPOSE 8888
ENV APP_DIR=/spring-cloud-config-server
ENV APP_NAME=spring-cloud-config-server-1.0-SNAPSHOT.jar
RUN mkdir $APP_DIR
COPY target/$APP_NAME $APP_DIR/$APP_NAME

WORKDIR $APP_DIR

CMD java -jar $APP_NAME
