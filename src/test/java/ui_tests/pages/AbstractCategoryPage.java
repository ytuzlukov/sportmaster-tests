package ui_tests.pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.WebDriverConditions.urlStartingWith;

public class AbstractCategoryPage {

    private SelenideElement productCard = $(By.xpath("//div[@data-selenium='product-card']"));
    private SelenideElement addToCartButton = $(By.xpath("//button[@data-selenium='addToCartButton']"));
    private SelenideElement addToCartFromSizeModal = $(By.xpath("//button[@data-selenium='add-btn']"));
    private SelenideElement cartItem = $(By.xpath("//span[@data-selenium='sm_badge_item']"));
    private SelenideElement chooseSizeModal = $(By.xpath("//div[@data-selenium='choose-size']"));
    private ElementsCollection activeSizes = $$(By.xpath("//div[@data-selenium='product-sizes-item' and not (contains(@class,'disabled'))]"));

    public AbstractCategoryPage checkCorrectPageOpened(final String data) {
        webdriver().shouldHave(urlStartingWith(data));
        return this;
    }

    public AbstractCategoryPage hoverOnProductCard() {
        productCard.hover();
        return this;
    }

    public AbstractProductPage clickOnProductCard() {
        productCard.click();
        return new AbstractProductPage();
    }

    public AbstractCategoryPage clickOnAddToCartButton() {
        addToCartButton.click();
        return this;
    }

    public AbstractCategoryPage clickOnAddToCartFromSizeModalButton() {
        addToCartFromSizeModal.click();
        return this;
    }

    public AbstractCategoryPage checkCartItemHaveText(String itemText) {
        cartItem.shouldHave(Condition.text(itemText));
        return this;
    }

    public AbstractCategoryPage checkSizeChooseModalVisible() {
        chooseSizeModal.shouldBe(visible);
        return this;
    }

    public AbstractCategoryPage checkSizeChooseModalNotVisible() {
        chooseSizeModal.shouldNotBe(visible);
        return this;
    }

    public AbstractCategoryPage clickOnSize(String size) {
        activeSizes.findBy(text(size)).click();
        return this;
    }
}
