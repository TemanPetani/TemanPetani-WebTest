package step_definitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.example.pageObject.SchedulePetaniFeature;
import org.openqa.selenium.WebDriver;

import java.time.Duration;

public class SchedulePetaniSteps {
    private WebDriver webDriver;
    public SchedulePetaniSteps(){
        super();
        this.webDriver = Hooks.webDriver;
    }
    @And("User click menu Jadwal Petani")
    public void userClickMenuJadwalPetani() {
        SchedulePetaniFeature schedulePetaniFeature = new SchedulePetaniFeature(webDriver);
        schedulePetaniFeature.clickMenuJadwalPetani();
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    }

    @Then("User already on Jadwal Petani page")
    public void userAlreadyOnJadwalPetaniPage() {
        SchedulePetaniFeature schedulePetaniFeature = new SchedulePetaniFeature(webDriver);
        schedulePetaniFeature.verifyJadwalPetaniPage();
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    }

    @And("List Jadwal Petani will show")
    public void listJadwalPetaniWillShow() {
        SchedulePetaniFeature schedulePetaniFeature = new SchedulePetaniFeature(webDriver);
        schedulePetaniFeature.verifyListJadwalPetani();
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    }

    @When("User click on icon detail jadwal petani")
    public void userClickOnIconDetailJadwalPetani() {
        SchedulePetaniFeature schedulePetaniFeature = new SchedulePetaniFeature(webDriver);
        schedulePetaniFeature.clickDetailIconJadwalPetani();
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    }

    @Then("Pop Up detail Jadwal Petani will show")
    public void popUpDetailJadwalPetaniWillShow() {
        SchedulePetaniFeature schedulePetaniFeature = new SchedulePetaniFeature(webDriver);
        schedulePetaniFeature.verifyPopUpDetailJadwalPetani();
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    }

    @And("List Detail Jadwal Petani will show")
    public void listDetailJadwalPetaniWillShow() {
        SchedulePetaniFeature schedulePetaniFeature = new SchedulePetaniFeature(webDriver);
        schedulePetaniFeature.verifyListDetailJadwalPetani();
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    }

    @When("User click on kembali button")
    public void userClickOnKembaliButton() {
        SchedulePetaniFeature schedulePetaniFeature = new SchedulePetaniFeature(webDriver);
        schedulePetaniFeature.clickBtnClosePopUpDetailJadwalPetani();
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    }

    @Then("Pop Up Detail will disappear")
    public void popUpDetailWillDisappear() {
        SchedulePetaniFeature schedulePetaniFeature = new SchedulePetaniFeature(webDriver);
        schedulePetaniFeature.verifyListJadwalPetani();
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    }
}
