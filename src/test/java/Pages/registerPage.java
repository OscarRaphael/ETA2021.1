package Pages;

import io.cucumber.datatable.DataTable;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.Map;

public class registerPage extends basePage {

    @FindBy(how = How.CLASS_NAME, using = "page-heading")
    private WebElement headerPage;

    @FindBy(how = How.ID, using = "id_gender1")
    private WebElement male_radio;

    @FindBy(how = How.ID, using = "id_gender2")
    private WebElement female_radio;

    @FindBy(how = How.ID, using = "customer_firstname")
    private WebElement firstName_input;

    @FindBy(how = How.ID, using = "customer_lastname")
    private WebElement secondName_input;

    @FindBy(how = How.ID, using = "email")
    private WebElement email_input;

    @FindBy(how = How.ID, using = "passwd")
    private WebElement passwd_input;

    @FindBy(how = How.ID, using = "days")
    private WebElement days_select;

    @FindBy(how = How.ID, using = "months")
    private WebElement months_select;

    @FindBy(how = How.ID, using = "years")
    private WebElement years_select;

    @FindBy(how = How.ID, using = "newsletter")
    private WebElement newsletter_checkbox;

    @FindBy(how = How.ID, using = "option")
    private WebElement option_checkbox;

    @FindBy(how = How.ID, using = "firstname")
    private WebElement addressFirstName_input;

    @FindBy(how = How.ID, using = "lastname")
    private WebElement addressLastName_input;

    @FindBy(how = How.ID, using = "address1")
    private WebElement address_input;

    @FindBy(how = How.ID, using = "city")
    private WebElement city_input;

    @FindBy(how = How.ID, using = "id_state")
    private WebElement state_input;

    @FindBy(how = How.ID, using = "postcode")
    private WebElement postcode_input;

    @FindBy(how = How.ID, using = "phone_mobile")
    private WebElement mobile_input;

    @FindBy(how = How.ID, using = "submitAccount")
    private WebElement submit_btn;

    public void verifyPage() {
        headerPage.isDisplayed();
    }

    public void selectMaleGender() {
        male_radio.click();
    }

    public void selectFemaleGender() {
        female_radio.click();
    }

    public void selectDateOfBirthDays(String test) {
        Select combo = new Select(days_select);
        combo.selectByValue(String.valueOf(test));
    }

    public void selectMonthOfBirthdays(String test) {
        Select combo = new Select(months_select);
        combo.selectByValue(String.valueOf(test));
    }

    public void selectYearOfBirthdays(String test) {
        Select combo = new Select(years_select);
        combo.selectByValue(test);
    }

    public void selectState(String test) {
        Select combo = new Select(state_input);
        combo.selectByVisibleText(test);
    }

    public void preencherCampos(DataTable table) {
        List<Map<String, String>> data = table.asMaps();
        firstName_input.sendKeys(data.get(0).get("valor"));
        secondName_input.sendKeys(data.get(1).get("valor"));
        passwd_input.sendKeys(data.get(2).get("valor"));
        selectDateOfBirthDays(data.get(3).get("valor"));
        selectMonthOfBirthdays(data.get(4).get("valor"));
        selectYearOfBirthdays(data.get(5).get("valor"));
        address_input.sendKeys(data.get(6).get("valor"));
        city_input.sendKeys(data.get(7).get("valor"));
        selectState(data.get(8).get("valor"));
        postcode_input.sendKeys(data.get(9).get("valor"));
        mobile_input.sendKeys(data.get(10).get("valor"));
    }

    public void clickSubmitAccount() {
        submit_btn.click();
    }
}
