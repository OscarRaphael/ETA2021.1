package Pages;

import Utils.Hooks;
import org.openqa.selenium.support.PageFactory;

public abstract class basePage {
    public basePage() {
        PageFactory.initElements(Hooks.getDriver(), this);
    }
}
