package Pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class storePage extends basePage {
    @FindBy(how = How.ID, using = "header_logo")
    private WebElement logo;

    @FindBy(how = How.CLASS_NAME, using = "login")
    private WebElement login_btn;

    @FindBy(how = How.XPATH, using = "//*[@title=\"Contact Us\"]")
    private WebElement contactUs_btn;

    @FindBy(how = How.ID, using = "search_query_top")
    private WebElement search_input;

    public void assertLogo() {
        logo.isDisplayed();
    }

    public void clickLogIn() {
        login_btn.click();
    }

    public void clickContactUs() {
        contactUs_btn.click();
    }

    public void clickLogo(){
        logo.click();
    }

    public void inputSearch(String text){
        search_input.sendKeys(text);
        search_input.sendKeys(Keys.ENTER);
    }
}
