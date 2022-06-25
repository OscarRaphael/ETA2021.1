package StepsDef;

import Pages.authPage;
import Pages.passwdPage;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;

public class passwdSteps {
    passwdPage PasswdPage = new passwdPage();

    @Quando("adiciona o email {string} para receber email")
    public void adicionaOEmailParaReceberEmail(String email) {
        PasswdPage.inputEmail(email);
        PasswdPage.clickRetrievePasswd();
    }

    @Então("uma mensagem de confirmacao de email deve aparecer")
    public void umaMensagemDeConfirmacaoDeEmailDeveAparecer() {
        PasswdPage.assertPage();

    }
}
