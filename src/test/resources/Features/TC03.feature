#language:pt

Funcionalidade: Adicionar item em carrinho

  Eu, como usuário, gostaria de acessar o sistema e adicionar um produto no carrinho e finalizar a compra

  Contexto:
    Dado que o usuário acessa o sistema com "marcia@test.com" e "123456"
    E o usuario navega até a página inicial

    @addcart
  Cenário: Efetuar uma compra com cartão de crédito
    Quando o usuário busca o produto "Faded Short Sleeve T-shirts"
    E clica no primeiro item da busca
    E adiciona o produto no carrinho
    E clica no link Proceed to checkout do modal
    E clica no link Proceed to checkout
    E clica no link Proceed to checkout
    E aceita os termos de serviço
    E clica no link Proceed to checkout
    E clica no link Pay by bank wire
    E clica no link I confirm my order
    Então a mensagem de compra realizada com sucesso é exibida

