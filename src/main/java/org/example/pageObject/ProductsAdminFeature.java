package org.example.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductsAdminFeature {
    public WebDriver driver;

    public ProductsAdminFeature(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    @FindBy(xpath = "//p[.='Teman Petani']/following-sibling::div")
    private static WebElement listProductHomepage;

    public void verifyListProductHomepage() {
        listProductHomepage.isDisplayed();
    }

    public void clickBtnDetailProduct() {
        String path= "//p[.='Teman Petani']/following-sibling::div/div/div[1]//button[.='detail']";
        WebElement btnDetailProduct = driver.findElement(By.xpath(path));
        Actions build = new Actions(driver);
        build.moveToElement(btnDetailProduct).build().perform();
        btnDetailProduct.isDisplayed();
        btnDetailProduct.click();
    }

    @FindBy(xpath = "//p[text()[contains(.,'Nego Harga')]]")
    private static WebElement verifyProductDetailAdmin;

    public void verifyDetailProductPage() {
        verifyProductDetailAdmin.isDisplayed();
    }

    public void setNegoHargaProduct(int negoHarga) {
        String path= "//p[text()[contains(.,'Nego Harga')]]/following-sibling::form//input[@id='nego']";
        WebElement fieldNegoHarga = driver.findElement(By.xpath(path));
        Actions build = new Actions(driver);
        build.moveToElement(fieldNegoHarga).build().perform();
        fieldNegoHarga.isDisplayed();
        driver.findElement(By.xpath(path)).sendKeys(Keys.CONTROL + "a");
        fieldNegoHarga.sendKeys(String.valueOf(negoHarga));
    }

    public void setQuantityProduct(int quantity) {
        String path= "//p[text()[contains(.,'Nego Harga')]]/following-sibling::form//input[@id='quantity']";
        WebElement fieldQuantity = driver.findElement(By.xpath(path));
        Actions build = new Actions(driver);
        build.moveToElement(fieldQuantity).build().perform();
        fieldQuantity.isDisplayed();
        fieldQuantity.sendKeys(String.valueOf(quantity));
    }

    @FindBy(xpath = "//p[text()[contains(.,'Nego Harga')]]/following-sibling::form//button[.='Tawar']")
    private static WebElement btnTawarProduk;

    public void clickBtnTawarProduk() {
        btnTawarProduk.isDisplayed();
        btnTawarProduk.click();
    }

    @FindBy(xpath = "//div[.='Berhasil Membuat Negosiasi Produk']")
    private static WebElement verifySuccessTawar;

    public void verifySuccessTawarProduct() {
        verifySuccessTawar.isDisplayed();
    }

    public void setQuantityProductEmpty() {
        String path= "//p[text()[contains(.,'Nego Harga')]]/following-sibling::form//input[@id='nego']";
        WebElement fieldNegoHarga = driver.findElement(By.xpath(path));
        Actions build = new Actions(driver);
        build.moveToElement(fieldNegoHarga).build().perform();
        fieldNegoHarga.isDisplayed();
        driver.findElement(By.xpath(path)).sendKeys(Keys.CONTROL + "a");
        fieldNegoHarga.sendKeys(Keys.DELETE);
    }
}
