#language: pt

Funcionalidade: Buscar item inexistente

  Eu, como usuário, gostaria de pesquisar por um item através da barra de pesquisa

  Contexto:
    Dado que o usuário está na página myStore

  @iteminexistente
  Cenário: Buscar na barra da pesquisa por um nome indisponivel
    Quando o usuário busca o produto "Biscoito Treloso"
    Entao o sistema nao deve retornar produtos