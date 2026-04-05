<h1 align="center">👤 UserEmail Microservice</h1>
<p align="center"> Microserviço responsável pelo <strong>gerenciamento de usuários</strong> 
  e pelo <strong>envio de solicitações de e-mail</strong> 
  ao serviço externo <strong>envioEmail Microservice</strong> via comunicação <strong>síncrona (REST)</strong> e 
  <strong>assíncrona (RabbitMQ)</strong>. </p> <p align="center"> 
    <img src="https://img.shields.io/badge/Java-17+-orange"/> 
    <img src="https://img.shields.io/badge/Spring%20Boot-4.x-brightgreen"/> 
    <img src="https://img.shields.io/badge/PostgreSQL-Database-blue"/> 
    <img src="https://img.shields.io/badge/RabbitMQ-Messaging-orange"/> 
    <img src="https://img.shields.io/badge/Microservices-Architecture-purple"/> </p>

 # 🚀 Sobre o Projeto

O UserEmail Microservice é responsável por:

👤 Gerenciar usuários (cadastro, listagem, busca)
📧 Solicitar envio de e-mail para o Email Microservice
🔄 Enviar requisições REST diretamente para o Email Microservice (modo síncrono)
🔁 Publicar mensagens no RabbitMQ para envio assíncrono
🗄️ Manter seu próprio banco de dados independente
🔗 Se comunicar com outro microserviço (Email Microservice)

 # 🔗 Comunicação Entre Microserviços
O UserEmail envia solicitações de e-mail ao Email Microservice de duas formas:

 # 🔄 1. Síncrona — REST
UserEmail → HTTP → Email Microservice → Envio do e-mail

 # 🔁 2. Assíncrona — RabbitMQ
UserEmail (Producer) → RabbitMQ → Email Microservice (Consumer)

 # ⚙️ Tecnologias Utilizadas
<ul> 
  <li>☕ Java 17+</li> 
  <li>🌱 Spring Boot</li> 
  <li>🌐 Spring Web</li> 
  <li>📦 Spring AMQP</li> 
  <li>🗄️ Spring Data JPA</li> 
  <li>🐘 PostgreSQL</li> 
  <li>📡 RabbitMQ</li> 
  <li>🧰 ModelMapper</li> 
  <li>⚡ Lombok</li> 
  <li>🛡️ Validation (Jakarta Validation)</li> </ul>

  #  🔄 🔹 Envio Síncrono (REST)
  POST /users/{id}/send-email
📌 O serviço:
<ul>
  <li>Busca o usuário</li>
  <li>Monta o DTO de envio</li>
  <li>Chama o Email Microservice via REST</li>
</ul>

# 🧪 Testes com Postman

Você pode testar:

🧍 Criar usuário
📃 Listar usuários
🔎 Buscar por ID
✉️ Enviar e-mail via REST
📨 Enviar e-mail via RabbitMQ

# 📌 Integração com o Email Microservice

O UserEmail nunca envia e-mails diretamente.
Ele sempre delegará ao Email Microservice.

✔️ Vantagens:
Maior separação de responsabilidades
Microserviços mais independentes
Facilita escalabilidade
Reduz acoplamento


