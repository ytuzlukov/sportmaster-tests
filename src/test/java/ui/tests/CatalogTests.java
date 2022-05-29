package ui.tests;

import ui.pages.CommonCategoryPage;
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
    CommonCategoryPage categoryPage = new CommonCategoryPage();

    @Test
    @AllureId("10098")
    @DisplayName("Check category correct open")
    @Tags({@Tag("major"), @Tag("web"), @Tag("smoke")})
    @Owner("allure8")
    @Feature("UI")
    public void openCorrectCategoryCheck() {
        mainPage.checkCityConfirmModalVisible()
                .clickOnRightCityButton()
                .checkCityConfirmModalNotVisible()
                .hoverOnCatalogButton()
                .checkCatalogVisible()
                .clickOnSomeCategory();

        categoryPage.checkCorrectPageOpened();
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
