package org.example.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MyPlantFeature {
    public WebDriver driver;

    public MyPlantFeature(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    @FindBy(xpath = "//a[.='Tanam sekarang']")
    private static WebElement menuTanamSekarang;

    public void clickMenuTanamSekarang() {
        menuTanamSekarang.isDisplayed();
        menuTanamSekarang.click();
    }

    @FindBy(xpath = "//p[text()[contains(.,'Mulai Menanam')]]")
    private static WebElement titleCreatePlantPage;

    public void verifyCreatePlantPage() {
        titleCreatePlantPage.isDisplayed();
        titleCreatePlantPage.click();
    }

    @FindBy(xpath = "//p[text()[contains(.,'Mulai Menanam')]]/ancestor::form")
    private static WebElement formCreatePlantPage;

    public void verifyFormStartPlant() {
    }

    public void setNamaTanaman(String namaPlant) {
        String path= "//p/ancestor::div[6]//input[@id='name']";
        driver.findElement(By.xpath(path)).isDisplayed();
        driver.findElement(By.xpath(path)).sendKeys(namaPlant);
    }

    @FindBy(xpath = "//p/ancestor::div[6]//select[@id='templateId']")
    private static WebElement selectJenisTanaman;

    public void setJenisTanaman(String jenisPlant) {
        selectJenisTanaman.isDisplayed();
        Select a = new Select(selectJenisTanaman);
        a.selectByVisibleText(jenisPlant);
    }

    @FindBy(xpath = "//p/ancestor::div[6]//input[@id='startDate']")
    private static WebElement dateSelected;

    public void setDatePlant() {
        dateSelected.isDisplayed();
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        Date date = new Date();
        String currDate= dateFormat.format(date);
        dateSelected.sendKeys(currDate);
    }

    @FindBy(xpath = "//p[text()[contains(.,'Mulai Menanam')]]/ancestor::form/div[2]//button[.='Simpan']")
    private static WebElement btnSimpanStartPlant;

    public void clickBtnSimpanStartPlant() {
        btnSimpanStartPlant.isDisplayed();
        btnSimpanStartPlant.click();
    }

    @FindBy(xpath = "//div[.='Berhasil Membuat Tanaman']")
    private static WebElement verifySuccessCreateNewPlant;

    public void verifySuccessCreateNewPlant() {
        verifySuccessCreateNewPlant.isDisplayed();
    }

    @FindBy(xpath = "//div[.='Berhasil Membuat Tanaman']/ancestor::div[1]/div[@class='swal2-actions']/button[.='OK']")
    private static WebElement btnOkSuccessCreateNewPlant;

    public void clickBtnOkCreateNewPlant() {
        btnOkSuccessCreateNewPlant.isDisplayed();
        btnOkSuccessCreateNewPlant.click();
    }

    @FindBy(xpath = "//p[.='Tanamanku']")
    private static WebElement titleMyPlantPage;

    public void verifyMyPlantPage() {
        titleMyPlantPage.isDisplayed();
    }

    @FindBy(xpath = "//a[.='Tanaman Saya']")
    private static WebElement menuTanamanSaya;

    public void clickMenuTanamanSaya() {
        menuTanamanSaya.isDisplayed();
        menuTanamanSaya.click();
    }

    public void clickDetailPlant(String plantTemplate) {
        String path= "//p[.='"+plantTemplate+"']/ancestor::div[1]/following-sibling::div/button[.='detail']";
        WebElement btnDetail = driver.findElement(By.xpath(path));
        Actions build = new Actions(driver);
        build.moveToElement(btnDetail).build().perform();
        btnDetail.isDisplayed();
        btnDetail.click();
    }

    public void verifyDetailMyPlantPage(String plantTemplate) {
        String path= "//p[text()[contains(.,'Jadwal') or contains(text(),'"+plantTemplate+"')]]";
        WebElement titleDetailMyPlantPage = driver.findElement(By.xpath(path));
        Actions build = new Actions(driver);
        build.moveToElement(titleDetailMyPlantPage).build().perform();
        titleDetailMyPlantPage.isDisplayed();
    }

    public void verifyListDetailMyPlant(String plantTemplate) {
        String path= "//p[text()[contains(.,'Jadwal') or contains(text(),'"+plantTemplate+"')]]/following-sibling::div";
        WebElement listDetailMyPlantPage = driver.findElement(By.xpath(path));
        Actions build = new Actions(driver);
        build.moveToElement(listDetailMyPlantPage).build().perform();
        listDetailMyPlantPage.isDisplayed();
    }

    public void clickBtnFinishActivity() {
        String path= "//p[text()[contains(.,'Jadwal')]]/following-sibling::div//div[@id='card-: undefined'][contains(.//button, 'Selesai')][1]//button[.='Selesai']";
        WebElement btnFinishActivity = driver.findElement(By.xpath(path));
        Actions build = new Actions(driver);
        build.moveToElement(btnFinishActivity).build().perform();
        btnFinishActivity.isDisplayed();
        btnFinishActivity.click();
    }

    @FindBy(xpath = "//h2[.='Selesaikan Jadwal']")
    private static WebElement popUpFinishActivity;

    public void verifyPopUpFinish() {
        popUpFinishActivity.isDisplayed();
    }

    @FindBy(xpath = "//h2[.='Selesaikan Jadwal']/ancestor::div[2]//div[@class='swal2-actions']/button[.='OK']")
    private static WebElement btnOkFinishActivity;

    public void clickBtnOkFinishActivity() {
        btnOkFinishActivity.isDisplayed();
        btnOkFinishActivity.click();
    }

    @FindBy(xpath = "//h2[.='Berhasil Memperbarui Data Tanaman']")
    private static WebElement verifySuccessFinishActivity;

    public void verifySuccessFinishActivity() {
        verifySuccessFinishActivity.isDisplayed();
    }

    public void clickBtnDeleteinPlant() {
        String path= "//div[@id='card-tanamanku: undefined'][last()]//button[.='Delete']";
        WebElement btnDeletePlant = driver.findElement(By.xpath(path));
        Actions build = new Actions(driver);
        build.moveToElement(btnDeletePlant).build().perform();
        btnDeletePlant.isDisplayed();
        btnDeletePlant.click();
    }

    @FindBy(xpath = "//h2[.='Hapus Jadwal']")
    private static WebElement popUpDeletePlant;

    public void verifyPopUpDelete() {
        popUpDeletePlant.isDisplayed();
    }

    @FindBy(xpath = "//h2[.='Hapus Jadwal']/ancestor::div[2]//div[@class='swal2-actions']/button[.='OK']")
    private static WebElement btnOkDeletePlant;

    public void clickBtnOkDeletePlant() {
        btnOkDeletePlant.isDisplayed();
        btnOkDeletePlant.click();
    }

    @FindBy(xpath = "//h2[.='Berhasil Menghapus Data Tanaman']")
    private static WebElement verifySuccessDeletePlant;

    public void verifySuccessDeletePlant() {
        verifySuccessDeletePlant.isDisplayed();
    }

    @FindBy(xpath = "//p[text()[contains(.,'Pengingat')]]")
    private static WebElement notificationBarActivity;

    public void verifyNotificationActivity() {
        notificationBarActivity.isDisplayed();
    }

    @FindBy(xpath = "//p[text()[contains(.,'Pengingat')]]/following-sibling::button[.='GO']")
    private static WebElement btnGoAcitivityNotif;

    public void clickBtnGoInNotifBar() {
        btnGoAcitivityNotif.isDisplayed();
        btnGoAcitivityNotif.click();
    }
}
