package org.example.pageObject;

import cucumber.api.java.en.And;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class PlantTemplatesFeature {
    public static WebDriver driver;

    public PlantTemplatesFeature(WebDriver driver) {
        PageFactory.initElements(driver, this);
        LoginFeature.driver = driver;
    }
}
