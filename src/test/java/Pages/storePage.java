package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class storePage extends basePage {
    @FindBy(how = How.ID, using = "header_logo")
    private WebElement logo;

    @FindBy(how = How.CLASS_NAME, using = "login")
    private WebElement login_btn;

    public void assertLogo() {
        logo.isDisplayed();
    }

    public void clickLogIn() {
        login_btn.click();
    }
}
