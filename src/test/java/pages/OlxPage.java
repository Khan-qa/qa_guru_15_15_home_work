package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import pages.components.TopMenuComponent;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class OlxPage {

    @Step("Открытие сайта OLX")
    public OlxPage openMainPage() {
        open("/");
        return this;
    }

    @Step("Поиск товара {product}")
    public OlxPage searchProduct(String product) {
        $("#headerSearch").setValue(product).pressEnter();
        return this;
    }

    @Step("Открытие деталей товара")
    public OlxPage openProductDetails() {
        $$("[data-testid='listing-grid']").filter(Condition.visible).first().click();
        return this;
    }

    @Step("Добавление товара в избранные")
    public OlxPage addingProductToFavorites() {
        $x("//span[text()='Опубликовано']/following::div[1]/svg").click();
        return this;
    }

    @Step("просмотр товаров в виде списка")
    public OlxPage viewProductsInList() {
        $("#list").click();
        return this;
    }
    @Step("Проверка списка товаров")
    public OlxPage productListCheck() {
        $(".offer-wrapper").shouldHave(Condition.visible);
        return this;
    }


}
