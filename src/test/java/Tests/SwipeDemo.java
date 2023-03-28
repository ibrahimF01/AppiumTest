package Tests;

import com.google.common.collect.ImmutableMap;
import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import sun.management.snmp.jvminstr.JvmOSImpl;

public class SwipeDemo extends BaseTest{
    @Test
    public void SwipeDemoTest() throws InterruptedException {
        scrollToEndAction();
        Thread.sleep(2000);
        driver.findElement(AppiumBy.accessibilityId("Views")).click();
        driver.findElement(AppiumBy.accessibilityId("Gallery")).click();
        driver.findElement(By.xpath("//android.widget.TextView[@text='1. Photos']")).click();
        WebElement firstImagine=driver.findElement(By.xpath("//(android.widget.ImageView)[1]"));
        Assert.assertEquals(driver.findElement(By.xpath("//(android.widget.ImageView)[1]")).getAttribute("focusable"),"true");
        //Swipe
//        ((JavascriptExecutor) driver).executeScript("mobile: swipeGesture", ImmutableMap.of(
//                "elementId",((RemoteWebElement)firstImagine).getId(),
//                "direction", "left",
//                "percent", 0.75
//        ));
        swipeAction(firstImagine,"left");
        Assert.assertEquals(driver.findElement(By.xpath("//(android.widget.ImageView)[1]")).getAttribute("focusable"),"false");

    }
}
