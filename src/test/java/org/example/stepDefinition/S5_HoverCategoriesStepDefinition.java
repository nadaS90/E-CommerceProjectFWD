package org.example.stepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.example.pages.P3_HomePage;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;

public class S5_HoverCategoriesStepDefinition {

    P3_HomePage homePage;
    String subCategoryName;
    P3_HomePage category = new P3_HomePage(Hooks.driver);

    public S5_HoverCategoriesStepDefinition()
    {
        this.homePage = new P3_HomePage(Hooks.driver);
    }

    @Given("user hover categories")
    public void find_search_field()
    {
        Actions action = new Actions(Hooks.driver);
        action.moveToElement(homePage.hoverCategoryPOM()).perform();
        action.moveToElement(homePage.hoverCategoryPOM()).perform();

        subCategoryName = homePage.subCategoryPOM().getText().toLowerCase();

        Hooks.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @And("user select sub category")
    public void enter_search_product()
    {
        homePage.subCategoryPOM().click();
    }

    @Then("user directed to the item page")
    public void find_product()
    {
        Assert.assertEquals(category.categoryListPOM().getText().toLowerCase(), subCategoryName, "subcategory");

    }


}
