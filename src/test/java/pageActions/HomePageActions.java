package pageActions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import pageElements.HomePageElements;

public class HomePageActions extends HomePageElements {

	public HomePageActions(WebDriver driver) {
		// Inicializar os elementos da página usando o PageFactory
		PageFactory.initElements(driver, this);
	}

	public String getSuccessMessage() {
		// Obter o texto da mensagem de sucesso
		return successMessage.getText();
	}
}
