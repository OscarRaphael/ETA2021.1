package Pages;

import Utils.Hooks;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

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

    @FindBy(how = How.ID, using = "cart_summary")
    private WebElement cart_summary;

    @FindBy(how = How.XPATH, using = "//p[text()='Your shopping cart is empty.']")
    private WebElement empty_cart_message;

    @FindBy(how = How.ID, using = "total_price")
    private WebElement total_price;

    @FindBy(how = How.ID, using = "total_shipping")
    private WebElement total_shipping;

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

    public void removeItem(Integer index){
        List<WebElement> elements = cart_summary.findElements(By.className("cart_quantity_delete"));
        elements.get(index).click();

        // aguarda o elemento sumir
        new WebDriverWait(Hooks.getDriver(), Duration.ofSeconds(10)).until(ExpectedConditions.invisibilityOf(elements.get(index)));
    }

    public void emptyCartMessageIsDisplayed(){
        empty_cart_message.isDisplayed();
    }

    public void evaluateTotal() {
        // Valor final
        String totalStr = total_price.getText().substring(1);
        float total = Float.parseFloat(totalStr);

        // Valor do frete
        String totalShippingStr = total_shipping.getText().substring(1);
        float totalShipping = Float.parseFloat(totalShippingStr);

        // Colunas com o preço de cada item
        List<WebElement> precos = Hooks.getDriver().findElements(By.xpath("//td[@class='cart_total']/span[@class='price']"));

        // Somatório das colunas + o frete
        float somatorio = totalShipping;
        for(WebElement preco : precos) {
            String precoStr = preco.getText().substring(1);
            somatorio += Float.parseFloat(precoStr);
        }

        // valida
        Assert.assertTrue(total == somatorio);
    }
}
