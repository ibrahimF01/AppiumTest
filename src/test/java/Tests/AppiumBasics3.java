package Tests;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class AppiumBasics3 {
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
        options.setApp("C:/Users/ibrah/IdeaProjects/appiumtest/src/test/java/Resources/General-Store.apk");

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
