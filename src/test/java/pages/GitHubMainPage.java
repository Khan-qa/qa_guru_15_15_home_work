package pages;

import com.codeborne.selenide.CollectionCondition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import java.util.Arrays;
import java.util.List;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;

public class GitHubMainPage {

    private final SelenideElement
            citySelectionWindow = $(".current-location__dialog-header"), // Проверить надпись "Выберите Ваш город"
            almatyCity = $("[data-city-id='750000000']"), // выбрать город "Алматы"
            selectedCity = $(".current-location__city"), // Проверить что выбран город "Алматы"
            searchInput = $(".search-bar__input"), // В поисковую строку вводим "Яблоко"
            productInformation = $(".item__inner"); // окно с информацией о продукте

    private final ElementsCollection kaspiProducts = $$x("//div[@id='Products']/ul/li"); // Проверить список продуктов Каспи
    private final ElementsCollection searchResult = $$(".item-cards-grid__cards"); // Список результата поиска
    private final ElementsCollection sellersList = $$("tbody"); // Список продовцов

    @Step("открытие страницы каспи магазина")
    public GitHubMainPage openPage() {
        open("shop/");

        return this;
    }

    @Step("Проверка текста окна со списком городов")
    public GitHubMainPage checkTextSelectionCityWindow() {
        citySelectionWindow.shouldHave(text("Выберите Ваш город"));

        return this;
    }

    @Step("Выбор города Алматы")
    public GitHubMainPage selectedCity() {
        almatyCity.click();

        return this;
    }

    @Step("Проверка что выбран город Алматы")
    public GitHubMainPage checkSelectedCity() {
        selectedCity.shouldHave(text("Алматы"));

        return this;
    }

    @Step("Проверка списка продуктов Каспи")
    public GitHubMainPage checkListKaspiProducts(List<String> kaspiProductsList) {
        kaspiProducts.shouldHave(CollectionCondition.texts(kaspiProductsList));

        return this;
    }

    @Step("Поиск товара {product} в поисковой строке")
    public GitHubMainPage searchProduct(String product) {
        searchInput.setValue(product).pressEnter();

        return this;
    }

    @Step("Проверка что название первого товара содержит {product}")
    public GitHubMainPage checkSearchResult(String product) {
        searchResult.first().shouldHave(text(product));

        return this;
    }

    @Step("Открытие деталей первого товара в списке")
    public GitHubMainPage openProductDetails() {
        searchResult.first().click();

        return this;
    }

    @Step("Проверка отображения деталей продукта")
    public GitHubMainPage checkThatProductInformationVisible() {
        productInformation.shouldBe(visible);

        return this;
    }

    @Step("Проверка продовцов")
    public GitHubMainPage checkSeller() {
        sellersList.findBy(text("MAGNUM")).shouldHave(visible);

        return this;
    }


}
