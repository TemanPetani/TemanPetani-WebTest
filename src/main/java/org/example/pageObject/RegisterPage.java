package org.example.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RegisterPage {
    public static WebDriver driver;

    public RegisterPage(WebDriver driver){
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    public void verifyLandingPage(){
        String path = "//p[@class='font-semibold text-3xl text-base-100 md:drop-shadow-lg tracking-wide'][.='TEMAN PETANI']";
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath(path))).click();
    }

    @FindBy(xpath = "//a[@id='navbar-to-register']")
    private static WebElement registerMenuBtn;

    public void clickRegisterMenu(){
        registerMenuBtn.isDisplayed();
        registerMenuBtn.click();
    }

    @FindBy(xpath = "//button[@id='signup-button']")
    private static WebElement registerBtn;

    public void verifyRegisterPage(){
        registerBtn.isDisplayed();
    }

    public void clickRegisterBtn(){
        registerBtn.click();
    }

    @FindBy(xpath = "//input[@id='input-fullname']")
    private static WebElement fullName;

    public void setFullName(String fullname){
        fullName.sendKeys(fullname);
    }

    @FindBy(xpath = "//input[@id='input-phone']")
    private static WebElement phone;

    public void setPhone(String phoneUser){
        phone.sendKeys(phoneUser);
    }

    @FindBy(xpath = "//input[@id='input-email']")
    private static WebElement email;

    public void setEmail(String emailUser){
        email.sendKeys(emailUser);
    }

    @FindBy(xpath = "//input[@id='input-address']")
    private static WebElement address;

    public void setAddress(String addressUser){
        address.sendKeys(addressUser);
    }

    @FindBy(xpath = "//input[@id='input-password']")
    private static WebElement password;

    public void setPassword(String passwordUser){
        password.sendKeys(passwordUser);
    }

    public void verifyNotifCreateUser(String message){
        String messagePopUp = "//h2[.='"+message+"']";
        driver.findElement(By.xpath(messagePopUp)).isDisplayed();
    }

    public void verifyErrMessageEmail(String message){
        String messagePopUp = "//span[text()[contains(.,'"+message+"')]]";
        driver.findElement(By.xpath(messagePopUp)).isDisplayed();
    }
}
