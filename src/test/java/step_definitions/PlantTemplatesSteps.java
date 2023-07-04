package step_definitions;

import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;

public class PlantTemplatesSteps {
    private WebDriver webDriver;
    public PlantTemplatesSteps(){
        super();
        this.webDriver = Hooks.webDriver;
    }
}
