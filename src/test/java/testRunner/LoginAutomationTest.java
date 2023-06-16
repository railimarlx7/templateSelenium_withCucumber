package testRunner;

import utils.DriverFactory;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import pages.HomePage;
import pages.LoginPage;
import utils.ConfigReader;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LoginAutomationTest {

    private static WebDriver driver;
    private static String url;
    private static String username;
    private static String password;

//    @BeforeAll
    static void setup() {
        // Obter as informações do arquivo de configuração
        url = ConfigReader.getUrl();
        username = ConfigReader.getUsername();
        password = ConfigReader.getPassword();

        // Configurar e inicializar o driver
        driver = DriverFactory.getDriver();

        // Navegar para a URL
        driver.get(url);
    }

//    @AfterAll
    static void tearDown() {
        // Encerrar o driver
        DriverFactory.tearDown();
    }

//    @Test
    public void testLogin() {
        // Instanciar a página de login
        LoginPage loginPage = new LoginPage(driver);

        // Preencher os campos de login e senha
        loginPage.enterUsername(username);
        loginPage.enterPassword(password);

        // Clicar no botão de login e redirecionar para a página inicial
        HomePage homePage = loginPage.clickSubmitButton();

        // Obter a mensagem de sucesso
        String successMessage = homePage.getSuccessMessage();

        // Verificar se a mensagem de sucesso é exibida corretamente
        assertEquals("Congratulations student. You successfully logged in!", successMessage,
                "Mensagem de sucesso incorreta");
    }

}
