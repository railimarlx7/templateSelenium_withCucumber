package stepdefinitions;

import io.cucumber.java.pt.Entao;
import utils.DriverFactory;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Quando;
import org.junit.jupiter.api.Assertions;
import pageActions.HomePageActions;
import pageActions.LoginPageActions;

public class LoginPageDefinitions {

    LoginPageActions objLogin = new LoginPageActions();
    HomePageActions objHomePage = new HomePageActions();

    @Dado("User is on HRMLogin page")
    public void userIsOnHrmLoginPage() {
        DriverFactory.setUpDriver(); // Inicializa o driver
        DriverFactory.openPage(); // Abre a página no navegador
    }

    @Quando("User enters username as {string} and password as {string}")
    public void userEntersUsernameAndPassword(String username, String password) {
        // Efetua o login na aplicação
        objLogin.login(username, password);
        // Vai para a próxima página
    }

    @Entao("User should be able to login sucessfully and new page open")
    public void userShouldBeAbleToLoginSuccessfullyAndNewPageOpen() {
        // Verifica a página inicial
        Assertions.assertTrue(objHomePage.getHomePageText().contains("Employee Information"));
        DriverFactory.tearDown(); // Encerra o driver e a instância da classe DriverFactory
    }
}
