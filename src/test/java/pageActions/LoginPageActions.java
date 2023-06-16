package pageActions;
import utils.DriverFactory;

import org.openqa.selenium.support.PageFactory;
import pageElements.LoginPageElements;

public class LoginPageActions {

    LoginPageElements LoginPageElements = null;

    public LoginPageActions() {

        this.LoginPageElements = new LoginPageElements();

        PageFactory.initElements(DriverFactory.getDriver(),LoginPageElements);
    }

    public void setUserName(String strUserName) {
        LoginPageElements.usernameField.sendKeys(strUserName);
    }

    // Set password in password textbox
    public void setPassword(String strPassword) {
        LoginPageElements.passwordField.sendKeys(strPassword);
    }

    // Click on login button
    public void clickLogin() {
        LoginPageElements.submitButton.click();
    }

    public void login(String strUserName, String strPassword) {

        // Fill user name
        this.setUserName(strUserName);

        // Fill password
        this.setPassword(strPassword);

        // Click Login button
        this.clickLogin();

    }
}