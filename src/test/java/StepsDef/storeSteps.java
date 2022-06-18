package StepsDef;

import Pages.storePage;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Quando;

public class storeSteps {
    storePage StorePage = new storePage();

    @Dado("que o usuário está na página myStore")
    public void que_o_usuário_está_na_página_my_store() throws Throwable {
        StorePage.assertLogo();
    }

    @Quando("o usuário navega para a página de autenticação")
    public void o_usuário_navega_para_a_página_de_autenticação() throws Throwable {
        StorePage.clickLogIn();
    }

}
