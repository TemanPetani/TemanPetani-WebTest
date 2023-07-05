package org.example.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SchedulePetaniFeature {
    public WebDriver driver;

    public SchedulePetaniFeature(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    @FindBy(xpath = "//a[.='Jadwal Petani']")
    private static WebElement menuJadwalPetani;

    public void clickMenuJadwalPetani() {
        menuJadwalPetani.isDisplayed();
        menuJadwalPetani.click();
    }

    @FindBy(xpath = "//p[.='Jadwal Petani']")
    private static WebElement titleJadwalPetaniPage;

    public void verifyJadwalPetaniPage() {
        titleJadwalPetaniPage.isDisplayed();
    }

    @FindBy(xpath = "//p[.='Jadwal Petani']/ancestor::div/following-sibling::div//table")
    private static WebElement ListJadwalPetaniPage;
    public void verifyListJadwalPetani() {
        ListJadwalPetaniPage.isDisplayed();
    }

    @FindBy(xpath = "//p[.='Jadwal Petani']/ancestor::div/following-sibling::div//table/tbody/tr[1]//td[last()]/label")
    private static WebElement btnDetailJadwalPetani;
    public void clickDetailIconJadwalPetani() {
        btnDetailJadwalPetani.isDisplayed();
        btnDetailJadwalPetani.click();
    }

    @FindBy(xpath = "//p[.='Detail Aktivitas']")
    private static WebElement popUpDetailJadwalPetani;

    public void verifyPopUpDetailJadwalPetani() {
        popUpDetailJadwalPetani.isDisplayed();
    }

    @FindBy(xpath = "//p[.='Detail Aktivitas']/following-sibling::div[2]//table")
    private static WebElement listDetailJadwalPetani;
    public void verifyListDetailJadwalPetani() {
        listDetailJadwalPetani.isDisplayed();
    }

    @FindBy(xpath = "//p[.='Detail Aktivitas']/following-sibling::div[3]//label[.='Kembali']")
    private static WebElement BtnClosePopUpDetailJadwalPetani;

    public void clickBtnClosePopUpDetailJadwalPetani() {
        BtnClosePopUpDetailJadwalPetani.isDisplayed();
        BtnClosePopUpDetailJadwalPetani.click();
    }
}
