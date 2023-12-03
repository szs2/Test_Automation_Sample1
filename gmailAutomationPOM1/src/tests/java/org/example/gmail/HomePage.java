package tests.java.org.example.gmail;

import org.openqa.selenium.By;

public class HomePage {
    public static void clickComposeButton() {
        driver.findElement(By.cssSelector(".T-I-KE")).click();
    }
}
