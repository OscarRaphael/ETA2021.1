#language:pt

Funcionalidade: Cancelar uma Compra

  Eu, como usuário, gostaria de cancelar uma compra.

  Contexto:
    Dado que o usuário está logado na página myStore

  Cenário: Alterar dados do usuário com sucesso.
    Quando o usuário seleciona o produto "Faded Short Sleeve T-shirts"
    E adiciona ao carrinho em seguida segue para checkout
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
    Então deve clicar no botão "delete" e em seguida clicar em voltar ao menu principal.