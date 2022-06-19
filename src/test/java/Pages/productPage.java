package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class productPage extends basePage {

    @FindBy(how = How.XPATH, using = "//p[@id = 'add_to_cart']/button")
    private WebElement add_cart_btn;

    @FindBy(how = How.XPATH, using = "//div[@class='button-container']/a")
    private WebElement proceed_checkout_link_modal;

    public void clickAddToCart() {
        add_cart_btn.click();
    }

    public void clickProceedCheckoutModal() {
        proceed_checkout_link_modal.click();
    }
}
