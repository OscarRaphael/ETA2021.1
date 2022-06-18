package Pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class authPage extends basePage {
    @FindBy(how = How.CLASS_NAME, using = "page-heading")
    private WebElement authentication_text;
  
    @FindBy(how = How.ID, using = "email")
    private WebElement email_input;

    @FindBy(how = How.ID, using = "passwd")
    private WebElement passwd_input;

    @FindBy(how = How.ID, using = "SubmitLogin")
    private WebElement submitLogin_btn;

    public void inputEmail(String text) {
        email_input.click();
        email_input.sendKeys(text);
        email_input.sendKeys(Keys.TAB);
    }

    public void inputPasswd(String text) {
        passwd_input.click();
        passwd_input.sendKeys(text);
        passwd_input.sendKeys(Keys.TAB);
    }

    public void clickSubmitLogin() {
        submitLogin_btn.click();
    }
}
