package org.example.pages;

import org.example.stepDefinition.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RegistrationPage {

    static WebDriver driver;

    public RegistrationPage(WebDriver driver)

    {
        this.driver = driver;
    }

    public WebElement rgstrUrlPOM()
    {
        return Hooks.driver.findElement(By.className("ico-register"));
    }

    public WebElement genderBtnPOM()
    {
        By gender = By.id("gender-female");
        WebElement gengerElm = driver.findElement(gender);
        return gengerElm;
    }

    public WebElement firstNamePOM()
    {
//        By firstName = By.id("FirstName");
//        WebElement firstNameElm = driver.findElement(firstName);
        //return driver.findElement(By.id("FirstName"));
        return driver.findElement(By.name("FirstName"));
    }

    public WebElement lastNamePOM()
    {
        By lastName = By.id("LastName");
        WebElement lastNameElm = driver.findElement(lastName);
        return lastNameElm;
    }

    public WebElement dayPOM()
    {
        By day = By.xpath("//select[@name=\"DateOfBirthDay\"]");
        WebElement dayElm = driver.findElement(day);
        return dayElm;
    }

    public WebElement monthPOM()
    {
        By month = By.xpath("//select[@name=\"DateOfBirthMonth\"]");;
        WebElement monthElm = driver.findElement(month);
        return monthElm;
    }

    public WebElement yearPOM()
    {
        By year = By.xpath("//select[@name=\"DateOfBirthYear\"]");;
        WebElement yearElm = driver.findElement(year);
        return yearElm;
    }

    public WebElement emailPOM()
    {
        By email = By.id("Email");
        WebElement emailElm = driver.findElement(email);
        return emailElm;
    }

    public WebElement passwordPOM()
    {
        By password = By.id("Password");
        WebElement passwordElm = driver.findElement(password);
        return passwordElm;
    }

    public WebElement confirmPasswordPOM()
    {
        By confirmPassword = By.id("ConfirmPassword");
        WebElement confirmPasswordElm = driver.findElement(confirmPassword);
        return confirmPasswordElm;
    }

    public static By msgPOM(){
        By sucessmsg = By.className("result");
        WebElement msgElm = driver.findElement(sucessmsg);
        return sucessmsg;
    }

//    public void RgstrSteps (String firstName, String lastName, String email, String password, String passwordConfirm)
//    {
//        firstNamePOM().clear();
//        firstNamePOM().sendKeys(firstName);
//
//        lastNamePOM().clear();
//        lastNamePOM().sendKeys(lastName);
//
//        emailPOM().clear();
//        emailPOM().sendKeys(email);
//
//        passwordPOM().clear();
//        passwordPOM().sendKeys(password);
//
//        confirmPasswordPOM().clear();
//        confirmPasswordPOM().sendKeys(passwordConfirm);
//    }






}
