package pages;

import Utility.BrowserDriver;
import org.openqa.selenium.By;

public class SigniPage extends BrowserDriver {
//    public static String username_text_xpath="//input[@type='text']";
//    public static String password_text_xpath="//input[@type='password']";
//    public static String login_button_xpath="//input[@class='btn btn-info']";
//    public static String registration_button_xpath="//button[@type='button']";

    public static void sendkey_username() throws InterruptedException{
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@type='text']")).sendKeys("acqueela");
    }
//    public static void sendkey_password() throws InterruptedException{
//        driver.findElement(By.xpath(password_text_xpath)).sendKeys("g");
//    }
//    public static void click_login_button() throws InterruptedException{
//        driver.findElement(By.xpath(login_button_xpath)).click();
//    }
//    public static void click_registration_button() throws InterruptedException{
//        driver.findElement(By.xpath(registration_button_xpath)).sendKeys("sa");
//    }
}
