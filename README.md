# 🥷 Sistema de Cadastro de Ninjas

Bem-vindo ao **Sistema de Cadastro de Ninjas**!  
Este projeto é uma aplicação **em arquitetura em camadas**, desenvolvida com **Spring Boot**, projetada para cadastrar **ninjas** e suas respectivas **missões**.  

O projeto utiliza **H2** como banco de dados em memória, **Flyway** para migrações, e segue boas práticas de desenvolvimento, como **controle de versão com Git** e **hospedagem no GitHub**.  
Além disso, conta com **aulas extras sobre banco de dados** com um estudo mais aprofundado sobre SQL.

---

## 📖 Visão Geral do Projeto

Este sistema foi desenvolvido para **gerenciar ninjas e suas missões**.  
Cada ninja pode ser atribuído a **uma única missão**, enquanto **uma missão pode ser associada a vários ninjas**.

### Funcionalidades
- 📌 Cadastro de ninjas com **nome**, **idade**, **email** e **rank**.
- 📌 Atribuição de uma missão para um ninja.
- 📌 Gerenciamento de missões e dos ninjas associados.
- 📌 Migrações automáticas do banco com **Flyway**.

---

## 🛠 Tecnologias Utilizadas

| Tecnologia | Descrição |
|------------|-----------|
| **Spring Boot** | Criação da aplicação web e gerenciamento de dependências |
| **H2 Database** | Banco de dados em memória para desenvolvimento e testes |
| **Flyway** | Controle e execução de migrações no banco de dados |
| **JPA (Java Persistence API)** | Mapeamento objeto-relacional (ORM) |
| **Spring Data JPA** | Interação simplificada com o banco de dados |
| **Maven** | Build e gerenciamento de dependências |
| **Docker** | Build externo do banco de dados |
| **SQL** | Manipulação e consultas no banco |
| **Git & GitHub** | Controle de versão e hospedagem do código |

---

## 🗄 Design do Banco de Dados

**Entidades e Relacionamentos:**
- **Ninja**
  - `id` (Long)
  - `nome` (String)
  - `idade` (Integer)
  - `email` (String)
  - `rank` (String)
  - 🔗 Relacionamento: **Muitos para Um** com `Missão`

- **Missão**
  - `id` (Long)
  - `titulo` (String)
  - `descricao` (String)
  - 🔗 Relacionamento: **Um para Muitos** com `Ninja`

📌 **Regra**:  
- Um Ninja → **apenas uma** Missão  
- Uma Missão → **vários** Ninjas  

---

## ⚙️ Configuração e Execução

### Pré-requisitos
- Java 17+
- Maven 3.8+
- Docker (opcional, para uso com banco externo)

### Passos para rodar o projeto
```bash
# Clonar o repositório
git clone https://github.com/leoschwedler/CadastroDeNinjas

# Entrar no diretório do projeto
cd sistema-cadastro-ninjas

# Compilar o projeto
mvn clean install

# Executar a aplicação
mvn spring-boot:run
