package com.Automation.pages;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;



public class DashboardPage extends BasePage {


        @AndroidFindBy(id = "io.plaidapp:id/menu_search")
        public AndroidElement searchButton;

        @AndroidFindBy(id = "android:id/search_src_text")
        public AndroidElement searchBox;


        @AndroidFindBy(id = "io.plaidapp:id/menu_theme")
        public AndroidElement SunButton;

        @AndroidFindBy(id = "io.plaidapp:id/menu_filter")
        public AndroidElement FilterButton;

        @AndroidFindBy(id = "io.plaidapp:id/no_filters")
        public AndroidElement NoFilter;

        @AndroidFindBy(xpath = "//*[@text='Popular Designer News']")
        public AndroidElement PDNButton;

        @AndroidFindBy(xpath = "//*[@text='“Material Design”']")
        public AndroidElement MDButton;

        @AndroidFindBy(xpath = "//*[@text='Product Hunt']")
        public AndroidElement PHButton;

        @AndroidFindBy(className = "android.widget.ImageButton")
        public AndroidElement ImageButton;

        @AndroidFindBy(xpath = "//*[@text='Log in to Designer News']")
        public AndroidElement LDNButton;

        @AndroidFindBy(xpath = "//*[@text='About']")
        public AndroidElement AboutButton;

        @AndroidFindBy(xpath = "//*[@text='Convert a YouTube Video to an Image']")
        public AndroidElement SearchResult;

        @AndroidFindBy(id = "io.plaidapp.designernews:id/login")
        public AndroidElement LoginButton;




    }