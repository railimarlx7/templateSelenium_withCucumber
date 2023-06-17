package pageElements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPageElements {

	
	//Mapea os ementos da Login Page
	@FindBy(id = "username")
	protected WebElement usernameField;

	@FindBy(id = "password")
	protected WebElement passwordField;

	@FindBy(id = "submit")
	protected WebElement submitButton;

}
