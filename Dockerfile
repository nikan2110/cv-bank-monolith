FROM openjdk:11.0.12-jre
ARG JAR_FILE=target/*.jar
ENV ADMIN_PASSWORD=admin
ENV API_KEY=a2dd27df48a44f661275972ae9059143
ENV FORUM_KEY=mongodb+srv://nikita:1234.com@cluster0.yygjb.mongodb.net/CVbank?retryWrites=true&w=majority
ENV MAIL_PASS=nikan2110@gmail.com
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java","-jar","/app.jar"]