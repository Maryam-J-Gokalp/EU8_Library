package week17;

import week5.WebDriver;

public class DriverObjects {
    public static void main(String[] args) {

        ChromeDriver driver1 = new ChromeDriver();
        FirefoxDriver driver2 = new FirefoxDriver();
        // polymorphism

        WebDriver driver3 = new WebDriver();
        // driver3 which is a variable of WebDriver (supertype) is referring to a subtype(chromeDriver) object

        driver1.get("www.google.com");
        driver1.findElement("//input[@name='q']");

        System.out.println("Title : "+driver1.getTitle());

        // driver3.get("www.cydeo.com");

      //  ((ChromeDriver)driver3).someUniqueMethod();

       // driver3 = new FirefoxDriver();

       // ((FirefoxDriver)driver3).someUniqueMethodforFirefox();

    }
}