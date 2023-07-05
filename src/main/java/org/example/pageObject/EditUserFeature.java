package org.example.pageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class EditUserFeature {
    public static WebDriver driver;

    public EditUserFeature(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    @FindBy(css = ".dropdown")
    private static WebElement iconProfile;

    public void clickIconProfile(){
        iconProfile.isDisplayed();
        iconProfile.click();
    }
    @FindBy(xpath = "//a[.='Profil']")
    private static WebElement menuProfile;

    public void clickMenuProfile() {
        menuProfile.isDisplayed();
        menuProfile.click();
    }

    @FindBy(xpath = "//p[2]/label[contains(text(),'Ubah')]")
    private static WebElement BtnEditName;

    @FindBy(xpath = "//button[contains(text(),'Hapus Akun')]")
    private static WebElement BtnDeleteAcc;

    public void verifyEditProfilePage(){
        BtnEditName.isDisplayed();
    }

    public void clickBtnEditName() {
        BtnEditName.click();
    }

    @FindBy(xpath = "//p[.='Edit Nama']")
    private static WebElement popUpEditNama;

    public void verifyPopUpEditName() {
        popUpEditNama.isDisplayed();
    }

    @FindBy(css = "[placeholder='Nama baru anda']")
    private static WebElement inputNewName;

    public void setNewName(String newName) {
        inputNewName.isDisplayed();
        inputNewName.sendKeys(newName);
    }

    @FindBy(xpath = "//p[.='Edit Nama']/following-sibling::div[3]/div/button[.='Simpan']")
    private static WebElement saveBtnName;

    public void clickSaveBtnName() {
        saveBtnName.isDisplayed();
        saveBtnName.click();
    }

    @FindBy(xpath = "//h2[.='Berhasil Memperbarui Data Pengguna']")
    private static WebElement successEdit;

    public void verifySuccessEdit() {
        successEdit.isDisplayed();
    }

    @FindBy(xpath = "//p[4]/label[contains(text(),'Ubah')]")
    private static WebElement BtnEditEmail;

    public void clickBtnEditEmail() {
        BtnEditEmail.isDisplayed();
        BtnEditEmail.click();
    }

    @FindBy(xpath = "//p[.='Edit Email']")
    private static WebElement popUpEditEmail;

    public void verifyPopUpEditEmail() {
        popUpEditEmail.isDisplayed();
    }

    @FindBy(css = "[placeholder='Email baru anda']")
    private static WebElement inputNewEmail;

    public void setNewEmail(String newEmail) {
        inputNewEmail.isDisplayed();
        inputNewEmail.sendKeys(newEmail);
    }

    @FindBy(xpath = "//p[.='Edit Email']/following-sibling::div[3]/div/button[.='Simpan']")
    private static WebElement saveBtnEmail;

    public void clickSaveBtnEmail() {
        saveBtnEmail.isDisplayed();
        saveBtnEmail.click();
    }

    @FindBy(xpath = "//p[6]/label[contains(text(),'Ubah')]")
    private static WebElement BtnEditPhone;

    public void clickBtnEditPhone() {
        BtnEditPhone.isDisplayed();
        BtnEditPhone.click();
    }

    @FindBy(xpath = "//p[.='Edit Telepon']")
    private static WebElement popUpEditPhone;

    public void verifyPopUpEditPhone() {
        popUpEditPhone.isDisplayed();
    }

    @FindBy(css = "[placeholder='Telepon baru anda']")
    private static WebElement inputNewPhone;

    public void setNewPhone(String newPhone) {
        inputNewPhone.isDisplayed();
        inputNewPhone.sendKeys(newPhone);
    }

    @FindBy(xpath = "//p[.='Edit Telepon']/following-sibling::div[3]/div/button[.='Simpan']")
    private static WebElement saveBtnPhone;

    public void clickSaveBtnPhone() {
        saveBtnPhone.isDisplayed();
        saveBtnPhone.click();
    }

    @FindBy(xpath = "//p[8]/label[contains(text(),'Ubah')]")
    private static WebElement BtnEditAddress;

    public void clickBtnEditAddress() {
        BtnEditAddress.isDisplayed();
        BtnEditAddress.click();
    }

    @FindBy(xpath = "//p[.='Edit Alamat']")
    private static WebElement popUpEditAddress;

    public void verifyPopUpEditAddress() {
        popUpEditAddress.isDisplayed();
    }

    @FindBy(css = "[placeholder='Alamat baru anda']")
    private static WebElement inputNewAddress;

    public void setNewAddress(String newAddress) {
        inputNewAddress.isDisplayed();
        inputNewAddress.sendKeys(newAddress);
    }

    @FindBy(xpath = "//p[.='Edit Alamat']/following-sibling::div[3]/div/button[.='Simpan']")
    private static WebElement saveBtnAddress;

    public void clickSaveBtnAddress() {
        saveBtnAddress.isDisplayed();
        saveBtnAddress.click();
    }

    @FindBy(xpath = "//p[10]/label[contains(text(),'Ubah')]")
    private static WebElement BtnEditRekening;

    public void clickBtnEditRekening() {
        BtnEditRekening.isDisplayed();
        BtnEditRekening.click();
    }

    @FindBy(xpath = "//p[.='Edit Rekening']")
    private static WebElement popUpEditRekening;

    public void verifyPopUpEditRekening() {
        popUpEditRekening.isDisplayed();
    }

    @FindBy(css = "[placeholder='Rekening baru anda']")
    private static WebElement inputNewRekening;

    public void setNewRekening(String newRekening) {
        inputNewRekening.isDisplayed();
        inputNewRekening.sendKeys(newRekening);
    }

    @FindBy(xpath = "//p[.='Edit Rekening']/following-sibling::div[3]/div/button[.='Simpan']")
    private static WebElement saveBtnRekening;

    public void clickSaveBtnRekening() {
        saveBtnRekening.isDisplayed();
        saveBtnRekening.click();
    }

    @FindBy(xpath = "//p[12]/label[contains(text(),'Ubah')]")
    private static WebElement BtnEditBank;

    public void clickBtnEditBank() {
        BtnEditBank.isDisplayed();
        BtnEditBank.click();
    }

    @FindBy(xpath = "//p[.='Edit Bank']")
    private static WebElement popUpEditBank;

    public void verifyPopUpEditBank() {
        popUpEditBank.isDisplayed();
    }

    @FindBy(xpath = "//select[@id='bank']")
    private static WebElement selectNewBank;

    public void setNewBank(String selectedBank) {
        selectNewBank.isDisplayed();
        Select a = new Select(selectNewBank);
        a.selectByVisibleText(selectedBank);
    }

    @FindBy(xpath = "//p[.='Edit Bank']/following-sibling::div[3]/div/button[.='Simpan']")
    private static WebElement saveBtnBank;

    public void clickSaveBtnBank() {
        saveBtnBank.isDisplayed();
        saveBtnBank.click();
    }

    @FindBy(xpath = "//label[@class='btn btn-primary btn-circle p-3 text-lg']")
    private static WebElement BtnEditPicture;

    public void clickBtnEditPicture() {
        BtnEditPicture.isDisplayed();
        BtnEditPicture.click();
    }

    @FindBy(xpath = "//p[.='Edit Avatar']")
    private static WebElement popUpEditPicture;

    public void verifyPopUpEditPicture() {
        popUpEditPicture.isDisplayed();
    }

    @FindBy(xpath = "//input[@id='picture']")
    private static WebElement uploadNewPicture;

    public void setNewPicture() {
        uploadNewPicture.isDisplayed();
        uploadNewPicture.sendKeys("D:/profile-picture.jpg");
    }

    @FindBy(xpath = "//p[.='Edit Avatar']/following-sibling::div[3]/div/button[.='Simpan']")
    private static WebElement saveBtnPicture;

    public void clickSaveBtnPicture() {
        saveBtnPicture.isDisplayed();
        saveBtnPicture.click();
    }

    @FindBy(xpath = "//label[.='Ganti Password']")
    private static WebElement BtnEditPassword;

    public void clickBtnEditPassword() {
        BtnEditPassword.isDisplayed();
        BtnEditPassword.click();
    }

    @FindBy(xpath = "//p[.='Edit Password']")
    private static WebElement popUpEditPassword;

    public void verifyPopUpEditPassword() {
        popUpEditPassword.isDisplayed();
    }

    @FindBy(xpath = "//input[@id='old_password']")
    private static WebElement inputOldPassword;

    public void setOldPassword(String oldPassword) {
        inputOldPassword.isDisplayed();
        inputOldPassword.sendKeys(oldPassword);
    }

    @FindBy(xpath = "//input[@id='password']")
    private static WebElement inputNewPassword;

    public void setNewPassword(String newPassword) {
        inputNewPassword.isDisplayed();
        inputNewPassword.sendKeys(newPassword);
    }

    @FindBy(xpath = "//input[@id='confirmPassword']")
    private static WebElement inputConfirmPassword;

    public void setConfirmPassword(String newPassword) {
        inputConfirmPassword.isDisplayed();
        inputConfirmPassword.sendKeys(newPassword);
    }

    @FindBy(xpath = "//p[.='Edit Password']/following-sibling::div[4]/div/button[.='Simpan']")
    private static WebElement saveBtnPassword;

    public void clickSaveBtnPassword() {
        saveBtnPassword.isDisplayed();
        saveBtnPassword.click();
    }

    public void verifyFailedUpdatePass(String message){
        String messagePopUp = "//h2[.='"+message+"']";
        driver.findElement(By.xpath(messagePopUp)).isDisplayed();
    }
}
