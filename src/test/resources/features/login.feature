#language:pt
Funcionalidade: Login

  Contexto:
    Dado que a modal esteja sendo exibida

  @fechaModal
  Cenario: Fechar a modal ao clicar fora da mesma
    Quando for realizado um clique fora da modal
    Entao a janela modal deve ser fechada

  @fecharModalicone
  Cenario: Fechar a modal ao clicar no icone fechar
    Quando for realizado um clique no icone de fechar da modal
    Entao a janela modal deve ser fechada

  @CreateNewAccount
  Cenario:Link Creat New Account
    Quando for realizado um clique no link Creat New Account
    Entao a pagina Creat Account deve ser exibida

  @loginComSucesso
  Esquema do Cenario: Realizar login com <identificacao>
    Quando os campos de login sejam preenchidos da seguinte forma
      | usuario  | <usuario>  |
      | senha    | <senha>    |
      | remember | <remember> |
    Quando for realizado o clique no botao sign in
    Entao deve ser possivel logar no sistema
    Exemplos:
      | identificacao       | usuario | senha     | remember |
      | campos obrigatorios | eledir  | Eledir123 | false    |
      | todos os campos     | eledir  | Eledir123 | true   |

@loginComErro
  Esquema do Cenario: Realizar login com <identificacao>
    Quando os campos de login sejam preenchidos da seguinte forma
      | usuario  | <usuario>  |
      | senha    | <senha>    |
      | remember | <remember> |
    Quando for realizado o clique no botao sign in
    Entao os sistema devera exibir uma mensagem de erro
    Exemplos:
      | identificacao    | usuario  | senha     | remember |
      | usuario invalido | invalido | Eledir123 | false    |
      | senha invalida   | eledir   | invalida  | false    |

  @dadosEmBranco
  Esquema do Cenario: Realizar login com <identificacao>
    Quando os campos de login sejam preenchidos da seguinte forma
      | usuario  | <usuario>  |
      | senha    | <senha>    |
      | remember | <remember> |
    Entao o botao sign in deve permanecer desabilitado
    Exemplos:
      | identificacao     | usuario | senha | remember |
      | usuario em branco |         | senha | false    |
      | senha em branco   | usuario |       | false    |

