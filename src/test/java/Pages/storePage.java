package Pages;

import Utils.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class storePage extends basePage {
    @FindBy(how = How.ID, using = "header_logo")
    private WebElement logo;

    @FindBy(how = How.CLASS_NAME, using = "login")
    private WebElement login_btn;

    @FindBy(how = How.XPATH, using = "//*[@title=\"Contact Us\"]")
    private WebElement contactUs_btn;

    @FindBy(how = How.ID, using = "search_query_top")
    private WebElement search_input;

    @FindBy(how = How.ID, using = "homefeatured")
    private WebElement homefeatured;

    @FindBy(how = How.XPATH, using = "//span[text()[contains(., 'Continue shopping')]]")
    private WebElement continue_btn;

    @FindBy(how = How.XPATH, using = "//a[@title='View my shopping cart']")
    private WebElement cart_link;

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

    public void addItemHomefeatured(Integer index) {
        Actions builder = new Actions(Hooks.getDriver());

        List<WebElement> products = homefeatured.findElements(By.tagName("li"));

        builder.moveToElement(products.get(index)).perform();
        products.get(index).findElement(By.xpath("//a[@data-id-product='" + (index+1) + "']")).click();

        WebDriverWait wait = new WebDriverWait(Hooks.getDriver(), Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(continue_btn));

        continue_btn.click();
    }

    public void clickCartLink(){
        cart_link.click();
    }

}
