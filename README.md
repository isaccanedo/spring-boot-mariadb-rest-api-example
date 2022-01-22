# Exemplo de Spring Boot com MariaDB
## spring-boot-mariadb-rest-api-example
Construindo uma API Restful CRUD usando Spring Boot, Mysql, JPA e Hibernate

### WARN
Fri Jan 21 09:32:02 BRT 2022 WARN: Establishing SSL connection without server's identity verification is not recommended. According to MySQL 5.5.45+, 5.6.26+ and 5.7.6+ requirements SSL connection must be established by default if explicit option isn't set. For compliance with existing applications not using SSL the verifyServerCertificate property is set to 'false'. You need either to explicitly disable SSL by setting useSSL=false, or set useSSL=true and provide truststore for server certificate verification.

### AVISO
Sex 21 de janeiro 09:32:02 BRT 2022 AVISO: Não é recomendado estabelecer uma conexão SSL sem a verificação de identidade do servidor. De acordo com os requisitos do MySQL 5.5.45+, 5.6.26+ e 5.7.6+ A conexão SSL deve ser estabelecida por padrão se a opção explícita não estiver definida. Para conformidade com aplicativos existentes que não usam SSL, a propriedade VerifyServerCertificate é definida como 'false'. Você precisa desabilitar explicitamente o SSL definindo useSSL=false ou definir useSSL=true e fornecer armazenamento confiável para verificação de certificado do servidor.

### COMMAND LINE
```
docker run --detach --name meu-mysql -e MYSQL_ROOT_PASSWORD=root -p 3306:3306 mysql:5.7
```

### EXEC
```
docker exec -it [container] bash
```
### MYSQL TERMINAL
```
mysql -u root -p root
```

