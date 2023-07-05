package step_definitions;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.example.pageObject.LoginFeature;
import org.openqa.selenium.WebDriver;

import java.time.Duration;

import static step_definitions.Hooks.webDriver;

public class LoginSteps {

    final private WebDriver driver;

    public LoginSteps() {
        super();
        this.driver = webDriver;
    }


    @Given("User already on Teman Petani landing page")
    public void userAlreadyOnTemanPetaniLandingPage() {
        LoginFeature loginFeature = new LoginFeature(driver);
        loginFeature.verifyLandingPage();
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    }

    @When("User click on Sign In button")
    public void userClickOnSignInButton() {
        LoginFeature loginFeature = new LoginFeature(driver);
        loginFeature.clickLoginLandingButton();
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    }


    @Then("User already on login page")
    public void userAlreadyOnLoginPage(){
        LoginFeature loginFeature = new LoginFeature(driver);
        loginFeature.verifyLoginPage();
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    }

    @When("User input \"(.*)\" as email and \"(.*)\" as password")
    public void userInputAsEmailAndAsPassword(String email, String password) {
        LoginFeature loginFeature = new LoginFeature(driver);
        loginFeature.inputEmailAndPassword(email, password);
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    }

    @And("User click login button")
    public void userClickLoginButton(){
        LoginFeature loginFeature = new LoginFeature(driver);
        loginFeature.clickLoginPageButton();
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    }

    @Then("User already on Home Page")
    public void userAlreadyOnHomePage() {
        LoginFeature loginFeature = new LoginFeature(driver);
        loginFeature.verifyHomePageLogin();
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    }

    @Then("Error message \"(.*)\" will appear")
    public void errorMessageWillAppear(String errMessage) {
        LoginFeature loginFeature = new LoginFeature(driver);
        loginFeature.verifyNotifLogin(errMessage);
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    }

    @And("User click ok button")
    public void userClickOkButton() {
        LoginFeature loginFeature = new LoginFeature(driver);
        loginFeature.clickOkLogin();
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    }

    @Then("Success notification \"(.*)\" will appear")
    public void successNotificationWillAppear(String message) {
        LoginFeature loginFeature = new LoginFeature(driver);
        loginFeature.verifyNotifLogin(message);
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    }
}
