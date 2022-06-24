#language:pt

Funcionalidade: Realizar a compra de um item

  Eu, como usuário, gostaria de acessar o sistema, adicionar um produto no carrinho e finalizar a compra

  Contexto:
    Dado que o usuário acessa o sistema com "marcia@test.com" e "123456"
    E o usuario navega até a página inicial

  @realizarcompra @credito
  Cenário: Efetuar uma compra com cartão de crédito
    Quando o usuário busca o produto "Faded Short Sleeve T-shirts"
    E clica no primeiro item da busca
    E adiciona o produto no carrinho
    E clica no link Proceed to checkout do modal
    E avança até a tela de pagamento
    E clica no link Pay by bank wire
    E clica no link I confirm my order
    Então a mensagem de compra realizada com sucesso é exibida

  @realizarcompra @cheque
  Cenário: Efetuar uma compra com cheque
    Quando o usuário busca o produto "Faded Short Sleeve T-shirts"
    E clica no primeiro item da busca
    E adiciona o produto no carrinho
    E clica no link Proceed to checkout do modal
    E avança até a tela de pagamento
    E clica no link Pay by check
    E clica no link I confirm my order
    Então a mensagem de compra realizada com sucesso é exibida

