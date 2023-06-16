package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	private WebDriver driver;

	private By usernameField = By.id("username");
	private By passwordField = By.id("password");
	private By submitButton = By.id("submit");

	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}

	public void enterUsername(String username) {
		
		// Localizar e preencher o campo de nome de usuário
		driver.findElement(usernameField).sendKeys(username);
	}

	public void enterPassword(String password) {
		
		// Localizar e preencher o campo de senha
		driver.findElement(passwordField).sendKeys(password);
	}

	public HomePage clickSubmitButton() {
		
		// Clicar no botão de envio
		driver.findElement(submitButton).click();

		// Retornar a página inicial após o login
		return new HomePage(driver);
	}
}