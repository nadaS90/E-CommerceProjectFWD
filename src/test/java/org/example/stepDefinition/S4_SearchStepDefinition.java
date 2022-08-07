package org.example.stepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.example.pages.P3_HomePage;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

public class S4_SearchStepDefinition {

    P3_HomePage homePage;

    public S4_SearchStepDefinition()
    {
        this.homePage = new P3_HomePage(Hooks.driver);
    }

    @Given("user click on search field")
    public void find_search_field()
    {
        homePage.searchFieldPOM().clear();
        homePage.searchFieldPOM().click();
    }

    @And("^user enter \"(.*)\" to search$")
    public void enter_search_product(String searchName)
    {
        homePage.searchFieldPOM().sendKeys(searchName);
        homePage.searchFieldPOM().sendKeys(Keys.ENTER);
        Hooks.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @Then("user find the product and relative products")
    public void find_product()
    {
        int numofProductResult =Hooks.driver.findElements(By.cssSelector("h2[class=\"product-title\"]")).size();
        System.out.println(numofProductResult);
        Assert.assertTrue(numofProductResult>0);

        String url="https://demo.nopcommerce.com/search";
        Assert.assertTrue(Hooks.driver.getCurrentUrl().contains(url));

        ArrayList<String> searchReasult;
        searchReasult= new ArrayList();

        for (int i = 0; i < numofProductResult; i++)
        {
            System.out.println(Hooks.driver.findElements(By.cssSelector("h2[class=\"product-title\"]")).get(i).getText());
            searchReasult.add(Hooks.driver.findElements(By.cssSelector("h2[class=\"product-title\"]")).get(i).getText());
        }
    }


}
