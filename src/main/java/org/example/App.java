package org.example;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.net.MalformedURLException;
import java.net.URL;

public class App {

    public AppiumDriver driver;
    public WebDriverWait wait;

    public void setUp() throws MalformedURLException {
        DesiredCapabilities cap = new DesiredCapabilities();

        cap.setCapability("automationName","UiAutomator2");
        cap.setCapability("deviceName", "ASUS_X00QD");
        cap.setCapability("platformName", "Android");
        cap.setCapability("version", "9.0");
        cap.setCapability("app", "C:\\Users\\Gunugur\\OneDrive\\Masaüstü\\0374d0c2-facc-4f16-a241-f71392c28acc(1).apk");


        driver = new AndroidDriver(new URL("http://localhost:4723/wd/hub"), cap);
        wait = new WebDriverWait(driver, 5);


    }
}
