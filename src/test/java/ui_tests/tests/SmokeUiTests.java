package ui_tests.tests;

import ui_tests.pages.AbstractCategoryPage;
import ui_tests.pages.AbstractProductPage;
import ui_tests.pages.MainPage;
import io.qameta.allure.AllureId;
import io.qameta.allure.Feature;
import io.qameta.allure.Owner;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Tags;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.open;

public class SmokeUiTests extends TestBase {

    MainPage mainPage = new MainPage();
    AbstractCategoryPage categoryPage = new AbstractCategoryPage();
    AbstractProductPage productPage = new AbstractProductPage();

    @Test
    @AllureId("10070")
    @DisplayName("Main site's elements visibility check")
    @Tags({@Tag("critical"), @Tag("web"), @Tag("smoke")})
    @Owner("allure8")
    @Feature("UI")
    public void mainElementsVisibilityCheck() {
        mainPage.checkCityConfirmModalVisible()
                .clickOnRightCityButton()
                .checkHeaderVisible()
                .checkMainAppVisible()
                .checkFooterVisible();
    }

    @Test
    @AllureId("10092")
    @DisplayName("Open change city modal check")
    @Tags({@Tag("major"), @Tag("web"), @Tag("smoke")})
    @Owner("allure8")
    @Feature("UI")
    public void openChangeModalCheck() {
        mainPage.checkCityConfirmModalVisible()
                .clickOnOtherCityButton()
                .checkCityChooseModalVisible()
                .clickOnCityChooseCloseButton()
                .checkCityChooseModalNotVisible()
                .clickOnCityChooseOpenButton()
                .checkCityChooseModalVisible();
    }

    @Test
    @AllureId("10094")
    @DisplayName("Login modal open check")
    @Tags({@Tag("critical"), @Tag("web"), @Tag("smoke")})
    @Owner("allure8")
    @Feature("UI")
    public void loginModalOpenCheck() {
        mainPage.clickOnLoginButton()
                .checkAuthModalVisible();
    }

    @Test
    @AllureId("10082")
    @DisplayName("Closing cookie bar check")
    @Tags({@Tag("minor"), @Tag("web"), @Tag("smoke")})
    @Owner("allure8")
    @Feature("UI")
    public void closingCookieBarCheck() {
        mainPage.checkCookieAgreementVisible()
                .clickOnAcceptCookieAgreementButton()
                .checkCookieAgreementNotVisible();
    }

    @Test
    @AllureId("10098")
    @DisplayName("Check category correct open")
    @Tags({@Tag("major"), @Tag("web"), @Tag("smoke")})
    @Owner("allure8")
    @Feature("UI")
    public void openCorrectCategoryCheck() {
        String checkUrl = "https://www.sportmaster.ru/catalog/zhenskaya_odezhda/dzhempery_i_svitery/";
        mainPage.checkCityConfirmModalVisible()
                .clickOnRightCityButton()
                .checkCityConfirmModalNotVisible()
                .hoverOnCatalogButton()
                .checkCatalogVisible()
                .clickOnSomeCategory();

        categoryPage.checkCorrectPageOpened(checkUrl);

    }

    @Test
    @AllureId("10096")
    @DisplayName("Check banner wrapper filled by banners")
    @Tags({@Tag("major"), @Tag("web"), @Tag("smoke")})
    @Owner("allure8")
    @Feature("UI")
    public void bannerWrapperFilledByBannersCheck() {
        mainPage.checkCityConfirmModalVisible()
                .clickOnRightCityButton()
                .checkActiveBannerVisible();
    }

    @Test
    @AllureId("10097")
    @DisplayName("Catalog open check")
    @Tags({@Tag("major"), @Tag("web"), @Tag("smoke")})
    @Owner("allure8")
    @Feature("UI")
    public void catalogOpenCheck() {
        mainPage.checkCityConfirmModalVisible()
                .clickOnRightCityButton()
                .checkCityConfirmModalNotVisible()
                .hoverOnCatalogButton()
                .checkCatalogVisible()
                .checkCatalogCategoriesVisible();
    }

    @Test
    @AllureId("10093")
    @DisplayName("Approve recognized city")
    @Tags({@Tag("major"), @Tag("web"), @Tag("smoke")})
    @Owner("allure8")
    @Feature("UI")
    public void approveRecognizedCity() {
        mainPage.checkCityConfirmModalVisible()
                .clickOnRightCityButton()
                .checkCityConfirmModalNotVisible();
    }

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
