package Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MobilBrowserTest extends BrowserBaseTest {
    @Test
    public void browserTest1(){
        driver.get("http://google.com");
        System.out.println("Title = "+driver.getTitle());
        driver.findElement(By.name("q")).sendKeys("rahul shetty academy");
        driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
    }
    @Test
    public void browserTest2(){
        driver.get("http://rahulshettyacademy.com/angularAppdemo/");
        System.out.println("Title = "+driver.getTitle());
        driver.findElement(By.xpath("//span[@class='navbar-toggler-icon']")).click();
        driver.findElement(By.cssSelector("a[routerlink*='products']")).click();
        ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,1000)","");
        String text=driver.findElement(By.cssSelector("a[href*='products/3']")).getText();
        Assert.assertEquals(text,"Devops");
    }
}
