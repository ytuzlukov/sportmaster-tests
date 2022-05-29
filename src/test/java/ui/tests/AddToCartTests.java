package ui.tests;

import io.qameta.allure.AllureId;
import io.qameta.allure.Feature;
import io.qameta.allure.Owner;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Tags;
import org.junit.jupiter.api.Test;
import ui.pages.AbstractCategoryPage;
import ui.pages.AbstractProductPage;
import ui.pages.MainPage;

import static com.codeborne.selenide.Selenide.open;

public class AddToCartTests extends TestBase {

    MainPage mainPage = new MainPage();
    AbstractCategoryPage categoryPage = new AbstractCategoryPage();
    AbstractProductPage productPage = new AbstractProductPage();

    @Test
    @AllureId("10106")
    @DisplayName("Add to cart from product page")
    @Tags({@Tag("major"), @Tag("web"), @Tag("smoke")})
    @Owner("allure8")
    @Feature("UI")
    public void addToCartFromProductPage() {
        mainPage.clickOnAcceptCookieAgreementButton();

        open("https://www.sportmaster.ru/product/23306930299/?skuId=180070910299");
        productPage.clickOnAddToCartButton()
                .checkCartItemHaveText("1");
    }

    @Test
    @AllureId("10099")
    @DisplayName("Add to cart from category page")
    @Tags({@Tag("major"), @Tag("web"), @Tag("smoke")})
    @Owner("allure8")
    @Feature("UI")
    public void addToCartFromCategoryPage() {
        mainPage.clickOnAcceptCookieAgreementButton();

        open("https://www.sportmaster.ru/catalog/zhenskaya_obuv/krossovki/");
        categoryPage.hoverOnProductCard()
                .clickOnAddToCartButton()
                .checkSizeChooseModalVisible()
                .clickOnSize("37")
                .clickOnAddToCartFromSizeModalButton()
                .checkSizeChooseModalNotVisible()
                .checkCartItemHaveText("1");
    }
}
