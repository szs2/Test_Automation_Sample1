package tests.java.org.example.gmail;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class SignInPage {
    public static void enterEmail(String email) {
        driver.findElement(By.name("identifier")).sendKeys(email);
        driver.findElement(By.name("identifier")).sendKeys(Keys.RETURN);
    }

    public static void enterPassword(String password) {
        driver.findElement(By.name("password")).sendKeys(password);
        driver.findElement(By.id("passwordNext")).click();
    }
}
