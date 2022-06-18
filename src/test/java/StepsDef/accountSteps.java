package StepsDef;

import Pages.accountPage;
import io.cucumber.java.pt.Quando;

public class accountSteps {
    accountPage AccountPage = new accountPage();

    @Quando("o usuário navega para a página My Personal Information")
    public void oUsuárioNavegaParaAPáginaMyPersonalInformation() throws Throwable {
        AccountPage.clickMyInformation();
    }
}
