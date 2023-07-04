package step_definitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.apache.commons.lang3.RandomStringUtils;
import org.example.pageObject.EditUserFeature;
import org.example.pageObject.LoginFeature;
import org.example.pageObject.RegisterPage;
import org.openqa.selenium.WebDriver;

import java.time.Duration;

import static step_definitions.Hooks.webDriver;

public class EditUserSteps {
    private WebDriver webDriver;
    public EditUserSteps(){
        super();
        this.webDriver = Hooks.webDriver;
    }

    @When("User click icon profile")
    public void userClickIconProfile() {
        EditUserFeature editUserFeature = new EditUserFeature(webDriver);
        editUserFeature.clickIconProfile();
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    }

    @And("User click menu profile")
    public void userClickMenuProfile() {
        EditUserFeature editUserFeature = new EditUserFeature(webDriver);
        editUserFeature.clickMenuProfile();
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    }

    @Then("User already on profile page")
    public void userAlreadyOnProfilePage() {
        EditUserFeature editUserFeature = new EditUserFeature(webDriver);
        editUserFeature.verifyEditProfilePage();
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    }

    @When("User click ubah on field name")
    public void userClickOnEditName() {
        EditUserFeature editUserFeature = new EditUserFeature(webDriver);
        editUserFeature.clickBtnEditName();
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    }

    @Then("Pop up Edit Nama will show")
    public void popUpGantiNameWillShow() {
        EditUserFeature editUserFeature = new EditUserFeature(webDriver);
        editUserFeature.verifyPopUpEditName();
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    }

    @And("User input \"(.*)\" as new name")
    public void userInputAsNewName(String newName) {
        EditUserFeature editUserFeature = new EditUserFeature(webDriver);
        editUserFeature.setNewName(newName);
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    }

    @And("User click on simpan name button")
    public void userClickOnSimpanName() {
        EditUserFeature editUserFeature = new EditUserFeature(webDriver);
        editUserFeature.clickSaveBtnName();
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    }

    @Then("User already success edit data")
    public void userAlreadySuccesEditNama() {
        EditUserFeature editUserFeature = new EditUserFeature(webDriver);
        editUserFeature.verifySuccessEdit();
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    }

    @When("User click ubah on field email")
    public void userClickOnEditEmail() {
        EditUserFeature editUserFeature = new EditUserFeature(webDriver);
        editUserFeature.clickBtnEditEmail();
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    }

    @Then("Pop up Edit Email will show")
    public void popUpEditEmailWillShow() {
        EditUserFeature editUserFeature = new EditUserFeature(webDriver);
        editUserFeature.verifyPopUpEditEmail();
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    }

    @And("User input \"(.*)\" as new email")
    public void userInputAsNewEmail(String newEmail) {
        EditUserFeature editUserFeature = new EditUserFeature(webDriver);
        editUserFeature.setNewEmail(newEmail);
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    }

    @And("User click on simpan email button")
    public void userClickOnSimpanEmail() {
        EditUserFeature editUserFeature = new EditUserFeature(webDriver);
        editUserFeature.clickSaveBtnEmail();
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    }

    @When("User click ubah on field phone")
    public void userClickOnEditPhone() {
        EditUserFeature editUserFeature = new EditUserFeature(webDriver);
        editUserFeature.clickBtnEditPhone();
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    }

    @Then("Pop up Edit Phone will show")
    public void popUpEditPhoneWillShow() {
        EditUserFeature editUserFeature = new EditUserFeature(webDriver);
        editUserFeature.verifyPopUpEditPhone();
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    }

    @And("User input phone number as new phone")
    public void userInputAsNewPhone() {
        EditUserFeature editUserFeature = new EditUserFeature(webDriver);
        String newPhone = "0" + RandomStringUtils.randomNumeric(10);
        editUserFeature.setNewPhone(newPhone);
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    }

    @And("User click on simpan phone button")
    public void userClickOnSimpanPhone() {
        EditUserFeature editUserFeature = new EditUserFeature(webDriver);
        editUserFeature.clickSaveBtnPhone();
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    }

    @When("User click ubah on field address")
    public void userClickOnEditAddress() {
        EditUserFeature editUserFeature = new EditUserFeature(webDriver);
        editUserFeature.clickBtnEditAddress();
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    }

    @Then("Pop up Edit Address will show")
    public void popUpEditAddressWillShow() {
        EditUserFeature editUserFeature = new EditUserFeature(webDriver);
        editUserFeature.verifyPopUpEditAddress();
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    }

    @And("User input \"(.*)\" as new address")
    public void userInputAsNewAddress(String Address) {
        EditUserFeature editUserFeature = new EditUserFeature(webDriver);
        String randAddress = Address+ " " +RandomStringUtils.randomNumeric(3);
        editUserFeature.setNewAddress(randAddress);
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    }

    @And("User click on simpan address button")
    public void userClickOnSimpanAddress() {
        EditUserFeature editUserFeature = new EditUserFeature(webDriver);
        editUserFeature.clickSaveBtnAddress();
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    }

    @When("User click ubah on field rekening")
    public void userClickOnEditRekening() {
        EditUserFeature editUserFeature = new EditUserFeature(webDriver);
        editUserFeature.clickBtnEditRekening();
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    }

    @Then("Pop up Edit Rekening will show")
    public void popUpEditRekeningWillShow() {
        EditUserFeature editUserFeature = new EditUserFeature(webDriver);
        editUserFeature.verifyPopUpEditRekening();
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    }

    @And("User input rekening as new rekening")
    public void userInputAsNewRekening() {
        EditUserFeature editUserFeature = new EditUserFeature(webDriver);
        String randRekening = RandomStringUtils.randomNumeric(7);
        editUserFeature.setNewRekening(randRekening);
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    }

    @And("User click on simpan rekening button")
    public void userClickOnSimpanRekening() {
        EditUserFeature editUserFeature = new EditUserFeature(webDriver);
        editUserFeature.clickSaveBtnRekening();
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    }

    @When("User click ubah on field bank")
    public void userClickOnEditBank() {
        EditUserFeature editUserFeature = new EditUserFeature(webDriver);
        editUserFeature.clickBtnEditBank();
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    }

    @Then("Pop up Edit Bank will show")
    public void popUpEditBankWillShow() {
        EditUserFeature editUserFeature = new EditUserFeature(webDriver);
        editUserFeature.verifyPopUpEditBank();
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    }

    @And("User select \"(.*)\" as new bank")
    public void userSelectAsNewBank(String Bank) {
        EditUserFeature editUserFeature = new EditUserFeature(webDriver);
        editUserFeature.setNewBank(Bank);
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    }

    @And("User click on simpan bank button")
    public void userClickOnSimpanBank() {
        EditUserFeature editUserFeature = new EditUserFeature(webDriver);
        editUserFeature.clickSaveBtnBank();
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    }

    @When("User click icon edit in user picture")
    public void userClickOnEditUserPicture() {
        EditUserFeature editUserFeature = new EditUserFeature(webDriver);
        editUserFeature.clickBtnEditPicture();
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    }

    @Then("Pop up Edit Avatar will show")
    public void popUpEditPictureWillShow() {
        EditUserFeature editUserFeature = new EditUserFeature(webDriver);
        editUserFeature.verifyPopUpEditPicture();
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    }

    @And("User upload files on field choose file")
    public void userUploadFiles() {
        EditUserFeature editUserFeature = new EditUserFeature(webDriver);
        editUserFeature.setNewPicture();
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    }

    @And("User click on simpan picture button")
    public void userClickOnSimpanPicture() {
        EditUserFeature editUserFeature = new EditUserFeature(webDriver);
        editUserFeature.clickSaveBtnPicture();
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    }

    @When("User click button ganti password")
    public void userClickBtnEditPassword() {
        EditUserFeature editUserFeature = new EditUserFeature(webDriver);
        editUserFeature.clickBtnEditPassword();
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    }

    @Then("Pop up Edit Password will show")
    public void popUpEditPasswordWillShow() {
        EditUserFeature editUserFeature = new EditUserFeature(webDriver);
        editUserFeature.verifyPopUpEditPassword();
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    }

    @And("User input \"(.*)\" as password lama")
    public void userInputAsOldPass(String oldPass) {
        EditUserFeature editUserFeature = new EditUserFeature(webDriver);
        editUserFeature.setOldPassword(oldPass);
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    }

    @And("User input \"(.*)\" as password baru")
    public void userInputAsNewPass(String newPass) {
        EditUserFeature editUserFeature = new EditUserFeature(webDriver);
        editUserFeature.setNewPassword(newPass);
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    }

    @And("User input \"(.*)\" as konfirmasi password")
    public void userInputAsConfirmPass(String confirmPass) {
        EditUserFeature editUserFeature = new EditUserFeature(webDriver);
        editUserFeature.setConfirmPassword(confirmPass);
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    }

    @And("User click on simpan password button")
    public void userClickOnSimpanPassword() {
        EditUserFeature editUserFeature = new EditUserFeature(webDriver);
        editUserFeature.clickSaveBtnPassword();
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    }

    @Then("User \"(.*)\" update password")
    public void userFailedUpdatePassword(String message) {
        EditUserFeature editUserFeature = new EditUserFeature(webDriver);
        editUserFeature.verifyFailedUpdatePass(message);
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    }
}
