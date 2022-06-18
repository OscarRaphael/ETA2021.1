#language:pt

Funcionalidade: Alterar Dados do Usuário

  Eu, como usuário, gostaria de alterar os dados da minha conta.

  Contexto:
    Dado que o usuário acessa o sistema com "lucastesting01@test.com" e "123456789"

  @alterarDadosUser
  Cenário: Alterar dados do usuário
    Quando o usuário navega para a página My Personal Information
    E altera os dados dos campos: First name e Last name
      | value            |
      | Testing Name     |
      | Testing LastName |
      | 123456789        |
    Então as alterações devem ser salvas com sucesso