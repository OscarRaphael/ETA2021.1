package StepsDef;

import Pages.productPage;
import io.cucumber.java.pt.E;

public class productSteps {

    productPage ProductPage = new productPage();

    @E("adiciona o produto no carrinho")
    public void e_adiciona_produto_carrinho() {
        ProductPage.clickAddToCart();
    }

    @E("clica no link Proceed to checkout do modal")
    public void e_clica_link_checkout_modal() {
        ProductPage.clickProceedCheckoutModal();
    }
}
