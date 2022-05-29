package ui.tests;

import io.qameta.allure.AllureId;
import io.qameta.allure.Feature;
import io.qameta.allure.Owner;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Tags;
import org.junit.jupiter.api.Test;
import ui.pages.CommonCategoryPage;
import ui.pages.CommonProductPage;
import ui.pages.MainPage;

public class AddToCartTests extends TestBase {

    MainPage mainPage = new MainPage();
    CommonCategoryPage categoryPage = new CommonCategoryPage();
    CommonProductPage productPage = new CommonProductPage();

    @Test
    @AllureId("10106")
    @DisplayName("Add to cart from product page")
    @Tags({@Tag("major"), @Tag("web"), @Tag("smoke")})
    @Owner("allure8")
    @Feature("UI")
    public void addToCartFromProductPage() {
        mainPage.clickOnAcceptCookieAgreementButton();

        productPage.openCommonProduct()
                .clickOnAddToCartButton()
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

        categoryPage.openCommonCategoryPage()
                .hoverOnProductCard()
                .clickOnAddToCartButton()
                .checkSizeChooseModalVisible()
                .clickOnSize("37")
                .clickOnAddToCartFromSizeModalButton()
                .checkSizeChooseModalNotVisible()
                .checkCartItemHaveText("1");
    }
}
