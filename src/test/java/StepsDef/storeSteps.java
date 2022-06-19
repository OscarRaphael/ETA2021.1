package StepsDef;

import Pages.storePage;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.E;
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

    @Quando("o usuário acessa o contate-nos")
    public void oUsuárioAcessaOContateNos() throws Throwable {
        StorePage.clickContactUs();
    }

    @E("o usuario navega até a página inicial")
    public void o_usuario_navega_ate_a_pagina_inicial(){
        StorePage.clickLogo();
    }

    @Quando("o usuário busca o produto {string}")
    public void o_usuario_busca_o_produto(String produto){
        StorePage.inputSearch(produto);
    }
}
