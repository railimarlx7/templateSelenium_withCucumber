package pageElements;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePageElements {
    private WebDriver driver;
    @FindBy(css = "p.has-text-align-center > strong")
    public WebElement successMessage;

}