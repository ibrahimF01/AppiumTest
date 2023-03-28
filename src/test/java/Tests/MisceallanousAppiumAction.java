package Tests;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.Activity;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import org.openqa.selenium.By;
import org.openqa.selenium.DeviceRotation;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MisceallanousAppiumAction extends BaseTest{
    @Test
    public void Miscellanous() throws InterruptedException {
        //adb shell dumpsys window | grep -E 'mCurrentFocus' -MAC
        //adb shell dumpsys window | find "mCurrentFocus" -Windows
        //App Package & App Activity
        Activity activity=new Activity("io.appium.android.apis","io.appium.android.apis.preference.PreferenceDependencies");
        driver.startActivity(activity);
        driver.findElement(AppiumBy.accessibilityId("Preference")).click();
        driver.findElement(By.xpath("//android.widget.TextView[@content-desc='3. Preference dependencies']")).click();
        driver.findElement(By.id("android:id/checkbox")).click();
        //telefon ekranını yana yatırma
        DeviceRotation landScape=new DeviceRotation(0,0,90);
        driver.rotate(landScape);
        driver. findElement(By.xpath("(//android.widget.RelativeLayout)[2]")).click();
        String alertTitle = driver. findElement(By.id("android:id/alertTitle")).getText();
        Assert.assertEquals(alertTitle, "WiFi settings");
        //copy
        //copy to clipboard- paste it clipboard
        driver.setClipboardText("ibrahim");
        driver. findElement(By.id("android:id/edit")).sendKeys(driver.getClipboardText());
        driver.pressKey(new KeyEvent(AndroidKey.ENTER));
        driver. findElements(AppiumBy.className("android.widget.Button")).get(1).click();
        driver.pressKey(new KeyEvent(AndroidKey.BACK));
        driver.pressKey(new KeyEvent(AndroidKey.HOME));



    }

}
