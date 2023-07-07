package step_definitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.example.pageObject.ProductsUserFeature;
import org.openqa.selenium.WebDriver;

import java.time.Duration;

public class ProductsUserSteps {
    private WebDriver webDriver;
    public ProductsUserSteps(){
        super();
        this.webDriver = Hooks.webDriver;
    }
    @When("User click on detail product user button")
    public void userClickOnDetailProductUserButton() {
        ProductsUserFeature productsUserFeature = new ProductsUserFeature(webDriver);
        productsUserFeature.clickBtnDetailProduct();
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    }

    @Then("User already on detail product user")
    public void userAlreadyOnDetailProductUser() {
        ProductsUserFeature productsUserFeature = new ProductsUserFeature(webDriver);
        productsUserFeature.verifyDetailProductUser();
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    }

    @When("User click on beli sekarang")
    public void userClickOnBeliSekarang() {
        ProductsUserFeature productsUserFeature = new ProductsUserFeature(webDriver);
        productsUserFeature.clickBtnBeliProduct();
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    }

    @Then("Pop detail pembelian will show")
    public void popDetailPembelianWillShow() {
        ProductsUserFeature productsUserFeature = new ProductsUserFeature(webDriver);
        productsUserFeature.verifyPopUpDetailPembelian();
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    }

    @When("User select bank \"(.*)\" in field pilih bank product pembelian")
    public void userSelectBankInFieldPilihBankProductPembelian(String bank) {
        ProductsUserFeature productsUserFeature = new ProductsUserFeature(webDriver);
        productsUserFeature.setNamaBank(bank);
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    }

    @And("User input product pembelian (\\d+) in field jumlah")
    public void userInputJumlahInFieldJumlahProductPembelian(int jumlahProduct) {
        ProductsUserFeature productsUserFeature = new ProductsUserFeature(webDriver);
        productsUserFeature.setJumlahProduct(jumlahProduct);
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    }

    @And("User input catatan product \"(.*)\" in field catatan")
    public void userInputInFieldCatatanProductPembelian(String catatan) {
        ProductsUserFeature productsUserFeature = new ProductsUserFeature(webDriver);
        productsUserFeature.setCatatanProduct(catatan);
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    }

    @And("User click on konfirmasi pembelian")
    public void userClickOnKonfirmasiPembelian() {
        ProductsUserFeature productsUserFeature = new ProductsUserFeature(webDriver);
        productsUserFeature.clickBtnKonfirmasiPembelian();
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    }

    @Then("User already on pembayaran page")
    public void userAlreadyOnPembayaranPage() {
        ProductsUserFeature productsUserFeature = new ProductsUserFeature(webDriver);
        productsUserFeature.verifyPembayaranPage();
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    }
}
