import java.util.concurrent.TimeUnit;

import org.apache.http.cookie.ClientCookie;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.gargoylesoftware.htmlunit.util.Cookie;


public class Tatoc {


	public static void main(String[] args) {
		String color1, color2, token;
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sadafansari\\workspace\\Demo1\\lib\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    driver.get("http://10.0.1.86/tatoc/basic/drag");   
//	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//	    driver.findElement(By.xpath("/html/body/div/div[2]/a[1]")).click();
//	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//	    driver.findElement(By.className("greenbox")).click();
//	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//	    driver.switchTo().frame("main");
//	    color1 = driver.findElement(By.id("answer")).getAttribute("class");
//	    System.out.println("Color of Box 1 = " + color1);
//	    driver.switchTo().frame("child");
//	    color2 = driver.findElement(By.id("answer")).getAttribute("class");
//	    System.out.println("Color of Box 2 = " + color2);
//	    driver.switchTo().defaultContent();
//	    
//	    while(!color1.equals(color2) ) {
//	    	driver.switchTo().frame("main");
//	    	driver.findElement(By.xpath("/html/body/center/a[1]")).click();
//	    	driver.switchTo().frame("child");
//	    	color2 = driver.findElement(By.id("answer")).getAttribute("class");	
//	    	System.out.println("Color of Box 2 = "+ color2);
//	    	driver.switchTo().defaultContent();
//		}
//	        driver.switchTo().defaultContent();
//	    	driver.switchTo().frame("main");
//	    	driver.findElement(By.xpath("/html/body/center/a[2]")).click();	
//	    	System.out.println("Color of Box 1 = " + color1 + " is equal to Color of Box 2 = " + color2);
	    	WebElement From=driver.findElement(By.id("dragbox"));	
	    	WebElement To=driver.findElement(By.id("dropbox"));
	    	Actions act = new Actions(driver);
	    	act.dragAndDrop(From, To).build().perform();
	    	driver.findElement(By.xpath("/html/body/div/div[2]/a")).click();
	    	String winHandleBefore = driver.getWindowHandle();
	    	driver.findElement(By.xpath("/html/body/div/div[2]/a[1]")).click();
	    	driver.switchTo().window("popup");
	    	driver.findElement(By.id("name")).sendKeys("Sadaf Ansari");
	    	driver.findElement(By.id("submit")).click();
	    	driver.switchTo().window(winHandleBefore);
	    	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    	driver.findElement(By.xpath("/html/body/div/div[2]/a[2]")).click();
	    	driver.findElement(By.xpath("/html/body/div/div[2]/a[1]")).click();
	    	token = driver.findElement(By.id("token")).getText();
	    	System.out.println("Token = " + token);
	    	
	    	
	}

}
