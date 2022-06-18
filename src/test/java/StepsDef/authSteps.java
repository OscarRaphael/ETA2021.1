package StepsDef;

import Pages.authPage;
import Pages.storePage;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Quando;

public class authSteps {
    authPage AuthPage = new authPage();
    storePage StorePage = new storePage();

    @Dado("que o usuário acessa o sistema com {string} e {string}")
    public void queOUsuárioAcessaOSistemaComE(String email, String passwd) {
        StorePage.assertLogo();
        StorePage.clickLogIn();
        AuthPage.inputEmail(email);
        AuthPage.inputPasswd(passwd);
        AuthPage.clickSubmitLogin();
    }

    @Quando("insere um email valido ao criar uma conta")
    public void insereUmEmailValidoAoCriarUmaConta() {
        AuthPage.assertPage();
        AuthPage.inputCreateRandomEmail();
        AuthPage.clickCreate();
    }
}
