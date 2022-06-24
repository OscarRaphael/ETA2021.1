#language:pt

Funcionalidade: Calcular valor total da compra

  Eu, como usuário, gostaria de adicionar e remover itens no carrinho e verificar se o valor está sendo calculado
  corretamente.

  Contexto:
    Dado que o usuário está na página myStore

  @calcularvalor
  Cenário: Remover um item do carrinho e recalcular o valor total
    Quando o usuário adiciona 3 produtos no carrinho
    E acessa o carrinho
    E remove o primeiro item da lista
    Então o valor valor total é recalculado corretamente
