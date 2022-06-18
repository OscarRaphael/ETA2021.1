package Pages;

import io.cucumber.datatable.DataTable;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.Map;

public class contactPage extends basePage {
    @FindBy(how = How.ID, using = "id_contact")
    private WebElement subject_select;

    @FindBy(how = How.ID, using = "email")
    private WebElement email_input;

    @FindBy(how = How.ID, using = "message")
    private WebElement message_input;

    @FindBy(how = How.ID, using = "submitMessage")
    private WebElement submitMessage_btn;

    public void selectSubject(String text) {
        Select combo = new Select(subject_select);
        combo.selectByVisibleText(text);
    }

    public void fillContactUs(DataTable table) {
        List<Map<String, String>> data = table.asMaps();
        selectSubject(data.get(0).get("valor"));
        email_input.sendKeys(data.get(1).get("valor"));
        message_input.sendKeys(data.get(2).get("valor"));
    }

    public void clickSend() {
        submitMessage_btn.click();
    }
}
