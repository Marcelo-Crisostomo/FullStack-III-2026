#Usar imagen local de java 17
FROM eclipse-temurin:17-jdk

#Definir el directorio de trabajo
WORKDIR /app

#Copia del archivo .jar
COPY target/*.jar app.jar

#Declarar el puerto que va a utilizar el contenedor
EXPOSE 8080

# Definir el comando principal cuando el contenedor inicie con el proyecto compilado en .jar
ENTRYPOINT ["java", "-jar", "app.jar"]