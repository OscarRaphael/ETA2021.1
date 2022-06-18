package Pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.Random;

public class authPage extends basePage {

    final String randomEmail = randomEmail();

    @FindBy(how = How.CLASS_NAME, using = "page-heading")
    private WebElement authentication_text;

    @FindBy(how = How.ID, using = "email")
    private WebElement email_input;

    @FindBy(how = How.ID, using = "create_email")
    private WebElement createEmail_input;

    @FindBy(how = How.ID, using = "passwd")
    private WebElement passwd_input;

    @FindBy(how = How.ID, using = "SubmitLogin")
    private WebElement submitLogin_btn;

    @FindBy(how = How.ID, using = "SubmitCreate")
    private WebElement create_btn;

    public void inputEmail(String text) {
        email_input.click();
        email_input.sendKeys(text);
        email_input.sendKeys(Keys.TAB);
    }

    public void inputCreateRandomEmail() {
        createEmail_input.click();
        createEmail_input.sendKeys(randomEmail);
        createEmail_input.sendKeys(Keys.TAB);
    }

    public void inputPasswd(String text) {
        passwd_input.click();
        passwd_input.sendKeys(text);
        passwd_input.sendKeys(Keys.TAB);
    }

    public void clickSubmitLogin() {
        submitLogin_btn.click();
    }

    public void clickCreate() {
        create_btn.click();
    }

    private static String randomEmail() {
        Random randomGenerator = new Random();
        int randomInt = randomGenerator.nextInt(1000);
        return "testing_email_" + randomInt + "@example.com";
    }

}
