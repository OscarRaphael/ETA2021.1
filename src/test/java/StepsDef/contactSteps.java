package StepsDef;

import Pages.contactPage;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;

public class contactSteps {
    contactPage ContactPage = new contactPage();

    @Quando("preenche as informações necessárias")
    public void preencheAsInformaçõesNecessárias(DataTable table) throws Throwable {
        ContactPage.fillContactUs(table);
    }

    @Então("o ticket deve ser enviado com sucesso")
    public void oTicketDeveSerEnviadoComSucesso() throws Throwable {
        ContactPage.clickSend();
    }
}
