package basic.template.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import basic.template.utils.Helper;

public class ResultadoPesquisaPage {

	public ResultadoPesquisaPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id = "resultStats")
	private WebElement inputPesquisa;
	
	public Boolean validResult() {
		return inputPesquisa.getText().contains("Aproximadamente");
		
	}
}
