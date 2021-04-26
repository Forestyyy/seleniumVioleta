package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PricesPage {

    @FindBy(xpath = "/html/body/div[3]/h1")
    private static WebElement pricePageName;

    @FindBy(xpath = "/html/body/div[3]/div/div[1]/table[1]/tbody/tr[2]/td[2]")
    private static WebElement singlePriceValue;

    private WebDriver driver;

    public PricesPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public boolean verifyPricePage() {
        return pricePageName.isDisplayed();
    }
}
