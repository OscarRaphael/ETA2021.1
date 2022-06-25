package StepsDef;

import Pages.searchPage;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Entao;

public class searchSteps {
    searchPage SearchPage = new searchPage();

    @E("clica no primeiro item da busca")
    public void e_clica_primeiro_item() {
        SearchPage.clickFirstItem();
    }

    @Entao("o sistema nao deve retornar produtos")
    public void oSistemaNaoDeveRetornarProdutos() {
        SearchPage.mensagemErro();
    }
}
