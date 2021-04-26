package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

    @FindBy(xpath = "/html/body/div[3]/div[1]/div/h2")
    private WebElement loginLogo;

    @FindBy(xpath = "/html/body/div[1]/div/div[2]/ul/li[7]/a/b")
    private static WebElement prices;

    @FindBy(xpath = "//*[@id=\"menu-item-13532\"]/a")
    private WebElement listClubs;

    private WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }


    public boolean verifyHomePage() {
        return loginLogo.isDisplayed();
    }

    public static void listOfPrices() {
        prices.click();

    }

}
