# Spring-Boot-Redis-Cache
Spring Boot 13 com Cache utilizando Redis.

1. As configurações do Redis são as default em outra infraestrutura.
O Redis Server foi executado com src/redis-server --protected-mode no para permitir acesso externo.

2. O projeto utilizou Java 8, Spring Boot 1.5.13.RELEASE, Embedded Tomcat, duas instâncias do projeto executando e compartilhando tanto o banco de dados postgres quanto o Redis.
