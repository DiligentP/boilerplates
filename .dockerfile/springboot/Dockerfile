# JRE 기반 이미지 사용 (OpenJDK 17 JRE 예시)
FROM openjdk:17-jre-slim

# 작업 디렉토리 설정
WORKDIR /app

# JAR 파일 복사 (빌드된 JAR 파일을 복사)
COPY target/*.jar app.jar

# 포트 노출 (Spring Boot 기본 포트 8080)
EXPOSE 8080

# JAR 실행
ENTRYPOINT ["java", "-jar", "app.jar"]