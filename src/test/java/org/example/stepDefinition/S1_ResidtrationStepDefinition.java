package org.example.stepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P1_RegistrationPage;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.asserts.SoftAssert;

public class S1_ResidtrationStepDefinition {

    P1_RegistrationPage register ;

    public S1_ResidtrationStepDefinition() {
        this.register = new P1_RegistrationPage(Hooks.driver);
    }

    @Given("user navigates to register page")
    public void registerPage() {
        WebElement rgstrBtn = Hooks.driver.findElement(By.cssSelector("a[href=\"/register?returnUrl=%2F\"]"));
        rgstrBtn.click();
    }

    @And("user select gender")
    public void select_gender()
    {
        register.genderBtnPOM().click();
    }

    @When("enter first name and last name")  //enter first name and last name "automation" and "tester"
    public void first_last ()
    {
        //register.firstNamePOM().clear();
        register.firstNamePOM().sendKeys("automation");

        register.lastNamePOM().clear();
        register.lastNamePOM().sendKeys("tester");
    }

    @And("user enter date of birth")
    public void birth_date()
    {
        register.dayPOM().sendKeys("3");
        register.monthPOM().sendKeys("5");
        register.yearPOM().sendKeys("1990");
    }

    @And("user enter email") //And user enter email "test@example.com" field
    public void enter_email()
    {
        register.emailPOM().clear();
        register.emailPOM().sendKeys("test@example.com");
    }

    @And("user fills Password fields") //And user fills Password fields "P@ssw0rd" and "P@ssw0rd"
    public void password_fields() throws InterruptedException {
        register.passwordPOM().clear();
        register.passwordPOM().sendKeys("P@ssw0rd");

        register.confirmPasswordPOM().clear();
        register.confirmPasswordPOM().sendKeys("P@ssw0rd");
        register.confirmPasswordPOM().sendKeys(Keys.ENTER);
        Thread.sleep(3000);
    }

    @Then("user could register successfully")
    public void sucess_msg()
    {
        SoftAssert soft =  new SoftAssert();

        String expectedResult = "Your registration completed";
        String actualResult = Hooks.driver.findElement(P1_RegistrationPage.msgPOM()).getText();

        soft.assertTrue(actualResult.contains(expectedResult));
        soft.assertEquals(actualResult.contains(expectedResult), true);

        WebElement rgbColor = Hooks.driver.findElement(P1_RegistrationPage.msgPOM());
        String s = rgbColor.getCssValue("color");
        String expectedColor = "rgba(76, 177, 124, 1)";
        System.out.println("Color is :" + s);

        soft.assertTrue(s.contains(expectedColor));

        soft.assertAll();

    }

}
