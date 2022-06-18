package Pages;

import io.cucumber.datatable.DataTable;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.List;
import java.util.Map;

public class informationPage extends basePage {
    @FindBy(how = How.ID, using = "firstname")
    private WebElement firstname_input;

    @FindBy(how = How.ID, using = "lastname")
    private WebElement lastname_input;

    @FindBy(how = How.ID, using = "old_passwd")
    private WebElement old_passwd_input;

    @FindBy(how = How.NAME, using = "submitIdentity")
    private WebElement submitIdentity_btn;

    public void fillFirstNameELastName(DataTable table) {
        List<Map<String, String>> data = table.asMaps();
        firstname_input.click();
        firstname_input.clear();
        firstname_input.sendKeys(data.get(0).get("value"));
        lastname_input.click();
        lastname_input.clear();
        lastname_input.sendKeys(data.get(1).get("value"));
        old_passwd_input.sendKeys(data.get(2).get("value"));
    }

    public void clickSaveButton() {
        submitIdentity_btn.click();
    }
}
