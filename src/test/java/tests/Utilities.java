package tests;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class Utilities {

    public WebDriver driver = new FirefoxDriver();
    JavascriptExecutor js = (JavascriptExecutor) driver;

    @BeforeTest
    public void startBrowserTNG() throws InterruptedException {
        System.setProperty("webdriver.gecko.driver", "/usr/local/bin/geckodriver");
        driver.manage().window().maximize();
        driver.get("http://automationpractice.com/index.php");
    }

    @AfterTest
    public void tearDownTNG() {
        driver.quit();

    }

}
