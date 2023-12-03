package main.java.org.example.gmail;

import tests.java.org.example.gmail.BaseClass;
import tests.java.org.example.gmail.HomePage;
import tests.java.org.example.gmail.SignInPage;
import main.java.org.example.gmail.Main;

public class Main {
    public static void main(String[] args) {
        BaseClass.initializeDriver();

        // Navigate to the Gmail sign-in page
        driver.get("https://mail.google.com");

        // Sign in
        SignInPage.enterEmail("your_email@gmail.com");
        SignInPage.enterPassword("your_password");

        
        // Initiate composing an email
        HomePage.clickComposeButton();

        // Additional actions can be added here for composing an email

        BaseClass.quitDriver();
    }
}

