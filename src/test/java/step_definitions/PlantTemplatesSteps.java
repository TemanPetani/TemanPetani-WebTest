package step_definitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.apache.commons.lang3.RandomStringUtils;
import org.example.pageObject.PlantTemplatesFeature;
import org.openqa.selenium.WebDriver;

import java.time.Duration;
import java.util.Objects;

import static org.apache.commons.lang.RandomStringUtils.randomNumeric;

public class PlantTemplatesSteps {
    private WebDriver webDriver;
    public PlantTemplatesSteps(){
        super();
        this.webDriver = Hooks.webDriver;
    }

    @And("User click menu Jadwal Tanam")
    public void userClickMenuJadwalTanam() {
        PlantTemplatesFeature plantTemplatesFeature = new PlantTemplatesFeature(webDriver);
        plantTemplatesFeature.clickMenuProfile();
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    }

    @Then("User already on Jadwal Tanam page")
    public void userAlreadyOnJadwalTanam() {
        PlantTemplatesFeature plantTemplatesFeature = new PlantTemplatesFeature(webDriver);
        plantTemplatesFeature.verifyJadwalTanamPage();
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    }

    @When("User click button Tambah Jadwal")
    public void userClickButtonTambahJadwal() {
        PlantTemplatesFeature plantTemplatesFeature = new PlantTemplatesFeature(webDriver);
        plantTemplatesFeature.clickBtnTambahJadwal();
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    }

    @Then("Pop up Tambah Jadwal will show")
    public void popUpTambahJadwalWillShow() {
        PlantTemplatesFeature plantTemplatesFeature = new PlantTemplatesFeature(webDriver);
        plantTemplatesFeature.verifyPopUpTambahJadwal();
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    }

    @And("User input \"(.*)\" in field Nama Tanaman")
    public void userInputInFieldNamaTanaman(String tanaman) {
        PlantTemplatesFeature plantTemplatesFeature = new PlantTemplatesFeature(webDriver);
        if(Objects.equals(tanaman, "")){
            plantTemplatesFeature.setNewTanaman(tanaman);
        } else {
            String randTanaman = tanaman+ " " + RandomStringUtils.randomAlphabetic(5);
            plantTemplatesFeature.setNewTanaman(randTanaman);
        }
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    }

    @And("User click on simpan new template button")
    public void userClickOnSimpanNewTemplateButton() {
        PlantTemplatesFeature plantTemplatesFeature = new PlantTemplatesFeature(webDriver);
        plantTemplatesFeature.clickSaveBtnJadwalNew();
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    }

    @Then("User success create new template")
    public void userSuccessCreateNewTemplate() {
        PlantTemplatesFeature plantTemplatesFeature = new PlantTemplatesFeature(webDriver);
        plantTemplatesFeature.verifySuccessTambahJadwal();
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    }

    @Then("should see an error create jadwal message \"(.*)\"")
    public void shouldSeeAnErrorCreateJadwalMessage(String message) {
        PlantTemplatesFeature plantTemplatesFeature = new PlantTemplatesFeature(webDriver);
        plantTemplatesFeature.verifyErrMessage(message);
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    }

    @And("User input Registered Name \"(.*)\" in field Nama Tanaman")
    public void userInputInFieldNamaTanamanRequired(String reqTanaman) {
        PlantTemplatesFeature plantTemplatesFeature = new PlantTemplatesFeature(webDriver);
        plantTemplatesFeature.setNewTanaman(reqTanaman);
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    }

    @When("User click icon detail jadwal in template \"(.*)\"")
    public void userClickIconDetailJadwalInTemplate(String nameTemplate) {
        PlantTemplatesFeature plantTemplatesFeature = new PlantTemplatesFeature(webDriver);
        plantTemplatesFeature.clickDetailJadwal(nameTemplate);
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    }

    @Then("User already on detail jadwal page \"(.*)\"")
    public void userAlreadyOnDetailJadwalPage(String nameTemplate) {
        PlantTemplatesFeature plantTemplatesFeature = new PlantTemplatesFeature(webDriver);
        plantTemplatesFeature.verifyDetailJadwalPage(nameTemplate);
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    }

    @When("User click icon edit jadwal in template \"(.*)\"")
    public void userClickIconEditJadwalInTemplate(String nameTemplate) {
        PlantTemplatesFeature plantTemplatesFeature = new PlantTemplatesFeature(webDriver);
        plantTemplatesFeature.clickEditJadwal(nameTemplate);
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    }

    @Then("Pop up Ubah Nama Jadwal will show")
    public void popUpUbahNamaJadwalWillShow() {
        PlantTemplatesFeature plantTemplatesFeature = new PlantTemplatesFeature(webDriver);
        plantTemplatesFeature.verifyPopUpEditJadwal();
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    }

    @Then("User success edit template")
    public void userSuccessEditTemplate() {
        PlantTemplatesFeature plantTemplatesFeature = new PlantTemplatesFeature(webDriver);
        plantTemplatesFeature.verifySuccessEditJadwal();
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    }

    @And("User edit \"(.*)\" in field Nama Tanaman")
    public void userEditInFieldNamaTanaman(String tanaman) {
        PlantTemplatesFeature plantTemplatesFeature = new PlantTemplatesFeature(webDriver);
        String randTanaman = RandomStringUtils.randomAlphabetic(5);
        plantTemplatesFeature.setEditTanaman(tanaman, randTanaman);
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    }

    @And("User click on simpan edit template button")
    public void userClickOnSimpanEditTemplateButton(){
        PlantTemplatesFeature plantTemplatesFeature = new PlantTemplatesFeature(webDriver);
        plantTemplatesFeature.clickSaveBtnEditJadwal();
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    }

    @And("User emptying in field Nama Tanaman \"(.*)\"")
    public void userEmptyingInFieldNamaTanaman(String tanaman) {
        PlantTemplatesFeature plantTemplatesFeature = new PlantTemplatesFeature(webDriver);
        plantTemplatesFeature.setEditTanamanEmpty(tanaman);
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    }

    @When("User click button Tambah Aktivitas")
    public void userClickButtonTambahAktivitas() {
        PlantTemplatesFeature plantTemplatesFeature = new PlantTemplatesFeature(webDriver);
        plantTemplatesFeature.clickBtnTambahAktivitas();
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    }

    @Then("Pop up Tambah Aktivitas will show")
    public void popUpTambahAktivitasWillShow() {
        PlantTemplatesFeature plantTemplatesFeature = new PlantTemplatesFeature(webDriver);
        plantTemplatesFeature.verifyPopUpTambahAktivitas();
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    }

    @And("User input \"(.*)\" as nama aktivitas")
    public void userInputAsNamaAktivitas(String nameActivity){
        PlantTemplatesFeature plantTemplatesFeature = new PlantTemplatesFeature(webDriver);
        if(Objects.equals(nameActivity, "")){
            plantTemplatesFeature.setNewNameAktivitas(nameActivity);
        } else {
            String randTanaman = nameActivity+ " " + RandomStringUtils.randomAlphabetic(5);
            plantTemplatesFeature.setNewNameAktivitas(randTanaman);
        }
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    }

    @And("User input (\\d+) as Aktivitas pada hari ke")
    public void userInputAsAktivitasPadaHariKe(int day) {
        PlantTemplatesFeature plantTemplatesFeature = new PlantTemplatesFeature(webDriver);
        plantTemplatesFeature.setNewDayAktivitas(day);
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    }

    @And("User click on simpan aktivitas button")
    public void userClickOnSimpanAktivitasButton() {
        PlantTemplatesFeature plantTemplatesFeature = new PlantTemplatesFeature(webDriver);
        plantTemplatesFeature.clickSaveBtnAktivitasNew();
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    }

    @Then("User success create new activity")
    public void userSuccessCreateNewActivity() {
        PlantTemplatesFeature plantTemplatesFeature = new PlantTemplatesFeature(webDriver);
        plantTemplatesFeature.verifySuccessTambahJadwal();
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    }

    @When("User click icon edit aktivitas in template \"(.*)\"")
    public void userClickIconEditAktivitasInTemplate(String name){
        PlantTemplatesFeature plantTemplatesFeature = new PlantTemplatesFeature(webDriver);
        plantTemplatesFeature.clickEditAktivitas(name);
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    }

    @Then("Pop up Ubah Aktivitas will show")
    public void popUpUbahAktivitasWillWillShow() {
        PlantTemplatesFeature plantTemplatesFeature = new PlantTemplatesFeature(webDriver);
        plantTemplatesFeature.verifyPopUpEditAktivitas();
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    }

    @And("User edit \"(.*)\" in field Nama Aktivitas")
    public void userEditInFieldNamaAktivitas(String aktivitas){
        PlantTemplatesFeature plantTemplatesFeature = new PlantTemplatesFeature(webDriver);
        String randAktivitas = RandomStringUtils.randomAlphabetic(5);
        plantTemplatesFeature.setEditAktivitas(aktivitas, randAktivitas);
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    }

    @And("User edit (\\d+) as Aktivitas pada hari ke")
    public void userEditDayAsAktivitasPadaHariKe(int day) {
        PlantTemplatesFeature plantTemplatesFeature = new PlantTemplatesFeature(webDriver);
        plantTemplatesFeature.setEditDayAktivitas(day);
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    }

    @And("User click on simpan edit aktivitas button")
    public void userClickOnSimpanEditAktivitasButton() {
        PlantTemplatesFeature plantTemplatesFeature = new PlantTemplatesFeature(webDriver);
        plantTemplatesFeature.clickSaveBtnAktivitasEdit();
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    }

    @Then("User success edit aktivitas")
    public void userSuccessEditAktivitas() {
        PlantTemplatesFeature plantTemplatesFeature = new PlantTemplatesFeature(webDriver);
        plantTemplatesFeature.verifySuccessEditAktvitas();
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    }

    @And("User emptying in field Nama Aktivitas \"(.*)\"")
    public void userEmptyingInFieldNamaAktivitas(String aktivitas) throws Throwable {
        PlantTemplatesFeature plantTemplatesFeature = new PlantTemplatesFeature(webDriver);
        plantTemplatesFeature.setEditNamaAktivitasEmpty(aktivitas);
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    }

    @And("User emptying in field Aktivitas pada hari ke")
    public void userEmptyingInFieldAktivitasPadaHariKeDay() {
        PlantTemplatesFeature plantTemplatesFeature = new PlantTemplatesFeature(webDriver);
        plantTemplatesFeature.setEditHariAktivitasEmpty();
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    }

    @When("User click icon hapus aktivitas")
    public void userClickIconHapusAktivitas(){
        PlantTemplatesFeature plantTemplatesFeature = new PlantTemplatesFeature(webDriver);
        plantTemplatesFeature.clickBtnHapusAktivitas();
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    }

    @Then("Pop up Konfirmasi Hapus will show")
    public void popUpKonfirmasiHapusWillShow(){
        PlantTemplatesFeature plantTemplatesFeature = new PlantTemplatesFeature(webDriver);
        plantTemplatesFeature.verifyPopUpHapusAktivitas();
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    }

    @When("User click ok hapus aktivitas")
    public void userClickOkHapusAktivitas() {
        PlantTemplatesFeature plantTemplatesFeature = new PlantTemplatesFeature(webDriver);
        plantTemplatesFeature.clickBtnOkHapusAktivitas();
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    }

    @Then("User success delete activity")
    public void userSuccessDeleteActivity() {
        PlantTemplatesFeature plantTemplatesFeature = new PlantTemplatesFeature(webDriver);
        plantTemplatesFeature.verifySuccessHapusAktivitas();
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    }

    @When("User click icon hapus jadwal")
    public void userClickIconHapusJadwal() {
        PlantTemplatesFeature plantTemplatesFeature = new PlantTemplatesFeature(webDriver);
        plantTemplatesFeature.clickBtnHapusJadwal();
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    }

    @Then("Pop up Konfirmasi Hapus Template will show")
    public void popUpKonfirmasiHapusTemplateWillShow() {
        PlantTemplatesFeature plantTemplatesFeature = new PlantTemplatesFeature(webDriver);
        plantTemplatesFeature.verifyPopUpHapusJadwal();
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    }

    @When("User click ok hapus jadwal")
    public void userClickOkHapusJadwal() {
        PlantTemplatesFeature plantTemplatesFeature = new PlantTemplatesFeature(webDriver);
        plantTemplatesFeature.clickBtnOkHapusJadwal();
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    }

    @Then("User success delete jadwal")
    public void userSuccessDeleteJadwal() {
        PlantTemplatesFeature plantTemplatesFeature = new PlantTemplatesFeature(webDriver);
        plantTemplatesFeature.verifySuccessHapusJadwal();
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    }
}
