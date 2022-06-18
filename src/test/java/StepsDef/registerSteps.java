package StepsDef;

import Pages.authPage;
import Pages.registerPage;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.pt.Quando;

public class registerSteps {
    registerPage RegisterPage = new registerPage();

    @Quando("adiciona credenciais válidas para cadastrar um usuário")
    public void adicionaCredenciaisVálidasParaCadastrarUmUsuário(DataTable table) {
        RegisterPage.preencherCampos(table);
        RegisterPage.submitAcount();
    }

}

