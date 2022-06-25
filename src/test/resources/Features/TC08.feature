#language:pt

Funcionalidade: Esqueci minha senha

  Eu, como usuario, gostaria utilizar a funcao esqueci minha senha

  Contexto:
    Dado que o usuário está na página myStore

  @recuperarSenha
  Cenário: Usar a funcao esqueci minha senha
    Quando o usuário navega para a página de autenticação
    E acessa o menu Esqueci minha senha
    E adiciona o email "testes@testes1.com" para receber email
    Então uma mensagem de confirmacao de email deve aparecer