package core;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class DriverFactory {

    private WebDriver driver = null;

    public WebDriver getDriver(String browserName) {
        try {
            String driverPath = System.getProperty("user.dir");
            if(browserName.equalsIgnoreCase("chrome")) {
                System.setProperty("webdriver.chrome.driver", "c:\\utils\\chromedriver.exe");
                driver = new ChromeDriver();
            }else if (browserName.equalsIgnoreCase("firefox")) {
                System.setProperty("webdriver.gecko.driver", "c:\\utils\\geckodriver.exe");
                driver = new FirefoxDriver();
            }else {
                throw new Exception("Incorrrect browser name provided : "+ browserName);
            }
            driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
            driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        }catch(Exception e) {
            e.printStackTrace();
        }
        return driver;
    }

    public void killDriver() {
        if(driver!=null) {
            driver.quit();
        }
    }
}
