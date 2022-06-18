#language:pt

Funcionalidade: Adicionar item em carrinho

  Eu, como usuário, gostaria de acessar o sistema e adicionar um produto no carrinho

  Contexto:
    Dado que o usuário está na página myStore
    E o usuário navega para a página de autenticação
    E realiza logon com o usuário
      | user                  | pass   |
      | marciathata@gmail.com | 123456 |

  Cenário: Adicionar um produto no carrinho
  Quando
  Então