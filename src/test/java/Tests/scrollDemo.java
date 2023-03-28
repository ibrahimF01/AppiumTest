package Tests;

import com.google.common.collect.ImmutableMap;
import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class scrollDemo extends BaseTest{
    @Test
    public void scrollDemoGesture() throws InterruptedException {
       //driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Views\"));"));
        //no prior idea
//        boolean canScrollMore;
//        do {
//            canScrollMore = (Boolean) ((JavascriptExecutor) driver).executeScript("mobile: scrollGesture", ImmutableMap.of(
//                    "left", 100, "top", 100, "width", 200, "height", 200,
//                    "direction", "down",
//                    "percent", 3.0
//                    //
//            ));
//        }while (canScrollMore);
        scrollToEndAction();
        Thread.sleep(2000);
        driver.findElement(AppiumBy.accessibilityId("Views")).click();
        //scroll yapmak için(text ile)
        driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"WebView\"));"));
        Thread.sleep(2000);
        driver.findElement(By.xpath("//android.widget.TextView[@content-desc='Expandable Lists']")).click();
        driver.findElement(AppiumBy.accessibilityId("1. Custom Adapter")).click();
        WebElement ele= driver.findElement(By.xpath("//android.widget.TextView[@text='People Names']"));
        longPressAction(ele);
        Thread.sleep(2000);
        String menuText = driver.findElement(By.id("android:id/title")).getText();
        Assert.assertEquals(menuText,"Sample menu");
        Assert.assertTrue(driver.findElement(By.id("android:id/title")).isDisplayed());

    }
}
