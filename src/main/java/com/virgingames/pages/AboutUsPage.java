package com.virgingames.pages;

import com.virgingames.utility.Utility;
import org.apache.log4j.Logger;
import org.openqa.selenium.support.PageFactory;


public class AboutUsPage extends Utility {
    private static final Logger log = Logger.getLogger(AboutUsPage.class);
    public AboutUsPage() {
        PageFactory.initElements(driver, this);
    }

    public String getTheCurrentUrl() {
      log.info("Get Aboutus page link: " + driver.getCurrentUrl());
        return driver.getCurrentUrl();
    }


}
