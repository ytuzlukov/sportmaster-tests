package ui.pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.WebDriverConditions.urlStartingWith;

public class CommonProductPage {

    private SelenideElement addToCartButton = $(By.xpath("//button[@data-selenium='addToCartButton']"));
    private SelenideElement cartItem = $(By.xpath("//span[@data-selenium='sm_badge_item']"));
    private SelenideElement addToCartFromSizeModal = $(By.xpath("//button[@data-selenium='add-btn']"));
    private SelenideElement chooseSizeModal = $(By.xpath("//div[@data-selenium='choose-size']"));
    private ElementsCollection activeSizes = $$(By.xpath("//div[@data-selenium='product-sizes-item' and not (contains(@class,'disabled'))]"));
    private final SelenideElement cookieAgreementButton = $(By.xpath("//div[@class='sm-cookie-agreement']//button[@data-selenium='smButton']"));

    public CommonProductPage checkCorrectPageOpened(final String data) {
        webdriver().shouldHave(urlStartingWith(data));
        return this;
    }

    public CommonProductPage openCommonProduct() {
        open("product/23306930299/?skuId=180070910299");
        return this;
    }

    public CommonProductPage clickOnAcceptCookieAgreementButton() {
        cookieAgreementButton.click();
        return this;
    }

    public CommonProductPage clickOnAddToCartButton() {
        addToCartButton.click();
        return this;
    }

    public CommonProductPage checkCartItemHaveText(String itemText) {
        cartItem.shouldHave(Condition.text(itemText));
        return this;
    }

    public CommonProductPage clickOnAddToCartFromSizeModalButton() {
        addToCartFromSizeModal.click();
        return this;
    }

    public CommonProductPage checkSizeChooseModalVisible() {
        chooseSizeModal.shouldBe(visible);
        return this;
    }

    public CommonProductPage checkSizeChooseModalNotVisible() {
        chooseSizeModal.shouldNotBe(visible);
        return this;
    }

    public CommonProductPage clickOnSize(String size) {
        activeSizes.findBy(text(size)).click();
        return this;
    }
}
