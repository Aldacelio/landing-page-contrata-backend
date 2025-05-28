# 🚀 Contrata+ Backend

## 💻 Projeto

Backend da plataforma Contrata+, responsável pelo gerenciamento e processamento dos dados dos usuários. Esta API REST fornece endpoints seguros e eficientes para suportar as operações da landing page.

## ✨ Tecnologias

- [Spring Boot 3](https://spring.io/projects/spring-boot)
- [Java 17](https://www.java.com/)
- [PostgreSQL](https://www.postgresql.org/)
- [Swagger](https://swagger.io/)
- [JPA/Hibernate](https://hibernate.org/)

## 🔍 Features

- ⚡ API REST com Spring Boot
- 🔒 Integração com PostgreSQL
- 📝 Documentação com Swagger
- 🔄 CORS configurado
- ✨ Persistência com JPA

## 🚀 Como executar

```bash
# Clone este repositório
$ git clone https://github.com/Aldacelio/landing-page-contrata-backend

# Entre na pasta do projeto
$ cd landing-page-contrata-backend

# Configure o application.properties
# Crie um arquivo application.properties em src/main/resources com as seguintes configurações:

server.port=${PORT:8080}
spring.datasource.url=sua_url_do_banco
spring.datasource.username=seu_usuario
spring.datasource.password=sua_senha
spring.jpa.generate-ddl=true
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
spring.jpa.properties.hibernate.format_sql=true
spring.jpa.database-platform=org.hibernate.dialect.PostgreSQLDialect
spring.data.rest.baseUri=/api
spring.datasource.hikari.maximum-pool-size=2
spring.jpa.open-in-view=false

# Execute o projeto
$ ./gradlew bootRun

# A API estará disponível em http://localhost:8080
```

## 📚 Endpoints

- `POST /api/dados`: Adiciona novos dados de usuários
- Documentação completa disponível em `/swagger-ui.html`

## 🔧 Configuração do Banco de Dados

Para executar localmente, você precisará:

1. Ter PostgreSQL instalado
2. Criar um banco de dados
3. Configurar as credenciais no application.properties

---

Feito por Aldacélio 👋 [Entre em contato!](https://www.linkedin.com/in/antonio-aldacélio-a42a1212b/)
