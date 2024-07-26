package com.virgingames.pages;

import com.virgingames.utility.Utility;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class HomePage extends Utility {

    private static final Logger log = Logger.getLogger(HomePage.class);

    @CacheLookup
    @FindBy(xpath = "//label[contains(text(),'Allow all cookies')]")
    WebElement allowCookie;

    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'About Us')]")
    WebElement aboutus;



    public void clickonCookies() {
        log.info("click on allow cookie: " + allowCookie.toString());
        clickOnElement(allowCookie);
    }

    public  void clickonAboutus(){
        log.info("Navigate to about us " + aboutus.toString());
        clickOnElement(aboutus);
    }


}
