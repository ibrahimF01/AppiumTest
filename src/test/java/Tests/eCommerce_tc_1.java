package Tests;

import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class eCommerce_tc_1 extends BaseTest{
    @Test
    public void FillForm1() throws InterruptedException {
    //driver.findElement(By.id("com.androidsample.generalstore:id/nameField")).sendKeys("ibrahim");
    //klavyeyi gizleme
    driver.hideKeyboard();
    driver.findElement(By.xpath("//android.widget.RadioButton[@text='Female']")).click();
    driver.findElement(By.id("android:id/text1")).click();
    driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Bolivia\"));"));
    driver.findElement(By.xpath("//android.widget.TextView[@text='Bolivia']")).click();
    driver.findElement(By.id("com.androidsample.generalstore:id/btnLetsShop")).click();
    String toastMessage=driver.findElement(By.xpath("(//android.widget.Toast)[1]")).getAttribute("name");
        Assert.assertEquals(toastMessage,"Please enter your name");


    }
}
