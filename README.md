# WinerySys - SOAP Web Service

Projeto desenvolvido para o **Checkpoint 1 da disciplina de SOA
(Service-Oriented Architecture)**.

O objetivo deste projeto é implementar e publicar um **Web Service do
tipo SOAP** utilizando **Java e JAX-WS**, além de desenvolver um
**cliente capaz de consumir esse serviço** a partir do **WSDL gerado**.

## 📚 Objetivo do Projeto

-   Criar um **Web Service SOAP**
-   Publicar o serviço utilizando **JAX-WS**
-   Gerar o **WSDL automaticamente**
-   Consumir o serviço através de um **cliente SOAP**
-   Utilizar **Maven** para gerenciamento de dependências e geração de
    classes com **wsimport**

## 🛠 Tecnologias Utilizadas

-   Java
-   JAX-WS
-   Maven
-   SOAP
-   IntelliJ IDEA

## ⚙️ Como Executar o Projeto

### 1️⃣ Executar o serviço

Execute a classe Loader em WinerySys responsável por publicar o serviço. Após
iniciar, o serviço ficará disponível em:

http://localhost:8085/WineStockService

http://localhost:8086/WineWarningService

O WSDL poderá ser acessado em:

http://localhost:8085/WineStockService?wsdl

http://localhost:8085/WineWarningService?wsdl

### 2️⃣ Gerar as classes do cliente

Utilize o Maven para gerar as classes a partir do WSDL:

`mvn clean compile`

O plugin **wsimport** irá gerar automaticamente as classes necessárias
para o consumo do serviço.

### 3️⃣ Executar o cliente

Execute a classe `ApplicationClient1` e `ApplicationClient2` para consumir o serviço SOAP e
visualizar a resposta no console.

## 👨‍💻 Integrantes

| Nome               | RM     |
| :----------------- | :----- |
| Guilherme Oliveira | 558797 |
| Matheus Dantas     | 558804 |
| Rafael Panhoca     | 555014 |
| Silas Alves        | 555020 |
| Victor Rodriguez   | 559094 |

## 📌 Disciplina

**SOA - Service-Oriented Architecture**

Checkpoint 1
