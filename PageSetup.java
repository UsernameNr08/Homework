package ProiectFinal;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import Sim0.Constants0;

public class PageSetup 
{
	
static WebDriver driver;
	
	@Before
	public void init() throws InterruptedException 
    {
		
       ChromeOptions option=new ChromeOptions();
       option.addArguments("--remote-allow-origins=*");
       
       option.addArguments("user-data-dir=C:\\Users\\EYE\\AppData\\Local\\Google\\Chrome\\User Data\\Default");
       option.addArguments("--profile-directory=Default");
       
       System.setProperty("webdriver.chrome.driver", Constants0.CHROME_DRIVER_PATH);
       driver = new ChromeDriver(option);
       driver.manage().window().maximize();
       
       driver.navigate().to("https://www.ilovepdf.com/");
	   Thread.sleep(2000);
    }
	@After
	public void exit() throws InterruptedException 
	{ 
       Thread.sleep(3000);
       driver.quit();
       
       
	}
	
}
