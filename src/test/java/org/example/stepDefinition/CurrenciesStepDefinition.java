package org.example.stepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.HomePage;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.testng.asserts.SoftAssert;

import java.util.List;

public class CurrenciesStepDefinition {
    HomePage homePage;

    public CurrenciesStepDefinition()
    {
        this.homePage = new HomePage(Hooks.driver);
    }

    @Given("User clicks on drop list")
    public void dropListClick()
    {
      homePage.dropDownPOM().click();
    }

    @When("User clicks on Euro")
    public void selectEuro(){
        homePage.slctcurncyPOM().click();
    }

    @Then("User find the price of products in Euro")
    public void currencyConfirm(){
       Hooks.driver.navigate().to("https://demo.nopcommerce.com/desktops");
        List<WebElement> currencyItemsElms = homePage.currencyItemsPOM();
        int count = currencyItemsElms.size();
        System.out.println("num of elements: "+ count);

//        String expectedResult = "€" ;
////        String actualResult = Hooks.driver.findElement(HomePage.currencyItemsPOM()).getText();
//         String actualReasult = Hooks.driver.findElements(HomePage.currencyItemsPOM()).getText();
//
       for (int i = 0; i < count; i++)
        {
            SoftAssert soft = new SoftAssert();
            String actualPrice = currencyItemsElms.get(i).getText();
            soft.assertTrue(actualPrice.contains("€"));

            soft.assertAll();
        }


       // Assert.assertTrue(Hooks.driver.findElement(By.cssSelector("body > div.master-wrapper-page > div.master-wrapper-content > div > div.center-2 > div > div.page-body > div.products-container > div.products-wrapper > div > div > div:nth-child(1) > div > div.details > div.add-info > div.prices > span")).getText().contains("€"));


    }


}
