package org.example.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyProductsFeature {
    public WebDriver driver;

    public MyProductsFeature(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    @FindBy(xpath = "//a[.='Produk Saya']")
    private static WebElement menuProdukSaya;

    public void clickMenuProdukSaya() {
        menuProdukSaya.isDisplayed();
        menuProdukSaya.click();
    }

    @FindBy(xpath = "//p[.='Produk Saya']")
    private static WebElement titleProdukSayaPage;

    public void verifyMyProductPage() {
        titleProdukSayaPage.isDisplayed();
        titleProdukSayaPage.click();
    }

    @FindBy(xpath = "//p[.='Produk Saya']/ancestor::div[2]//div[@class='w-full h-full']")
    private static WebElement listProdukSayaPage;

    public void verifyListMyProduct() {
        listProdukSayaPage.isDisplayed();
    }

    @FindBy(xpath = "//p[.='Produk Saya']/following-sibling::label[.='Tambah Produk']")
    private static WebElement btnTambahProdukSaya;

    public void clickBtnTambahProduk() {
        btnTambahProdukSaya.isDisplayed();
        btnTambahProdukSaya.click();
    }

    @FindBy(xpath = "//p[.='Tambah Produk']")
    private static WebElement popUpFormTambahProduk;

    public void verifyPopUpFormTambahProduk() {
        popUpFormTambahProduk.isDisplayed();
    }

    public void setNewNamaProduk(String namaProduk) {
        String path= "//input[@id='name']";
        WebElement fieldNamaProduk = driver.findElement(By.xpath(path));
        Actions build = new Actions(driver);
        build.moveToElement(fieldNamaProduk).build().perform();
        fieldNamaProduk.isDisplayed();
        fieldNamaProduk.sendKeys(namaProduk);
    }

    public void setNewHargaProduk(int hargaProduk) {
        String path= "//input[@id='price']";
        WebElement fieldHargaProduk = driver.findElement(By.xpath(path));
        Actions build = new Actions(driver);
        build.moveToElement(fieldHargaProduk).build().perform();
        fieldHargaProduk.isDisplayed();
        fieldHargaProduk.sendKeys(String.valueOf(hargaProduk));
    }

    public void setNewStokProduk(int stokProduk) {
        String path= "//input[@id='stock']";
        WebElement fieldStokProduk = driver.findElement(By.xpath(path));
        Actions build = new Actions(driver);
        build.moveToElement(fieldStokProduk).build().perform();
        fieldStokProduk.isDisplayed();
        fieldStokProduk.sendKeys(String.valueOf(stokProduk));
    }

    public void setDeskripsiProduk(String desc) {
        String path= "//textarea[@id='description']";
        WebElement fieldDescProduk = driver.findElement(By.xpath(path));
        Actions build = new Actions(driver);
        build.moveToElement(fieldDescProduk).build().perform();
        fieldDescProduk.isDisplayed();
        fieldDescProduk.sendKeys(desc);
    }

    @FindBy(xpath = "//p[.='Tambah Produk']/following-sibling::div[2]//button[@id='btn-submit-add']")
    private static WebElement BtnSimpanTambahProduk;

    public void clickBtnSimpanTambahProduk() {
        BtnSimpanTambahProduk.isDisplayed();
        BtnSimpanTambahProduk.click();
    }

    @FindBy(xpath = "//h2[.='Berhasil menambahkan product']")
    private static WebElement verifySuccessNewProduct;

    public void verifySuccessNewProduct() {
        verifySuccessNewProduct.isDisplayed();
    }

    @FindBy(xpath = "//input[@id='image']")
    private static WebElement uploadImageMyProduct;

    public void setImageMyProduct(String namaFiles) {
        uploadImageMyProduct.isDisplayed();
        uploadImageMyProduct.sendKeys("D:/" +namaFiles);
    }

    public void clickBtnEditProduct(String namaProduk) {
        String path= "//p[text()[contains(.,'"+namaProduk+"')]]/ancestor::div[2]//button[.='edit']";
        WebElement btnEditProduct = driver.findElement(By.xpath(path));
        Actions build = new Actions(driver);
        build.moveToElement(btnEditProduct).build().perform();
        btnEditProduct.isDisplayed();
        btnEditProduct.click();
    }

    @FindBy(xpath = "//label[@id='button-to-edit']")
    private static WebElement btnEditDetail;

    public void verifyEditProductPage() {
        btnEditDetail.isDisplayed();
    }

    public void clickBtnEditDetailProduk() {
        btnEditDetail.click();
    }

    @FindBy(xpath = "//form[@class='flex flex-col gap-2 items-center']")
    private static WebElement popUpFormEditProduct;

    public void verifyPopUpEditProduct() {
        popUpFormEditProduct.isDisplayed();
    }

    public void setEditNamaProduk() {
        String path= "//input[@id='name']";
        WebElement fieldEditNamaProduk = driver.findElement(By.xpath(path));
        Actions build = new Actions(driver);
        build.moveToElement(fieldEditNamaProduk).build().perform();
        fieldEditNamaProduk.isDisplayed();
        fieldEditNamaProduk.sendKeys(" 1");
    }

    public void setEditHargaProduk(int harga) {
        String path= "//input[@id='price']";
        WebElement fieldEditHargaProduk = driver.findElement(By.xpath(path));
        Actions build = new Actions(driver);
        build.moveToElement(fieldEditHargaProduk).build().perform();
        fieldEditHargaProduk.isDisplayed();
        fieldEditHargaProduk.sendKeys(Keys.CONTROL + "a");
        fieldEditHargaProduk.sendKeys(String.valueOf(harga));
    }

    public void setEditStokProduk(int stok) {
        String path= "//input[@id='stock']";
        WebElement fieldEditStokProduk = driver.findElement(By.xpath(path));
        Actions build = new Actions(driver);
        build.moveToElement(fieldEditStokProduk).build().perform();
        fieldEditStokProduk.isDisplayed();
        fieldEditStokProduk.sendKeys(Keys.CONTROL + "a");
        fieldEditStokProduk.sendKeys(String.valueOf(stok));
    }

    public void setEditDeskripsiProduk(String desc) {
        String path= "//textarea[@id='description']";
        WebElement fieldEditDescProduk = driver.findElement(By.xpath(path));
        Actions build = new Actions(driver);
        build.moveToElement(fieldEditDescProduk).build().perform();
        fieldEditDescProduk.isDisplayed();
        fieldEditDescProduk.sendKeys(Keys.CONTROL + "a");
        fieldEditDescProduk.sendKeys(desc);
    }

    @FindBy(xpath = "//button[@id='btn-edit']")
    private static WebElement SimpanEditProduk;

    public void clickBtnSimpanEditProduk() {
        SimpanEditProduk.isDisplayed();
        SimpanEditProduk.click();
    }

    @FindBy(xpath = "//h2[@id='swal2-title']")
    private static WebElement verifySuccessEditProduct;

    public void verifySuccessEditProduct() {
        verifySuccessEditProduct.isDisplayed();
    }

    public void setEmptyDeskripsiProduk() {
        String path= "//textarea[@id='description']";
        WebElement fieldEditDescProduk = driver.findElement(By.xpath(path));
        Actions build = new Actions(driver);
        build.moveToElement(fieldEditDescProduk).build().perform();
        fieldEditDescProduk.sendKeys(Keys.CONTROL + "a");
        fieldEditDescProduk.sendKeys(Keys.DELETE);
    }

    public void setEmptyStokProduk() {
        String path= "//input[@id='stock']";
        WebElement fieldEditStokProduk = driver.findElement(By.xpath(path));
        Actions build = new Actions(driver);
        build.moveToElement(fieldEditStokProduk).build().perform();
        fieldEditStokProduk.sendKeys(Keys.CONTROL + "a");
        fieldEditStokProduk.sendKeys(Keys.DELETE);
    }

    public void setEmptyHargaProduk() {
        String path= "//input[@id='price']";
        WebElement fieldEditStokProduk = driver.findElement(By.xpath(path));
        Actions build = new Actions(driver);
        build.moveToElement(fieldEditStokProduk).build().perform();
        fieldEditStokProduk.sendKeys(Keys.CONTROL + "a");
        fieldEditStokProduk.sendKeys(Keys.DELETE);
    }

    public void setEmptyNamaProduk() {
        String path= "//input[@id='name']";
        WebElement fieldEditNamaProduk = driver.findElement(By.xpath(path));
        Actions build = new Actions(driver);
        build.moveToElement(fieldEditNamaProduk).build().perform();
        fieldEditNamaProduk.sendKeys(Keys.CONTROL + "a");
        fieldEditNamaProduk.sendKeys(Keys.DELETE);
    }

    @FindBy(xpath = "//label[@id='button-to-ganti']")
    private static WebElement btnGantiGambar;

    public void clickBtnGantiGambar() {
        btnGantiGambar.isDisplayed();
        btnGantiGambar.click();
    }

    @FindBy(xpath = "//p[.='Edit Image']")
    private static WebElement popUpGantiGambar;

    public void verifyPopUpGantiGambar() {
        popUpGantiGambar.isDisplayed();
    }

    @FindBy(xpath = "//p[.='Edit Image']/following-sibling::div[3]//button[.='Simpan']")
    private static WebElement btnSimpanGantiGambar;

    public void clickBtnSimpanGantiGambar() {
        btnSimpanGantiGambar.isDisplayed();
        btnSimpanGantiGambar.click();
    }

    @FindBy(xpath = "//h2[.='Berhasil mengupdate image product']")
    private static WebElement verifySuccessImgEditProduct;

    public void verifySuccessEditImage() {
        verifySuccessImgEditProduct.isDisplayed();
    }

    public void clickBtnEditDetailProdukDelete(String namaProduk) {
        String firstpath = "//div[@class='w-full grid grid-cols-1 md:grid-cols-2 lg:grid-cols-3 gap-10']/div[contains(.//p, '";
        String secondpath = namaProduk + "')][1]//button[.='edit']";
        String path = firstpath+secondpath;
        WebElement btnEditDelete = driver.findElement(By.xpath(path));
        Actions build = new Actions(driver);
        build.moveToElement(btnEditDelete).build().perform();
        btnEditDelete.isDisplayed();
        btnEditDelete.click();
    }

    @FindBy(xpath = "//button[@id='button-to-delete']")
    private static WebElement btnDeleteProduct;

    public void clickBtnDeleteProduct() {
        btnDeleteProduct.isDisplayed();
        btnDeleteProduct.click();
    }

    @FindBy(xpath = "//h2[text()[contains(.,'Hapus')]][@class='swal2-title']")
    private static WebElement popUpKonfirmasiDelete;

    public void verifyPopKonfirmasiDelete() {
        popUpKonfirmasiDelete.isDisplayed();
    }

    @FindBy(xpath = "//h2[@class='swal2-title']/following-sibling::div[@class='swal2-actions']//button[.='OK']")
    private static WebElement btnOkDeleteProduct;

    public void clickOkDeleteProduct() {
        btnOkDeleteProduct.isDisplayed();
        btnOkDeleteProduct.click();
    }

    @FindBy(xpath = "//h2[text()[contains(.,'Berhasil menghapus data produk')]][@class='swal2-title']")
    private static WebElement verifySuccessDelete;

    public void verifySuccessDeleteProduct() {
        verifySuccessDelete.isDisplayed();
    }
}
