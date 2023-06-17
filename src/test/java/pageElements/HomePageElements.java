package pageElements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePageElements {

	//Mapea os ementos da Home Page	
	@FindBy(css = "p.has-text-align-center > strong")
	protected WebElement successMessage;

}