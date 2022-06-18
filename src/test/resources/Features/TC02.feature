#language:pt

Funcionalidade: Alterar Dados do Usuário

  Eu, como usuário, gostaria de alterar os dados dá minha conta.

  Contexto:
    Dado que o usuário está na página myStore

  Cenário: Alterar dados do usuário com sucesso.
    Quando o usuário navega para a página My account em seguida My Personal Information
    E altera os dados dos campos: Last name e Email
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
    Então as alterações devem ser salvas com sucesso.