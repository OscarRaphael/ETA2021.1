package StepsDef;

import Pages.authPage;
import Pages.recoverPage;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;

public class recoverSteps {
    recoverPage RecoverPasswdPage = new recoverPage();
    authPage AuthPage = new authPage();

    @Quando("acessa o menu Esqueci minha senha")
    public void acessaOMenuEsqueciMinhaSenha() {
       AuthPage.clickForgotPasswd();
    }
    @Quando("adiciona credenciais válidas para receber email")
    public void adicionaCredenciaisVálidasParaReceberEmail(String email) {
        RecoverPasswdPage.inputEmail(email);
        RecoverPasswdPage.clickRetrievePasswd();
    }
    @Então("uma mensagem de confirmação de email deve aparecer.")
    public void umaMensagemDeConfirmaçãoDeEmailDeveAparecer() {
        RecoverPasswdPage.assertPage();

    }
}
