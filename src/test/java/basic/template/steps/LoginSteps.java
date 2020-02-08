package basic.template.steps;

import org.junit.Assert;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;
import basic.template.pages.BasePage;
import basic.template.setup.Hooks;

public class LoginSteps {

	private BasePage basePage = new BasePage(Hooks.getDriver());

	@Dado("que eu esteja na tela de login")
	public void que_eu_deseje_logar_no_sistema() throws InterruptedException {

		basePage.sendMsgElemento("msg");

	}

	@Quando("faço login com o usuário {string} e senha {string}")
	public void faco_login_com_o_usuário_e_senha(String user, String pass) {

	}

	@Então("sou autenticado com sucesso")
	public void sou_autenticado_com_sucesso() throws InterruptedException {

		Assert.assertEquals("Login não realizado com sucesso!.", "validar pagina");
	}

	@Então("é apresentado a mensagem {string}")
	public void é_apresentado_a_mensagem(String mensagem) {
	}

}
