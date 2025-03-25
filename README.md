# API com Spring Boot

Este repositório contém um projeto de API desenvolvido com **Spring Boot**, abordando conceitos como **JPA**, **REST**, **CRUD**, **Banco de Dados** e **Postman**.

## 📌 Tecnologias Utilizadas
- **Spring Boot**
- **Spring Data JPA**
- **Banco de Dados H2** (persistência em memória)
- **MySQL** (para ambiente de produção)
- **Postman** (para testes de API)

## 📁 Estrutura do Projeto

O projeto é composto por três camadas principais:

- **Model**: Representa a estrutura de dados da aplicação e contém a classe **Produto** representando o nosso modelo de negócios.
- **Controller**: Contém os endpoints REST para interação com a API. Contém a classe *ProdutoController*.
- **Repository**: Responsável pela comunicação com o banco de dados.

### 🌍 Endpoints da API
A API contém endpoints para realizar operações CRUD sobre produtos. Os principais endpoints são:

- Criar um novo produto:
  ```http
  POST /produtos
  ```
  **Corpo da requisição:**
  ```json
  {
    "nome": "Produto A",
    "descricao": "Descrição do produto",
    "preco": 100.0
  }
  ```

- Buscar um produto por ID:
  ```http
  GET /produtos/{id}
  ```

- Atualizar um produto:
  ```http
  PUT /produtos/{id}
  ```
  **Corpo da requisição:**
  ```json
  {
    "nome": "Produto A",
    "descricao": "Nova descrição",
    "preco": 120.0
  }
  ```

- Deletar um produto:
  ```http
  DELETE /produtos/{id}
  ```

- Buscar produtos por filtros:
  ```http
  GET /produtos?nome=ProdutoA
  ```

## 🛠️ Configuração do Banco de Dados
No ambiente de desenvolvimento, utilizamos o banco de dados **H2 em memória**, configurado no arquivo `application.yml`:
```yaml
spring:
  datasource:
    url: jdbc:h2:mem:produtos
    driverClassName: org.h2.Driver
    username: sa
    password: ""
  jpa:
    database-platform: org.hibernate.dialect.H2Dialect
```
Para produção, a API pode ser configurada para utilizar **PostgreSQL**, bastando alterar as credenciais no `application.yml`.

## 📌 Repositório
O código-fonte está disponível em: [GitHub](https://github.com/hac1997/API-com-Springboot)

---

📌 **Autor:** [Herick Andrei de Carvalho](https://www.linkedin.com/in/herick-andrei-de-carvalho-a97258300/)


