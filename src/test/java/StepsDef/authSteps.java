package StepsDef;

import Pages.authPage;
import io.cucumber.java.pt.Quando;

public class authSteps {
    authPage AuthPage = new authPage();

    @Quando("insere um email valido {string} ao criar uma conta")
    public void insereUmEmailValidoAoCriarUmaConta(String text) {
        AuthPage.assertAuthentication();
        AuthPage.inputEmail(text);
        AuthPage.clickCreateAccount();
    }


}



