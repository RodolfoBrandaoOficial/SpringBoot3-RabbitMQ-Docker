# SpringBoot3 + RabbitMQ + Docker 🐳🚀

Este repositório contém dois projetos separados que integram Spring Boot 3 com RabbitMQ e Docker. 

- Projeto 1: `backend-api-rabbit-mq`
- Projeto 2: `backend-worker`

## Estrutura do Projeto 📂

- **backend-api-rabbit-mq**: Um projeto Spring Boot que atua como uma API backend.
- **backend-worker**: Um projeto Spring Boot que atua como um worker para processar mensagens de pagamento.

## Requisitos 📋

- Docker
- Docker Compose
- Java 17
- Maven

## Configuração do Ambiente 🛠️

1. Clone o repositório:
```bash
   git clone https://github.com/RodolfoBrandaoOficial/SpringBoot3-RabbitMQ-Docker.git
   cd SpringBoot3-RabbitMQ-Docker
```
Execute o Docker Compose para subir o RabbitMQ:

```bash
docker-compose up -d
```
Acesse a interface de administração do RabbitMQ em:

```arduino
http://localhost:15672/
Usuário: guest
Senha: guest
```
Configuração das Filas e Exchanges no RabbitMQ 📬
Criar Exchanges e Filas
Exchange para Sucesso de Pagamento:

Exchange: pagamento-response-sucesso-queue
Routing Key: pagamento-response-sucesso-rout-key
Exchange para Erro de Pagamento:

Exchange: pagamento-response-erro-queue
Routing Key: pagamento-response-erro-rout-key
Queue para Solicitações de Pagamento:

Queue: pagamento-request-queue
Tipo: classic
Status: running
Queue para Resposta de Erro de Pagamento:

Queue: pagamento-response-erro-queue
Tipo: classic
Status: running
Queue para Resposta de Sucesso de Pagamento:

Queue: pagamento-response-sucesso-queue
Tipo: classic
Status: running
Execução dos Projetos 🚀
Backend API
Navegue até o diretório do projeto backend-api-rabbit-mq:

```bash
cd backend-api-rabbit-mq
```
Compile e execute o projeto:

```bash
mvn clean install
mvn spring-boot:run
```
Pagamentos Worker
Navegue até o diretório do projeto backend-worker:

```bash
cd backend-worker
Compile e execute o projeto:
```
```bash
mvn clean install
mvn spring-boot:run
```
Testando a Integração 🔄
Envie uma solicitação de pagamento para a API do backend.
O worker processará a mensagem e enviará a resposta para a fila apropriada (sucesso ou erro).
Licença 📄
Este projeto está licenciado sob os termos da licença MIT. Veja o arquivo LICENSE para mais detalhes.

Feito com ❤️ por Rodolfo Brandao
