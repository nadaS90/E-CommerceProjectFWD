package org.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class P3_HomePage {
         WebDriver driver;

        public P3_HomePage(WebDriver driver)
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

//    public  WebElement productTitlePOM()
//    {
//        By productTitle = By.cssSelector("h2[class=\"product-title\"]");
//        WebElement productTitleElm = driver.findElement(productTitle);
//        return productTitleElm;
//    }

    public WebElement hoverCategoryPOM()
    {
        By hoverCategory = By.cssSelector("ul[class=\"top-menu notmobile\"] [href=\"/electronics\"]");
        WebElement hoverCategoryElm = driver.findElement(hoverCategory);
        return hoverCategoryElm;
    }

    public WebElement subCategoryPOM()
    {
        By subCategory = By.cssSelector("body > div.master-wrapper-page > div.header-menu > ul.top-menu.notmobile > li:nth-child(2) > ul > li:nth-child(2) > a");
        WebElement subCategoryElm = driver.findElement(subCategory);
        return subCategoryElm;
    }

    public  WebElement categoryListPOM()
    {
        By categoryList = By.cssSelector("div[class=\"page-title\"]");
        WebElement categoryListElm = driver.findElement(categoryList);
        return categoryListElm;
    }

    public WebElement selectFirstSliderPOM()
    {
        By selectFirstSlider = By.xpath("//div[@class='nivo-controlNav']//a[1]");
        WebElement selectFirstSliderElm = driver.findElement(selectFirstSlider);
        return selectFirstSliderElm;
    }

    public WebElement selectSecondSliderPOM()
    {
        By selectSecondSlider = By.xpath("//div[@class='nivo-controlNav']//a[2]");
        WebElement selectSecondSliderElm = driver.findElement(selectSecondSlider);
        return selectSecondSliderElm;
    }

    public WebElement faceBookPOM()
    {
        By faceBook = By.xpath("//a[@href=\"http://www.facebook.com/nopCommerce\"]");
        WebElement faceBookElm = driver.findElement(faceBook);
        return faceBookElm;
    }

    public WebElement twitterPOM()
    {
        By twitter = By.xpath("//a[@href=\"https://twitter.com/nopCommerce\"]");
        WebElement twitterElm = driver.findElement(twitter);
        return twitterElm;
    }

    public WebElement rssPOM()
    {
        By rss = By.xpath("//a[@href=\"/news/rss/1\"]");
        WebElement rssElm = driver.findElement(rss);
        return rssElm;
    }

    public WebElement youTubePOM()
    {
        By youTube = By.xpath("//a[@href=\"http://www.youtube.com/user/nopCommerce\"]");
        WebElement youTubeElm = driver.findElement(youTube);
        return youTubeElm;
    }






}
