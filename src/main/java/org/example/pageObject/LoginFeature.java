package org.example.pageObject;

import org.openqa.selenium.By;
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

    @FindBy(css = "[alt='img logo']")
    private WebElement verifyLandingPage;

    @FindBy(xpath = "//p[@class='text-4xl font-semibold text-base-100']")
    private WebElement verifyLoginPage;

    @FindBy(xpath = "//input[@id='input email']")
    private WebElement emailField;


    @FindBy(xpath = "//input[@id='input password']")
    private WebElement passwordField;


    @FindBy(xpath = "//button[@id='login-button']")
    private WebElement loginPageButton;


    @FindBy(xpath = "//button[contains(text(),'OK')]")
    private WebElement okButton;


    @FindBy(css = "[alt='img logo']")
    private WebElement verifyHomePage;


    public void clickLoginLandingButton() {
        loginLandingButton.click();
    }

    public void verifyLandingPage() {
        verifyLandingPage.isDisplayed();
    }

    public boolean verifyLoginPage() {
        return verifyLoginPage.isDisplayed();
    }

    public void inputEmailAndPassword(String email, String password) {
        emailField.sendKeys(email);
        passwordField.sendKeys(password);
    }

    public void clickLoginPageButton(){
        loginPageButton.click();
    }

    public void verifyHomePageLogin() {
        verifyHomePage.isDisplayed();
    }

    public void verifyNotifLogin(String message){
        String messagePopUp = "//div[contains(text(),'"+message+"')]";
        driver.findElement(By.xpath(messagePopUp)).isDisplayed();
    }

    public void clickOkLogin() {
        okButton.isDisplayed();
        okButton.click();
    }
}

