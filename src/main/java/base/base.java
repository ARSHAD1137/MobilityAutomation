package base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.net.MalformedURLException;
import java.net.URL;

public class base {
    static WebDriver driver;

    @BeforeTest
    public void setup() throws InterruptedException, MalformedURLException {
        DesiredCapabilities cap = new DesiredCapabilities();

        cap.setCapability("deviceName", "emulator-5554");
        cap.setCapability("platformName", "Android");
        cap.setCapability("platformVersion", "8.0");
        cap.setCapability("appPackage", "com.android.calculator2");
        cap.setCapability("appActivity", "com.android.calculator2.Calculator");
        cap.setCapability("automationName","UiAutomator2");
        cap.setCapability("uiautomator2ServerLaunchTimeout","100000");
        cap.setCapability("adbExecTimeout","60000");

        driver = new RemoteWebDriver(new URL("http://0.0.0.0:4723/wd/hub"), cap);

    }

    @AfterTest
    public void clearScreen()
    {
        driver.findElement(By.xpath("//android.widget.Button[@text='CLR']")).click();
    }
}
