package pageObjects;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.StaleElementReferenceException;

import java.io.IOException;
import java.lang.Object;

public class Methods {
	
	public WebDriver driver;
	WebDriverWait wait;
	//WebDriver Driver
		
    Actions action;
    
    //BL3
    By userLocator = By.id("username");
	By passLocator = By.name("password");
	By signInBtnLocator = By.id("submitButton");
	By homePageLocator = By.xpath("//*[@id=\"logo\"]");
	By submitButtomSaping = By.id("submitButton");
	By enterlab = By.xpath("//button[@type='button']");
	By opcion1= By.id("ppe_option_0");
	By opcion2=By.id("ppe_option_1");
	By opcion3=By.id("ppe_option_2");

//WebElement element = findElement(bench250);
//Actions builder = new Actions(driver);
// builder.moveToElement(element).release().perform();

public Methods(WebDriver driver) {
	// TODO Auto-generated constructor stub
	
	this.driver=driver;
	
}


public boolean isHomePageDisplayed() {
	return isDisplayed(homePageLocator);
}

//@After
//public void tearDown() throws Exception {
//  driver.quit();


	
	//ChromeDriver Conection
  public WebDriver chrome() {
	System.setProperty("webdriver.chrome.driver", "./src/test/resources/chromedriver/chromedriver.exe");
	driver = new ChromeDriver();
	return driver;
  }
	
	
	//Firefox Conection
	  public WebDriver firefox() {
		System.setProperty("webdriver.gecko.driver", "./src/test/resources/geckodriver/geckodriver.exe");
		driver = new FirefoxDriver();
		return driver;
		
	  }
		
		  
		  
		  
			 public WebDriver back() {
					driver.navigate().back();
					return driver;
}
			 
			 public WebDriver forward() {
					driver.navigate().forward();
					return driver;
}
  //FindElementLocator
  public WebElement findElement(By locator) {
	  return driver.findElement(locator);
  } 
  
//FindElementLocator
  public WebElement Assert(By locator) {
	  return driver.findElement(locator);
  } 
  
  public void verify(By locator){
  WebElement element = driver.findElement(locator);
  String strng = element.getText();
  System.out.println(strng);
  }
  
  public WebElement Assertions(By locator) {
  WebElement element2 = driver.findElement(locator);
  element2.getText();
  System.out.println("Printing "+element2);
  return element2;
  }
 /////////////
  public WebElement Waitfor(By by) {
	    WebElement result = null;
	    long maxTime = 5 * 1000; // time in milliseconds
	    long timeSlice = 250;
	    long elapsedTime = 0;

	    do {
	        try{
	            Thread.sleep(timeSlice);
	            elapsedTime += timeSlice;
	            result = driver.findElement(by);
	        } catch(Exception e) {
	        }
	    } while(result == null && elapsedTime < maxTime);

	    return result;
	}
	  
  //Element List 
	  public List <WebElement> findElements (By locator){
		  return driver.findElements(locator);
	  }
	  
	  //Force the action of Click Method
	  
	  public boolean retryingFindClick(By by) {
		    boolean result = false;
		    int attempts = 0;
		    while(attempts < 2) {
		        try {
		            driver.findElement(by).click();
		            result = true;
		            break;
		        } catch(StaleElementReferenceException e) {
		        }
		        attempts++;
		    }
		    return result;
		}
	  //Force the action of Drop Method

	  
	  public boolean Dropforce(By by) {
		    boolean result = false;
		    int attempts = 0;
		    while(attempts < 2) {
		        try {
		        	WebElement element = driver.findElement(by);
			        Actions builder = new Actions(driver);
			        builder.moveToElement(element).release().perform();		            result = true;
		            break;
		        } catch(StaleElementReferenceException e) {
		        }
		        attempts++;
		    }  return result;
		}
	  
	  //Force the action of Drag Method
	  
	  public boolean Dragforce(By by) {
		    boolean result = false;
		    int attempts = 0;
		    while(attempts < 2) {
		        try {
		        	WebElement element = driver.findElement(by);
		        	Actions builder = new Actions(driver);
			        builder.moveToElement(element).clickAndHold().perform();            result = true;
		            break;
		        } catch(StaleElementReferenceException e) {
		        }
		        attempts++;
		    }  return result;
		}
//Force the action of MovetoElement Method
	  
	  public boolean Moveforce(By by) {
		    boolean result = false;
		    int attempts = 0;
		    while(attempts < 2) {
		        try {
		        	WebElement element = driver.findElement(by);
		        	Actions builder = new Actions(driver);
			        builder.moveToElement(element).perform();
			        result = true;
		            break;
		        } catch(StaleElementReferenceException e) {
		        }
		        attempts++;
		    }  return result;
		}
	  
	  //Get Text method
	  public String getText(WebElement element) {
	  return element.getText();
	  }
	  //Get Text method

	  public String getText(By locator) {

		  return driver.findElement(locator).getText();
	  }
	  //Input Text Action Method
	  public void type(String inputText, By locator) {
		  driver.findElement(locator).sendKeys(inputText);
	  }
	  
	  //Wait for Element Present Method
	  public void wait(By locator) {
	        WebDriverWait wait = new WebDriverWait(driver,30);        
	        wait.until(ExpectedConditions.visibilityOf((WebElement) locator));
	    }
	  //Simple Click Method
	  public void click(By locator) {
		  driver.findElement(locator).click();
	  }
	  
	  public void swichtoframe(By locator) {
		  driver.switchTo().frame(driver.findElement(locator));

	  
	  
	  }
	  
	  //Simple Drag Method
	  public void Drag(By locator) {
		  WebElement element =driver.findElement(locator);
	        Actions builder = new Actions(driver);
	        builder.moveToElement(element).clickAndHold().perform();
	  	  	      
	  }
	  
	  
	  //Simple move Method
	  public void Move(By locator) {
		  WebElement element = driver.findElement(locator);
	        Actions builder = new Actions(driver);
	        builder.moveToElement(element).perform();
	  }
	  
	  //Simple Drop Method
	  public void Drop(By locator) {
		  WebElement element = driver.findElement(locator);
	        Actions builder = new Actions(driver);
	        builder.moveToElement(element).release().perform();
	  }
	  
	  
	  
	  /////////////////////////////////////////
		  
	  //Simple move Method
	  public void DragAndD(By locator) {
		  Actions act=new Actions(driver);
		  WebElement drag=driver.findElement(locator);
		  WebElement drop=driver.findElement(locator);
	      Actions builder = new Actions(driver);
	      builder.moveToElement(drop).perform();
		  act.dragAndDrop(drag, drop).build().perform();

	  }
	  
	
	  ////////////////////////////////////////
	  
	  public void DoubleClick(By locator) {

	  WebElement element = driver.findElement(locator);
	  Actions actions = new Actions(driver);
	  actions.doubleClick(element).perform();
	  }
	  
	  
	  //Is Diplayed Method
	  public Boolean isDisplayed(By locator) {
	  try {
		  return driver.findElement(locator).isDisplayed();
	  } catch (org.openqa.selenium.NoSuchElementException e) {
		  return false;
	  }
	  
	  }
	  ////
public void bench (By locator) {
	  WebElement element = driver.findElement(locator); // Let the element id be abcd
	  JavascriptExecutor executor = (JavascriptExecutor)driver;
	  executor.executeScript("arguments[0].click();", element);
		  
	  
	  
	  //Visit URL Method
	  }
	  public void visit(String url) {
		  driver.get(url);
		  
		  
		  }}
	  


