package StepsDef;

import Pages.searchPage;
import io.cucumber.java.pt.E;

public class searchSteps {
    searchPage SearchPage = new searchPage();

    @E("clica no primeiro item da busca")
    public void e_clica_primeiro_item() {
        SearchPage.clickFirstItem();
    }


}
