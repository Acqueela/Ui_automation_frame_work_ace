package Utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BrowserDriver {
    public static WebDriver driver;
    public static ChromeOptions Options;
    public BrowserDriver(){


        this.driver=driver;
        System.setProperty("webdriver.chrome.verboseLogging", "true");
        this.driver= new ChromeDriver();
        driver.get("https://anupdamoda.github.io/AceOnlineShoePortal/index.html");
    }

    public void close(){
        this.driver.close();
    }
}
