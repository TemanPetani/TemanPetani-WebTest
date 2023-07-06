package step_definitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.example.pageObject.ProductsAdminFeature;
import org.openqa.selenium.WebDriver;

import java.time.Duration;

public class ProductsAdminSteps {
    private WebDriver webDriver;
    public ProductsAdminSteps(){
        super();
        this.webDriver = Hooks.webDriver;
    }
    @And("List Product Homepage will show")
    public void listProductHomepageWillShow() {
        ProductsAdminFeature productsAdminFeature = new ProductsAdminFeature(webDriver);
        productsAdminFeature.verifyListProductHomepage();
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    }

    @When("User click on button detail product admin")
    public void userClickOnDetailProduct() {
        ProductsAdminFeature productsAdminFeature = new ProductsAdminFeature(webDriver);
        productsAdminFeature.clickBtnDetailProduct();
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    }

    @Then("Detail Product Admin will show")
    public void detailProductWillShow() {
        ProductsAdminFeature productsAdminFeature = new ProductsAdminFeature(webDriver);
        productsAdminFeature.verifyDetailProductPage();
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    }

    @When("User input (\\d+) in field nego harga")
    public void userInputNegoHargaInFieldNegoHarga(int negoHarga) {
        ProductsAdminFeature productsAdminFeature = new ProductsAdminFeature(webDriver);
        productsAdminFeature.setNegoHargaProduct(negoHarga);
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    }

    @And("User input (\\d+) in field jumlah")
    public void userInputQuantityInFieldJumlah(int quantity) {
        ProductsAdminFeature productsAdminFeature = new ProductsAdminFeature(webDriver);
        productsAdminFeature.setQuantityProduct(quantity);
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    }

    @And("User click button tawar produk")
    public void userClickButtonTawarProduk() {
        ProductsAdminFeature productsAdminFeature = new ProductsAdminFeature(webDriver);
        productsAdminFeature.clickBtnTawarProduk();
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    }

    @Then("User success tawar harga product")
    public void userSuccessTawarHargaProduct() {
        ProductsAdminFeature productsAdminFeature = new ProductsAdminFeature(webDriver);
        productsAdminFeature.verifySuccessTawarProduct();
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
    }

    @When("User emptying in field nego harga")
    public void userEmptyingInFieldNegoHarga() {
        ProductsAdminFeature productsAdminFeature = new ProductsAdminFeature(webDriver);
        productsAdminFeature.setQuantityProductEmpty();
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    }
}
