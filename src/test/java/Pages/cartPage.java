package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class cartPage extends basePage {

    @FindBy(how = How.XPATH, using = "//ul[contains(@class, 'product_list')]/li/div")
    private WebElement first_item;

    @FindBy(how = How.XPATH, using = "//p[@class='cart_navigation clearfix']/*/span[text()[contains(., 'Proceed to checkout')]]")
    private WebElement checkout_link;

    @FindBy(how = How.ID, using = "cgv")
    private WebElement terms_checkbox;

    @FindBy(how = How.XPATH, using = "//a[@class='bankwire']")
    private WebElement bankwire_link;

    @FindBy(how = How.XPATH, using = "//a[@class='cheque']")
    private WebElement cheque_link;

    @FindBy(how = How.XPATH, using = "//button/span[text()[contains(., 'I confirm my order')]]")
    private WebElement confirm_order_link;

    @FindBy(how = How.XPATH, using = "//*[text()='Your order on My Store is complete.']")
    private WebElement success_message;

    public void clickFirstItem(){
        first_item.click();
    }

    public void clickCheckout() {
        checkout_link.click();
    }

    public void checkTerms() {
        terms_checkbox.click();
    }

    public void clickPayByBankwire() {
        bankwire_link.click();
    }

    public void clickPayByCheck() {
        cheque_link.click();
    }

    public void clickConfirmOrder() {
        confirm_order_link.click();
    }

    public void successMessageIsDisplayed() {
        success_message.isDisplayed();
    }

}
