package com.amazon;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public class DriverFactory {
    public static WebDriver driver;

    public DriverFactory(){
        PageFactory.initElements(driver,this);
    }
    public void openBrowser(){
        WebDriverManager.chromedriver().setup();
        driver.get("https://www.amazon.co.uk");
    }
    public void maxBrowser(){
        driver.manage().window().maximize();
    }
    public void impWait(){
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }
    public void closeBrowser(){
        driver.quit();
        //ketan
    }
}
