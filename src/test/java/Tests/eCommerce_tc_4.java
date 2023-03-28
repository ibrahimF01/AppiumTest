package Tests;

import com.sun.org.apache.xpath.internal.operations.And;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;
import java.util.Set;

public class eCommerce_tc_4 extends BaseTest{
    @Test
    public void FillForm4() throws InterruptedException {
    driver.findElement(By.id("com.androidsample.generalstore:id/nameField")).sendKeys("ibrahim");
    //klavyeyi gizleme
    driver.hideKeyboard();
    driver.findElement(By.xpath("//android.widget.RadioButton[@text='Female']")).click();
    driver.findElement(By.id("android:id/text1")).click();
    driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Bolivia\"));"));
    driver.findElement(By.xpath("//android.widget.TextView[@text='Bolivia']")).click();
    driver.findElement(By.id("com.androidsample.generalstore:id/btnLetsShop")).click();
    driver.findElements(By.xpath("//android.widget.TextView[@text='ADD TO CART']")).get(0).click();
    driver.findElements(By.xpath("//android.widget.TextView[@text='ADD TO CART']")).get(0).click();
//    driver.findElements(By.xpath("(//android.widget.TextView[@text='ADD TO CART'])[1]")).click();//2.yol
    driver.findElement(By.id("com.androidsample.generalstore:id/appbar_btn_cart")).click();

    Thread.sleep(2000);

    WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(5));
    wait.until(ExpectedConditions.attributeContains(driver.findElement(By.id("com.androidsample.generalstore:id/toolbar_title")),"text","Cart"));
     List<WebElement> productPrice=driver.findElements(By.id("com.androidsample.generalstore:id/productPrice"));
    int count=productPrice.size();
        double totalSum=0;
        for (int i = 0; i <count ; i++) {
           String amountString= productPrice.get(i).getText();
          Double price =getFormattedAmount(amountString);
          totalSum +=price; //160.97 + 120 = 280.97
        }
    String displaySum=driver.findElement(By.id("com.androidsample.generalstore:id/totalAmountLbl")).getText();
        Double displayFormattedSum=getFormattedAmount(displaySum);
        Assert.assertEquals(totalSum,displayFormattedSum);
        WebElement ele=driver.findElement(By.id("com.androidsample.generalstore:id/termsButton"));
        longPressAction(ele);
        driver.findElement(By.id("android:id/button1")).click();
        driver.findElement(AppiumBy.className("android.widget.CheckBox")).click();
        driver.findElement(By.id("com.androidsample.generalstore:id/btnProceed")).click();
        Thread.sleep(6000);
        Set<String> contexts=driver.getContextHandles();
        for (String contextName:contexts){
            System.out.println("contextName = " + contextName);
        }
        driver.context("WEBVIEW_com.androidsample.generalstore");//chrome driver
        driver.findElement(By.name("q")).sendKeys("Erdem Bey");
        driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
        driver.pressKey(new KeyEvent(AndroidKey.BACK));
        driver.context("NATIVE_APP");

        //Hybrid - Google page
    }

}
