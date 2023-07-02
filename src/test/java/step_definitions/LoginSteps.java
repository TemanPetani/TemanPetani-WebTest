package step_definitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.example.pageObject.LoginFeature;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class LoginSteps {

    final private WebDriver driver;

    public LoginSteps() {
        super();
        this.driver =Hooks.webDriver;
    }


    @Given("^User already on Teman Petani landing page$")
    public void userAlreadyOnTemanPetaniLandingPage() {
        LoginFeature loginFeature = new LoginFeature(driver);
        Assert.assertTrue(loginFeature.verifyLandingPage());
    }

    @When("^User click on Sign In button$")
    public void userClickOnSignInButton() {
        LoginFeature loginFeature = new LoginFeature(driver);
        loginFeature.clickLoginLandingButton();
    }


    @Then("^User already on login page$")
    public void userAlreadyOnLoginPage() throws InterruptedException {
        LoginFeature loginFeature = new LoginFeature(driver);
        Thread.sleep(3000);
        Assert.assertTrue(loginFeature.verifyLoginPage());
    }

    @When("^User input \"([^\"]*)\" as email and \"([^\"]*)\" as password$")
    public void userInputAsEmailAndAsPassword(String email, String password) {
        LoginFeature loginFeature = new LoginFeature(driver);
        loginFeature.inputEmailAndPassword(email, password);
    }

    @And("^User click login button$")
    public void userClickLoginButton() throws InterruptedException {
        LoginFeature loginFeature = new LoginFeature(driver);
        loginFeature.clickLoginPageButton();
    }

    @Then("^User already on Home Page$")
    public void userAlreadyOnHomePage() throws InterruptedException {
        LoginFeature loginFeature = new LoginFeature(driver);
        Assert.assertTrue(loginFeature.verifyHomePage());
        Thread.sleep(3000);
    }
}
