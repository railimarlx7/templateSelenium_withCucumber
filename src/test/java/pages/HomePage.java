package pages;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.openqa.selenium.WebDriver;

import pageActions.HomePageActions;

public class HomePage {

	private HomePageActions homePageActions;

	public HomePage(WebDriver driver) {
		// Inicializar a classe HomePageActions passando o driver como argumento
		this.homePageActions = new HomePageActions(driver);
	}

	public void validSuccessMessage() {
		// Verificar a mensagem de sucesso na página inicial
		String successMessage = homePageActions.getSuccessMessage();
		assertEquals("Congratulations student. You successfully logged in!", successMessage,
				"Incorrect success message");
	}
}
