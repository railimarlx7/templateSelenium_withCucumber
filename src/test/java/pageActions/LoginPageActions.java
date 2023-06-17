package pageActions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import pageElements.LoginPageElements;

public class LoginPageActions extends LoginPageElements {
    // Inicializa os elementos da página usando o PageFactory
    public LoginPageActions(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    // Digita o usuário no campo de nome de usuário
    public void setUserName(String username) {
        usernameField.sendKeys(username);
    }

    // Digita a senha no campo de senha
    public void setPassword(String password) {
        passwordField.sendKeys(password);
    }

    // Clica no botão de envio
    public void clickSubmitButton() {
        submitButton.click();
    }
}
