package pageActions;
import utils.DriverFactory;

import org.openqa.selenium.support.PageFactory;
import pageElements.HomePageElements;

public class HomePageActions {
    HomePageElements homePageElements = null;

    public HomePageActions() {

        this.homePageElements = new HomePageElements();

        PageFactory.initElements(DriverFactory.getDriver(),homePageElements);
    }

      public String getHomePageText() {
        return homePageElements.successMessage.getText();
    }

}
