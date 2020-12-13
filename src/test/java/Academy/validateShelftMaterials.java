package Academy;

import static org.junit.Assert.assertEquals;

import java.awt.Dimension;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
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
//Adding logs 
//Generating html reports
//Screenshots on failure
//JEnkins integration
public class validateShelftMaterials extends base{
	public WebDriver driver;
	  JavascriptExecutor js;

	
	 public static Logger log =LogManager.getLogger(base.class.getName());
	 
	  /// Locators//
	  
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
		By bench=By.id("Bench");
		By bench2=By.id("Bench-container");
	    By sink=By.className("Sink");
	    By waste=By.className("WasteBin-container");
		By module= By.xpath("//li[@id='module-7745071']/a/span");
		By cancel=By.xpath("/html/body/div[2]/div[3]/div/div/div/section[2]/button[1]");
		By Materiales=By.cssSelector("#material_target_button");
		By Containers=By.cssSelector("#container_target_button");
		By Instruments=By.cssSelector("#instrument_target_button");
		By startlab=By.cssSelector("#savi-hmlabsims-cl15 > div > div.savi-app.modal-false.app-is-expanded-false > div.responsive-wrapper.portrait.small.modal-false.app-is-expanded-false > div.lnl-lab-simulation-container > div.lab-simulation-container-scale > div > div.initial-screen > div > div > button");
		By bench250=By.xpath("/html/body/div[1]/div/div[2]/div[3]/div[3]/div[3]/div[1]/div/div[2]/div[1]/div/div/div[2]/div/div[3]/div/div[5]/div[2]/div[2]/div/div/div/div/div[1]");
		
		
		///Containers
		
		By container250ml=By.cssSelector("#savi-hmlabsims-modal > div:nth-child(3) > div > div > div > section.modal__content.large > div:nth-child(1) > div > button:nth-child(1) > div.lab-interactions-wizard-content-item-image > div");
		By microtube=By.cssSelector("#savi-hmlabsims-modal > div:nth-child(3) > div > div > div > section.modal__content.large > div:nth-child(1) > div > button:nth-child(2) > div.lab-interactions-wizard-content-item-name > div");
		By electrogel=By.cssSelector("#savi-hmlabsims-modal > div:nth-child(3) > div > div > div > section.modal__content.large > div:nth-child(1) > div > button:nth-child(4)");
		By micropipette=By.cssSelector("#savi-hmlabsims-modal > div:nth-child(3) > div > div > div > section.modal__content.large > div:nth-child(1) > div > button:nth-child(3)");
		By pcrmaster=By.cssSelector("#savi-hmlabsims-modal > div:nth-child(3) > div > div > div > section.modal__content.large > div:nth-child(1) > div > button:nth-child(5) > div.lab-interactions-wizard-content-item-name");
	    By canvas=By.cssSelector("head > style:nth-child(27)");
		By premodule=By.xpath("/html/body/div[1]/div/div[2]/div[3]/table/tbody/tr/td[2]/div/table/tbody/tr[3]/td[2]/ul/li[4]/a/span");


		// Containers Bench	  
	    
@BeforeTest

public void initialize() throws IOException
{
	
driver =initializeDriver();
		 log.info("Driver is initialized");
			
		driver.get(prop.getProperty("url2"));
		log.info("Navigated to Home page");
	}


	
	@Test
//Cambie a CL12 para validacion de materiales contenedores e instrumentos.
	public void BL3Validate() throws IOException
	{

		visit("https://www.saplinglearning.com/ibiscms/course/view.php?id=92967");

		type ("savispark", userLocator);
		type ("savispark", passLocator);
		retryingFindClick (submitButtomSaping);
		retryingFindClick (premodule);
		
		
		visit("https://savi-cdn-dev.saplinglearning.com/hmlabsims/cl12/cl12-1.0.1/index.html");

		//Enter Laboratory
		click(enterlab);
		click(opcion1);
		click(opcion2);
		click(opcion3);
		click(skipanimation);
	    driver.findElement(By.xpath("(//button[@type='button'])[7]")).click();
	    System.out.println("**********************BIOLOGY 3*********************************************");  

	    String materiales = driver.findElement(By.xpath("//div[@id='savi-hmlabsims-modal']/div[3]/div/div/div/section")).getText();
	    assertEquals(materiales, driver.findElement(By.xpath("//div[@id='savi-hmlabsims-modal']/div[3]/div/div/div/section")).getText());
	    System.out.println("Lab 3 Materials: " +materiales);
	    System.out.println("*******************************************************************");  



	    driver.findElement(By.xpath("(//button[@type='button'])[18]")).click();
	    driver.findElement(By.xpath("//div[@id='container_target_button']/button/span")).click();
	    String contenedores = driver.findElement(By.xpath("//div[@id='savi-hmlabsims-modal']/div[3]/div/div/div/section")).getText();
	    assertEquals(contenedores, driver.findElement(By.xpath("//div[@id='savi-hmlabsims-modal']/div[3]/div/div/div/section")).getText());
	    System.out.println("Lab 3 Containers: " +contenedores);
	    System.out.println("*******************************************************************");  


	    driver.findElement(By.xpath("//div[@id='savi-hmlabsims-modal']/div[3]/div/div")).click();
	    driver.findElement(By.xpath("(//button[@type='button'])[18]")).click();
	    driver.findElement(By.xpath("//div[@id='instrument_target_button']/button/span")).click();
	    String instrumentos = driver.findElement(By.xpath("//div[@id='savi-hmlabsims-modal']/div[3]/div/div/div/section")).getText();
	    assertEquals(instrumentos, driver.findElement(By.xpath("//div[@id='savi-hmlabsims-modal']/div[3]/div/div/div/section")).getText());
	    System.out.println("Lab 3 Instruments: " +instrumentos);
	    System.out.println("*******************************************************************");  
	    Reporter.log( "Message", true );

	}

	
	
@Test
	
	public void BL2Validate() throws IOException
	{

	visit("https://www.saplinglearning.com/ibiscms/course/view.php?id=92967");

	type ("savispark", userLocator);
	type ("savispark", passLocator);
	retryingFindClick (submitButtomSaping);
	retryingFindClick (premodule);
		visit("https://savi-cdn-dev.saplinglearning.com/hmlabsims/bl2/SAVILNL-562/index.html");

		//Enter Laboratory
		click(enterlab);
		click(opcion1);
		click(opcion2);
		click(opcion3);
		click(skipanimation);
	    driver.findElement(By.xpath("(//button[@type='button'])[7]")).click();
	    System.out.println("**********************BIOLOGY 3*********************************************");  

	    String materiales = driver.findElement(By.xpath("//div[@id='savi-hmlabsims-modal']/div[3]/div/div/div/section")).getText();
	    assertEquals(materiales, driver.findElement(By.xpath("//div[@id='savi-hmlabsims-modal']/div[3]/div/div/div/section")).getText());
	    System.out.println("Lab 2 Materials: " +materiales);
	    System.out.println("*******************************************************************");  



	    driver.findElement(By.xpath("(//button[@type='button'])[18]")).click();
	    driver.findElement(By.xpath("//div[@id='container_target_button']/button/span")).click();
	    String contenedores = driver.findElement(By.xpath("//div[@id='savi-hmlabsims-modal']/div[3]/div/div/div/section")).getText();
	    assertEquals(contenedores, driver.findElement(By.xpath("//div[@id='savi-hmlabsims-modal']/div[3]/div/div/div/section")).getText());
	    System.out.println("Lab 2 Containers: " +contenedores);
	    System.out.println("*******************************************************************");  


	    driver.findElement(By.xpath("//div[@id='savi-hmlabsims-modal']/div[3]/div/div")).click();
	    driver.findElement(By.xpath("(//button[@type='button'])[18]")).click();
	    driver.findElement(By.xpath("//div[@id='instrument_target_button']/button/span")).click();
	    String instrumentos = driver.findElement(By.xpath("//div[@id='savi-hmlabsims-modal']/div[3]/div/div/div/section")).getText();
	    assertEquals(instrumentos, driver.findElement(By.xpath("//div[@id='savi-hmlabsims-modal']/div[3]/div/div/div/section")).getText());
	    System.out.println("Lab 2 Instruments: " +instrumentos);
	    System.out.println("*******************************************************************");  
	    Reporter.log( "Message", true );


	}


	    

@Test

public void BL7Validate() throws IOException
{



	visit("https://savi-cdn-dev.saplinglearning.com/hmlabsims/bl2/SAVILNL-562/index.html");

	//Enter Laboratory
	click(enterlab);
	click(opcion1);
	click(opcion2);
	click(opcion3);
	click(skipanimation);
    driver.findElement(By.xpath("(//button[@type='button'])[7]")).click();
    System.out.println("**********************BIOLOGY 7*********************************************");  

    String materiales = driver.findElement(By.xpath("//div[@id='savi-hmlabsims-modal']/div[3]/div/div/div/section")).getText();
    assertEquals(materiales, driver.findElement(By.xpath("//div[@id='savi-hmlabsims-modal']/div[3]/div/div/div/section")).getText());
    System.out.println("Lab BL7 Materials: " +materiales);
    System.out.println("*******************************************************************");  



    driver.findElement(By.xpath("(//button[@type='button'])[18]")).click();
    driver.findElement(By.xpath("//div[@id='container_target_button']/button/span")).click();
    String contenedores = driver.findElement(By.xpath("//div[@id='savi-hmlabsims-modal']/div[3]/div/div/div/section")).getText();
    assertEquals(contenedores, driver.findElement(By.xpath("//div[@id='savi-hmlabsims-modal']/div[3]/div/div/div/section")).getText());
    System.out.println("Lab BL7 Containers: " +contenedores);
    System.out.println("*******************************************************************");  


    driver.findElement(By.xpath("//div[@id='savi-hmlabsims-modal']/div[3]/div/div")).click();
    driver.findElement(By.xpath("(//button[@type='button'])[18]")).click();
    driver.findElement(By.xpath("//div[@id='instrument_target_button']/button/span")).click();
    String instrumentos = driver.findElement(By.xpath("//div[@id='savi-hmlabsims-modal']/div[3]/div/div/div/section")).getText();
    assertEquals(instrumentos, driver.findElement(By.xpath("//div[@id='savi-hmlabsims-modal']/div[3]/div/div/div/section")).getText());
    System.out.println("Lab BL7 Instruments: " +instrumentos);
    System.out.println("*******************************************************************");  
    Reporter.log( "Message", true );


}
	 
	
	 
	
	
	
	@AfterTest
	public void teardown()
	{
		
		driver.close();
	
		
	}

	
}
