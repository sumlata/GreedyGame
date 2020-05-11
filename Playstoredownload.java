package mob.greedygames.assign.test;


	
	import io.appium.java_client.android.AndroidDriver;
	import io.appium.java_client.android.AndroidKeyCode;
	import io.appium.java_client.MobileElement;
	import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.openqa.selenium.By;

import java.util.List;
import java.util.concurrent.TimeUnit;
	import java.net.URL;

	public class Playstoredownload {
	    public static AndroidDriver<MobileElement> driver;

	    @BeforeClass
	    public static void setUp() throws Exception {
	        DesiredCapabilities capabilities = new DesiredCapabilities();
	        capabilities.setCapability("platformName", "Android");
	        capabilities.setCapability("deviceName", "Google Nexus 5X");
	        capabilities.setCapability("platformVersion", "7.0");
	        capabilities.setCapability("appPackage", "com.android.vending");
	        capabilities.setCapability("appActivity", "com.google.android.finsky.activities.MainActivity");

	        driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
	        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    }

	    @AfterClass
	    public static void tearDown() {
	        driver.quit();
	    }

	   @Test
	    public void testPlayStore() throws Exception {
		   Thread.sleep(3000);
	        driver.findElement(By.xpath("//android.widget.TextView[@text='Top charts']")).click();
	        List<MobileElement> AppName=driver.findElements(By.id("com.android.vending:id/play_card"));
			for(int i=0;i<AppName.size();i++) {
			String Appdata=AppName.get(i).getText();
				System.out.println("The total app's are "+Appdata);
			}

	      
	   }
	}


