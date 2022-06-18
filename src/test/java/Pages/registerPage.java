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
    private WebElement create_text;

    @FindBy(how = How.ID, using = "uniform-id_gender1")
    private WebElement gender_label;

    @FindBy(how = How.ID, using = "customer_firstname")
    private WebElement first_name_input;

    @FindBy(how = How.ID, using = "customer_lastname")
    private WebElement last_name_input;

    @FindBy(how = How.ID, using = "passwd")
    private WebElement password_input;

    @FindBy(how = How.ID, using = "days")
    private WebElement day_select;

    @FindBy(how = How.ID, using = "months")
    private WebElement month_select;

    @FindBy(how = How.ID, using = "years")
    private WebElement years_select;

    @FindBy(how = How.ID, using = "address1")
    private WebElement adress_input;

    @FindBy(how = How.ID, using = "city")
    private WebElement city_input;

    @FindBy(how = How.ID, using = "id_state")
    private WebElement state_select;

    @FindBy(how = How.ID, using = "postcode")
    private WebElement postcode_input;

    @FindBy(how = How.ID, using = "phone_mobile")
    private WebElement phone_mobile_input;

    @FindBy(how = How.ID, using = "submitAccount")
    private WebElement submit_account_btn;


    public void selectDay(String day) {
        Select comboday = new Select(day_select);
        comboday.selectByValue(String.valueOf(day));
    }
    public void selectMonth(String month) {
        Select combomonth = new Select(month_select);
        combomonth.selectByValue(String.valueOf(month));
    }
    public void selectYear(String year) {
        Select comboYear = new Select(years_select);
        comboYear.selectByValue(String.valueOf(year));
    }

    public void selectState(String state) {
        Select comboState = new Select(state_select);
        comboState.selectByValue(String.valueOf(state));
    }
    public void submitAcount(){
        submit_account_btn.click();
    }

    public void preencherCampos(DataTable table){
        List<Map<String, String>> data = table.asMaps();
        first_name_input.sendKeys(data.get(0).get("valor"));
        last_name_input.sendKeys(data.get(1).get("valor"));
        password_input.sendKeys(data.get(2).get("valor"));
        selectDay(data.get(3).get("valor"));
        selectMonth(data.get(4).get("valor"));
        selectYear(data.get(5).get("valor"));
        adress_input.sendKeys(data.get(6).get("valor"));
        city_input.sendKeys(data.get(7).get("valor"));
        selectState(data.get(8).get("valor"));
        phone_mobile_input.sendKeys(data.get(9).get("valor"));
    }
}
