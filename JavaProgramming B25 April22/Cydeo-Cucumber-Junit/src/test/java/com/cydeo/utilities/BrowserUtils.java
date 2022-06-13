package com.cydeo.utilities;

// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)

import java.util.Iterator;
import java.util.Set;
import org.junit.Assert;

public class BrowserUtils {

    public BrowserUtils() {
    }

    public static void sleep(int second) {
        second *= 1000;

        try {
            Thread.sleep((long)second);
        } catch (InterruptedException var2) {
        }

    }

    public static void switchWindowAndVerify(String expectedInUrl, String expectedInTitle) {
        Set<String> allWindowsHandles = Driver.getDriver().getWindowHandles();
        Iterator var3 = allWindowsHandles.iterator();

        while(var3.hasNext()) {
            String each = (String)var3.next();
            Driver.getDriver().switchTo().window(each);
            System.out.println("Current URL: " + Driver.getDriver().getCurrentUrl());
            if (Driver.getDriver().getCurrentUrl().contains(expectedInUrl)) {
                break;
            }
        }

        String actualTitle = Driver.getDriver().getTitle();
        Assert.assertTrue(actualTitle.contains(expectedInTitle));
    }

    public static void verifyTitle(String expectedTitle) {
        Assert.assertEquals(Driver.getDriver().getTitle(), expectedTitle);
    }
}

