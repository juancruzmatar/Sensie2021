package Academy;


import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.sukgu.Shadow;
import resources.base;

import static org.junit.Assert.assertEquals;

import java.awt.Dimension;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObjects.LoginPage;
import pageObjects.Methods;
import resources.base;
import org.openqa.selenium.JavascriptExecutor;
import resources.base;


public class ShadowTest extends base{
	
	public WebDriver driver;
	JavascriptExecutor js;
	private static Shadow shadow = null; 
    public static Logger log =LogManager.getLogger(base.class.getName());
    
    
  /// Locators//

  	By usuario=By.cssSelector("#username");
  	By password=By.cssSelector("#password");
  	By reset=By.cssSelector("#password-hint > div > amplify-button");
  	By sendbutton=By.cssSelector("button");
  	By Amplify=By.cssSelector("#app > amplify-authenticator");
  	By amply=By.cssSelector("#app > amplify-authenticator");

	@BeforeTest

	  public void initialize() throws Exception {
		  
	  driver =initializeDriver();
			   log.info("Driver is initialized");
				  
			  driver.get(prop.getProperty("url2"));
		  
		System.out.println("QA Test Automation testing Sensie Web is started");
		shadow = new Shadow(driver);
	}
	
	
    
	
	@Test
	void ASensieLogJSInjection() {
		WebElement element = shadow.findElement("#username");
		WebElement password = shadow.findElement("#password");
		WebElement enviar = shadow.findElement("button");


		element.sendKeys("test@parabolt.net");
		password.sendKeys("Sensie123");
		password.sendKeys(Keys.ENTER);

		
		
		System.out.println(element);
		System.out.println(password);
		System.out.println(enviar);


		//Assertions.assertEquals(new String(""), shadow.driver.getPageSource(), "Message");
	}
	

	
	
	@Test
	  public void web() throws Exception {

			driver.get("https://dev.d1wojw5nslzwz.amplifyapp.com/home");
			
			

JavascriptExecutor js = (JavascriptExecutor) driver;  
			String sText =  js.executeScript("return document.title;").toString();
			System.out.println("Domain name=" + sText);

			

String sText2 =  js.executeScript("return document.documentElement.innerText;").toString();
System.out.println("Validate Content Text" +sText2);

//Vertical scroll - down by 500  pixels
js.executeScript("window.scrollBy(0,500)");
// for scrolling till the bottom of the page we can use the code like
//js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		    
		    driver.findElement(By.xpath("//div[@id='app']/div/header/div/div/div[2]/a[2]/div")).click();
		    driver.findElement(By.xpath("//div[@id='app']/div/header/div/div/div[2]/a[3]/div")).click();
		    driver.findElement(By.xpath("//div[@id='app']/div/header/div/div/div[2]/a[4]/div")).click();
		    driver.findElement(By.xpath("//div[@id='app']/div/header/div/div/div[2]/a[5]/div")).click();
		    driver.findElement(By.xpath("//div[@id='abs']/div/div[4]/div[2]/div[3]/div/div/div[2]/div")).click();
		    driver.findElement(By.xpath("//div[@id='abs']/div/div[4]/div[2]/div[3]/div/div/div[2]/div")).click();
		    // ERROR: Caught exception [ERROR: Unsupported command [doubleClick | //div[@id='abs']/div/div[4]/div[2]/div[3]/div/div/div[2]/div | ]]
		    assertEquals("Dr. Eva Selhub", driver.findElement(By.xpath("//div[@id='abs']/div/div[4]/div[2]/div[2]/div/div/div[2]/div")).getText());
		    assertEquals("Dr. Anne Jensen", driver.findElement(By.xpath("//div[@id='abs']/div/div[4]/div[2]/div[3]/div/div/div[2]/div")).getText());
		    assertEquals("Bill Softsky", driver.findElement(By.xpath("//div[@id='abs']/div/div[4]/div[2]/div[4]/div/div/div[2]/div")).getText());
		    assertEquals("Enitan Marcelle", driver.findElement(By.xpath("//div[@id='abs']/div/div[4]/div[2]/div[5]/div/div/div[2]/div")).getText());
			System.out.println("All Scientific board is Validate");

		    driver.findElement(By.xpath("//input[@value='']")).click();
		    driver.findElement(By.xpath("//input[@value='']")).clear();
		    driver.findElement(By.xpath("//input[@value='']")).sendKeys("juan");
		    driver.findElement(By.xpath("(//input[@value=''])[2]")).clear();
		    driver.findElement(By.xpath("(//input[@value=''])[2]")).sendKeys("juancruz.matar@gmail.com");
		    driver.findElement(By.xpath("//div[@id='abs']/div/div[6]/div[3]/div/form/div/div[3]/div/div/textarea")).click();
		    driver.findElement(By.xpath("//div[@id='abs']/div/div[6]/div[3]/div/form/div/div[3]/div/div/textarea")).clear();
		    driver.findElement(By.xpath("//div[@id='abs']/div/div[6]/div[3]/div/form/div/div[3]/div/div/textarea")).sendKeys("daddasdsadsadas");
		    driver.findElement(By.xpath("//div[@id='abs']/div/div[6]/div[3]/div/form/div/div[4]/button/span")).click();
		    driver.findElement(By.xpath("//div[@id='abs']/div/div[6]/div[3]/div/form/div/div[4]/button/span")).click();
		    driver.findElement(By.xpath("(//input[@value=''])[3]")).click();
			System.out.println("The sending WS is not working");

			log.info("version web");

		  }
	
	
}
