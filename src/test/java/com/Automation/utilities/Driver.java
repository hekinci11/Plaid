package com.Automation.utilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.Platform;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class Driver {
    private static AppiumDriver<MobileElement> driver;
    private static DesiredCapabilities desiredCapabilities = new DesiredCapabilities().android();
    // private final static String ANDROID_APP_URL = ConfigurationReader.get("android.app");


    public Driver() {
    }

    public static AppiumDriver<MobileElement> getDriver() {
        if (driver == null) {
            String platfrom = ConfigurationReader.get("platform");
            System.out.println(platfrom);
            Log.info("Test is running on " + platfrom);

            switch (platfrom) {
                case "android":
                    desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, Platform.ANDROID);
                    desiredCapabilities.setCapability(MobileCapabilityType.VERSION, "7.0");

                    desiredCapabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Pixel_21");
                    desiredCapabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");
                    desiredCapabilities.setCapability("app","C:/Users/HP/IdeaProjects/PlaidAutomation/Plaid-1251-v1.1.0.apk");

                    try {
                        driver = new AppiumDriver<>(new URL("http://localhost:4723/wd/hub"), desiredCapabilities);
                    } catch (MalformedURLException e) {
                        e.printStackTrace();
                    }
                    break;

                case "SauceLabs":

                    desiredCapabilities.setCapability("appiumVersion", "1.20.1");
                    desiredCapabilities.setCapability("deviceName","Samsung Galaxy S9 WQHD GoogleAPI Emulator");
                    desiredCapabilities.setCapability("deviceOrientation", "portrait");
                    desiredCapabilities.setCapability("browserName", "");
                    desiredCapabilities.setCapability("platformVersion","8.0");
                    desiredCapabilities.setCapability("platformName","Android");
                    desiredCapabilities.setCapability("app","storage:filename=Plaid-1251-v1.1.0.apk");


                    try {
                        driver = new AppiumDriver<>(new URL("https://hekinci:afd25e7c-52b5-4a00-a7be-22708e02ab2b@ondemand.eu-central-1.saucelabs.com:443/wd/hub"),desiredCapabilities);
                    } catch (MalformedURLException e) {
                        e.printStackTrace();
                    }
                    break;

                case "RealDevice":
                    desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, Platform.ANDROID);
                    desiredCapabilities.setCapability(MobileCapabilityType.VERSION, "9.0");

                    desiredCapabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "a8c8c6cf");
                    desiredCapabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");
                    desiredCapabilities.setCapability("app","C:/Users/HP/IdeaProjects/PlaidAutomation/Plaid-1251-v1.1.0.apk");

                    try {
                        driver = new AppiumDriver<>(new URL("http://localhost:4723/wd/hub"), desiredCapabilities);
                    } catch (MalformedURLException e) {
                        e.printStackTrace();
                    }
                    break;

                default:
                    Log.error("Driver type is not implemented yet");
                    throw new RuntimeException("Driver type is not implemented yet");

            }

        }
        return driver;
    }

    public static void closeDriver() {
        if (driver != null) {
            driver.closeApp();
            driver = null;
        }
    }
}