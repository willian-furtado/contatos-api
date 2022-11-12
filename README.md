Ferramentas/linguagem necessarias para excutar o projeto localmente:

•	Java 11 (https://www.oracle.com/br/java/technologies/javase/jdk11-archive-downloads.html)
•	SpringBoot 2.7.5
•	Maven 3.8.6 (https://maven.apache.org/download.cgi)
•	GIT (https://git-scm.com/download/win)
•	Postman (https://www.postman.com/downloads/)

Passo a passo para excutar o projeto localmente:

 1 - Configure o JAVA_HOME e M2_HOME (maven) nas variaveis de ambiente local.
 2 - Clone o projeto
 3 - Execute em sua IDE de preferência (sugestão InteliiJ)
 
 Para testar a API utilize o Postman para executar as requisições:
 
 Endpoints da API
 
 POST (Salvar Contato):
 https://contatos-api-heroku.herokuapp.com/api/contatos 
 Objeto JSON exemplo:
 {
    "nome": "Nome Dev",
    "email": "nome@outlook.com",
    "dataNascimento": "01/01/1999",
    "telefone": "(11)99999-9999"
 }
 
 PUT(Atualiza contato já existente)
 http://localhost:8080/api/contatos
 {
    "id": 1
    "nome": "Nome Dev",
    "email": "nome@outlook.com",
    "dataNascimento": "01/01/1999",
    "telefone": "(11)99999-9999"
 }
 
 GET (Lista todos os contatos):
 https://contatos-api-heroku.herokuapp.com/api/contatos
 
 GET (Busca um contato por id):
 https://contatos-api-heroku.herokuapp.com/api/contatos/id ---> (ID que deseja deletar)
 
 DELETE(Deleta um contato)
 https://contatos-api-heroku.herokuapp.com/api/contatos/id ---> (ID que deseja deletar)
 
