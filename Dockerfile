# Starter Dockerfile. Students are expected to review and adapt it for the final task.
FROM tomcat:9.0-jdk17-temurin
RUN rm -rf /usr/local/tomcat/webapps/ROOT
COPY target/online-examination-system.war /usr/local/tomcat/webapps/ROOT.war
EXPOSE 8080
CMD ["catalina.sh", "run"]
