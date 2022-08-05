package org.example.stepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.example.pages.LoginPage;
import org.example.pages.RegistrationPage;
import org.junit.rules.Timeout;
import org.openqa.selenium.Keys;

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
    public void valid_data(String email, String password)
    {
        login.LoginSteps(email, password);
        login.passwordPOM().sendKeys(Keys.ENTER);
        Hooks.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }
    @And("user go to home page")
    public void sucess_login()
    {

    }


    @Then("Then user could not login to the system")
    public void error_msg()
    {

    }

}
