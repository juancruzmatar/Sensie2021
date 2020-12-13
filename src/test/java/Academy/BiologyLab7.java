package Academy;

import org.testng.Assert;
import org.testng.annotations.*;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObjects.LoginPage;
import pageObjects.Methods;
import resources.base;

public class BiologyLab7 extends base{
	public WebDriver driver;
	  JavascriptExecutor js;
	    Actions action;

	 public static Logger log =LogManager.getLogger(base.class.getName());
	 
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
		
		By Containertext=By.className("first-content-container");
		///Containers
		
		By container250ml=By.cssSelector("#savi-hmlabsims-modal > div:nth-child(3) > div > div > div > section.modal__content.large > div:nth-child(1) > div > button:nth-child(1) > div.lab-interactions-wizard-content-item-image > div");
		By microtube=By.cssSelector("#savi-hmlabsims-modal > div:nth-child(3) > div > div > div > section.modal__content.large > div:nth-child(1) > div > button:nth-child(2) > div.lab-interactions-wizard-content-item-name > div");
		By electrogel=By.cssSelector("#savi-hmlabsims-modal > div:nth-child(3) > div > div > div > section.modal__content.large > div:nth-child(1) > div > button:nth-child(4)");
		By micropipette=By.cssSelector("#savi-hmlabsims-modal > div:nth-child(3) > div > div > div > section.modal__content.large > div:nth-child(1) > div > button:nth-child(3)");
		By pcrmaster=By.cssSelector("#savi-hmlabsims-modal > div:nth-child(3) > div > div > div > section.modal__content.large > div:nth-child(1) > div > button:nth-child(5) > div.lab-interactions-wizard-content-item-name");
		By premodule=By.xpath("/html/body/div[1]/div/div[2]/div[3]/table/tbody/tr/td[2]/div/table/tbody/tr[3]/td[2]/ul/li[4]/a/span");
		By erlenmeyerflask250=By.xpath("/html/body/div[2]/div[3]/div/div/div/section[1]/div[1]/div/button[1]");
		By beaker250=By.xpath("/html/body/div[2]/div[3]/div/div/div/section[1]/div[1]/div/button[2]");
		By smalltesttube=By.xpath("/html/body/div[2]/div[3]/div/div/div/section[1]/div[1]/div/button[3]");
		By cuvette=By.xpath("/html/body/div[2]/div[3]/div/div/div/section[1]/div[1]/div/button[4]");
	    By cuvette2=By.cssSelector("#savi-hmlabsims-modal > div:nth-child(3) > div > div > div > section.modal__content.large > div:nth-child(1) > div > button:nth-child(4) > div.lab-interactions-wizard-content-item-name > div");
	    By cuvette3=By.xpath("/html/body/div[2]/div[3]/div/div/div/section[1]/div[1]/div/button[4]");
	    By cuvette5=By.xpath("/html/body/div[2]/div[3]/div/div/div/section[1]/div[1]/div/button[4]/div[2]");

	    
		//Instruments
		By electrophotometer=By.cssSelector("#savi-hmlabsims-modal > div:nth-child(3) > div > div > div > section.modal__content.large > div:nth-child(1) > div > button.lab-interactions-wizard-content-item.selected");
		By constanttemperaturabathe=By.xpath("/html/body/div[2]/div[3]/div/div/div/section[1]/div[1]/div/button[2]");
		By Thermometer=By.xpath("/html/body/div[2]/div[3]/div/div/div/section[1]/div[1]/div/button[3]");
		By Phmeter=By.cssSelector("#savi-hmlabsims-modal > div:nth-child(3) > div > div > div > section.modal__content.large > div:nth-child(1) > div > button:nth-child(4)");
		By Gassiringe=By.xpath("/html/body/div[2]/div[3]/div/div/div/section[1]/div[1]/div/button[5]");
		By Plantlightbox=By.xpath("/html/body/div[2]/div[3]/div/div/div/section[1]/div[1]/div/button[6]");
		By Phmeter2=By.xpath("/html/body/div[2]/div[3]/div/div/div/section[1]/div[1]/div/button[4]/div[1]/div");
	    By especto=By.xpath("/html/body/div[2]/div[3]/div/div/div/section[1]/div[1]/div/button[1]");
		
		// Containers Bench
		
		By add=By.cssSelector("#savi-hmlabsims-modal > div:nth-child(3) > div > div > div > section.modal__buttons-container.large > button.button.primary.large");
		By tirarbench= By.cssSelector("#savi-hmlabsims-modal > div:nth-child(3) > div > div > div > section.modal__content.large > div:nth-child(1) > div.lab-interactions-wizard-content-targets-list > div > label > input");
		By enteramount=By.cssSelector("#savi-hmlabsims-modal > div:nth-child(3) > div > div > div > section.modal__content.large > div:nth-child(1) > input");
		
		//Materials
		
		By water=By.cssSelector("#savi-hmlabsims-modal > div:nth-child(3) > div > div > div > section.modal__content.large > div:nth-child(1) > div > button:nth-child(1) > div.lab-interactions-wizard-content-item-image > div");
		By cantidad=By.cssSelector("#savi-hmlabsims-modal > div:nth-child(3) > div > div > div > section.modal__buttons-container.large > button.button.primary.large");
		By containerbench1=By.cssSelector("#savi-hmlabsims-modal > div:nth-child(3) > div > div > div > section.modal__content.large > div:nth-child(1) > div.lab-interactions-wizard-content-targets-list > div:nth-child(1) > label > input");
		By containerbench2=By.cssSelector("#savi-hmlabsims-modal > div:nth-child(3) > div > div > div > section.modal__content.large > div:nth-child(1) > div.lab-interactions-wizard-content-targets-list > div:nth-child(2) > label > input");
		By containerbench3=By.cssSelector("#savi-hmlabsims-modal > div:nth-child(3) > div > div > div > section.modal__content.large > div:nth-child(1) > div.lab-interactions-wizard-content-targets-list > div:nth-child(3) > label > input");
		By containerbench4=By.cssSelector("#savi-hmlabsims-modal > div:nth-child(3) > div > div > div > section.modal__content.large > div:nth-child(1) > div.lab-interactions-wizard-content-targets-list > div:nth-child(4) > label > input");
		By containerbench5=By.cssSelector("#savi-hmlabsims-modal > div:nth-child(3) > div > div > div > section.modal__content.large > div:nth-child(1) > div.lab-interactions-wizard-content-targets-list > div:nth-child(5) > label > input");
		By containerbench6=By.cssSelector("#savi-hmlabsims-modal > div:nth-child(3) > div > div > div > section.modal__content.large > div:nth-child(1) > div.lab-interactions-wizard-content-targets-list > div:nth-child(6) > label > input");
		By containerbench7=By.cssSelector("#savi-hmlabsims-modal > div:nth-child(3) > div > div > div > section.modal__content.large > div:nth-child(1) > div.lab-interactions-wizard-content-targets-list > div:nth-child(7) > label > input");
		By containerbench8=By.cssSelector("#savi-hmlabsims-modal > div:nth-child(3) > div > div > div > section.modal__content.large > div:nth-child(1) > div.lab-interactions-wizard-content-targets-list > div:nth-child(8) > label > input");
		
		
		
		
		By buttonamount=By.cssSelector("#savi-hmlabsims-modal > div:nth-child(3) > div > div > div > section.modal__buttons-container.large > button.button.primary.large");
		By Lugolsiodine=By.xpath("/html/body/div[2]/div[3]/div/div/div/section[1]/div[1]/div/button[3]");
		By starchsolution2=By.xpath("/html/body/div[2]/div[3]/div/div/div/section[1]/div[1]/div/button[2]");
		By Mhydrochloric6acid=By.cssSelector("#savi-hmlabsims-modal > div:nth-child(3) > div > div > div > section.modal__content.large > div:nth-child(1) > div > button.lab-interactions-wizard-content-item.selected");
		By aceticacid=By.xpath("/html/body/div[2]/div[3]/div/div/div/section[1]/div[1]/div/button[5]");
		By dihydrogenphosphate=By.xpath("/html/body/div[2]/div[3]/div/div/div/section[1]/div[1]/div/button[6]");
		By hydrogenphosphate=By.xpath("/html/body/div[2]/div[3]/div/div/div/section[1]/div[1]/div/button[7]");
		By sodiumbicarbonate=By.xpath("/html/body/div[2]/div[3]/div/div/div/section[1]/div[1]/div/button[8]");
		By Amylasesolution=By.xpath("/html/body/div[2]/div[3]/div/div/div/section[1]/div[1]/div/button[9]");
		By elodea=By.xpath("/html/body/div[2]/div[3]/div/div/div/section[1]/div[1]/div/button[10]");

		//Others
		By tubebench=By.xpath("/html/body/div[1]/div/div[2]/div[3]/div[3]/div[3]/div[1]/div/div[2]/div[1]/div/div/div[2]/div/div[3]/div/div[8]/div[2]");
		By erlenmegerbench=By.xpath("/html/body/div[1]/div/div[2]/div[3]/div[3]/div[3]/div[1]/div/div[2]/div[1]/div/div/div[2]/div/div[3]/div/div[2]/div[2]/div[2]/div/div/div/div/div[1]");
		By Phbench=By.xpath("/html/body/div[1]/div/div[2]/div[3]/div[3]/div[3]/div[1]/div/div[2]/div[1]/div/div/div[2]/div/div[3]/div/div[8]/div[2]/div[2]");
		//Modal options
		By modal1=By.xpath("/html/body/div[2]/div[3]/div/div/div/section[1]/div[1]/div[2]/div[1]/label/input");
		By modal2=By.xpath("/html/body/div[2]/div[3]/div/div/div/section[1]/div[1]/div[2]/div[2]/label/input");
		By modal3=By.xpath("/html/body/div[2]/div[3]/div/div/div/section[1]/div[1]/div[2]/div[3]/label/input");
		By modal4=By.xpath("/html/body/div[2]/div[3]/div/div/div/section[1]/div[1]/div[2]/div[4]/label/input");
		By modal5=By.xpath("/html/body/div[2]/div[3]/div/div/div/section[1]/div[1]/div[2]/div[5]/label/input");
		By modal6=By.xpath("/html/body/div[2]/div[3]/div/div/div/section[1]/div[1]/div[2]/div[6]/label/input");

		
		//Bench Containers
		By erlenmeyerflask=By.xpath("/html/body/div[1]/div/div[2]/div[3]/div[3]/div[3]/div[1]/div/div[2]/div[1]/div/div/div[2]/div/div[3]/div/div[5]/div[2]/div[2]/div/div/div/div/div[1]");
		By benchbeaker=By.xpath("/html/body/div[1]/div/div[2]/div[3]/div[3]/div[3]/div[1]/div/div[2]/div[1]/div/div/div[2]/div/div[3]/div/div[2]/div[2]/div[2]/div/div/div/div[1]");
		By benchsmalltesttube=By.xpath("/html/body/div[1]/div/div[2]/div[3]/div[3]/div[3]/div[1]/div/div[2]/div[1]/div/div/div[2]/div/div[3]/div/div[4]/div[2]/div[2]/div/div/div/div/div[1]");
		By benchcuvette=By.xpath("/html/body/div[1]/div/div[2]/div[3]/div[3]/div[3]/div[1]/div/div[2]/div[1]/div/div/div[2]/div/div[3]/div/div[14]/div[2]/div[2]/div/div[1]");

		By benchmicropipette=By.xpath("/html/body/div[1]/div/div[2]/div[3]/div[3]/div[3]/div[1]/div/div[2]/div[1]/div/div/div[2]/div/div[3]/div/div[4]/div[2]/div[2]/div/div[1]");
		By nichromewirerod=By.xpath("/html/body/div[1]/div/div[2]/div[3]/div[3]/div[3]/div[1]/div/div[2]/div[1]/div/div/div[2]/div/div[3]/div/div[5]/div[2]/div[2]/div/div[1]");
		By benchdropper=By.xpath("/html/body/div[1]/div/div[2]/div[3]/div[3]/div[3]/div[1]/div/div[2]/div[1]/div/div/div[2]/div/div[3]/div/div[6]/div[2]/div[2]/div/div[1]");
		By benchecoli=By.xpath("/html/body/div[1]/div/div[2]/div[3]/div[3]/div[3]/div[1]/div/div[2]/div[1]/div/div/div[2]/div/div[3]/div/div[7]/div[2]/div[2]/div/div[1]");
		By benchaureus=By.xpath("/html/body/div[1]/div/div[2]/div[3]/div[3]/div[3]/div[1]/div/div[2]/div[1]/div/div/div[2]/div/div[3]/div/div[8]/div[2]/div[2]/div/div[1]");
		By benchmrsa=By.xpath("/html/body/div[1]/div/div[2]/div[3]/div[3]/div[3]/div[1]/div/div[2]/div[1]/div/div/div[2]/div/div[3]/div/div[9]/div[2]/div[2]/div/div[1]");
		By benchmphlei=By.xpath("/html/body/div[1]/div/div[2]/div[3]/div[3]/div[3]/div[1]/div/div[2]/div[1]/div/div/div[2]/div/div[3]/div/div[10]/div[2]/div[2]/div/div[1]");
		By kpneumoniae=By.xpath("/html/body/div[1]/div/div[2]/div[3]/div[3]/div[3]/div[1]/div/div[2]/div[1]/div/div/div[2]/div/div[3]/div/div[11]/div[2]/div[2]/div/div[1]");
		By spneumoniae=By.xpath("/html/body/div[1]/div/div[2]/div[3]/div[3]/div[3]/div[1]/div/div[2]/div[1]/div/div/div[2]/div/div[3]/div/div[12]/div[2]/div[2]/div/div[1]");
		By nutrietagar=By.xpath("/html/body/div[1]/div/div[2]/div[3]/div[3]/div[3]/div[1]/div/div[2]/div[1]/div/div/div[2]/div/div[3]/div/div[13]/div[2]/div[2]/div/div/div[1]");
		By elerlenbench=By.xpath("/html/body/div[1]/div/div[2]/div[3]/div[3]/div[3]/div[1]/div/div[2]/div[1]/div/div/div[2]/div/div[3]/div/div[2]");

		//Bench Instruments
		By benchelectrophotometer=By.xpath("/html/body/div[1]/div/div[2]/div[3]/div[3]/div[3]/div[1]/div/div[2]/div[1]/div/div/div[2]/div/div[3]/div/div[8]/div[2]/div[2]/div[1]");
		By benchtemperaturabathe=By.xpath("/html/body/div[1]/div/div[2]/div[3]/div[3]/div[3]/div[1]/div/div[2]/div[1]/div/div/div[2]/div/div[3]/div/div[2]/div[2]/div[2]/div[1]");
		By benchthermometer=By.xpath("/html/body/div[1]/div/div[2]/div[3]/div[3]/div[3]/div[1]/div/div[2]/div[1]/div/div/div[2]/div/div[3]/div/div[6]/div[2]/div[2]");
		By benchphmeter=By.xpath("/html/body/div[1]/div/div[2]/div[3]/div[3]/div[3]/div[1]/div/div[2]/div[1]/div/div/div[2]/div/div[3]/div/div[3]/div[2]/div[2]");
		By benchgassiringe=By.xpath("/html/body/div[1]/div/div[2]/div[3]/div[3]/div[3]/div[1]/div/div[2]/div[1]/div/div/div[2]/div/div[3]/div/div[7]/div[2]/div[2]");
		By benchplantlightbox=By.xpath("/html/body/div[1]/div/div[2]/div[3]/div[3]/div[3]/div[1]/div/div[2]/div[1]/div/div/div[2]/div/div[3]/div/div[2]/div[2]/div[2]/div/div[1]");
		By microscope=By.xpath("/html/body/div[1]/div/div[2]/div[3]/div[3]/div[3]/div[1]/div/div[2]/div[1]/div/div/div[2]/div/div[3]/div/div[14]/div[2]/div[2]/div[1]");

		
		By smalltubebench1=By.xpath("/html/body/div[1]/div/div[2]/div[3]/div[3]/div[3]/div[1]/div/div[2]/div[1]/div/div/div[2]/div/div[3]/div/div[6]/div[2]/div[2]/div/div/div/div/div[1]");
		By smalltubebench2=By.xpath("/html/body/div[1]/div/div[2]/div[3]/div[3]/div[3]/div[1]/div/div[2]/div[1]/div/div/div[2]/div/div[3]/div/div[2]/div[2]/div[2]/div/div/div/div/div[1]");
		By smalltubebench3=By.xpath("/html/body/div[1]/div/div[2]/div[3]/div[3]/div[3]/div[1]/div/div[2]/div[1]/div/div/div[2]/div/div[3]/div/div[3]/div[2]/div[2]/div/div/div/div/div[1]");
		By benchphmeter2=By.xpath("/html/body/div[1]/div/div[2]/div[3]/div[3]/div[3]/div[1]/div/div[2]/div[1]/div/div/div[2]/div/div[3]/div/div[7]/div[2]/div[2]");
	    By phmeter3=By.cssSelector("#savi-hmlabsims-modal > div:nth-child(3) > div > div > div > section.modal__content.large > div:nth-child(1) > div > button:nth-child(4)");
	    By cuvette4=By.xpath("/html/body/div[1]/div/div[2]/div[3]/div[3]/div[3]/div[1]/div/div[2]/div[1]/div/div/div[2]/div/div[3]/div/div[7]/div[2]");
	    By espectobench=By.xpath("/html/body/div[1]/div/div[2]/div[3]/div[3]/div[3]/div[1]/div/div[2]/div[1]/div/div/div[2]/div/div[3]/div/div[6]/div[2]/div[2]/div[1]");
	    By espectobenchzero=By.xpath("/html/body/div[1]/div/div[2]/div[3]/div[3]/div[3]/div[1]/div/div[2]/div[1]/div/div/div[2]/div/div[3]/div/div[6]/div[2]/div[2]/div[4]/div[3]/div[2]");
	    By espectocuvete=By.xpath("/html/body/div[1]/div/div[2]/div[3]/div[3]/div[3]/div[1]/div/div[2]/div[1]/div/div/div[2]/div/div[3]/div/div[6]/div[2]/div[2]/div[6]/div[2]/div[2]/div/div[1]");
	    By cuvettebench1=By.xpath("/html/body/div[1]/div/div[2]/div[3]/div[3]/div[3]/div[1]/div/div[2]/div[1]/div/div/div[2]/div/div[3]/div/div[6]/div[2]/div[2]/div");
	    By cuvettebench2=By.xpath("/html/body/div[1]/div/div[2]/div[3]/div[3]/div[3]/div[1]/div/div[2]/div[1]/div/div/div[2]/div/div[3]/div/div[6]");
	    By cuvettebench3=By.xpath("/html/body/div[1]/div/div[2]/div[3]/div[3]/div[3]/div[1]/div/div[2]/div[1]/div/div/div[2]/div/div[3]/div/div[4]");
	    By cuvettebench33=By.xpath("/html/body/div[1]/div/div[2]/div[3]/div[3]/div[3]/div[1]/div/div[2]/div[1]/div/div/div[2]/div/div[3]/div/div[5]");

	    By espectobench1=By.xpath("/html/body/div[1]/div/div[2]/div[3]/div[3]/div[3]/div[1]/div/div[2]/div[1]/div/div/div[2]/div/div[3]/div/div[5]");
	    By espectobench2=By.xpath("/html/body/div[1]/div/div[2]/div[3]/div[3]/div[3]/div[1]/div/div[2]/div[1]/div/div/div[2]/div/div[3]/div/div[6]/div[2]/div[2]/div[1]");
	    By absorbance=By.className("Spectrophotometer-displays");
		By beakerdinamicelement=By.xpath("//input[contains(@id, \"Beaker\")]");
	 
	@BeforeTest
	public void initialize() throws IOException
	{

		 driver =initializeDriver();
		 log.info("Driver is initialized");
			
		driver.get(prop.getProperty("url2"));
		log.info("Navigated to Home page");
	}
	@Test
	
	public void BL7BurnerBench() throws IOException
	{
		Methods me=new Methods(driver);

		//one is inheritance
		// creating object to that class and invoke methods of it
		//compare the text from the browser with actual text.- Error..
		
			visit("https://www.saplinglearning.com/ibiscms/course/view.php?id=92967");

			//Entorno	
			type ("savispark", userLocator);
			type ("savispark", passLocator);
			retryingFindClick (submitButtomSaping);
			retryingFindClick (premodule);
			//URL
			visit("https://savi-cdn-dev.saplinglearning.com/hmlabsims/bl7/master/index.html");

          click(enterlab);
			click(opcion1);
			click(opcion2);
			click(opcion3);
			click(skipanimation);
		    driver.findElement(By.cssSelector("#material_target_button > .category-button-list__item__button")).click();
		    driver.findElement(By.cssSelector(".modal__header-close-button")).click();
		    driver.findElement(By.cssSelector("#container_target_button > .category-button-list__item__button")).click();
		    driver.findElement(By.cssSelector(".diffusion")).click();
		    driver.findElement(By.cssSelector(".primary")).click();
		    driver.findElement(By.name("Bench")).click();
		    driver.findElement(By.cssSelector(".primary")).click();
		    driver.findElement(By.cssSelector("#container_target_button span")).click();
		    driver.findElement(By.cssSelector(".lab-interactions-wizard-content-item:nth-child(2) > .lab-interactions-wizard-content-item-name")).click();
		    driver.findElement(By.cssSelector(".primary")).click();
		    driver.findElement(By.name("Bench")).click();
		    driver.findElement(By.cssSelector(".primary")).click();
		    driver.findElement(By.cssSelector("#container_target_button > .category-button-list__item__button")).click();
		    driver.findElement(By.cssSelector(".lab-interactions-wizard-content-item:nth-child(2)")).click();
		    driver.findElement(By.cssSelector(".primary")).click();
		    driver.findElement(By.name("Bench")).click();
		    driver.findElement(By.cssSelector(".primary")).click();
		    driver.findElement(By.cssSelector("#container_target_button span")).click();
		    driver.findElement(By.cssSelector(".lab-interactions-wizard-content-item:nth-child(2) > .lab-interactions-wizard-content-item-name")).click();
		    driver.findElement(By.cssSelector(".primary")).click();
		    driver.findElement(By.cssSelector(".radio")).click();
		    driver.findElement(By.cssSelector(".primary")).click();
		    driver.findElement(By.cssSelector("#material_target_button > .category-button-list__item__button")).click();
		    driver.findElement(By.cssSelector(".lab-interactions-wizard-content-item:nth-child(2)")).click();
		    driver.findElement(By.cssSelector(".primary")).click();
		    driver.findElement(By.cssSelector("div:nth-child(1) > .radio > .lab-interactions-wizard-content-radio")).click();
		    driver.findElement(By.cssSelector(".lab-simulation-inputField")).click();
		    driver.findElement(By.cssSelector(".lab-simulation-inputField")).sendKeys("50");
		    driver.findElement(By.cssSelector(".primary")).click();
		    driver.findElement(By.cssSelector("#container_target_button > .category-button-list__item__button")).click();
		    driver.findElement(By.cssSelector(".modal__header-close-button")).click();
		    driver.findElement(By.cssSelector("#material_target_button span")).click();
		    driver.findElement(By.cssSelector(".lab-interactions-wizard-content-item:nth-child(2)")).click();
		    driver.findElement(By.cssSelector(".primary")).click();
		    driver.findElement(By.cssSelector("div:nth-child(1) > .radio > .lab-interactions-wizard-content-radio")).click();
		    driver.findElement(By.cssSelector(".lab-simulation-inputField")).click();
		    driver.findElement(By.cssSelector(".lab-simulation-inputField")).click();
		    driver.findElement(By.cssSelector(".lab-simulation-inputField")).sendKeys("37.5");
		    driver.findElement(By.cssSelector(".modal__content")).click();
		    driver.findElement(By.cssSelector(".lab-simulation-inputField")).click();
		    driver.findElement(By.cssSelector(".lab-simulation-inputField")).click();
		    driver.findElement(By.cssSelector(".lab-simulation-inputField")).sendKeys("0");
		    driver.findElement(By.cssSelector("div:nth-child(2) > .radio")).click();
		    driver.findElement(By.cssSelector(".lab-simulation-inputField")).click();
		    driver.findElement(By.cssSelector(".lab-simulation-inputField")).sendKeys("37.5");
		    driver.findElement(By.cssSelector(".primary")).click();
		    driver.findElement(By.cssSelector("#material_target_button > .category-button-list__item__button")).click();
		    driver.findElement(By.cssSelector(".lab-interactions-wizard-content-item:nth-child(2) > .lab-interactions-wizard-content-item-name > div")).click();
		    driver.findElement(By.cssSelector(".primary")).click();
		    driver.findElement(By.cssSelector("div:nth-child(3) > .radio > .lab-interactions-wizard-content-radio")).click();
		    driver.findElement(By.cssSelector(".lab-simulation-inputField")).click();
		    driver.findElement(By.cssSelector(".lab-simulation-inputField")).sendKeys("25");
		    driver.findElement(By.cssSelector(".primary")).click();
		    driver.findElement(By.cssSelector("#material_target_button span")).click();
		    driver.findElement(By.cssSelector(".lab-interactions-wizard-content-item:nth-child(2)")).click();
		    driver.findElement(By.cssSelector(".primary")).click();
		    driver.findElement(By.cssSelector("div:nth-child(4) .lab-interactions-wizard-content-radio")).click();
		    driver.findElement(By.cssSelector(".lab-simulation-inputField")).click();
		    driver.findElement(By.cssSelector(".lab-simulation-inputField")).sendKeys("12.5");
		    driver.findElement(By.cssSelector(".primary")).click();
		    driver.findElement(By.cssSelector("#material_target_button span")).click();
		    driver.findElement(By.cssSelector(".lab-interactions-wizard-content-item:nth-child(1)")).click();
		    driver.findElement(By.cssSelector(".primary")).click();
		    driver.findElement(By.cssSelector("div:nth-child(1) > .radio > .lab-interactions-wizard-content-radio")).click();
		    driver.findElement(By.cssSelector(".lab-simulation-inputField")).click();
		    driver.findElement(By.cssSelector(".lab-simulation-inputField")).sendKeys("0");
		    driver.findElement(By.cssSelector(".primary")).click();
		    driver.findElement(By.cssSelector("#material_target_button span")).click();
		    driver.findElement(By.cssSelector(".lab-interactions-wizard-content-item:nth-child(1) > .lab-interactions-wizard-content-item-name > div")).click();
		    driver.findElement(By.cssSelector(".primary")).click();
		    driver.findElement(By.cssSelector("div:nth-child(2) > .radio > .lab-interactions-wizard-content-radio")).click();
		    driver.findElement(By.cssSelector(".lab-simulation-inputField")).click();
		    driver.findElement(By.cssSelector(".lab-simulation-inputField")).sendKeys("12.5");
		    driver.findElement(By.cssSelector(".primary")).click();
		    driver.findElement(By.cssSelector("#material_target_button span")).click();
		    driver.findElement(By.cssSelector(".lab-interactions-wizard-content-item:nth-child(1) > .lab-interactions-wizard-content-item-name > div")).click();
		    driver.findElement(By.cssSelector(".primary")).click();
		    driver.findElement(By.cssSelector("div:nth-child(3) > .radio > .lab-interactions-wizard-content-radio")).click();
		    driver.findElement(By.cssSelector(".lab-simulation-inputField")).click();
		    driver.findElement(By.cssSelector(".lab-simulation-inputField")).sendKeys("25");
		    driver.findElement(By.cssSelector(".primary")).click();
		    driver.findElement(By.cssSelector("#material_target_button > .category-button-list__item__button")).click();
		    driver.findElement(By.cssSelector(".lab-interactions-wizard-content-item:nth-child(1)")).click();
		    driver.findElement(By.cssSelector(".primary")).click();
		    driver.findElement(By.cssSelector("div:nth-child(4) .lab-interactions-wizard-content-radio")).click();
		    driver.findElement(By.cssSelector(".lab-simulation-inputField")).click();
		    driver.findElement(By.cssSelector(".lab-simulation-inputField")).sendKeys("37.5");
		    driver.findElement(By.cssSelector(".primary")).click();
		    driver.findElement(By.cssSelector("#container_target_button > .category-button-list__item__button")).click();
		    driver.findElement(By.cssSelector(".lab-interactions-wizard-content-item:nth-child(1)")).click();
		    driver.findElement(By.cssSelector(".primary")).click();
		    driver.findElement(By.name("Bench")).click();
		    driver.findElement(By.cssSelector(".primary")).click();
		    driver.findElement(By.cssSelector("#container_target_button span")).click();
		    driver.findElement(By.cssSelector(".lab-interactions-wizard-content-item:nth-child(1)")).click();
		    driver.findElement(By.cssSelector(".primary")).click();
		    driver.findElement(By.name("Bench")).click();
		    driver.findElement(By.cssSelector(".primary")).click();
		    driver.findElement(By.cssSelector("#container_target_button > .category-button-list__item__button")).click();
		    {
		      WebElement element = driver.findElement(By.cssSelector("#container_target_button > .category-button-list__item__button"));
		      Actions builder = new Actions(driver);
		      builder.moveToElement(element).perform();
		    }
		    {
		      WebElement element = driver.findElement(By.tagName("body"));
		      Actions builder = new Actions(driver);
		      builder.moveToElement(element, 0, 0).perform();
		    }
		    driver.findElement(By.cssSelector(".lab-interactions-wizard-content-item:nth-child(1)")).click();
		    driver.findElement(By.cssSelector(".primary")).click();
		    driver.findElement(By.name("Bench")).click();
		    driver.findElement(By.cssSelector(".primary")).click();
		    {
		      WebElement element = driver.findElement(By.cssSelector("#container_target_button > .category-button-list__item__button"));
		      Actions builder = new Actions(driver);
		      builder.moveToElement(element).clickAndHold().perform();
		    }
		    {
		      WebElement element = driver.findElement(By.cssSelector("#container_target_button > .category-button-list__item__button"));
		      Actions builder = new Actions(driver);
		      builder.moveToElement(element).perform();
		    }
		    {
		      WebElement element = driver.findElement(By.cssSelector("#container_target_button > .category-button-list__item__button"));
		      Actions builder = new Actions(driver);
		      builder.moveToElement(element).release().perform();
		    }
		    driver.findElement(By.cssSelector(".\\32 50")).click();
		    driver.findElement(By.cssSelector(".primary")).click();
		    driver.findElement(By.name("Bench")).click();
		    driver.findElement(By.cssSelector(".primary")).click();
		    driver.findElement(By.cssSelector("#material_target_button > .category-button-list__item__button")).click();
		    driver.findElement(By.cssSelector(".lab-interactions-wizard-content-item:nth-child(2) .PLASTIC_LIQUIDS_BOTTLE")).click();
		    driver.findElement(By.cssSelector(".primary")).click();
		    driver.findElement(By.cssSelector("div:nth-child(1) > .radio > .lab-interactions-wizard-content-radio")).click();
		    driver.findElement(By.cssSelector(".lab-simulation-inputField")).click();
		    driver.findElement(By.cssSelector(".lab-simulation-inputField")).sendKeys("100");
		    driver.findElement(By.cssSelector(".primary")).click();
		    driver.findElement(By.cssSelector("#material_target_button > .category-button-list__item__button")).click();
		    {
		      WebElement element = driver.findElement(By.cssSelector("#material_target_button > .category-button-list__item__button"));
		      Actions builder = new Actions(driver);
		      builder.moveToElement(element).perform();
		    }
		    {
		      WebElement element = driver.findElement(By.tagName("body"));
		      Actions builder = new Actions(driver);
		      builder.moveToElement(element, 0, 0).perform();
		    }
		    driver.findElement(By.cssSelector(".PLASTIC_H2O_BOTTLE")).click();
		    driver.findElement(By.cssSelector(".primary")).click();
		    driver.findElement(By.xpath("//div[@id=\'savi-hmlabsims-modal\']/div[3]/div/div/div/section/div/div[2]/div[6]/label/input")).click();
		    driver.findElement(By.cssSelector(".lab-simulation-inputField")).click();
		    driver.findElement(By.cssSelector(".lab-simulation-inputField")).sendKeys("100");
		    driver.findElement(By.cssSelector(".primary")).click();
		    driver.findElement(By.cssSelector("#material_target_button span")).click();
		    driver.findElement(By.cssSelector(".lab-interactions-wizard-content-item:nth-child(1) > .lab-interactions-wizard-content-item-name > div")).click();
		    driver.findElement(By.cssSelector(".primary")).click();
		    driver.findElement(By.xpath("//div[@id=\'savi-hmlabsims-modal\']/div[3]/div/div/div/section/div/div[2]/div[7]/label/input")).click();
		    driver.findElement(By.cssSelector(".lab-simulation-inputField")).click();
		    driver.findElement(By.cssSelector(".lab-simulation-inputField")).sendKeys("100");
		    driver.findElement(By.cssSelector(".primary")).click();
		    driver.findElement(By.cssSelector("#material_target_button svg")).click();
		    driver.findElement(By.cssSelector(".lab-interactions-wizard-content-item:nth-child(1)")).click();
		    driver.findElement(By.cssSelector(".primary")).click();
		    driver.findElement(By.xpath("//div[@id=\'savi-hmlabsims-modal\']/div[3]/div/div/div/section/div/div[2]/div[8]/label/input")).click();
		    driver.findElement(By.cssSelector(".lab-simulation-inputField")).click();
		    driver.findElement(By.cssSelector(".lab-simulation-inputField")).sendKeys("100");
		    driver.findElement(By.cssSelector(".primary")).click();
		    driver.findElement(By.cssSelector("#material_target_button > .category-button-list__item__button")).click();
		    driver.findElement(By.cssSelector(".lab-interactions-wizard-content-item:nth-child(2)")).click();
		    driver.findElement(By.cssSelector(".primary")).click();
		    driver.findElement(By.xpath("//div[@id=\'savi-hmlabsims-modal\']/div[3]/div/div/div/section/div/div[2]/div/label/input")).click();
		    driver.findElement(By.cssSelector(".lab-simulation-inputField")).click();
		    driver.findElement(By.cssSelector(".lab-simulation-inputField")).sendKeys("100");
		    driver.findElement(By.cssSelector(".primary")).click();
		    driver.findElement(By.cssSelector("#material_target_button > .category-button-list__item__button")).click();
		    driver.findElement(By.cssSelector(".lab-interactions-wizard-content-item:nth-child(2)")).click();
		    driver.findElement(By.cssSelector(".primary")).click();
		    driver.findElement(By.xpath("//div[@id=\'savi-hmlabsims-modal\']/div[3]/div/div/div/section/div/div[2]/div[6]/label/input")).click();
		    driver.findElement(By.cssSelector(".lab-simulation-inputField")).click();
		    driver.findElement(By.cssSelector(".lab-simulation-inputField")).sendKeys("100");
		    driver.findElement(By.cssSelector(".primary")).click();
		    driver.findElement(By.cssSelector("#material_target_button span")).click();
		    {
		      WebElement element = driver.findElement(By.cssSelector("#material_target_button span"));
		      Actions builder = new Actions(driver);
		      builder.moveToElement(element).perform();
		    }
		    {
		      WebElement element = driver.findElement(By.tagName("body"));
		      Actions builder = new Actions(driver);
		      builder.moveToElement(element, 0, 0).perform();
		    }
		    driver.findElement(By.cssSelector(".lab-interactions-wizard-content-item:nth-child(2)")).click();
		    driver.findElement(By.cssSelector(".primary")).click();
		    driver.findElement(By.xpath("//div[@id=\'savi-hmlabsims-modal\']/div[3]/div/div/div/section/div/div[2]/div[7]/label/input")).click();
		    driver.findElement(By.cssSelector(".lab-simulation-inputField")).click();
		    driver.findElement(By.cssSelector(".lab-simulation-inputField")).sendKeys("100");
		    driver.findElement(By.cssSelector(".primary")).click();
		    {
		      WebElement element = driver.findElement(By.cssSelector("#material_target_button > .category-button-list__item__button"));
		      Actions builder = new Actions(driver);
		      builder.moveToElement(element).clickAndHold().perform();
		    }
		    {
		      WebElement element = driver.findElement(By.cssSelector("#material_target_button svg"));
		      Actions builder = new Actions(driver);
		      builder.moveToElement(element).release().perform();
		    }
		    {
		      WebElement element = driver.findElement(By.cssSelector("#material_target_button svg"));
		      Actions builder = new Actions(driver);
		      builder.moveToElement(element).perform();
		    }
		    {
		      WebElement element = driver.findElement(By.tagName("body"));
		      Actions builder = new Actions(driver);
		      builder.moveToElement(element, 0, 0).perform();
		    }
		    driver.findElement(By.cssSelector(".lab-interactions-wizard-content-item:nth-child(2)")).click();
		    driver.findElement(By.cssSelector(".primary")).click();
		    driver.findElement(By.cssSelector("div:nth-child(8) > .radio")).click();
		    driver.findElement(By.cssSelector(".lab-simulation-inputField")).click();
		    driver.findElement(By.cssSelector(".lab-simulation-inputField")).sendKeys("100");
		    driver.findElement(By.cssSelector(".primary")).click();
		    driver.findElement(By.cssSelector("#instrument_target_button span")).click();
		    driver.findElement(By.cssSelector(".balance")).click();
		    driver.findElement(By.cssSelector(".primary")).click();
		    driver.findElement(By.name("Bench")).click();
		    driver.findElement(By.cssSelector(".primary")).click();
		    {
		    	WebElement element = driver.findElement(By.xpath("//div[9]/div[2]/div[2]/div/div/div/div"));
		        Actions builder = new Actions(driver);
		        builder.moveToElement(element).clickAndHold().perform();
		      }
		      {
		        WebElement element = driver.findElement(By.xpath("//div[9]/div[2]/div[2]/div"));
		        Actions builder = new Actions(driver);
		        builder.moveToElement(element).perform();
		      }
		      {

		        WebElement element = driver.findElement(By.xpath("//div[9]/div[2]/div[2]/div"));
		        Actions builder = new Actions(driver);
		        builder.moveToElement(element).release().perform();

		    }


	}


				
	
	
		
		
	@AfterTest
	public void teardown()
	{
		
		driver.close();
	
		
	}

	


}
