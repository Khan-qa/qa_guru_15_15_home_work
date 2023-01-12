package tests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import pages.GitHubMainPage;
import utils.DateForTest;

public class GitHubTest extends TestBaseConfiguration {

    DateForTest dateForTest = new DateForTest();
    GitHubMainPage mainPage = new GitHubMainPage();

    @Test
    @DisplayName("Открытие и проверка страницы каспи магазина")
    void openMainPage() {
        mainPage.openPage()
                .checkTextSelectionCityWindow()
                .selectedCity()
                .checkSelectedCity()
                .checkListKaspiProducts(dateForTest.kaspiProductsList);
    }

    @Test
    @DisplayName("Проверка поиска товара")
    void checkSearchProduct() {
        mainPage.openPage()
                .searchProduct(dateForTest.product)
                .checkSearchResult(dateForTest.product);
    }

    @Test
    @DisplayName("Проверка деталей товара")
    void checkProductDetail() {
        mainPage.openPage()
                .searchProduct(dateForTest.product)
                .openProductDetails()
                .checkThatProductInformationVisible();
    }

    @Test
    @DisplayName("Проверка что в списке продавцов есть 'MAGNUM'")
    void checkingSellers() {
        mainPage.openPage()
                .searchProduct(dateForTest.product)
                .openProductDetails()
                .checkSeller();
    }

}
