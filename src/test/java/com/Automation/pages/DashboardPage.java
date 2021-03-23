package com.Automation.pages;

import com.Automation.utilities.Driver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.support.PageFactory;

public class DashboardPage extends BasePage {

        public DashboardPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }


        @AndroidFindBy(id = "c5457780-78d7-4a5d-a8c7-52fcc11a1bba")
        public AndroidElement SearchButton;

    }