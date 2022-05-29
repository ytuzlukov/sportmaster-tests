package ui.tests;

import io.qameta.allure.AllureId;
import io.qameta.allure.Feature;
import io.qameta.allure.Owner;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Tags;
import org.junit.jupiter.api.Test;
import ui.pages.MainPage;

public class CityRecognizeModalTests {

    MainPage mainPage = new MainPage();

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
}
