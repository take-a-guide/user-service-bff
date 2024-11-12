# Usa a imagem Maven com JDK 21 para build
FROM maven:3.9.4-eclipse-temurin-21 AS build

# Define o diretório de trabalho
WORKDIR /app

# Copia o arquivo pom.xml e o código fonte
COPY pom.xml ./
COPY src ./src

# Compila o projeto
RUN mvn clean package -DskipTests

# Cria a imagem final usando JDK
FROM eclipse-temurin:21-jdk

# Define o diretório de trabalho
WORKDIR /app

# Copia o JAR da etapa de build
COPY --from=build /app/target/user-service-bff-0.0.1-SNAPSHOT.jar /app/app.jar


# Define o comando de entrada
ENTRYPOINT ["java", "-jar", "/app/app.jar"]
