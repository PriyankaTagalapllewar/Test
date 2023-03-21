package DemoTest.Test1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Snapdeal {

	public static void main(String[] args) {

		// Launch The Browser
				System.setProperty("webdriver.chrome.driver", "D:\\batch22\\Demo\\chromedriver_win32\\chromedriver.exe");
		        WebDriver driver=new ChromeDriver();
		        
		        //Launch Google Web Page
		        driver.get("https://www.snapdeal.com/");
		        driver.manage().window().maximize();
		     
		      //driver.findElement(By.id("nav-link-accountList-nav-line-1")).click();
		     WebElement element= driver.findElement(By.xpath("//span[@class='accountUserName col-xs-12 reset-padding']"));
		     Actions act= new Actions(driver);
		      act.moveToElement(element).build().perform();
		      
		      driver.findElement(By.xpath("//span[@class='newUserRegister']")).click();
		      //driver.findElement(By.xpath("//input[@id='userName']")).sendKeys("7507510516");
		    // driver.findElement(By.className("col-xs-24")).sendKeys("motarwar24@gmail.com");
		     driver.findElement(By.id("checkUser")).click();
		     

	}

}
