package core;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class TestBase {

    private WebDriver driver;
    private DriverFactory driverFactory;

    @Parameters("browser")
    @BeforeClass
    public void initDriver(String browserName) {
        String browser = browserName;
        driverFactory = new DriverFactory();
        this.driver = driverFactory.getDriver(browser);
    }

    @BeforeMethod
    public void launchApp() {
        driver().manage().deleteAllCookies();
        driver().get("https://www.yogavibe.net/en");
    }

    public WebDriver driver() {
        return driver;
    }

    @AfterClass
    public void tearDown() {
        if(driverFactory!=null) {
            driverFactory.killDriver();
        }
    }
}
