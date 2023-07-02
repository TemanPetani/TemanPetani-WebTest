package org.example.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginFeature {
    public static WebDriver driver;

    public LoginFeature(WebDriver driver) {
        PageFactory.initElements(driver, this);
        LoginFeature.driver = driver;
    }
    @FindBy(xpath = "//a[@id='navbar-to-login']")
    private WebElement loginLandingButton;

    @FindBy(xpath = "//img[@alt='img logo']")
    private WebElement verifyLandingPage;

    @FindBy(xpath = "//p[@class='text-4xl font-semibold text-base-100']")
    private WebElement verifyLoginPage;

    @FindBy(xpath = "//input[@id='input email']")
    private WebElement emailField;


    @FindBy(xpath = "//input[@id='input password']")
    private WebElement passwordField;


    @FindBy(xpath = "//button[@id='login-button']")
    private WebElement loginPageButton;


    @FindBy(xpath = "//button[@class='swal2-confirm swal2-styled swal2-default-outline']")
    private WebElement okButton;


    @FindBy(xpath = "//img[@alt='img logo']")
    private WebElement verifyHomePage;


    public void clickLoginLandingButton() {
        loginLandingButton.click();
    }

    public boolean verifyLandingPage() {
        return verifyLandingPage.isDisplayed();
    }

    public boolean verifyLoginPage() {
        return verifyLoginPage.isDisplayed();
    }

    public void inputEmailAndPassword(String email, String password) {
        emailField.sendKeys(email);
        passwordField.sendKeys(password);
    }

    public void clickLoginPageButton() throws InterruptedException {
        loginPageButton.click();
        Thread.sleep(2000);
        okButton.click();
    }

    public boolean verifyHomePage() {
        return verifyHomePage.isDisplayed();
    }
}

