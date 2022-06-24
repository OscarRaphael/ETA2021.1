#language:pt

Funcionalidade: Adicionar item em carrinho e remover

  Eu, como usuário, gostaria de acessar o sistema, adicionar um produto no carrinho e depois removê-lo

  Contexto:
    Dado que o usuário está na página myStore

  @adicionarremover
  Cenário: Adicionar item no carrinho e remover em seguida
    Quando o usuário busca o produto "Faded Short Sleeve T-shirts"
    E clica no primeiro item da busca
    E adiciona o produto no carrinho
    E clica no link Proceed to checkout do modal
    E remove o primeiro item da lista
    Então é exibida a mensagem de que o carrinho está vazio


