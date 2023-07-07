package org.example.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class ProductsUserFeature {
    public WebDriver driver;

    public ProductsUserFeature(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    public void clickBtnDetailProduct() {
        String path= "//p[.='Teman Petani']/following-sibling::div/div/div[1]//button[.='detail']";
        WebElement btnDetailProduct = driver.findElement(By.xpath(path));
        Actions build = new Actions(driver);
        build.moveToElement(btnDetailProduct).build().perform();
        btnDetailProduct.isDisplayed();
        btnDetailProduct.click();
    }

    @FindBy(xpath = "//label[@id='button-to-beli']")
    private static WebElement btnBeliSekarang;

    public void verifyDetailProductUser() {
        btnBeliSekarang.isDisplayed();
    }

    public void clickBtnBeliProduct() {
        btnBeliSekarang.click();
    }

    @FindBy(xpath = "//p[.='Detail Pembelian']")
    private static WebElement popUpDetailPembelian;

    public void verifyPopUpDetailPembelian() {
        popUpDetailPembelian.isDisplayed();
    }

    @FindBy(xpath = "//select[@id='bank']")
    private static WebElement selectNewBank;

    public void setNamaBank(String selectedBank) {
        selectNewBank.isDisplayed();
        Select a = new Select(selectNewBank);
        a.selectByVisibleText(selectedBank);
    }

    public void setJumlahProduct(int quantity) {
        String path= "//p[text()[contains(.,'Detail Pembelian')]]/ancestor::form//input[@id='quantity']";
        WebElement fieldQuantity = driver.findElement(By.xpath(path));
        Actions build = new Actions(driver);
        build.moveToElement(fieldQuantity).build().perform();
        fieldQuantity.isDisplayed();
        fieldQuantity.sendKeys(String.valueOf(quantity));
    }

    public void setCatatanProduct(String catatan) {
        String path= "//p[text()[contains(.,'Detail Pembelian')]]/ancestor::form//textarea[@id='catatan']";
        WebElement fieldCatatan = driver.findElement(By.xpath(path));
        Actions build = new Actions(driver);
        build.moveToElement(fieldCatatan).build().perform();
        fieldCatatan.isDisplayed();
        fieldCatatan.sendKeys(String.valueOf(catatan));
    }

    public void clickBtnKonfirmasiPembelian() {
        String path= "//p[text()[contains(.,'Detail Pembelian')]]/ancestor::form//button[@id='btn-submit-add']";
        WebElement fieldCatatan = driver.findElement(By.xpath(path));
        Actions build = new Actions(driver);
        build.moveToElement(fieldCatatan).build().perform();
        fieldCatatan.isDisplayed();
        fieldCatatan.click();
    }

    @FindBy(xpath = "//h2[text()[contains(.,'Pembayara')]]")
    private static WebElement titlePembayaranPage;

    public void verifyPembayaranPage() {
        titlePembayaranPage.isDisplayed();
    }
}
