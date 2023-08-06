package stepdefinitions;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import pages.HomePage;
import pages.LoginPage;
import utils.ConfigReader;
import utils.DriverFactory;
import utils.ScreenRecorderUtil;

public class LoginStepDefinitions {

    private WebDriver driver;
    private String url;
    private LoginPage loginPage;
    private HomePage homePage;

    @Before
    public void setup() throws Exception {
        // Configuração inicial - Criação do driver e definição da URL
        driver = DriverFactory.createDriver();
        url = ConfigReader.getUrl();
        driver.get(url);
        // Inicia a gravação do video
//        ScreenRecorderUtil.startRecording("Star");
    }

    @Dado("que estou logado no sistema")
    public void queEstouLogadoNosistema() {
        // Etapa de execução do teste - Realizar o login
        loginPage = new LoginPage(driver);
        loginPage.login();
        // Após o login, inicializar a página inicial
        homePage = new HomePage(driver);
    }

    @Entao("valido que estou na Home Page")
    public void validoQueEstouNaHomePage() {
        // Verificação - Validar a mensagem de sucesso na página inicial
        homePage.validSuccessMessage();
    }
    
    @After
    public void tearDown() throws Exception {
    	// Finaliza a gravação do video
//    	ScreenRecorderUtil.stopRecording();
        // Encerramento do driver após a execução do teste
        DriverFactory.quitDriver();
    }
}
