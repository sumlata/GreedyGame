package mob.kzayebee.assign.test;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class SwipeHelper {
	private double startXPercentage;
	private double endXPercentage;
	private double startYPercentage;
	private double endYPercentage;
	private int swipeCount;
	public SwipeHelper(double startX,double endX,double startY,double endY,int count){
		startXPercentage = startX;
		endXPercentage = endX;
		startYPercentage = startY;
		endYPercentage = endY;
		swipeCount = count;
	}
	public void swipe(AndroidDriver<MobileElement> driver) throws InterruptedException{
		Dimension size = driver.manage().window().getSize(); 
		System.out.println(size); 
		for (int i=0;i<swipeCount;i++){
			int starty = (int) (size.height * startYPercentage); 
			int endy = (int) (size.height * endYPercentage); 
			int startx = (int) (size.height * startXPercentage); 
			int endx = (int) (size.height * endXPercentage); 
			System.out.println("Start X Coordinate is :"+startx);
			System.out.println("Start Y Coordinate is :"+starty);
			System.out.println("End X Coordinate is :"+endx);
			System.out.println("End Y Coordinate is :"+endy);
			driver.swipe(startx, starty, endx, endy, 1000);
			Thread.sleep(5000);
		}
	}
	public void swipe(WebDriver driver) {
		// TODO Auto-generated method stub
		
	}
}


