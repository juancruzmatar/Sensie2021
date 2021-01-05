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
import org.testng.Reporter;
import java.util.concurrent.TimeUnit;




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

	  public void initialize() throws IOException {
		  
	  driver =initializeDriver();
			   log.info("Driver is initialized");
				  
			  driver.get(prop.getProperty("url2"));
		  
		System.out.println("QA Test Automation testing Sensie Web is started");
		shadow = new Shadow(driver);
	}
	
	
    
	
	@Test
	void ASensieLogJSInjection() throws IOException {
		WebElement element = shadow.findElement("#username");
		WebElement password = shadow.findElement("#password");
		WebElement enviar = shadow.findElement("button");


		element.sendKeys("test@parabolt.net");
		password.sendKeys("Sensie123");
		password.sendKeys(Keys.ENTER);

		
		
		System.out.println(element);
		System.out.println(password);
		System.out.println(enviar);



	}
	

	
	
	@Test
	  public void web() throws IOException {

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

		  @Test
		  public void ValidateNavigation() throws IOException {
			driver.get("https://dev.d1wojw5nslzwz.amplifyapp.com/home");
			driver.findElement(By.xpath("//div[@id='app']/div/header/div/div/div/div/a/div/img")).click();
			driver.findElement(By.xpath("//div[@id='app']/div/header/div/div/div[2]/a[5]/div")).click();
			assertEquals("Technology of all kinds can help us along the way, but our vision is one in which we advance our ability to adapt, effectively cope with stress and govern our own internal states. The future for well-being is tool-based and supported by helping us see what was previously unseen. Unlimited possibilities await.", driver.findElement(By.xpath("//div[@id='abs']/div/div[2]/div[4]/div[2]/div/div[2]/div/div/p")).getText());
			assertEquals("Recent breakthroughs in the fields of neuroscience and physiology have unlocked the mind/body connection. By applying sensing technology, we aim to empower humanity to take their health into their own hands.", driver.findElement(By.xpath("//div[@id='abs']/div/div[2]/div[4]/div[4]/div/div[2]/div/div/p")).getText());
			driver.findElement(By.xpath("//div[@id='app']/div/header/div/div/div[2]/a[4]/div")).click();
			assertEquals("Sensie is everyone's million dollar coach - available whenever, wherever.", driver.findElement(By.xpath("//div[@id='hm']/div/div[3]/div[2]/p/div")).getText());
			driver.findElement(By.xpath("//div[@id='app']/div/header/div/div/div[2]/a[3]/div")).click();
			driver.get("https://dev.d1wojw5nslzwz.amplifyapp.com/home");
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

			driver.findElement(By.xpath("//input[@value='']")).click();
			driver.findElement(By.xpath("//input[@value='']")).clear();
			driver.findElement(By.xpath("//input[@value='']")).sendKeys("juancruz.matar@gmail.com");
			driver.findElement(By.xpath("//div[@id='app']/div/div[2]/div/div[2]/div[2]/div[2]/button/span")).click();
			driver.findElement(By.xpath("//div[@id='app']/div/header/div/div/div[2]/a[2]/div")).click();
			driver.findElement(By.xpath("//div[@id='app']/div/header/div/div/div[2]/a[2]/div")).click();
			driver.findElement(By.xpath("//div[@id='app']/div/header/div/div/div[2]/a/div")).click();
			driver.findElement(By.xpath("//div[@id='app']/div/header/div/div/div[3]/div/div[2]/button/span")).click();
			
		
		}
		@Test
		public void BreackPoints() throws IOException {
		  driver.get("https://dev.d1wojw5nslzwz.amplifyapp.com/home");
		  pause(2000);

		  JavascriptExecutor js = (JavascriptExecutor) driver;
      // set size with window.resizeTo() method
	  js.executeScript("window.resizeTo(850,630);");
	  pause(2000);

      // set size with window.resizeTo() method
	  js.executeScript("window.resizeTo(450,630);");
	  pause(2000);

		}
	
}

