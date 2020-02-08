package basic.template.steps;

import org.junit.Assert;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;
import basic.template.pages.HomePage;
import basic.template.pages.ResultadoPesquisaPage;
import basic.template.setup.Hooks;

public class BaseSteps {

	private HomePage basePage = new HomePage(Hooks.getDriver());
	private ResultadoPesquisaPage resultadoPesquisaPage = new ResultadoPesquisaPage(Hooks.getDriver());
	
	@Dado("que eu esteja na tela de pesquisa")
	public void que_eu_deseje_logar_no_sistema() throws InterruptedException {
		basePage.valid_page();
	}

	@Quando("realizo pesquisa sobre msg")
	public void faco_login_com_o_usuário_e_senha() {
		basePage.sendMsgElemento("msg");
		basePage.clickBtnPesquisar();
	}

	@Então("sou direcionado para pagina de resultados")
	public void sou_autenticado_com_sucesso() throws InterruptedException {

		Assert.assertTrue("Aproximadamente", resultadoPesquisaPage.validResult());
	}


}
