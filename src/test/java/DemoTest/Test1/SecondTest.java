package DemoTest.Test1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SecondTest {

	public static void main(String[] args) {
		// Launch The Browser
		System.setProperty("webdriver.chrome.driver", "D:\\batch22\\Demo\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        
        //Launch Google Web Page
        driver.get("https://www.amazon.in/");
        driver.manage().window().maximize();
        
        //Capture title of web page
        String title=driver.getTitle();
        System.out.println("Page Title :" + title);
        
        //capture URL
        String url=driver.getCurrentUrl();
        System.out.println("URL :" + url);
        
        
        
        driver.findElement(By.id("nav-link-accountList-nav-line-1")).click();
       
        //locate Us
        
        driver.findElement(By.name("email")).sendKeys("motarwar24@gmail.com");
       driver.findElement(By.id("continue")).click();
       driver.findElement(By.name("password")).sendKeys("harshmsu");
       driver.findElement(By.id("signInSubmit")).click();
       
       driver.findElement(By.id("twotabsearchtextbox")).sendKeys("apple phone case 13");
       String currentWindowHandle=driver.getWindowHandle();
       driver.switchTo().window(currentWindowHandle);
      //driver.findElement(By.xpath("//div[text()='apple phone case 13']")).click();
       
       driver.findElement(By.xpath("//div[@aria-label='apple phone 13']")).click();
        //driver.findElement(By.id("user-name")).sendKeys("standard_user");
        
        //locate password
       // driver.findElement(By.id("password")).sendKeys("secret_sauce");
        
        //click on login
        //driver.findElement(By.name("login-button")).click();
        
        //window Handle
        //String currentWindowHandle=driver.getWindowHandle();
        //driver.switchTo().window(currentWindowHandle);
        
        //locate the bolt T-shirt
        //driver.findElement(By.linkText("Sauce Labs Bolt T-Shirt")).click();
        //driver.findElement(By.partialLinkText("Sauce Labs Bolt T-Shirt")).click();
       // driver.close();
        
       // List <WebElement>  elementList=driver.findElements(By.partialLinkText("Sauce"));
        //System.out.println("Total Link on web page " + elementList.size());
        
	}

}
