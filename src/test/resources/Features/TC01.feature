#language:pt

Funcionalidade: Cadastrar Usuário

  Eu, como usuário, gostaria de cadastrar um usuário para conseguir comprar roupas.

  Contexto:
    Dado que o usuário está na página myStore

  @cadastrarUser
  Cenário: Cadastrar Usuário com sucesso
    Quando o usuário navega para a página de autenticação
    E insere um email valido ao criar uma conta
    E adiciona credenciais válidas para cadastrar um usuário
      | valor            |
      | Testing Name     |
      | Testing LastName |
      | Pass!@#          |
      | 24               |
      | 3                |
      | 1991             |
      | Full Address     |
      | Green Bay        |
      | Wisconsin        |
      | 54229            |
      | +1-920-555-0165  |
    Então uma conta de usuário deve ser criada com sucesso