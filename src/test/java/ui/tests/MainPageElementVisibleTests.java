package ui.tests;

import io.qameta.allure.AllureId;
import io.qameta.allure.Feature;
import io.qameta.allure.Owner;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Tags;
import org.junit.jupiter.api.Test;
import ui.pages.MainPage;

public class MainPageElementVisibleTests {

    MainPage mainPage = new MainPage();

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
    @AllureId("10094")
    @DisplayName("Login modal open check")
    @Tags({@Tag("critical"), @Tag("web"), @Tag("smoke")})
    @Owner("allure8")
    @Feature("UI")
    public void loginModalOpenCheck() {
        mainPage.clickOnLoginButton()
                .checkAuthModalVisible();
    }
}
