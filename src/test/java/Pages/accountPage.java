package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class accountPage extends basePage {

    @FindBy(how = How.CLASS_NAME, using = "page-heading")
    private WebElement my_account_text;

    @FindBy(how = How.XPATH, using = "//*[@title=\"Orders\"]")
    private WebElement orders_btn;

    @FindBy(how = How.XPATH, using = "//*[@title=\"Information\"]")
    private WebElement info_btn;

    public void clickMyInformation() {
        info_btn.click();
    }
    public void assertMyAccountPage() {
        my_account_text.isDisplayed();
    }
}
