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


import java.lang.Object;

public class AllMethods {
	
	private WebDriver driver;
	WebDriverWait wait;

    Actions action;

    By userLocator = By.id("username");
	By passLocator = By.name("password");
	By signInBtnLocator = By.id("submitButton");
	By homePageLocator = By.xpath("//*[@id=\"logo\"]");
	By submitButtomSaping = By.id("submitButton");
	By enterlab = By.xpath("//button[@type='button']");
	By opcion1= By.id("ppe_option_0");
	By opcion2=By.id("ppe_option_1");
	By opcion3=By.id("ppe_option_2");
	By skipanimation=By.xpath("/html/body/div[1]/div/div[2]/div[3]/div[3]/div[3]/div/div[1]/div/div/div/div/div[5]/button[1]");
	By modulolink= By.xpath("//div[@id='container_target_button']/button/span");
	By bench=By.name("Bench");
	By module= By.xpath("//li[@id='module-7745071']/a/span");
	By Materiales=By.cssSelector("#material_target_button");
	By Containers=By.cssSelector("#container_target_button");
	By Instruments=By.cssSelector("#instrument_target_button");
	By startlab=By.cssSelector("#savi-hmlabsims-cl15 > div > div.savi-app.modal-false.app-is-expanded-false > div.responsive-wrapper.portrait.small.modal-false.app-is-expanded-false > div.lnl-lab-simulation-container > div.lab-simulation-container-scale > div > div.initial-screen > div > div > button");
	By bench250=By.xpath("/html/body/div[1]/div/div[2]/div[3]/div[3]/div[3]/div[1]/div/div[2]/div[1]/div/div/div[2]/div/div[3]/div/div[5]/div[2]/div[2]/div/div/div/div/div[1]");
	
	
	///Containers
	
	By microscopeslide=By.xpath("/html/body/div[2]/div[3]/div/div/div/section[1]/div[1]/div/button[1]");
	By micropipette=By.xpath("/html/body/div[2]/div[3]/div/div/div/section[1]/div[1]/div/button[3]");
	By beaker250ml=By.xpath("/html/body/div[2]/div[3]/div/div/div/section[1]/div[1]/div/button[2]");
	By nichromewirerod=By.xpath("/html/body/div[2]/div[3]/div/div/div/section[1]/div[1]/div/button[4]");
	By dropper=By.xpath("/html/body/div[2]/div[3]/div/div/div/section[1]/div[1]/div/button[5]");
	By aureus=By.xpath("/html/body/div[2]/div[3]/div/div/div/section[1]/div[1]/div/button[7]");
	By mrsa=By.xpath("/html/body/div[2]/div[3]/div/div/div/section[1]/div[1]/div/button[8]");
	By mphlei=By.xpath("/html/body/div[2]/div[3]/div/div/div/section[1]/div[1]/div/button[9]");
	By kpneumoniae=By.xpath("/html/body/div[2]/div[3]/div/div/div/section[1]/div[1]/div/button[10]");
	By spneumoniae=By.xpath("/html/body/div[2]/div[3]/div/div/div/section[1]/div[1]/div/button[11]");

	//Instruments
	
	By bunsenburner=By.xpath("/html/body/div[2]/div[3]/div/div/div/section[1]/div[1]/div/button[1]");
	By incubator=By.xpath("/html/body/div[2]/div[3]/div/div/div/section[1]/div[1]/div/button[2]");
	By antibioticdispenser=By.xpath("/html/body/div[2]/div[3]/div/div/div/section[1]/div[1]/div/button[3]");
	By projectionmagnifier=By.xpath("/html/body/div[2]/div[3]/div/div/div/section[1]/div[1]/div/button[4]");
	By stainingpan=By.xpath("/html/body/div[2]/div[3]/div/div/div/section[1]/div[1]/div/button[5]");
	By shapedspreader=By.xpath("/html/body/div[2]/div[3]/div/div/div/section[1]/div[1]/div/button[6]");
	By microscope=By.xpath("/html/body/div[2]/div[3]/div/div/div/section[1]/div[1]/div/button[7]");

	//Materials
	By water =By.xpath("/html/body/div[2]/div[3]/div/div/div/section[1]/div[1]/div/button[1]");
	By cristalviolet=By.xpath("/html/body/div[2]/div[3]/div/div/div/section[1]/div[1]/div/button[2]");
	By gramsiodine=By.xpath("/html/body/div[2]/div[3]/div/div/div/section[1]/div[1]/div/button[3]");
	By ethanol95=By.xpath("/html/body/div[2]/div[3]/div/div/div/section[1]/div[1]/div/button[4]");
	By safranin=By.xpath("/html/body/div[2]/div[3]/div/div/div/section[1]/div[1]/div/button[5]");
	By isopropanol70=By.xpath("/html/body/div[2]/div[3]/div/div/div/section[1]/div[1]/div/button[6]");
	By penicillin=By.xpath("/html/body/div[2]/div[3]/div/div/div/section[1]/div[1]/div/button[7]");
	By neomycin=By.xpath("/html/body/div[2]/div[3]/div/div/div/section[1]/div[1]/div/button[8]");
	By ampicillin=By.xpath("/html/body/div[2]/div[3]/div/div/div/section[1]/div[1]/div/button[9]");
	By erythromycin=By.xpath("/html/body/div[2]/div[3]/div/div/div/section[1]/div[1]/div/button[10]");
	By gentamicim=By.xpath("/html/body/div[2]/div[3]/div/div/div/section[1]/div[1]/div/button[11]");
	By sulfamethoxazole=By.xpath("/html/body/div[2]/div[3]/div/div/div/section[1]/div[1]/div/button[12]");
	By tetracycline=By.xpath("/html/body/div[2]/div[3]/div/div/div/section[1]/div[1]/div/button[13]");
	By kinyouncarbolfuchsin=By.xpath("/html/body/div[2]/div[3]/div/div/div/section[1]/div[1]/div/button[14]");
	By acidalcohol=By.xpath("/html/body/div[2]/div[3]/div/div/div/section[1]/div[1]/div/button[15]");
	By brilliantgreen=By.xpath("/html/body/div[2]/div[3]/div/div/div/section[1]/div[1]/div/button[16]");
	By congored=By.xpath("/html/body/div[2]/div[3]/div/div/div/section[1]/div[1]/div/button[17]");
	By manevalssolution=By.xpath("/html/body/div[2]/div[3]/div/div/div/section[1]/div[1]/div/button[18]");
	By sheepserum=By.xpath("/html/body/div[2]/div[3]/div/div/div/section[1]/div[1]/div/button[19]");


	
	
	
	
	
	//Others
	By tubebench=By.xpath("/html/body/div[1]/div/div[2]/div[3]/div[3]/div[3]/div[1]/div/div[2]/div[1]/div/div/div[2]/div/div[3]/div/div[8]/div[2]");
	By erlenmegerbench=By.xpath("/html/body/div[1]/div/div[2]/div[3]/div[3]/div[3]/div[1]/div/div[2]/div[1]/div/div/div[2]/div/div[3]/div/div[2]/div[2]/div[2]/div/div/div/div/div[1]");
	By Phbench=By.xpath("/html/body/div[1]/div/div[2]/div[3]/div[3]/div[3]/div[1]/div/div[2]/div[1]/div/div/div[2]/div/div[3]/div/div[8]/div[2]/div[2]");
	By premodule=By.cssSelector("#div_acc_demos > li > ul > li.collapsable.lastCollapsable > ul > li.last > div > div.info > div > a > h4");

	//Modal options
	By modal1=By.xpath("/html/body/div[2]/div[3]/div/div/div/section[1]/div[1]/div[2]/div[1]/label/input");
	By modal2=By.xpath("/html/body/div[2]/div[3]/div/div/div/section[1]/div[1]/div[2]/div[2]/label/input");
	By modal3=By.xpath("/html/body/div[2]/div[3]/div/div/div/section[1]/div[1]/div[2]/div[3]/label/input");
	By modal4=By.xpath("/html/body/div[2]/div[3]/div/div/div/section[1]/div[1]/div[2]/div[4]/label/input");
	By modal5=By.xpath("/html/body/div[2]/div[3]/div/div/div/section[1]/div[1]/div[2]/div[5]/label/input");
	By modal6=By.xpath("/html/body/div[2]/div[3]/div/div/div/section[1]/div[1]/div[2]/div[6]/label/input");
	By nutrietagar=By.xpath("/html/body/div[2]/div[3]/div/div/div/section[1]/div[1]/div/button[12]");
	// Containers Bench
	
		By add=By.cssSelector("#savi-hmlabsims-modal > div:nth-child(3) > div > div > div > section.modal__buttons-container.large > button.button.primary.large");
		By tirarbench= By.cssSelector("#savi-hmlabsims-modal > div:nth-child(3) > div > div > div > section.modal__content.large > div:nth-child(1) > div.lab-interactions-wizard-content-targets-list > div > label > input");
		By enteramount=By.cssSelector("#savi-hmlabsims-modal > div:nth-child(3) > div > div > div > section.modal__content.large > div:nth-child(1) > input");
		By buttonamount=By.cssSelector("#savi-hmlabsims-modal > div:nth-child(3) > div > div > div > section.modal__buttons-container.large > button.button.primary.large");
		By sink=By.className("Sink");
		By waste=By.className("WasteBin-container");

		
	
	//Bench Containers
	By erlenmeyerflask=By.xpath("/html/body/div[1]/div/div[2]/div[3]/div[3]/div[3]/div[1]/div/div[2]/div[1]/div/div/div[2]/div/div[3]/div/div[5]/div[2]/div[2]/div/div/div/div/div[1]");
	By benchbeaker=By.xpath("/html/body/div[1]/div/div[2]/div[3]/div[3]/div[3]/div[1]/div/div[2]/div[1]/div/div/div[2]/div/div[3]/div/div[2]/div[2]/div[2]/div/div/div/div[1]");
	By benchsmalltesttube=By.xpath("/html/body/div[1]/div/div[2]/div[3]/div[3]/div[3]/div[1]/div/div[2]/div[1]/div/div/div[2]/div/div[3]/div/div[4]/div[2]/div[2]/div/div/div/div/div[1]");
	By benchcuvette=By.xpath("/html/body/div[1]/div/div[2]/div[3]/div[3]/div[3]/div[1]/div/div[2]/div[1]/div/div/div[2]/div/div[3]/div/div[14]/div[2]/div[2]/div/div[1]");

	By benchmicropipette=By.xpath("/html/body/div[1]/div/div[2]/div[3]/div[3]/div[3]/div[1]/div/div[2]/div[1]/div/div/div[2]/div/div[3]/div/div[4]/div[2]/div[2]/div/div[1]");
	By benchdropper=By.xpath("/html/body/div[1]/div/div[2]/div[3]/div[3]/div[3]/div[1]/div/div[2]/div[1]/div/div/div[2]/div/div[3]/div/div[6]/div[2]/div[2]/div/div[1]");
	By benchecoli=By.xpath("/html/body/div[1]/div/div[2]/div[3]/div[3]/div[3]/div[1]/div/div[2]/div[1]/div/div/div[2]/div/div[3]/div/div[7]/div[2]/div[2]/div/div[1]");
	By benchaureus=By.xpath("/html/body/div[1]/div/div[2]/div[3]/div[3]/div[3]/div[1]/div/div[2]/div[1]/div/div/div[2]/div/div[3]/div/div[8]/div[2]/div[2]/div/div[1]");
	By benchmrsa=By.xpath("/html/body/div[1]/div/div[2]/div[3]/div[3]/div[3]/div[1]/div/div[2]/div[1]/div/div/div[2]/div/div[3]/div/div[9]/div[2]/div[2]/div/div[1]");
	By benchmphlei=By.xpath("/html/body/div[1]/div/div[2]/div[3]/div[3]/div[3]/div[1]/div/div[2]/div[1]/div/div/div[2]/div/div[3]/div/div[10]/div[2]/div[2]/div/div[1]");
	By droperbench=By.xpath("/html/body/div[1]/div/div[2]/div[3]/div[3]/div[3]/div[1]/div/div[2]/div[1]/div/div/div[2]/div/div[3]/div/div[7]/div[2]/div[2]/div/div[1]");

	//Bench Instruments
	By benchelectrophotometer=By.xpath("/html/body/div[1]/div/div[2]/div[3]/div[3]/div[3]/div[1]/div/div[2]/div[1]/div/div/div[2]/div/div[3]/div/div[8]/div[2]/div[2]/div[1]");
	By benchtemperaturabathe=By.xpath("/html/body/div[1]/div/div[2]/div[3]/div[3]/div[3]/div[1]/div/div[2]/div[1]/div/div/div[2]/div/div[3]/div/div[2]/div[2]/div[2]/div[1]");
	By benchthermometer=By.xpath("/html/body/div[1]/div/div[2]/div[3]/div[3]/div[3]/div[1]/div/div[2]/div[1]/div/div/div[2]/div/div[3]/div/div[6]/div[2]/div[2]");
	By benchphmeter=By.xpath("/html/body/div[1]/div/div[2]/div[3]/div[3]/div[3]/div[1]/div/div[2]/div[1]/div/div/div[2]/div/div[3]/div/div[3]/div[2]/div[2]");
	By benchgassiringe=By.xpath("/html/body/div[1]/div/div[2]/div[3]/div[3]/div[3]/div[1]/div/div[2]/div[1]/div/div/div[2]/div/div[3]/div/div[7]/div[2]/div[2]");
	By benchplantlightbox=By.xpath("/html/body/div[1]/div/div[2]/div[3]/div[3]/div[3]/div[1]/div/div[2]/div[1]/div/div/div[2]/div/div[3]/div/div[2]/div[2]/div[2]/div/div[1]");

	By burner1=By.className("Burner-knob");
	By burner2=By.className("Burner-knob orange");
	By burner3=By.className("Burner-knob blue");
	By burner4=By.className("Burner-knob purple");

By nicrobench=By.xpath("/html/body/div[1]/div/div[2]/div[3]/div[3]/div[3]/div[1]/div/div[2]/div[1]/div/div/div[2]/div/div[3]/div/div[6]/div[2]/div[2]");
By burnerbench=By.xpath("/html/body/div[1]/div/div[2]/div[3]/div[3]/div[3]/div[1]/div/div[2]/div[1]/div/div[1]/div[2]/div/div[3]/div/div[5]/div[2]/div[2]");
By auresbench=By.xpath("/html/body/div[1]/div/div[2]/div[3]/div[3]/div[3]/div[1]/div/div[2]/div[1]/div/div/div[2]/div/div[3]/div/div[5]/div[2]/div[2]/div/div[1]");

	By smalltubebench1=By.xpath("/html/body/div[1]/div/div[2]/div[3]/div[3]/div[3]/div[1]/div/div[2]/div[1]/div/div/div[2]/div/div[3]/div/div[6]/div[2]/div[2]/div/div/div/div/div[1]");
	By smalltubebench2=By.xpath("/html/body/div[1]/div/div[2]/div[3]/div[3]/div[3]/div[1]/div/div[2]/div[1]/div/div/div[2]/div/div[3]/div/div[2]/div[2]/div[2]/div/div/div/div/div[1]");
	By smalltubebench3=By.xpath("/html/body/div[1]/div/div[2]/div[3]/div[3]/div[3]/div[1]/div/div[2]/div[1]/div/div/div[2]/div/div[3]/div/div[3]/div[2]/div[2]/div/div/div/div/div[1]");
	By benchphmeter2=By.xpath("/html/body/div[1]/div/div[2]/div[3]/div[3]/div[3]/div[1]/div/div[2]/div[1]/div/div/div[2]/div/div[3]/div/div[7]/div[2]/div[2]");

 By beakerbench=By.xpath("/html/body/div[1]/div/div[2]/div[3]/div[3]/div[3]/div[1]/div/div[2]/div[1]/div/div/div[2]/div/div[3]/div/div[3]/div[2]/div[2]/div/div/div/div[1]");

 
 //////Full Break
 By beaker=By.xpath(" /html/body/div[1]/div/div[2]/div[3]/div[3]/div[3]/div[1]/div/div[2]/div[1]/div/div/div[1]/div[7]/div/div[1]/div[6]/div[2]/div[2]/div/div/div/div");
 
	//WebDriver Driver
	public AllMethods(WebDriver driver) {
		this.driver = driver;
	}
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
		//Explorer Conection
		  public WebDriver InternetExplorerDriverConnection() {
			System.setProperty("webdriver.ie.driver", "./src/test/resources/iedriver/IEDriverServer.exe");
			driver = new InternetExplorerDriver();
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
	  


