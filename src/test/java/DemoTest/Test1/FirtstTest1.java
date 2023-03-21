package DemoTest.Test1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirtstTest1 {

	public static void main(String[] args) {

		// Launch The Browser
				System.setProperty("webdriver.chrome.driver", "D:\\batch22\\Demo\\chromedriver_win32\\chromedriver.exe");
		        WebDriver driver=new ChromeDriver();
		        
		        //Launch Google Web Page
		        driver.get("https://www.google.com/");
		        driver.manage().window().maximize();
		        
		        
		        WebElement element=driver.findElement(By.name("q"));
		        element.sendKeys("Selenium java download");
		        element.submit();
		        
		        //Capture title of web page
		        String title=driver.getTitle();
		        System.out.println("Page Title :" + title);
		         
		        
		        //capture URL
		        String url=driver.getCurrentUrl();
		        System.out.println("URL :" + url);
		        //driver.close();
		        
		        
		        
	}

}
