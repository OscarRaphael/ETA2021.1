package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class searchPage extends basePage {

    @FindBy(how = How.XPATH, using = "//ul[contains(@class, 'product_list')]/li/div")
    private WebElement first_item;

    @FindBy (how = How.CLASS_NAME, using = "search_query form-control ac_input")
    private WebElement campoPesquisa_input;

    public void clickFirstItem(){
        first_item.click();
    }
    public void pesquisarItem(){
        campoPesquisa_input.sendKeys();
    }

}
