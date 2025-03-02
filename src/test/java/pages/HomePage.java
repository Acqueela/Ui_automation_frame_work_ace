package pages;

import Utility.BrowserDriver;
import org.openqa.selenium.By;

public class HomePage extends BrowserDriver {
    public static String hamburgerMenu="jhuj";
    public static  String signinLinkpath="mnefnj";
    public static void click() throws InterruptedException {
        Thread.sleep(200);
        driver.findElement(By.xpath(hamburgerMenu)).click();

    }
    public static void click_signIn() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(By.xpath(signinLinkpath)).click();
    }
}
