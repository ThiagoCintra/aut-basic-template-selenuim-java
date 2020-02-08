package basic.template.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import basic.template.utils.Helper;

public class BasePage {

	public BasePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(name = "email")
	private WebElement elemento;

	public void sendMsgElemento(String txt) {
		Helper.elemento_existe(elemento, 10);
		elemento.sendKeys(txt);
	}

}
