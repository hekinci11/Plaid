package com.Automation.pages;
import com.Automation.utilities.ConfigurationReader;
import com.Automation.utilities.Driver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.apache.log4j.Logger;
import org.openqa.selenium.support.PageFactory;



   public abstract class BasePage {
    private final static Logger logger = Logger.getLogger(ConfigurationReader.class);


    public BasePage() {
        PageFactory.initElements(new AppiumFieldDecorator(Driver.getDriver()),this);
    }



    }

