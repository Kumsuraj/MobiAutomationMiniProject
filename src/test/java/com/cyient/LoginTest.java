package com.cyient;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;

public class LoginTest {

	public static void main(String[] args) throws MalformedURLException {
		DesiredCapabilities cap=new DesiredCapabilities();
		cap.setCapability("deviceName", "Lenovo");
        cap.setCapability("platformName", "Android");
        //cap.setCapability("browserName", "chrome");
        //Thread.sleep(5000);
        cap.setCapability("app","C:\\MAutomationMiniProject\\src\\test\\resources\\apkfile\\com.ubercab.fleet_2021-04-07.apk");
        AndroidDriver<WebElement> driver=new AndroidDriver<WebElement>(new URL("http://localhost:4723/wd/hub"), cap);
        driver.manage().timeouts().implicitlyWait(70, TimeUnit.SECONDS);
           //ValidCredentail
        //Skip button
        driver.findElement(By.id("com.ubercab.fleet:id/ub__fre_button")).click();
        
        //SignIn button
        driver.findElement(By.id("com.ubercab.fleet:id/ub__sign_in_button")).click();
        
        //Enter userName
        driver.findElement(By.id("com.ubercab.fleet:id/email_field")).sendKeys("surajkumar@gmail.com");
        
        //Enter Password
        driver.findElement(By.id("com.ubercab.fleet:id/password_field")).sendKeys("Sur@12345");
        
        //Clickable next button
        driver.findElement(By.xpath("//android.widget.ImageButton[@content-desc=\"Next\"]")).click();
        
        //Clickable back button
        driver.findElement(By.id("com.ubercab.fleet:id/onboarding_app_bar")).click();
       
        //Check Payment statment....
        
        driver.findElement(By.id("com.ubercab.fleet:id/ub__fre_step_title_view")).click();
        
        //Validate Login page
        //String actualValue=driver.findElement(By.id("com.ubercab.fleet:id/ub__fre_step_title_view")).getText();
       // Asserts.assertEquals(actualValue,"Find new drivers");
        
        //Invalid Credentail.......
       
        
        
        //driver.quit();	

	}

}
