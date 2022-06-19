package StepsDef;

import Pages.cartPage;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Então;

public class cartSteps {
    cartPage CartPage = new cartPage();

    @E("clica no link Proceed to checkout")
    public void e_clica_no_botao_proceed_to_checkout(){
        CartPage.clickCheckout();
    }

    @E("avança até a tela de pagamento")
    public void e_avanca_ate_a_tela_de_pagamento(){
        CartPage.clickCheckout();
        CartPage.clickCheckout();
        CartPage.checkTerms();
        CartPage.clickCheckout();
    }

    @E("aceita os termos de serviço")
    public void e_aceita_termos_servicos() {

    }

    @E("clica no link Pay by bank wire")
    public void e_clica_no_link_pay_by_bank_wire() {
        CartPage.clickPayByBankwire();
    }

    @E("clica no link Pay by check")
    public void e_clica_no_link_pay_by_check() {
        CartPage.clickPayByCheck();
    }

    @E("clica no link I confirm my order")
    public void e_clica_no_link_confirm_order() {
        CartPage.clickConfirmOrder();
    }

    @Então("a mensagem de compra realizada com sucesso é exibida")
    public void entao_mensagem_compra_sucesso_exibida() {
        CartPage.successMessageIsDisplayed();
    }
}
