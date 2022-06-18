package StepsDef;

import Pages.informationPage;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Então;

public class informationSteps {
    informationPage InformationPage = new informationPage();

    @E("altera os dados dos campos: First name e Last name")
    public void alteraOsDadosDosCamposFirstNameELastName(DataTable dataTable) {
        InformationPage.fillFirstNameELastName(dataTable);
    }

    @Então("as alterações devem ser salvas com sucesso")
    public void asAlteraçõesDevemSerSalvasComSucesso() {
        InformationPage.clickSaveButton();
    }
}
