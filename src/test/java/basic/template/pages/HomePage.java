package basic.template.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import basic.template.utils.Helper;

public class HomePage {

	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(name = "q")
	private WebElement inputPesquisa;
	
	@FindBy(name= "btnK")
	private WebElement btnPesquisar;

	@FindBy(name= "btnI")
	private WebElement btnEstouComSorte;
	
	public void sendMsgElemento(String txt) {
		Helper.elemento_existe(inputPesquisa, 10);
		inputPesquisa.sendKeys(txt);
	}

	public void clickBtnPesquisar() {
		Helper.elemento_existe(btnPesquisar, 10);
		btnPesquisar.click();
	}
	
	public String valid_page() {
		Helper.elemento_existe(btnEstouComSorte, 10);
		return btnEstouComSorte.getText();
	}
}
