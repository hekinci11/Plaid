package com.Automation.utilities;


public class MobileUtils {

    public static void waitFor(int milliseconds) {
        try {
            Thread.sleep(milliseconds);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


    }
