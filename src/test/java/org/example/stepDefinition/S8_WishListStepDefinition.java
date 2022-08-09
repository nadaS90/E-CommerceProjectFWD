package org.example.stepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.example.pages.P3_HomePage;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.testng.asserts.SoftAssert;

import java.util.concurrent.TimeUnit;

public class S8_WishListStepDefinition {

    P3_HomePage homePage;

    public S8_WishListStepDefinition()
    {
        this.homePage = new P3_HomePage(Hooks.driver);
    }


    @Given("User clicks on add item wishlist")
    public void add_item_wishlist()
    {
        homePage.selectItemWishListPOM().click();
        Hooks.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        homePage.addItemWishListPOM().click();
    }

    @Then("Success message appears")
    public void success_msg()
    {
        SoftAssert soft =  new SoftAssert();
        String expectedResult = "The product has been added to your";
        String actualResult = Hooks.driver.findElement(P3_HomePage.successmsgPOM()).getText();
        System.out.println(actualResult);

        soft.assertTrue(actualResult.contains(expectedResult));
        soft.assertEquals(actualResult.contains(expectedResult), true);

        System.out.println(P3_HomePage.msgBckgPOM());
        String bckgclr = Hooks.driver.findElement(P3_HomePage.msgBckgPOM())
                .getCssValue("background-color");
        String expectedbckgclr = "rgba(75, 176, 122, 1)";
        System.out.println(bckgclr);
        soft.assertTrue(bckgclr.contains(expectedbckgclr));

        soft.assertAll();

    }

    @And("User navigates to wishlist page")
    public void navigate_wishlist()
    {
        homePage.wishListPagePOM().click();
    }

    @Then("Item found in wishlist page")
    public void confirm_item_added()
    {
        SoftAssert soft = new SoftAssert();

//        WebElement wishListItemsElm = homePage.wishListItemsPOM();
//        int count = wishListItemsElm.getSize();
//        System.out.println("num of elements: "+ count);
//        soft.assertTrue(count > 0, "wishlist items");
//

        int itemsNo = homePage.wishListItemsPOM();
        System.out.println("No. of items in wishlist: " + itemsNo);
        soft.assertTrue(itemsNo > 0, "Items Found");
        soft.assertAll();

    }

}
