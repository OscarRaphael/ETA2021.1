#language:pt

Funcionalidade: Contate-nos

  Eu, como usuário, gostaria de utilizar o contate-nos.

  Contexto:
    Dado que o usuário está na página myStore

  @contatenos
  Cenário: Acessar o serviço ao cliente
    Quando o usuário acessa o contate-nos
    E preenche as informações necessárias
      | valor                   |
      | Customer service        |
      | lucastesting01@test.com |
      | Automation Test         |
    Então o ticket deve ser enviado com sucesso