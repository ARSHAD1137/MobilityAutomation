package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.BeforeTest;

import java.net.MalformedURLException;
import java.net.URL;

public class base {
    static WebDriver driver;

    @BeforeTest
    public void setup() throws MalformedURLException {
        DesiredCapabilities cap = new DesiredCapabilities();

        cap.setCapability("deviceName", "SM G570F");
        cap.setCapability("udid","42000995e440a3d9");
        cap.setCapability("platformName", "Android");
        cap.setCapability("platformVersion", "8.0.0");
        cap.setCapability("appPackage", "com.sec.android.app.popupcalculator");
        cap.setCapability("appActivity", "com.sec.android.app.popupcalculator.Calculator");


        driver = new RemoteWebDriver(new URL("http://0.0.0.0:4723/wd/hub"), cap);
    }

}
