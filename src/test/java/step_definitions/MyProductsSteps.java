package step_definitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.example.pageObject.MyProductsFeature;
import org.openqa.selenium.WebDriver;

import java.time.Duration;

import static step_definitions.Hooks.webDriver;

public class MyProductsSteps {
    private WebDriver webDriver;
    public MyProductsSteps(){
        super();
        this.webDriver = Hooks.webDriver;
    }

    @And("User click menu Produk Saya")
    public void userClickMenuProdukSaya() {
        MyProductsFeature myProductFeature = new MyProductsFeature(webDriver);
        myProductFeature.clickMenuProdukSaya();
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    }

    @Then("User already on My Product page")
    public void userAlreadyOnMyProductPage() {
        MyProductsFeature myProductFeature = new MyProductsFeature(webDriver);
        myProductFeature.verifyMyProductPage();
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    }

    @And("List My Product will show")
    public void listProductWillShow() {
        MyProductsFeature myProductFeature = new MyProductsFeature(webDriver);
        myProductFeature.verifyListMyProduct();
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    }

    @When("User click on button tambah produk")
    public void userClickOnButtonTambahProduk() {
        MyProductsFeature myProductFeature = new MyProductsFeature(webDriver);
        myProductFeature.clickBtnTambahProduk();
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    }

    @Then("Pop Up Form Tambah Produk will show")
    public void popUpFormTambahWillShow() {
        MyProductsFeature myProductFeature = new MyProductsFeature(webDriver);
        myProductFeature.verifyPopUpFormTambahProduk();
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    }

    @When("User input new \"(.*)\" in field Nama Produk Saya")
    public void userInputNewInFieldNamaProduk(String namaProduk) {
        MyProductsFeature myProductFeature = new MyProductsFeature(webDriver);
        myProductFeature.setNewNamaProduk(namaProduk);
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    }

    @And("User input new (\\d+) in field Harga Produk Saya")
    public void userInputNewInFieldHargaProduk(int hargaProduk) {
        MyProductsFeature myProductFeature = new MyProductsFeature(webDriver);
        myProductFeature.setNewHargaProduk(hargaProduk);
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    }

    @And("User input new (\\d+) in field Stok Produk Saya")
    public void userInputNewInFieldStokProduk(int stokProduk) {
        MyProductsFeature myProductFeature = new MyProductsFeature(webDriver);
        myProductFeature.setNewStokProduk(stokProduk);
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    }

    @And("User input new \"(.*)\" in field Deskripsi Produk Saya")
    public void userInputNewInFieldDeskripsiProduk(String desc) {
        MyProductsFeature myProductFeature = new MyProductsFeature(webDriver);
        myProductFeature.setDeskripsiProduk(desc);
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    }

    @And("User click on simpan tambah produk button")
    public void userClickOnSimpanTambahProdukButton() {
        MyProductsFeature myProductFeature = new MyProductsFeature(webDriver);
        myProductFeature.clickBtnSimpanTambahProduk();
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    }

    @Then("User already success add new product")
    public void userAlreadySuccessAddNewProduct() {
        MyProductsFeature myProductFeature = new MyProductsFeature(webDriver);
        myProductFeature.verifySuccessNewProduct();
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    }

    @And("User upload product files \"(.*)\" on field choose file")
    public void userUploadProductFilesOnFieldChooseFile(String namaFiles) {
        MyProductsFeature myProductFeature = new MyProductsFeature(webDriver);
        myProductFeature.setImageMyProduct(namaFiles);
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    }

    @When("User click on edit in product \"(.*)\"")
    public void userClickOnEditInProduct(String namaProduk) {
        MyProductsFeature myProductFeature = new MyProductsFeature(webDriver);
        myProductFeature.clickBtnEditProduct(namaProduk);
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    }

    @Then("User already in Edit Product page")
    public void userAlreadyInEditProductPage() {
        MyProductsFeature myProductFeature = new MyProductsFeature(webDriver);
        myProductFeature.verifyEditProductPage();
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    }

    @When("User click on button edit produk")
    public void userClickOnButtonEditProduk() {
        MyProductsFeature myProductFeature = new MyProductsFeature(webDriver);
        myProductFeature.clickBtnEditDetailProduk();
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    }

    @Then("Pop Up edit product will show")
    public void popUpEditProductWillShow() {
        MyProductsFeature myProductFeature = new MyProductsFeature(webDriver);
        myProductFeature.verifyPopUpEditProduct();
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    }

    @When("User edit nama produk in field Nama Produk Saya")
    public void userEditInFieldNamaProdukSaya() {
        MyProductsFeature myProductFeature = new MyProductsFeature(webDriver);
        myProductFeature.setEditNamaProduk();
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    }

    @And("User edit (\\d+) in field Harga Produk Saya")
    public void userEditInFieldHargaProdukSaya(int harga) {
        MyProductsFeature myProductFeature = new MyProductsFeature(webDriver);
        myProductFeature.setEditHargaProduk(harga);
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    }

    @And("User edit (\\d+) in field Stok Produk Saya")
    public void userEditInFieldStokProdukSaya(int stok) {
        MyProductsFeature myProductFeature = new MyProductsFeature(webDriver);
        myProductFeature.setEditStokProduk(stok);
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    }

    @And("User edit \"(.*)\" in field Deskripsi Produk Saya")
    public void userEditInFieldDeskripsiProdukSaya(String desc) {
        MyProductsFeature myProductFeature = new MyProductsFeature(webDriver);
        myProductFeature.setEditDeskripsiProduk(desc);
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    }

    @And("User click on simpan edit produk button")
    public void userClickOnSimpanEditProdukButton() {
        MyProductsFeature myProductFeature = new MyProductsFeature(webDriver);
        myProductFeature.clickBtnSimpanEditProduk();
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    }

    @Then("User already success edit product")
    public void userAlreadySuccessEditProduct() {
        MyProductsFeature myProductFeature = new MyProductsFeature(webDriver);
        myProductFeature.verifySuccessEditProduct();
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    }

    @When("User emptying in field Nama Produk")
    public void userEmptyingInFieldNamaProduk() {
        MyProductsFeature myProductFeature = new MyProductsFeature(webDriver);
        myProductFeature.setEmptyNamaProduk();
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    }

    @And("User emptying in field Harga Produk Saya")
    public void userEmptyingInFieldHargaProdukSaya() {
        MyProductsFeature myProductFeature = new MyProductsFeature(webDriver);
        myProductFeature.setEmptyHargaProduk();
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    }

    @And("User emptying in field Stok Produk")
    public void userEmptyingInFieldStokProduk() {
        MyProductsFeature myProductFeature = new MyProductsFeature(webDriver);
        myProductFeature.setEmptyStokProduk();
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    }

    @And("User emptying in field Deskripsi Produk")
    public void userEmptyingInFieldDeskripsiProduk() {
        MyProductsFeature myProductFeature = new MyProductsFeature(webDriver);
        myProductFeature.setEmptyDeskripsiProduk();
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    }

    @When("User click on Ganti Gambar button")
    public void userClickOnGantiGambarButton() {
        MyProductsFeature myProductFeature = new MyProductsFeature(webDriver);
        myProductFeature.clickBtnGantiGambar();
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    }

    @Then("Pop Up Ganti Gambar will show")
    public void popUpGantiGambarWillShow() {
        MyProductsFeature myProductFeature = new MyProductsFeature(webDriver);
        myProductFeature.verifyPopUpGantiGambar();
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    }

    @And("User click on simpan edit gambar produk button")
    public void userClickOnSimpanEditGambarProdukButton() {
        MyProductsFeature myProductFeature = new MyProductsFeature(webDriver);
        myProductFeature.clickBtnSimpanGantiGambar();
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    }

    @Then("User already success edit image product")
    public void userAlreadySuccessEditImageProduct() {
        MyProductsFeature myProductFeature = new MyProductsFeature(webDriver);
        myProductFeature.verifySuccessEditImage();
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    }

    @When("User click on delete produk button")
    public void userClickOnDeleteProdukButton() {
        MyProductsFeature myProductFeature = new MyProductsFeature(webDriver);
        myProductFeature.clickBtnDeleteProduct();
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    }

    @Then("Pop Up Konfirmasi delete produk will show")
    public void popUpKonfirmasiDeleteProdukWillShow() {
        MyProductsFeature myProductFeature = new MyProductsFeature(webDriver);
        myProductFeature.verifyPopKonfirmasiDelete();
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    }

    @When("User click on ok delete product")
    public void userClickOnOkDeleteProduct() {
        MyProductsFeature myProductFeature = new MyProductsFeature(webDriver);
        myProductFeature.clickOkDeleteProduct();
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    }

    @Then("User success delete product")
    public void userSuccessDeleteProduct() {
        MyProductsFeature myProductFeature = new MyProductsFeature(webDriver);
        myProductFeature.verifySuccessDeleteProduct();
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    }

    @When("User click on edit in product will delete \"(.*)\"")
    public void userClickOnEditInProductWillDelete(String namaProduk)  {
        MyProductsFeature myProductFeature = new MyProductsFeature(webDriver);
        myProductFeature.clickBtnEditDetailProdukDelete(namaProduk);
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    }
}
