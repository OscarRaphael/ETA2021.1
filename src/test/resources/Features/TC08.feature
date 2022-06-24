#language:pt

Funcionalidade: Esqueci minha senha.

  Eu, como usuário, gostaria utilizar a função esqueci minha senha.

  Contexto:
    Dado que o usuário está na página myStore

  @recuperarSenha
  Cenário: Usar a função esqueci minha senha.
    Quando o usuário navega para a página de autenticação
    E acessa o menu Esqueci minha senha
    E adiciona credenciais válidas para receber email
    Então uma mensagem de confirmação de email deve aparecer.