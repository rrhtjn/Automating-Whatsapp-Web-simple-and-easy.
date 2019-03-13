package selenimuapp;

import java.awt.Robot;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.sun.glass.events.KeyEvent;

public class whatsappWeb { 
	public static void main(String[] args) throws Exception{
		
		FirefoxDriver d =new FirefoxDriver();
		d.get("https://web.whatsapp.com/");
		d.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		
		d.findElement(By.xpath("//input[@title='Search or start new chat']")).click();
		
		d.findElement(By.xpath("//input[@title='Search or start new chat']")).sendKeys("Mayank");
		
		Thread.sleep(5000);
	
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		

		d.findElement(By.xpath("//div[@class='_2S1VP copyable-text selectable-text']")).sendKeys("hello");

        d.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[4]/div[1]/footer[1]/div[1]/div[3]/button[1]")).click();
		
		
	}

}
