package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class passwdPage extends basePage {

    @FindBy(how = How.ID, using = "email")
    private WebElement email_input;

    @FindBy(how = How.XPATH, using = "//button[@type=\"submit\" and @class=\"btn btn-default button button-medium\"]")
    private WebElement retrievePasswd_btn;

    @FindBy(how = How.CSS, using = ".alert.alert-success")
    private WebElement confirmation_txt;

    public void assertPage() {
        confirmation_txt.isDisplayed();
    }

    public void clickRetrievePasswd() {
        retrievePasswd_btn.click();
    }

    public void inputEmail(String email) {
        email_input.sendKeys(email);
    }
}
