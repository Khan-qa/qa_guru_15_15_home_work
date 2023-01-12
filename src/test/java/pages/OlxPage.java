package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import pages.components.TopMenuComponent;

import static com.codeborne.selenide.Selenide.*;

public class OlxPage {

    @Step("Открытие сайта OLX")
    public OlxPage openMainPage() {
        open("/");
        return this;
    }

    @Step("Поиск товара {product}")
    public OlxPage searchProduct(String product) {
        $("#headerSearch").setValue(product).click();
        return this;
    }

    @Step("Открытие деталей товара")
    public OlxPage openProductDetails() {
        $$("[data-testid='listing-grid']").filter(Condition.visible).first().click();
        return this;
    }


}
