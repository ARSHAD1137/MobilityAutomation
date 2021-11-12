package base;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class calcTest extends base {

    @Test(priority = 1)
    public void addition() throws InterruptedException {
        driver.findElement(By.id("com.sec.android.app.popupcalculator:id/bt_01")).click();
        Thread.sleep(3000);
        driver.findElement(By.id("com.sec.android.app.popupcalculator:id/bt_add")).click();
        Thread.sleep(3000);
        driver.findElement(By.id("com.sec.android.app.popupcalculator:id/bt_07")).click();
        Thread.sleep(3000);
        String result = driver.findElement(By.id("com.sec.android.app.popupcalculator:id/txtCalc_RealTimeResult")).getText();

        Assert.assertEquals(result,"8");
    }

    @Test(priority = 2)
    public void subtract() throws InterruptedException {
        driver.findElement(By.id("com.sec.android.app.popupcalculator:id/bt_08")).click();
        Thread.sleep(3000);
        driver.findElement(By.id("com.sec.android.app.popupcalculator:id/bt_sub")).click();
        Thread.sleep(3000);
        driver.findElement(By.id("com.sec.android.app.popupcalculator:id/bt_07")).click();
        Thread.sleep(3000);
        String result = driver.findElement(By.id("com.sec.android.app.popupcalculator:id/txtCalc_RealTimeResult")).getText();

        Assert.assertEquals(result,"1");
    }

    @Test(priority = 3)
    public void multiply() throws InterruptedException {
        driver.findElement(By.id("com.sec.android.app.popupcalculator:id/bt_05")).click();
        Thread.sleep(3000);
        driver.findElement(By.id("com.sec.android.app.popupcalculator:id/bt_mul")).click();
        Thread.sleep(3000);
        driver.findElement(By.id("com.sec.android.app.popupcalculator:id/bt_06")).click();
        Thread.sleep(3000);
        String result = driver.findElement(By.id("com.sec.android.app.popupcalculator:id/txtCalc_RealTimeResult")).getText();

        Assert.assertEquals(result,"30");
    }

    @AfterMethod
    public void clickEquals() throws InterruptedException {
        driver.findElement(By.id("com.sec.android.app.popupcalculator:id/bt_equal")).click();
        Thread.sleep(3000);
    }
}

