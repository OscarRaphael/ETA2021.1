package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class searchPage extends basePage {

    @FindBy(how = How.XPATH, using = "//ul[contains(@class, 'product_list')]/li/div")
    private WebElement first_item;

    @FindBy(how = How.CSS, using = ".alert.alert-warning")
    private WebElement alertMessage_txt;

    public void clickFirstItem() {
        first_item.click();
    }

    public void mensagemErro() {
        alertMessage_txt.isDisplayed();
    }
}
