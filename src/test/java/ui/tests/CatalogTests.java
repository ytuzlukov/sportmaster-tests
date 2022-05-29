package ui.tests;

import ui.pages.AbstractCategoryPage;
import ui.pages.MainPage;
import io.qameta.allure.AllureId;
import io.qameta.allure.Feature;
import io.qameta.allure.Owner;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Tags;
import org.junit.jupiter.api.Test;

public class CatalogTests extends TestBase {

    MainPage mainPage = new MainPage();
    AbstractCategoryPage categoryPage = new AbstractCategoryPage();

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
}
