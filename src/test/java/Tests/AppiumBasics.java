package Tests;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
//import jdk.nashorn.internal.runtime.Debug;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import org.testng.annotations.Test;
//import io.appium.java_client.android.AndroidDriver;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;

public class AppiumBasics {
    @Test
    public void AppiumTest() throws MalformedURLException {
        // code to start server
        //AndroidDriver, IOSDriver
        //Appium code -> Appium Server -> Mobile
//        AppiumDriverLocalService service=new AppiumServiceBuilder().withAppiumJS(new File("C:/Users/ibrah/AppData/Roaming/npm/node_modules/appium/build/lib/main.js"))
//                .withIPAddress("127.0.0.1").usingPort(4723).build();
//        service.start();

        UiAutomator2Options options=new UiAutomator2Options();
        options.setDeviceName("ibrahim2");
        options.setApp("C:/Users/ibrah/IdeaProjects/appiumtest/src/test/java/Resources/ApiDemos-debug.apk");

        AndroidDriver driver=new AndroidDriver(new URL("http://127.0.0.1:4723"),options);
        // Actual automation
        //Xpath,  id, accessibilityId, classname, androidUIAutomator
       // driver.findElement(By.) --> for selenium

        //driver.findElement(AppiumBy.accessibilityId("Preference")).click();
        
//        driver.quit();
//        service.stop();
        //stop server

    }
}
