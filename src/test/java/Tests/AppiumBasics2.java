package Tests;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

public class AppiumBasics2 extends BaseTest{
    @Test
    public void WifiSettingName() throws InterruptedException {

        // Actual automation
        //Xpath,  id, accessibilityId, classname, androidUIAutomator
        // driver.findElement(By.) --> for selenium
     //   driver.findElement(AppiumBy.accessibilityId("Preference")).click();
       // driver.findElement(AppiumBy.xpath("//android.widget.TextView[@content-desc='3. Preference dependencies']")).click();
     //   driver.findElement(By.xpath("//android.widget.TextView[@content-desc='3. Preference dependencies']")).click();
     //   driver.findElement(By.id("android:id/checkbox")).click();
       // driver.findElement(By.xpath("//android.widget.TextView[@content-desc='3. Preference dependencies']")).click();

        //Xpath,  id, accessibilityId, classname, androidUIAutomator   Locoter olarak bunları kullanıyoruz
//        ConfigureAppium();     @BeforeClass olduğu için gerek yok
        driver.findElement(AppiumBy.accessibilityId("Preference")).click();
        driver.findElement(By.xpath("//android.widget.TextView[@content-desc='3. Preference dependencies']")).click();
       // Thread.sleep(3000);
        driver.findElement(By.id("android:id/checkbox")).click();
        driver. findElement(By.xpath("(//android.widget.RelativeLayout)[2]")).click();
        String alertTitle = driver. findElement(By.id("android:id/alertTitle")).getText();
        Assert.assertEquals(alertTitle, "WiFi settings");
        driver. findElement(By.id("android:id/edit")).sendKeys("ibrahim");

        driver. findElements(AppiumBy.className("android.widget.Button")).get(1).click();
//        tearDown();  @AfterClass olduğu için gerek yok




    }
    @Test
    public void test2(){
        driver.findElement(AppiumBy.accessibilityId("Preference")).click();
        driver.findElement(By.xpath("//android.widget.TextView[@content-desc=\"4. Default values\"]")).click();

    }
}
