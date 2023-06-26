package ProiectFinal;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import Sim0.Constants0;



public class TestCases extends PageSetup
{

	@Test
	public void TestProtectPDF() throws InterruptedException, AWTException 
	{
		WebElement ProtectPDF = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div[18]/a"));
		ProtectPDF.click();
		Thread.sleep(2000);

		WebElement chooseFileButton = driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[1]/div[4]/a/span"));
		chooseFileButton.click();
		Thread.sleep(2000);
		
		StringSelection strSelection = new StringSelection("E:\\Petrisor\\Formular_Acordul_AETR_sablon.pdf");
		Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(strSelection, null);
		
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(2000);
				
		WebElement passInput = driver.findElement(By.id("pwd"));
		passInput.click();
		Thread.sleep(2000);
		passInput.sendKeys(Constants.PASS);
		Thread.sleep(2000);
	    WebElement repassInput = driver.findElement(By.id("pwd2")); 
	    repassInput.click();
	    Thread.sleep(2000);
	    repassInput.sendKeys(Constants.REPASS);
	    Thread.sleep(2000);
	    WebElement EnableProtection = driver.findElement(By.id("processTaskTextBtn"));
	    EnableProtection.click();
	    Thread.sleep(6000);
	    
	    driver.navigate().to("https://www.ilovepdf.com/");
		Thread.sleep(2000);
	    WebElement UnlockPDF = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div[17]/a"));
	    UnlockPDF.click();
	    Thread.sleep(2000);
	    
	    WebElement chooseFileButton1 = driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[1]/div[4]/a"));
		chooseFileButton1.click();
		Thread.sleep(2000);
		
		StringSelection strSelection1 = new StringSelection("\"C:\\Users\\EYE\\Downloads\\Formular_Acordul_AETR_sablon_protected.pdf\"");
		Clipboard clipboard1 = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard1.setContents(strSelection1, null);
		
		Robot robot1 = new Robot();
		robot1.keyPress(KeyEvent.VK_CONTROL);
		robot1.keyPress(KeyEvent.VK_V);
		robot1.keyRelease(KeyEvent.VK_V);
		robot1.keyRelease(KeyEvent.VK_CONTROL);
		robot1.keyPress(KeyEvent.VK_ENTER);
		robot1.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(2000);
		
		WebElement UnPDFButton = driver.findElement(By.xpath("/html/body/div[2]/div[1]/button"));
		UnPDFButton.click();
		Thread.sleep(6000);
	    
	}
	
	@Test
	public void EditPDF() throws InterruptedException, AWTException 
	{
	
		WebElement EditPDF = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div[10]/a"));
		EditPDF.click();

		WebElement chooseFileButton = driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[2]/div[6]/a"));
		Thread.sleep(2000);
		chooseFileButton.click();
		Thread.sleep(2000);
		
		StringSelection strSelection = new StringSelection("\"E:\\Chrome Downloads\\Duminica-Meniu Demipensiune (1)_page-0001.pdf\"");
		Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(strSelection, null);
		
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(2000);
		
		WebElement AddTxt = driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[2]/div[1]/div/div[6]/div"));
		AddTxt.click();
		Thread.sleep(2000);
		
		WebElement searchbox = driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[2]/div[7]/div/div[1]/div/div/div/div/div")); 
	    searchbox.sendKeys("This is a test !");
	    
	    WebElement editPDF = driver.findElement(By.xpath("/html/body/div[2]/div[1]/button")); 
	    editPDF.click();
	    Thread.sleep(6000);
	    	    
	    driver.navigate().to("https://www.ilovepdf.com/");
		Thread.sleep(2000);
		
		WebElement EditPDF1 = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div[10]/a"));
		EditPDF1.click();

		WebElement chooseFileButton1 = driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[2]/div[6]/a"));
		Thread.sleep(2000);
		chooseFileButton1.click();
		Thread.sleep(2000);
		
		StringSelection strSelection1 = new StringSelection("\"C:\\Users\\EYE\\Downloads\\Duminica-Meniu Demipensiune (1)_page-0001.pdf\"");
		Clipboard clipboard1 = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard1.setContents(strSelection1, null);
		
		Robot robot1 = new Robot();
		robot1.keyPress(KeyEvent.VK_CONTROL);
		robot1.keyPress(KeyEvent.VK_V);
		robot1.keyRelease(KeyEvent.VK_V);
		robot1.keyRelease(KeyEvent.VK_CONTROL);
		robot1.keyPress(KeyEvent.VK_ENTER);
		robot1.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(2000);
	
		WebElement ZoomIn = driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[2]/div[1]/div/div[4]/div"));
		ZoomIn.click();
		Thread.sleep(2000);
		ZoomIn.click();
		Thread.sleep(2000);
		
	}
	
	@Test
	public void SignPDF() throws InterruptedException, AWTException
	{
	
		WebElement signPDF = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div[13]"));
		signPDF.click();
		
		WebElement chooseFileButton = driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[2]/div[4]/a"));
		Thread.sleep(2000);
		chooseFileButton.click();
		Thread.sleep(2000);
	
		StringSelection strSelection = new StringSelection("\"E:\\Chrome Downloads\\Duminica-Meniu Demipensiune (1)_page-0001.pdf\"");
		Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(strSelection, null);
		
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(2000);
		
		WebElement Opt0 = driver.findElement(By.xpath("/html/body/div[2]/div[4]/div/div/div[2]/div/div[1]/button"));
		Opt0.click();
		Thread.sleep(2000);
		
		WebElement searchbox0 = driver.findElement(By.xpath("/html/body/div[2]/div[5]/div/div/div[3]/div[1]/div[2]/div/div[1]/div/input")); 
	    searchbox0.sendKeys("Test Final ");
	    Thread.sleep(2000);
	    WebElement signStil = driver.findElement(By.xpath("/html/body/div[2]/div[5]/div/div/div[3]/div[2]/div[1]/div/div[1]/ul/li[4]/div")); 
	    signStil.click();
	    Thread.sleep(2000);
	    WebElement initials = driver.findElement(By.xpath("/html/body/div[2]/div[5]/div/div/div[3]/ul/li[2]/a")); 
	    initials.click();
	    Thread.sleep(2000);
	    WebElement initialsStyle = driver.findElement(By.xpath("/html/body/div[2]/div[5]/div/div/div[3]/div[2]/div[2]/div/div[1]/ul/li[3]/div")); 
	    initialsStyle.click();
	    Thread.sleep(2000);
	    WebElement apply = driver.findElement(By.xpath("/html/body/div[2]/div[5]/div/div/div[4]/div/button")); 
	    apply.click();
	    Thread.sleep(2000);
	    
	    Actions action = new Actions(driver);          
		WebElement from = driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[3]/div[2]/div[4]/div[2]/div"));
		action.dragAndDropBy(from, -200, 10).perform();
		Thread.sleep(4000);
		WebElement sign = driver.findElement(By.xpath("/html/body/div[2]/div[1]/button"));
		sign.click();
		Thread.sleep(6000);
		
		driver.navigate().to("https://www.ilovepdf.com/");
		Thread.sleep(2000);
		
		WebElement verifyPDF = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div[10]/a"));
		verifyPDF.click();
		
		WebElement chooseFileButton1 = driver.findElement(By.id("pickfiles"));
		Thread.sleep(2000);
		chooseFileButton1.click();
		Thread.sleep(2000);
	
		StringSelection strSelection1 = new StringSelection("\"C:\\Users\\EYE\\Downloads\\Duminica-Meniu Demipensiune (1)_page-0001_signed.pdf\"");
		Clipboard clipboard1 = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard1.setContents(strSelection1, null);
		
		Robot robot1 = new Robot();
		robot1.keyPress(KeyEvent.VK_CONTROL);
		robot1.keyPress(KeyEvent.VK_V);
		robot1.keyRelease(KeyEvent.VK_V);
		robot1.keyRelease(KeyEvent.VK_CONTROL);
		robot1.keyPress(KeyEvent.VK_ENTER);
		robot1.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(2000);
			    	    
	}
	
}
