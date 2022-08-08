package org.example.stepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.example.pages.P3_HomePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;

public class S6_HomeSliderStepDefinition {

    P3_HomePage homePage;

    public S6_HomeSliderStepDefinition()
    {
        this.homePage = new P3_HomePage(Hooks.driver);
    }


    @Given("User clicks on first slider")
    public void click_first_slider()
    {
        homePage.selectFirstSliderPOM().click();

        String nameFirst = homePage.selectFirstSliderPOM().getText();
        System.out.println("done first selecting");
        System.out.println(nameFirst);
    }

    @Then("User directed to the first product page")
    public void navigate_first_product()
    {
        String expectedURL = "https://demo.nopcommerce.com/nokia-lumia-1020";
        String actualURL = Hooks.driver.getCurrentUrl();

        Assert.assertEquals(actualURL.contains(expectedURL), true);
    }

    @Given("User clicks on second slider")
    public void click_second_slider()
    {
        homePage.selectSecondSliderPOM().click();

        String nameSecond = homePage.selectSecondSliderPOM().getText();
        System.out.println("done second selecting");
        System.out.println(nameSecond);
    }

    @Then("User directed to the second product page")
    public void navigate_second_product()
    {
        String expectedURL = "https://demo.nopcommerce.com/iphone-6";
        String actualURL = Hooks.driver.getCurrentUrl();

        Assert.assertEquals(actualURL.contains(expectedURL), true);
    }


}
