package ui.pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

public class MainPage {

    private final SelenideElement header = $(By.xpath("//div[@data-selenium='sm-header']"));
    private final SelenideElement mainApp = $(By.xpath("//div[contains(@class, 'app-content')]"));
    private final SelenideElement footer = $(By.xpath("//footer[@data-selenium='footer'] "));
    private final SelenideElement cityConfirmModal = $(By.xpath("//div[@data-selenium='city-confirm-popup']"));
    private final SelenideElement cityConfirmModalOtherCity = $(By.xpath("//button[@data-selenium='another-city']"));
    private final SelenideElement cityConfirmModalRightCity = $(By.xpath("//button[@data-selenium='confirm-city-button']"));
    private final SelenideElement cityChooseModal = $(By.xpath("//div[@class='sm-choose-city']"));
    private final SelenideElement cityChooseModalClose = $(By.xpath("//button[@data-selenium='close-button']"));
    private final SelenideElement cityChooseModalOpen = $(By.xpath("//div[@data-selenium='sm-popover']"));
    private final SelenideElement loginButton = $(By.xpath("//button[@data-selenium='user-btn']"));
    private final SelenideElement authModal = $(By.xpath("//div[@class='auth-dialog']"));
    private final SelenideElement cookieAgreement = $(By.xpath("//div[@class='sm-cookie-agreement']"));
    private final SelenideElement cookieAgreementButton = $(By.xpath("//div[@class='sm-cookie-agreement']//button[@data-selenium='smButton']"));
    private final SelenideElement catalogButton = $(By.xpath("//li[@data-selenium='section-catalog']"));
    private final SelenideElement catalogContent = $(By.xpath("//div[@data-selenium='catalog-content']"));
    private final SelenideElement catalogCategories = $(By.xpath("//div[@class='sm-header-catalog-sections']"));
    private final SelenideElement activeBanner = $(By.xpath("//div[@data-selenium='main-swiper']" +
                                                            "//div[@data-selenium='swiper-slide' " +
                                                            "and contains(@class,'active')]"));
    private final SelenideElement catalogSomeCategory = $(By.xpath("//div[@data-selenium='catalog-content']" +
                                                                    "//a[@href='/catalog/zhenskaya_odezhda/dzhempery_i_svitery/']"));


    public MainPage checkHeaderVisible() {
        header.shouldBe(visible);
        return this;
    }

    public MainPage checkMainAppVisible() {
        mainApp.shouldBe(visible);
        return this;
    }

    public MainPage checkFooterVisible() {
        footer.shouldBe(visible);
        return this;
    }

    public MainPage checkCityConfirmModalVisible() {
        cityConfirmModal.shouldBe(visible);
        return this;
    }

    public MainPage checkCityConfirmModalNotVisible() {
        cityConfirmModal.shouldNotBe(visible);
        return this;
    }

    public MainPage clickOnOtherCityButton() {
        cityConfirmModalOtherCity.click();
        return this;
    }

    public MainPage clickOnRightCityButton() {
        cityConfirmModalRightCity.click();
        return this;
    }

    public MainPage checkCityChooseModalVisible() {
        cityChooseModal.shouldBe(visible);
        return this;
    }

    public MainPage clickOnCityChooseCloseButton() {
        cityChooseModalClose.click();
        return this;
    }

    public MainPage clickOnCityChooseOpenButton() {
        cityChooseModalOpen.click();
        return this;
    }

    public MainPage checkCityChooseModalNotVisible() {
        cityChooseModal.shouldNotBe(visible);
        return this;
    }

    public MainPage checkAuthModalVisible() {
        authModal.shouldBe(visible);
        return this;
    }

    public MainPage clickOnLoginButton() {
        loginButton.click();
        return this;
    }

    public MainPage checkCookieAgreementVisible() {
        cookieAgreement.shouldBe(visible);
        return this;
    }

    public MainPage checkCookieAgreementNotVisible() {
        cookieAgreement.shouldNotBe(visible);
        return this;
    }


    public MainPage clickOnAcceptCookieAgreementButton() {
        cookieAgreementButton.click();
        return this;
    }

    public MainPage hoverOnCatalogButton() {
        catalogButton.hover();
        return this;
    }

    public MainPage checkCatalogVisible() {
        catalogContent.shouldBe(visible);
        return this;
    }

    public MainPage checkCatalogCategoriesVisible() {
        catalogCategories.shouldBe(visible);
        return this;
    }

    public MainPage checkActiveBannerVisible() {
        activeBanner.shouldBe(visible);
        return this;
    }

    public CommonCategoryPage clickOnSomeCategory() {
        catalogSomeCategory.click();
        return new CommonCategoryPage();
    }

}
