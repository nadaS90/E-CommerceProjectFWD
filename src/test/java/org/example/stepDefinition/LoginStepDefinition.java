package org.example.stepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.example.pages.LoginPage;
import org.example.pages.RegistrationPage;
import org.junit.Assert;
import org.junit.rules.Timeout;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.asserts.SoftAssert;

import java.security.Key;
import java.util.concurrent.TimeUnit;

public class LoginStepDefinition {

    LoginPage login;

    public LoginStepDefinition()
    {
        this.login = new LoginPage(Hooks.driver);
    }

    @Given("user go to login page")
    public void try_login()
    {
        Hooks.driver.navigate().to("https://demo.nopcommerce.com/login?returnUrl=%2F");
    }
    @Then("^user enter email and password \"(.*)\" and \"(.*)\"$")
    public void enter_data(String email, String password)
    {
//        login.emailPOM().clear();
//        login.emailPOM().sendKeys("test@example.com");
//
//        login.passwordPOM().clear();
//        login.passwordPOM().sendKeys("P@ssw0rd");
//        login.passwordPOM().sendKeys(Keys.ENTER);
        login.LoginSteps(email, password);
        login.passwordPOM().sendKeys(Keys.ENTER);
    }
    @Then("user login to the system successfully")
    public void sucess_login()
    {
        SoftAssert soft =  new SoftAssert();

        soft.assertEquals("https://demo.nopcommerce.com/", Hooks.driver.getCurrentUrl());
        soft.assertTrue(login.myAccountPOM().isDisplayed());

        soft.assertAll();
    }


//    @And("user enter invalid email and password")
//    public void invalid_data()
//    {
//        login.emailPOM().clear();
//        login.emailPOM().sendKeys("wrong@example.com");
//
//        login.passwordPOM().clear();
//        login.passwordPOM().sendKeys("P@ssw0rd");
//        login.passwordPOM().sendKeys(Keys.ENTER);
//        Hooks.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//
//    }


    @Then("user could not login to the system")
    public void error_msg()
    {

        //System.out.println("reached to assertion part that is not working");
        SoftAssert soft = new SoftAssert();

        String expectedResult = "Login was unsuccessful. Please correct the errors and try again.";
        String actualResult = Hooks.driver.findElement(By.xpath("//div[@class='message-error validation-summary-errors']")).getText();
        System.out.println("actual result: "+ actualResult);
        soft.assertTrue(actualResult.contains(expectedResult));

        soft.assertAll();
    }

}
