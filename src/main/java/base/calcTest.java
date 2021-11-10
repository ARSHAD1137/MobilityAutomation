package base;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class calcTest extends base {

    @Test(priority = 1)
    public void add() throws InterruptedException {
        driver.findElement(By.id("com.android.calculator2:id/digit_7")).click();
        Thread.sleep(3000);
        driver.findElement(By.id("com.android.calculator2:id/op_add")).click();
        Thread.sleep(3000);
        driver.findElement(By.id("com.android.calculator2:id/digit_8")).click();
        Thread.sleep(3000);
        String result = driver.findElement(By.xpath("//android.widget.TextView[@resource-id='com.android.calculator2:id/result']")).getText();

        Assert.assertEquals(result,"15");
    }

    @Test(priority = 2)
    public void subtract() throws InterruptedException {
        driver.findElement(By.id("com.android.calculator2:id/digit_6")).click();
        Thread.sleep(3000);
        driver.findElement(By.id("com.android.calculator2:id/op_sub")).click();
        Thread.sleep(3000);
        driver.findElement(By.id("com.android.calculator2:id/digit_5")).click();
        Thread.sleep(3000);
        String result = driver.findElement(By.xpath("//android.widget.TextView[@resource-id='com.android.calculator2:id/result']")).getText();

        Assert.assertEquals(result,"1");
    }

    @Test(priority = 3)
    public void division() throws InterruptedException {
        driver.findElement(By.id("com.android.calculator2:id/digit_8")).click();
        Thread.sleep(3000);
        driver.findElement(By.id("com.android.calculator2:id/op_div")).click();
        Thread.sleep(3000);
        driver.findElement(By.id("com.android.calculator2:id/digit_6")).click();
        Thread.sleep(3000);
    }

    @AfterMethod
    public void clickEquals() throws InterruptedException {
        driver.findElement(By.id("com.android.calculator2:id/eq")).click();
        Thread.sleep(3000);
    }
}

