package step_definitions;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import org.example.pageObject.RegisterPage;

import java.time.Duration;

public class RegisterStep {
    private WebDriver webDriver;
    public RegisterStep(){
        super();
        this.webDriver = Hooks.webDriver;
    }

    @Given("User already on website TemanPetani")
    public void userAlreadyOnWebsiteTemanPetani() {
        RegisterPage registerPage = new RegisterPage(webDriver);
        registerPage.verifyLandingPage();
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    }

    @When("User input \"(.*)\" as fullName, \"(.*)\" as email, \"(.*)\" as password,\"(.*)\" as phone, and \"(.*)\" as address")
    public void userInputValidAnd(String fullName, String email, String password, String phone, String address){
        RegisterPage registerPage = new RegisterPage(webDriver);
        registerPage.setFullName(fullName);
        registerPage.setPhone(phone);
        registerPage.setEmail(email);
        registerPage.setPassword(password);
        registerPage.setAddress(address);
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    }

    @And("User click on sign up button")
    public void userClickOnSignUpButton() {
        RegisterPage registerPage = new RegisterPage(webDriver);
        registerPage.clickRegisterBtn();
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    }

    @When("User click on register menu")
    public void userClickOnRegisterMenu() {
        RegisterPage registerPage = new RegisterPage(webDriver);
        registerPage.clickRegisterMenu();
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    }

    @Then("User already on register page")
    public void userAlreadyOnRegisterPage() {
        RegisterPage registerPage = new RegisterPage(webDriver);
        registerPage.verifyRegisterPage();
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    }

    @Then("User \"(.*)\" create new user")
    public void userCreateNewUser(String message) {
        RegisterPage registerPage = new RegisterPage(webDriver);
        registerPage.verifyNotifCreateUser(message);
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    }

    @Then("should see an error message \"(.*)\"")
    public void shouldSeeAnErrorMessage(String message){
        RegisterPage registerPage = new RegisterPage(webDriver);
        registerPage.verifyErrMessageEmail(message);
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    }

}
