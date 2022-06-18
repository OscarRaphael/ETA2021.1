package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class authPage extends basePage {

    @FindBy(how = How.CLASS_NAME, using = "page-heading")
    private WebElement authentication_text;

    @FindBy(how = How.ID, using = "email_create")
    private WebElement email_input;

    @FindBy(how = How.ID, using = "SubmitCreate")
    private WebElement create_an_account_btn;

    public void clickCreateAccount() {
        create_an_account_btn.click();
    }
    public void inputEmail(String text) {
        email_input.sendKeys(text);
    }
    public void assertAuthentication() {
        authentication_text.isDisplayed();
    }


}
