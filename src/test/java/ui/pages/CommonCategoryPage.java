package ui.pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.WebDriverConditions.urlContaining;

public class CommonCategoryPage {

    private SelenideElement productCard = $(By.xpath("//div[@data-selenium='product-card']"));
    private SelenideElement addToCartButton = $(By.xpath("//button[@data-selenium='addToCartButton']"));
    private SelenideElement addToCartFromSizeModal = $(By.xpath("//button[@data-selenium='add-btn']"));
    private SelenideElement cartItem = $(By.xpath("//span[@data-selenium='sm_badge_item']"));
    private SelenideElement chooseSizeModal = $(By.xpath("//div[@data-selenium='choose-size']"));
    private ElementsCollection activeSizes = $$(By.xpath("//div[@data-selenium='product-sizes-item' and not (contains(@class,'disabled'))]"));

    public CommonCategoryPage checkCorrectPageOpened() {
        webdriver().shouldHave(urlContaining("catalog/zhenskaya_odezhda/dzhempery_i_svitery/"));
        return this;
    }

    public CommonCategoryPage openCommonCategoryPage() {
        open("catalog/zhenskaya_odezhda/dzhempery_i_svitery/");
        return this;
    }

    public CommonCategoryPage hoverOnProductCard() {
        productCard.hover();
        return this;
    }

    public CommonProductPage clickOnProductCard() {
        productCard.click();
        return new CommonProductPage();
    }

    public CommonCategoryPage clickOnAddToCartButton() {
        addToCartButton.click();
        return this;
    }

    public CommonCategoryPage clickOnAddToCartFromSizeModalButton() {
        addToCartFromSizeModal.click();
        return this;
    }

    public CommonCategoryPage checkCartItemHaveText(String itemText) {
        cartItem.shouldHave(Condition.text(itemText));
        return this;
    }

    public CommonCategoryPage checkSizeChooseModalVisible() {
        chooseSizeModal.shouldBe(visible);
        return this;
    }

    public CommonCategoryPage checkSizeChooseModalNotVisible() {
        chooseSizeModal.shouldNotBe(visible);
        return this;
    }

    public CommonCategoryPage clickOnSize(String size) {
        activeSizes.findBy(text(size)).click();
        return this;
    }
}
