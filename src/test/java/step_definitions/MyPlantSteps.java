package step_definitions;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.apache.commons.lang3.RandomStringUtils;
import org.example.pageObject.MyPlantFeature;
import org.openqa.selenium.WebDriver;

import java.time.Duration;
import java.util.Objects;

public class MyPlantSteps {
    private WebDriver webDriver;
    public MyPlantSteps(){
        super();
        this.webDriver = Hooks.webDriver;
    }
    @And("User click menu Tanam Sekarang")
    public void userClickMenuTanamSekarang() {
        MyPlantFeature myPlantFeature = new MyPlantFeature(webDriver);
        myPlantFeature.clickMenuTanamSekarang();
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    }

    @Then("User already on Create Plant page")
    public void userAlreadyOnCreatePlantPage() {
        MyPlantFeature myPlantFeature = new MyPlantFeature(webDriver);
        myPlantFeature.verifyCreatePlantPage();
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    }

    @And("Start Plant form will show")
    public void startPlantFormWillShow() {
        MyPlantFeature myPlantFeature = new MyPlantFeature(webDriver);
        myPlantFeature.verifyFormStartPlant();
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    }

    @When("User input new \"(.*)\" in field Nama Tanaman")
    public void userInputNewInFieldNamaTanaman(String namaPlant) {
        MyPlantFeature myPlantFeature = new MyPlantFeature(webDriver);
        if(Objects.equals(namaPlant, "")){
            myPlantFeature.setNamaTanaman(namaPlant);
        } else {
            String randNamaPlant = namaPlant+ " " + RandomStringUtils.randomAlphabetic(5);
            myPlantFeature.setNamaTanaman(randNamaPlant);
        }
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    }

    @And("User select \"(.*)\" as Jenis Tanaman")
    public void userSelectAsJenisTanaman(String jenisPlant) {
        MyPlantFeature myPlantFeature = new MyPlantFeature(webDriver);
        myPlantFeature.setJenisTanaman(jenisPlant);
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    }

    @And("User select today's date as Tanggal Mulai")
    public void userSelectTodaySDateAsTanggalMulai() {
        MyPlantFeature myPlantFeature = new MyPlantFeature(webDriver);
        myPlantFeature.setDatePlant();
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    }

    @And("User click on button simpan start plant")
    public void userClickOnButtonSimpanStartPlant() {
        MyPlantFeature myPlantFeature = new MyPlantFeature(webDriver);
        myPlantFeature.clickBtnSimpanStartPlant();
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    }

    @Then("User success create new plant")
    public void userSuccessCreateNewPlant() {
        MyPlantFeature myPlantFeature = new MyPlantFeature(webDriver);
        myPlantFeature.verifySuccessCreateNewPlant();
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    }

    @When("User click on ok in pop up success create new plant")
    public void userClickOnOkInPopUpSuccessCreateNewPlant() {
        MyPlantFeature myPlantFeature = new MyPlantFeature(webDriver);
        myPlantFeature.clickBtnOkCreateNewPlant();
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    }

    @Then("User already on my plant page")
    public void userAlreadyOnMyPlantPage() {
        MyPlantFeature myPlantFeature = new MyPlantFeature(webDriver);
        myPlantFeature.verifyMyPlantPage();
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    }

    @And("User click menu Tanaman Saya")
    public void userClickMenuTanamanSaya() {
        MyPlantFeature myPlantFeature = new MyPlantFeature(webDriver);
        myPlantFeature.clickMenuTanamanSaya();
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    }


    @When("User click on detail in plant \"(.*)\"")
    public void userClickOnDetailInPlant(String plantTemplate) {
        MyPlantFeature myPlantFeature = new MyPlantFeature(webDriver);
        myPlantFeature.clickDetailPlant(plantTemplate);
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    }

    @Then("User already on my plant detail \"(.*)\"")
    public void userAlreadyOnMyPlantDetail(String plantTemplate) {
        MyPlantFeature myPlantFeature = new MyPlantFeature(webDriver);
        myPlantFeature.verifyDetailMyPlantPage(plantTemplate);
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    }

    @And("Detail activity my plant \"(.*)\" will show")
    public void detailActivityMyPlantWillShow(String plantTemplate) {
        MyPlantFeature myPlantFeature = new MyPlantFeature(webDriver);
        myPlantFeature.verifyListDetailMyPlant(plantTemplate);
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    }

    @When("User click on selesai in not finished activity")
    public void userClickOnSelesaiInNotFinishedActivity() {
        MyPlantFeature myPlantFeature = new MyPlantFeature(webDriver);
        myPlantFeature.clickBtnFinishActivity();
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    }

    @Then("Konfirmasi Selesai pop up will show")
    public void konfirmasiSelesaiPopUpWillShow() {
        MyPlantFeature myPlantFeature = new MyPlantFeature(webDriver);
        myPlantFeature.verifyPopUpFinish();
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    }

    @When("User click on ok to finish activity")
    public void userClickOnOkToFinishActivity() {
        MyPlantFeature myPlantFeature = new MyPlantFeature(webDriver);
        myPlantFeature.clickBtnOkFinishActivity();
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    }

    @Then("User success finishing the activity")
    public void userSuccessFinishingTheActivity() {
        MyPlantFeature myPlantFeature = new MyPlantFeature(webDriver);
        myPlantFeature.verifySuccessFinishActivity();
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    }

    @When("User click delete in plant")
    public void userClickDeleteInPlant() {
        MyPlantFeature myPlantFeature = new MyPlantFeature(webDriver);
        myPlantFeature.clickBtnDeleteinPlant();
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    }

    @Then("Konfirmasi Hapus pop up will show")
    public void konfirmasiHapusPopUpWillShow() {
        MyPlantFeature myPlantFeature = new MyPlantFeature(webDriver);
        myPlantFeature.verifyPopUpDelete();
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    }

    @When("User click on ok to delete plant")
    public void userClickOnOkToDeletePlant() {
        MyPlantFeature myPlantFeature = new MyPlantFeature(webDriver);
        myPlantFeature.clickBtnOkDeletePlant();
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    }

    @Then("User success delete the plant")
    public void userSuccessDeleteThePlant() {
        MyPlantFeature myPlantFeature = new MyPlantFeature(webDriver);
        myPlantFeature.verifySuccessDeletePlant();
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    }

    @And("Noticification Plant Activity will show if there is activity to do")
    public void noticificationPlantActivityWillShowIfThereIsActivityToDo() {
        MyPlantFeature myPlantFeature = new MyPlantFeature(webDriver);
        myPlantFeature.verifyNotificationActivity();
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    }

    @When("User click button go in notification bar plant activity")
    public void userClickButtonGoInNotificationBarPlantActivity() {
        MyPlantFeature myPlantFeature = new MyPlantFeature(webDriver);
        myPlantFeature.clickBtnGoInNotifBar();
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    }
}
