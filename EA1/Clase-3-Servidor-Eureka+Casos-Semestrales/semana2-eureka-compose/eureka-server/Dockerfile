# Imagen base con Java 17
FROM eclipse-temurin:17-jdk

# Carpeta de trabajo dentro del contenedor
WORKDIR /app

# Instalamos curl para poder usar healthchecks fácilmente
RUN apt-get update && apt-get install -y curl && rm -rf /var/lib/apt/lists/*

# Copiamos el jar generado por Maven
COPY target/*.jar app.jar

# Puerto expuesto por el contenedor
EXPOSE 8761

# Comando para arrancar la app
ENTRYPOINT ["java", "-jar", "app.jar"]