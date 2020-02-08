# language: pt

Funcionalidade: Login

	@teste
	Cenário: Realizar login com sucesso
		Dado que eu esteja na tela de login
		Quando faço login com o usuário "" e senha ""
		Então sou autenticado com sucesso
				