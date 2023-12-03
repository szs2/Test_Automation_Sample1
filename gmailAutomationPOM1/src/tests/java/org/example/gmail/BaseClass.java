package tests.java.org.example.gmail;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
    protected static WebDriver driver;

    public static void initializeDriver() {
        System.setProperty("webdriver.chrome.driver", "\"E:\\CCTB\\OOP\\Selenium Projects\\chromedriver.exe\"");

        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    public static void quitDriver() {
        if (driver != null) {
            driver.quit();
        }
    }
}
