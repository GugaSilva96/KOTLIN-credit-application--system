

# API para Avaliação de Créditos: Uma Jornada de Desenvolvimento Back-End com Kotlin 🚀

## Introdução

Bem-vindo ao Projeto de conclusão do Bootcamp de Desenvolvimento Back-End com Kotlin! Neste artigo, apresento a entrega final do projeto: uma API robusta e eficiente para Avaliação de Créditos, desenvolvida utilizando as poderosas tecnologias SPRING BOOT e KOTLIN 🍃💜.


## Objetivo do Projeto

O principal objetivo deste projeto educacional foi criar uma API capaz de atender às necessidades de uma empresa de empréstimos. Desenvolvemos a API com o propósito específico de proporcionar uma experiência completa de gerenciamento de clientes e solicitações de empréstimos. Este projeto não apenas demonstra a aplicação prática das tecnologias escolhidas, como Java, Kotlin, Spring Boot, Gradle, H2 e Flyway, mas também serve como um exercício valioso para aprimorar habilidades de desenvolvimento.

## Tecnologias Utilizadas

### SPRING BOOT

O framework SPRING BOOT foi escolhido pela sua simplicidade e eficiência no desenvolvimento de aplicações Java. Com SPRING BOOT, conseguimos criar uma API RESTful de forma rápida e estruturada, facilitando a implementação de recursos como segurança, tratamento de exceções e integração de banco de dados.

### KOTLIN

KOTLIN, a linguagem de programação moderna e concisa, mostrou-se uma escolha brilhante para o desenvolvimento deste projeto. Sua interoperabilidade com Java e sintaxe elegante permitiram um código mais legível e expressivo, aumentando a produtividade da equipe de desenvolvimento.

## Funcionalidades da API
![diagramaEntidadesApi](https://github.com/GugaSilva96/KOTLIN-credit-application--system/assets/150392138/26cbc8c7-be9a-483a-bbb6-893a305cab06)

### Gerenciamento de Clientes

- **Cadastro de Cliente:**
  - Endpoint para cadastrar novos clientes com informações como nome, CPF, renda, e endereço.

- **Edição de Cadastro:**
  - Possibilidade de editar informações do cliente, como nome, renda e endereço.

- **Visualização de Perfil:**
  - Endpoint para visualizar detalhes do perfil de um cliente com base no ID.

- **Exclusão de Cadastro:**
  - Funcionalidade para remover o cadastro de um cliente.

### Solicitação de Empréstimo

- **Cadastro de Solicitação de Empréstimo:**
  - Permite que os clientes solicitem empréstimos, especificando o valor, número de parcelas e outras informações relevantes.

- **Listagem de Empréstimos de um Cliente:**
  - Endpoint para listar todas as solicitações de empréstimo de um cliente.

- **Visualização Detalhada de Empréstimo:**
  - Mostra detalhes específicos de uma solicitação de empréstimo, incluindo o status da aprovação.

## Exemplo de Uso

Abaixo, apresentamos um exemplo simples de como utilizar a API para cadastrar um cliente:

```json
POST /api/customer/register

{
  "firstName": "John",
  "lastName": "Doe",
  "cpf": "123.456.789-00",
  "income": 5000.00,
  "email": "john.doe@email.com",
  "password": "securepassword",
  "zipCode": "12345-678",
  "street": "Main Street"
}

## Conclusão
A combinação de Java e Kotlin, duas linguagens de programação versáteis, proporcionou uma base sólida para nossa aplicação. Utilizando o framework Spring Boot, conseguimos acelerar o desenvolvimento, criando uma API RESTful estruturada. O gerenciamento de dependências e automação de construção foram tratados com o Gradle, enquanto o H2 e o Flyway foram essenciais para garantir a persistência eficiente dos dados. Vamos explorar como essas tecnologias se entrelaçaram para criar uma solução poderosa e dinâmica.
A API para Avaliação de Créditos é o resultado de semanas de estudo árduo e dedicação. Este projeto não apenas demonstra as habilidades adquiridas durante o Bootcamp, mas também destaca a importância de escolher as ferramentas certas para atingir os objetivos de forma eficiente.
Estou animados em apresentar esta API como uma solução completa. Agradeço a todos os envolvidos no Bootcamp de Desenvolvimento Back-End com Kotlin, Uma Incrível parceria entre as empresas NTT DATA E DIGITAL INOVATION ONE. Estou ansioso para continuar explorando e aprimorando habilidades de desenvolvimento Back-end. 🌟🚀

    
