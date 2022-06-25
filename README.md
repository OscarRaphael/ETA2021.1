# ETA2021.1

Este documento se refere aos casos de testes automatizados executados no nosso projeto da disciplina de Testes de Sistemas.
o nosso grupo é formado por Lucas Neves, Márcia Beserra e Oscar Raphael.

obs. existem 2 maneiras de executar os casos de test através do nosso Runner, colocando a tag do cenário no campo tag ou 
deixando o campo tag vazio para executar todos em sequencia.


TC - 01 - Registrar 1 usuario.
Este cenário deve acessar a pagina e cadastrar um novo usuário com sucesso.

TC - 02 - Alteração de dados do usuário;
Este cenário deve logar com um usuário cadastrado e alterar os dados desta conta.

TC - 03.01 - Logar,adicionar 1 item ao carrinho e finalizar a compra utilizando o método de pagamento Cheque.
Este cenário deve logar com um usuario cadastrado, enviar um item para o carrinho e finalizar a compra com o método
de pagamento cheque. 

TC - 03.02 - Logar,adicionar 1 item ao carrinho e finalizar a compra utilizando o método de pagamento Cartão de Crédito.
Este cenário deve logar com um usuario cadastrado, enviar um item para o carrinho e finalizar a compra com o método
de pagamento cartão de crédito. 

TC - 04 - Logar, adicionar 1 item ao carrinho e cancelar a compra
Este cenário deve logar com um usuario cadastrado e enviar um item para o carrinho, em seguida cancelar através da Lixeira.

TC - 05 - Logar, adicionar 3 itens e remover 1 deles.
Este cenário deve logar com um usuario cadastrado e enviar 3 itens para o carrinho, em seguida remover um deles
e validar que o valor do item foi removido do carrinho.

TC - 06 - Buscar um item indisponivel na barra de pesquisa.
Este cenário deve pesquisar por um item indisponivel na barra de pesquisa do menu principal e apresentar a mensagem de item
indisponivel.

TC - 07 - Logar e utilizar a opção Contact US.
este cenário deve transferir o usuario para a pagina do contact us do site.

TC - 08 - Enviar uma solitação de alteração de senha
Este cenário deve realizar o envio de uma solicitação de troca de senha com sucesso.
