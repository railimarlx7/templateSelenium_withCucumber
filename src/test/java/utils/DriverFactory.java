package utils;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DriverFactory {
    private static WebDriver driver;

    public static WebDriver createDriver() {
        // Configurar o WebDriver usando o WebDriverManager
        WebDriverManager.chromedriver().setup();

        // Configurar as opções do Chrome
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
//        options.addArguments("--headless");
        
        // Inicializar o driver
        driver = new ChromeDriver(options);

        return driver;
    }

    public static void quitDriver() {
        // Encerrar o driver se estiver inicializado
        if (driver != null) {
            driver.quit();
        }
    }
}
