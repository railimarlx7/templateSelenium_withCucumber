package pages;

import org.openqa.selenium.WebDriver;

import pageActions.LoginPageActions;
import utils.ConfigReader;

public class LoginPage {
    private LoginPageActions loginPageActions;

    public LoginPage(WebDriver driver) {
        // Inicializar a classe LoginPageActions passando o driver como argumento
        this.loginPageActions = new LoginPageActions(driver);
    }

    public void login() {
        // Chamar os métodos da classe LoginPageActions para realizar o login
        // Obtém o nome de usuário do arquivo de configuração usando o ConfigReader
        loginPageActions.setUserName(ConfigReader.getUsername());
        // Obtém a senha do arquivo de configuração usando o ConfigReader
        loginPageActions.setPassword(ConfigReader.getPassword());
        // Clica no botão de envio para fazer login
        loginPageActions.clickSubmitButton();
    }
}
