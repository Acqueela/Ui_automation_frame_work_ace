package pages;

import Utility.BrowserDriver;
import org.openqa.selenium.By;

public class HomePage extends BrowserDriver {
    public static String hamburger_menu_xpath="//input[@type='checkbox']";
    public static String signin_link_xpath="//li[text()='Sign In Portal']";
    public static void click() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(By.xpath(hamburger_menu_xpath)).click();

    }
    public static void click_signIn() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(By.xpath(signin_link_xpath)).click();
    }
}
