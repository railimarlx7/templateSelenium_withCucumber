package utils;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class DriverFactory {
    private static DriverFactory driverFactory;

    private static WebDriver driver;
    private static WebDriverWait wait;
    public final static int TIMEOUT = 10;

    private DriverFactory() {
//        WebDriverManager.chromedriver().browserVersion("111.0.5563.19").setup();
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        options.setHeadless(false);

        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, Duration.ofSeconds(TIMEOUT));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(TIMEOUT));
        driver.manage().window().maximize();

    }

    public static void openPage() {
        driver.get("https://google.com");
    }

    public static WebDriver getDriver() {
        return driver;

    }

    public static void setUpDriver() {

        if (driverFactory==null) {

            driverFactory = new DriverFactory();
        }
    }

    public static void tearDown() {

        if(driver!=null) {
            driver.close();
            driver.quit();
        }

        driverFactory = null;

    }
}