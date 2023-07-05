package org.example.pageObject;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PlantTemplatesFeature {
    public WebDriver driver;

    public PlantTemplatesFeature(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    @FindBy(xpath = "//a[.='Jadwal Tanam']")
    private static WebElement menuJadwalTanam;

    public void clickMenuProfile() {
        menuJadwalTanam.isDisplayed();
        menuJadwalTanam.click();
    }

    @FindBy(xpath = "//p[.='Jadwal Tanam']")
    private static WebElement titleJadwalTanamPage;

    public void verifyJadwalTanamPage() {
        titleJadwalTanamPage.isDisplayed();
    }

    @FindBy(xpath = "//label[.='Tambah Jadwal']")
    private static WebElement TambahJadwal;
    public void clickBtnTambahJadwal() {
        TambahJadwal.isDisplayed();
        TambahJadwal.click();
    }

    @FindBy(xpath = "//p[.='Tambah Jadwal']")
    private static WebElement popUpTambahJadwal;

    public void verifyPopUpTambahJadwal() {
        popUpTambahJadwal.isDisplayed();
    }

    @FindBy(xpath = "//p[.='Tambah Jadwal']/following-sibling::div[1]/div/div/input")
    private static WebElement inputNewJadwal;

    public void setNewTanaman(String newTanaman) {
        inputNewJadwal.isDisplayed();
        inputNewJadwal.sendKeys(newTanaman);
    }

    @FindBy(xpath = "//p[.='Tambah Jadwal']/following-sibling::div[2]/div/button[.='Simpan']")
    private static WebElement saveBtnJadwalNew;

    public void clickSaveBtnJadwalNew() {
        saveBtnJadwalNew.isDisplayed();
        saveBtnJadwalNew.click();
    }

    @FindBy(xpath = "//div[.='Berhasil Membuat Template Baru']")
    private static WebElement successTambah;

    public void verifySuccessTambahJadwal() {
        successTambah.isDisplayed();
    }

    public void verifyErrMessage(String message) {
        String messagePopUp = "//h2[.='Failed']/following-sibling::div[1][text()[contains(.,'"+message+"')]]";
        driver.findElement(By.xpath(messagePopUp)).isDisplayed();
    }

    public void clickDetailJadwal(String nameTemplate) {
        String path= "//td[.='"+nameTemplate+"']/following-sibling::td[1]/button";
        driver.findElement(By.xpath(path)).isDisplayed();
        WebElement icon = driver.findElement(By.xpath(path));
        Actions build = new Actions(driver);
        build.moveToElement(icon).build().perform();
        icon.click();
    }

    public void verifyDetailJadwalPage(String nameTemplate) {
        String path= "//p[text()[contains(.,'Detail Jadwal :') or contains(text(),'"+nameTemplate+"')]]";
        driver.findElement(By.xpath(path)).isDisplayed();
    }

    public void clickEditJadwal(String nameTemplate) {
        String path= "//td[.='"+nameTemplate+"']/following-sibling::td[2]/label";
        driver.findElement(By.xpath(path)).isDisplayed();
        driver.findElement(By.xpath(path)).click();
    }

    @FindBy(xpath = "//p[.='Ubah Nama Jadwal']")
    private static WebElement popUpEditJadwal;

    public void verifyPopUpEditJadwal() {
        popUpEditJadwal.isDisplayed();
    }

    @FindBy(xpath = "//h2[.='Berhasil Memperbarui Data Template']")
    private static WebElement successEdit;

    public void verifySuccessEditJadwal() {
        successEdit.isDisplayed();
    }

    public void clickSaveBtnEditJadwal() {
        String path= "//p[.='Ubah Nama Jadwal']/following-sibling::div[2]/div/button[.='Simpan']";
        driver.findElement(By.xpath(path)).isDisplayed();
        driver.findElement(By.xpath(path)).click();
    }

    public void setEditTanaman(String tanaman, String randTanaman) {
        String path= "//p[.='Ubah Nama Jadwal']/following-sibling::div[1]//input[@value='"+tanaman+"']";
        driver.findElement(By.xpath(path)).isDisplayed();
        driver.findElement(By.xpath(path)).sendKeys(" "+randTanaman);
    }

    public void setEditTanamanEmpty(String tanaman) {
        String path= "//p[.='Ubah Nama Jadwal']/following-sibling::div[1]//input[@value='"+tanaman+"']";
        driver.findElement(By.xpath(path)).isDisplayed();
        driver.findElement(By.xpath(path)).sendKeys(Keys.CONTROL + "a");
        driver.findElement(By.xpath(path)).sendKeys(Keys.DELETE);
    }

    @FindBy(xpath = "//label[.='Tambah Aktivitas']")
    private static WebElement TambahAktivitas;

    public void clickBtnTambahAktivitas() {
        TambahAktivitas.isDisplayed();
        TambahAktivitas.click();
    }

    @FindBy(xpath = "//div[@class='h-full w-full flex flex-col items-center justify-center']/div[1]//p[.='Tambah Aktivitas']")
    private static WebElement popUpTambahAktivitas;

    public void verifyPopUpTambahAktivitas() {
        popUpTambahAktivitas.isDisplayed();
    }

    public void setNewNameAktivitas(String nameActivity) {
        String path= "//div[@class='h-full w-full flex flex-col items-center justify-center']/div[1]//p[text()[contains(.,'Nama Aktivitas')]]/following-sibling::div//input";
        driver.findElement(By.xpath(path)).isDisplayed();
        driver.findElement(By.xpath(path)).sendKeys(nameActivity);
    }

    public void setNewDayAktivitas(int day) {
        String path= "//div[@class='h-full w-full flex flex-col items-center justify-center']/div[1]//p[text()[contains(.,'pada hari')]]/following-sibling::div//input";
        driver.findElement(By.xpath(path)).isDisplayed();
        if (day > 0){
            driver.findElement(By.xpath(path)).sendKeys(String.valueOf(day));
        }
    }

    @FindBy(xpath = "//div[@class='h-full w-full flex flex-col items-center justify-center']/div[1]//p[.='Tambah Aktivitas']/following-sibling::div[2]/div/button[.='Simpan']")
    private static WebElement saveBtnAktivitasNew;

    public void clickSaveBtnAktivitasNew() {
        saveBtnAktivitasNew.isDisplayed();
        saveBtnAktivitasNew.click();
    }

    @FindBy(xpath = "//div[.='Berhasil Membuat Template Baru']")
    private static WebElement successTambahAktivitas;

    public void verifySuccessTambahAktivitas() {
        successTambahAktivitas.isDisplayed();
    }

    public void clickEditAktivitas(String namaAktivitas) {
        String path = "//td[.='" +namaAktivitas+ "']/following-sibling::td[2]/label";
        driver.findElement(By.xpath(path)).isDisplayed();
        driver.findElement(By.xpath(path)).click();
    }

    @FindBy(xpath = "//div[@class='h-full w-full flex flex-col items-center justify-center']/div[2]//p[.='Tambah Aktivitas']")
    private static WebElement popUpEditAktivitas;

    public void verifyPopUpEditAktivitas() {
        popUpEditAktivitas.isDisplayed();
    }

    public void setEditAktivitas(String aktivitas, String randAktivitas) {
        String firstpath= "//div[@class='h-full w-full flex flex-col items-center justify-center']";
        String secondpath = "/div[2]//p[text()[contains(.,'Nama Aktivitas')]]/following-sibling::div//input['" +aktivitas+"']";
        String path = firstpath + secondpath;
        driver.findElement(By.xpath(path)).isDisplayed();
        driver.findElement(By.xpath(path)).sendKeys(" "+randAktivitas);
    }

    public void setEditDayAktivitas(int day) {
        String firstpath = "//div[@class='h-full w-full flex flex-col items-center justify-center']";
        String secondpath = "/div[2]//p[text()[contains(.,'Aktivitas pada hari ke')]]/following-sibling::div//input";
        String path = firstpath + secondpath;
        driver.findElement(By.xpath(path)).isDisplayed();
        driver.findElement(By.xpath(path)).sendKeys(String.valueOf(day));
    }

    @FindBy(xpath = "//div[@class='h-full w-full flex flex-col items-center justify-center']/div[2]//p[.='Tambah Aktivitas']/following-sibling::div[2]/div/button[.='Simpan']")
    private static WebElement saveBtnAktivitasEdit;

    public void clickSaveBtnAktivitasEdit() {
        saveBtnAktivitasEdit.isDisplayed();
        saveBtnAktivitasEdit.click();
    }

    @FindBy(xpath = "//h2[.='Berhasil Memperbarui Data Template']")
    private static WebElement successEditAktivitas;

    public void verifySuccessEditAktvitas() {
        successEditAktivitas.isDisplayed();
    }
    public void setEditNamaAktivitasEmpty(String aktivitas) {
        String firstpath= "//div[@class='h-full w-full flex flex-col items-center justify-center']";
        String secondpath = "/div[2]//p[text()[contains(.,'Nama Aktivitas')]]/following-sibling::div//input['" +aktivitas+"']";
        String path = firstpath + secondpath;
        driver.findElement(By.xpath(path)).isDisplayed();
        driver.findElement(By.xpath(path)).sendKeys(Keys.CONTROL + "a");
        driver.findElement(By.xpath(path)).sendKeys(Keys.DELETE);
    }

    public void setEditHariAktivitasEmpty() {
        String firstpath = "//div[@class='h-full w-full flex flex-col items-center justify-center']";
        String secondpath = "/div[2]//p[text()[contains(.,'Aktivitas pada hari ke')]]/following-sibling::div//input";
        String path = firstpath + secondpath;
        driver.findElement(By.xpath(path)).isDisplayed();
        driver.findElement(By.xpath(path)).sendKeys(Keys.CONTROL + "a");
        driver.findElement(By.xpath(path)).sendKeys(Keys.DELETE);
    }

    public void clickBtnHapusAktivitas() {
        String path= "//table[@class='table bg-base-100']//tr[last()]//td[4]/button";
        WebElement btnHapus = driver.findElement(By.xpath(path));
        Actions build = new Actions(driver);
        build.moveToElement(btnHapus).build().perform();
        btnHapus.click();
    }

    @FindBy(xpath = "//h2[.='Hapus Jadwal']")
    private static WebElement popUpHapusAktivitas;

    public void verifyPopUpHapusAktivitas() {
        popUpHapusAktivitas.isDisplayed();
    }

    @FindBy(xpath = "//h2[.='Hapus Jadwal']/following-sibling::div[5]/button[.='OK']")
    private static WebElement btnHapusAktivitas;

    public void clickBtnOkHapusAktivitas() {
        btnHapusAktivitas.isDisplayed();
        btnHapusAktivitas.click();
    }

    @FindBy(xpath = "//h2[.='Berhasil Menghapus Data Template']")
    private static WebElement successHapusAktivitas;

    public void verifySuccessHapusAktivitas() {
        successHapusAktivitas.isDisplayed();
        successHapusAktivitas.click();
    }

    public void clickBtnHapusJadwal() {
        String path= "//table[@class='table bg-base-100']/tbody/tr[last()]//td[4]/button";
        WebElement btnHapus = driver.findElement(By.xpath(path));
        Actions build = new Actions(driver);
        build.moveToElement(btnHapus).build().perform();
        btnHapus.click();
    }

    @FindBy(xpath = "//h2[.='Hapus Jadwal']")
    private static WebElement popUpHapusJadwal;

    public void verifyPopUpHapusJadwal() {
        popUpHapusJadwal.isDisplayed();
    }

    @FindBy(xpath = "//h2[.='Hapus Jadwal']/following-sibling::div[5]/button[.='OK']")
    private static WebElement btnHapusJadwal;

    public void clickBtnOkHapusJadwal() {
        btnHapusJadwal.isDisplayed();
        btnHapusJadwal.click();
    }

    @FindBy(xpath = "//h2[.='Berhasil Menghapus Data Template']")
    private static WebElement successHapusJadwal;

    public void verifySuccessHapusJadwal() {
        successHapusJadwal.isDisplayed();
        successHapusJadwal.click();
    }
}
