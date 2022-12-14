package org.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class P2_LoginPage {
    static WebDriver driver;

    public P2_LoginPage(WebDriver driver)

    {
        this.driver = driver;
    }

    public WebElement emailPOM()
    {
        By entrEmail = By.id("Email");
        WebElement entrEmailElm = driver.findElement(entrEmail);
        return entrEmailElm;
    }

    public WebElement passwordPOM()
    {
        By entrPassword = By.id("Password");
        WebElement entrPasswordElm = driver.findElement(entrPassword);
        return entrPasswordElm;
    }

    public static By errorMsgPOM(){
        By errormsg = By.xpath("//div[@class='message-error validation-summary-errors']");
        WebElement msgElm = driver.findElement(errormsg);
        return errormsg;
    }


//    public WebElement forgetPassPOM()
//    {
//        By forgetPass = By.linkText("Forgot password?");
//        WebElement forgetPassElm = driver.findElement(forgetPass);
//        return forgetPassElm;
//    }

    public WebElement myAccountPOM()
    {
        By myAccount = By.linkText("My account");
        WebElement myAccountElm = driver.findElement(myAccount);
        return myAccountElm;
    }




    public void  LoginSteps(String email, String password)
    {
        // Enter email with POM
        emailPOM().clear();
        emailPOM().sendKeys(email);

        //Enter password with POM
        passwordPOM().sendKeys(password);
    }




}
