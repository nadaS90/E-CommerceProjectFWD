package org.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class HomePage {

         WebDriver driver;

        public HomePage(WebDriver driver)
        {
            this.driver = driver;
        }

    public WebElement dropDownPOM()
    {
        By dropDown = By.cssSelector("#customerCurrency");
        WebElement dropDownlElm = driver.findElement(dropDown);
        return dropDownlElm;
    }

    public WebElement slctcurncyPOM()
    {
        By slctcurncy = By.cssSelector("#customerCurrency > option:nth-child(2)");
        WebElement slctcurncyElm = driver.findElement(slctcurncy);
        return slctcurncyElm;
    }

    public List<WebElement> currencyItemsPOM()
    {
        By currencyItems = By.cssSelector(("span[class=\"price actual-price\"]"));
        List<WebElement> currencyItemsElms = driver.findElements(currencyItems);
        return currencyItemsElms;
    }

    public WebElement searchFieldPOM()
    {
        By searchField = By.name("q");
        WebElement searchFieldElm = driver.findElement(searchField);
        return searchFieldElm;
    }

    public WebElement productNamePOM()
    {
        By productName = By.name("q");
        WebElement productNameElm = driver.findElement(productName);
        return productNameElm;
    }



    }
