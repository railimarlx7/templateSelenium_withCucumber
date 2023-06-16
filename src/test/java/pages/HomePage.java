package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
	private WebDriver driver;

	private By successMessage = By.cssSelector("p.has-text-align-center > strong");

	public HomePage(WebDriver driver) {
		this.driver = driver;
	}

	public String getSuccessMessage() {
		
		// Obter o texto da mensagem de sucesso
		return driver.findElement(successMessage).getText();
	}
}
