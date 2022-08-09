package org.example.stepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P3_HomePage;
import org.junit.Assert;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

public class S7_FollowUsStepDefinition {

    P3_HomePage homePage;

    public S7_FollowUsStepDefinition()
    {
        this.homePage = new P3_HomePage(Hooks.driver);
    }

    @Given("user clicks on facebook")
    public void click_facebook()
    {
        homePage.faceBookPOM().click();
        Hooks.driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        ArrayList<String> newTab = new ArrayList<>(Hooks.driver.getWindowHandles());

        Hooks.driver.switchTo().window(newTab.get(1));
        System.out.println(Hooks.driver.getCurrentUrl());

    }

    @Then("^user navigates to facebook \"(.*)\"$")
    public void navigate_facebook(String url)
    {
        Assert.assertEquals(Hooks.driver.getCurrentUrl(),url);
        Hooks.driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        ArrayList<String> newTab = new ArrayList<>(Hooks.driver.getWindowHandles());

        Hooks.driver.close();
        Hooks.driver.switchTo().window(newTab.get(0));
    }

    @Given("user clicks on twitter")
    public void click_twitter()
    {
        homePage.twitterPOM().click();
        Hooks.driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        ArrayList<String> newTab = new ArrayList<>(Hooks.driver.getWindowHandles());
        Hooks.driver.switchTo().window(newTab.get(1));
        System.out.println(Hooks.driver.getCurrentUrl());
    }

    @Then("^user navigates to twitter \"(.*)\"$")
    public void navigate_twitter(String url)
    {
        Assert.assertEquals(Hooks.driver.getCurrentUrl(),url);
        Hooks.driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        ArrayList<String> newTab = new ArrayList<>(Hooks.driver.getWindowHandles());

        Hooks.driver.close();
        Hooks.driver.switchTo().window(newTab.get(0));
    }

    @Given("user clicks on rss")
    public void click_rss()
    {
        homePage.rssPOM().click();
        Hooks.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        ArrayList<String> newTab = new ArrayList<>(Hooks.driver.getWindowHandles());
         Hooks.driver.switchTo().window(newTab.get(1));

        System.out.println(Hooks.driver.getCurrentUrl());
    }

    @Then("^user navigates to rss \"(.*)\"$")
    public void navigate_rss(String url)
    {
        Assert.assertEquals(Hooks.driver.getCurrentUrl(),url);
        Hooks.driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        ArrayList<String> newTab = new ArrayList<>(Hooks.driver.getWindowHandles());
        Hooks.driver.close();
        Hooks.driver.switchTo().window(newTab.get(0));
    }

    @Given("user clicks on youtube")
    public void click_youtube()
    {
        homePage.youTubePOM().click();
        Hooks.driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        ArrayList<String> newTab = new ArrayList<>(Hooks.driver.getWindowHandles());
        Hooks.driver.switchTo().window(newTab.get(1));

        System.out.println(Hooks.driver.getCurrentUrl());
    }

    @Then("^user navigates to youtube \"(.*)\"$")
    public void navigate_youtube(String url)
    {
        Assert.assertEquals(Hooks.driver.getCurrentUrl(),url);
        Hooks.driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        ArrayList<String> newTab = new ArrayList<>(Hooks.driver.getWindowHandles());
        Hooks.driver.close();
        Hooks.driver.switchTo().window(newTab.get(0));

    }

}
