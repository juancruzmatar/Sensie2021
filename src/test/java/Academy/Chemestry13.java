package Academy;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObjects.Methods;
import resources.base;

public class Chemestry13   extends base{
	public WebDriver driver;
	  JavascriptExecutor js;

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
		By bench=By.name("Bench");
		By module= By.xpath("//li[@id='module-7745071']/a/span");
		By Materiales=By.cssSelector("#material_target_button");
		By Containers=By.cssSelector("#container_target_button");
		By Instruments=By.cssSelector("#instrument_target_button");
		By startlab=By.cssSelector("#savi-hmlabsims-cl15 > div > div.savi-app.modal-false.app-is-expanded-false > div.responsive-wrapper.portrait.small.modal-false.app-is-expanded-false > div.lnl-lab-simulation-container > div.lab-simulation-container-scale > div > div.initial-screen > div > div > button");
		By bench250=By.xpath("/html/body/div[1]/div/div[2]/div[3]/div[3]/div[3]/div[1]/div/div[2]/div[1]/div/div/div[2]/div/div[3]/div/div[5]/div[2]/div[2]/div/div/div/div/div[1]");
		
		
		///Containers
		
		By beaker400=By.xpath("/html/body/div[2]/div[3]/div/div/div/section[1]/div[1]/div/button[1]");
		By beaker2500=By.xpath("/html/body/div[2]/div[3]/div/div/div/section[1]/div[1]/div/button[2]");
		By beaker50=By.xpath("/html/body/div[2]/div[3]/div/div/div/section[1]/div[1]/div/button[3]");
		By smalltesttube=By.xpath("/html/body/div[2]/div[3]/div/div/div/section[1]/div[1]/div/button[4]");
		By largetesttube=By.xpath("/html/body/div[2]/div[3]/div/div/div/section[1]/div[1]/div/button[5]");
		By dropper=By.xpath("/html/body/div[2]/div[3]/div/div/div/section[1]/div[1]/div/button[6]");
		By graduatecylinder=By.xpath("/html/body/div[2]/div[3]/div/div/div/section[1]/div[1]/div/button[7]");
		
		//Instruments
		
		By bunsenburner=By.xpath("/html/body/div[2]/div[3]/div/div/div/section[1]/div[1]/div/button[1]");
	    By phmeter=By.xpath("/html/body/div[2]/div[3]/div/div/div/section[1]/div[1]/div/button");

		//Materials


		By water=By.xpath("/html/body/div[2]/div[3]/div/div/div/section[1]/div[1]/div/button[1]");
		By acetone=By.xpath("/html/body/div[2]/div[3]/div/div/div/section[1]/div[1]/div/button[2]");
		By ammonia4=By.xpath("/html/body/div[2]/div[3]/div/div/div/section[1]/div[1]/div/button[3]");
		By hidrocloricacid=By.xpath("/html/body/div[2]/div[3]/div/div/div/section[1]/div[1]/div/button[4]");
		By sodiumhydorixide=By.xpath("/html/body/div[2]/div[3]/div/div/div/section[1]/div[1]/div/button[5]");
		By sodiumdhydrogen=By.xpath("/html/body/div[2]/div[3]/div/div/div/section[1]/div[1]/div/button[6]");
		By sodiumhydrogen=By.xpath("/html/body/div[2]/div[3]/div/div/div/section[1]/div[1]/div/button[7]");
		By citricacid=By.xpath("/html/body/div[2]/div[3]/div/div/div/section[1]/div[1]/div/button[8]");
		By dilutedbleach=By.xpath("/html/body/div[2]/div[3]/div/div/div/section[1]/div[1]/div/button[9]");
		By hidrocloricacid05=By.xpath("/html/body/div[2]/div[3]/div/div/div/section[1]/div[1]/div/button[10]");
		By hidroxidesodium=By.xpath("/html/body/div[2]/div[3]/div/div/div/section[1]/div[1]/div/button[11]");
		By vinegar=By.xpath("/html/body/div[2]/div[3]/div/div/div/section[1]/div[1]/div/button[12]");
		By phenol=By.xpath("/html/body/div[2]/div[3]/div/div/div/section[1]/div[1]/div/button[13]");
		By yellowmethil=By.xpath("/html/body/div[2]/div[3]/div/div/div/section[1]/div[1]/div/button[14]");
		By greenbromo=By.xpath("/html/body/div[2]/div[3]/div/div/div/section[1]/div[1]/div/button[15]");
		By bluebromo=By.xpath("/html/body/div[2]/div[3]/div/div/div/section[1]/div[1]/div/button[16]");
		By yellowalizarin=By.xpath("/html/body/div[2]/div[3]/div/div/div/section[1]/div[1]/div/button[17]");
		By redcabage=By.xpath("/html/body/div[2]/div[3]/div/div/div/section[1]/div[1]/div/button[18]");


		
		
		//Others
		By tubebench=By.xpath("/html/body/div[1]/div/div[2]/div[3]/div[3]/div[3]/div[1]/div/div[2]/div[1]/div/div/div[2]/div/div[3]/div/div[8]/div[2]");
		By erlenmegerbench=By.xpath("/html/body/div[1]/div/div[2]/div[3]/div[3]/div[3]/div[1]/div/div[2]/div[1]/div/div/div[2]/div/div[3]/div/div[2]/div[2]/div[2]/div/div/div/div/div[1]");
		By Phbench=By.xpath("/html/body/div[1]/div/div[2]/div[3]/div[3]/div[3]/div[1]/div/div[2]/div[1]/div/div/div[2]/div/div[3]/div/div[8]/div[2]/div[2]");
		By premodule=By.xpath("/html/body/div[1]/div/div[2]/div[3]/table/tbody/tr/td[2]/div/table/tbody/tr[3]/td[2]/ul/li[4]/a/span");

		//Modal options
		By modal1=By.xpath("/html/body/div[2]/div[3]/div/div/div/section[1]/div[1]/div[2]/div[1]/label/input");
		By modal2=By.xpath("/html/body/div[2]/div[3]/div/div/div/section[1]/div[1]/div[2]/div[2]/label/input");
		By modal3=By.xpath("/html/body/div[2]/div[3]/div/div/div/section[1]/div[1]/div[2]/div[3]/label/input");
		By modal4=By.xpath("/html/body/div[2]/div[3]/div/div/div/section[1]/div[1]/div[2]/div[4]/label/input");
		By modal5=By.xpath("/html/body/div[2]/div[3]/div/div/div/section[1]/div[1]/div[2]/div[5]/label/input");
		By modal6=By.xpath("/html/body/div[2]/div[3]/div/div/div/section[1]/div[1]/div[2]/div[6]/label/input");
		By modal7=By.xpath("/html/body/div[2]/div[3]/div/div/div/section[1]/div[1]/div[2]/div[6]/label/input");
		By nutrietagar=By.xpath("/html/body/div[2]/div[3]/div/div/div/section[1]/div[1]/div/button[12]");
		// Containers Bench
		
			By add=By.cssSelector("#savi-hmlabsims-modal > div:nth-child(3) > div > div > div > section.modal__buttons-container.large > button.button.primary.large");
			By tirarbench= By.cssSelector("#savi-hmlabsims-modal > div:nth-child(3) > div > div > div > section.modal__content.large > div:nth-child(1) > div.lab-interactions-wizard-content-targets-list > div > label > input");
			By enteramount=By.cssSelector("#savi-hmlabsims-modal > div:nth-child(3) > div > div > div > section.modal__content.large > div:nth-child(1) > input");
			By buttonamount=By.cssSelector("#savi-hmlabsims-modal > div:nth-child(3) > div > div > div > section.modal__buttons-container.large > button.button.primary.large");
			By sink=By.className("Sink");
			By waste=By.className("WasteBin-container");
			By input=By.className("lab-simulation-bodyText");
			By input2=By.className("lab-simulation-inputField");

			 
			By butondone=By.xpath("(//button[@type='button'])[18]");

			
		
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
	 
		By pruebabenchtube1=By.xpath("//div[@class='tooltip container-tooltip']");
		By pruebabenchtube2=By.xpath("//div[@class='tooltip container-tooltip']");
		By pruebabenchtube3=By.xpath("//div[@class='tooltip container-tooltip'] [7]");
		By pruebabenchtube4=By.xpath("//div[@class='tooltip container-tooltip'] [6]");
		By pruebabenchtube5=By.xpath("//div[@class='tooltip container-tooltip'] [5]");
		By pruebabenchtube6=By.xpath("//div[@class='tooltip container-tooltip'] [4]");


		By benchtube1=By.xpath("/html/body/div[1]/div/div[2]/div[3]/div[3]/div[3]/div[1]/div/div[2]/div[1]/div/div/div[2]/div/div[3]/div/div[2]/div[2]/div[2]/div/div");
		By benchtube2=By.xpath("/html/body/div[1]/div/div[2]/div[3]/div[3]/div[3]/div[1]/div/div[2]/div[1]/div/div/div[2]/div/div[3]/div/div[5]/div[2]/div[2]/div/div");
		By benchtube3=By.xpath("/html/body/div[1]/div/div[2]/div[3]/div[3]/div[3]/div[1]/div/div[2]/div[1]/div/div/div[2]/div/div[3]/div/div[7]/div[2]/div[2]/div");
		By benchtube4=By.xpath("/html/body/div[1]/div/div[2]/div[3]/div[3]/div[3]/div[1]/div/div[2]/div[1]/div/div/div[2]/div/div[3]/div/div[8]/div[2]/div[2]/div");
		By benchtube5=By.xpath("/html/body/div[1]/div/div[2]/div[3]/div[3]/div[3]/div[1]/div/div[2]/div[1]/div/div/div[2]/div/div[3]/div/div[8]/div[2]/div[2]/div/div");
		By benchtube6=By.xpath("/html/body/div[1]/div/div[2]/div[3]/div[3]/div[3]/div[1]/div/div[2]/div[1]/div/div/div[3]/div/div[3]/div/div[8]/div[2]/div[2]/div/div/div/div/div[1]");
		By benchtube7=By.xpath("/html/body/div[1]/div/div[2]/div[3]/div[3]/div[3]/div[1]/div/div[2]/div[1]/div/div/div[2]/div/div[3]/div/div[8]/div[2]/div[2]/div/div/div/div/div[1]");
	    
		
	 
	 //////Full Break
	 By beaker=By.xpath(" /html/body/div[1]/div/div[2]/div[3]/div[3]/div[3]/div[1]/div/div[2]/div[1]/div/div/div[1]/div[7]/div/div[1]/div[6]/div[2]/div[2]/div/div/div/div");
	 
	 
	 @BeforeTest
		public void initialize() throws IOException
		{

			 driver =initializeDriver();
			 log.info("Driver is initialized");
				
			driver.get(prop.getProperty("url2"));
			log.info("Navigated to Home page");
		}
	 
	 @Test
		
		public void CL13TestMeasurethepHofAcids ()  {
		 driver.get(prop.getProperty("url2"));
			Methods me=new Methods(driver);
			


			//Entorno	
		visit("https://www.saplinglearning.com/ibiscms/course/view.php?id=92967");

			//Entorno	
			type ("savispark", userLocator);
			type ("savispark", passLocator);
			retryingFindClick (submitButtomSaping);
			retryingFindClick (premodule);
			//URL
			visit("https://savi-cdn-dev.saplinglearning.com/hmlabsims/cl13/cl13-1.0.0/index.html");
			//Enter Laboratory
			click(enterlab);
			click(opcion1);
			click(opcion2);
			click(opcion3);
			click(skipanimation);
			//Experiments
			click(Containers);
			retryingFindClick(smalltesttube);
			click(add);
			click(tirarbench);
			click(add);
			
			click(Containers);
			retryingFindClick(smalltesttube);
			click(add);
			click(tirarbench);
			click(add);
			
			click(Containers);
			retryingFindClick(smalltesttube);
			click(add);
			click(tirarbench);
			click(add);
			
			click(Containers);
			retryingFindClick(smalltesttube);
			click(add);
			click(tirarbench);
			click(add);
			
			click(Containers);
			retryingFindClick(smalltesttube);
			click(add);
			click(tirarbench);
			click(add);
			
			click(Containers);
			retryingFindClick(smalltesttube);
			click(add);
			click(tirarbench);
			click(add);
			
			click(Containers);
			retryingFindClick(smalltesttube);
			click(add);
			click(tirarbench);
			click(add);
			
			
			//Material 1
			click(Materiales);
			retryingFindClick(hidrocloricacid);
			click(buttonamount);
			click(modal1);
			type ("5", enteramount);
			click(add);
			
			
			//Material 1
					click(Materiales);
					retryingFindClick(water);
					click(buttonamount);
					click(modal1);
					type ("5", enteramount);
					click(add);
			
					//Material 1
					click(Materiales);
					retryingFindClick(water);
					click(buttonamount);
					click(modal2);
					type ("9", enteramount);
					click(add);
					
					//Material 1
					click(Materiales);
					retryingFindClick(water);
					click(buttonamount);
					click(modal7);
					type ("9", enteramount);
					click(add);
					
				
					
					Drag(benchtube1);
					Move(benchtube2);
					Move(benchtube2);
					Drop(benchtube2);
					Waitfor(input);
					type("5", input2);
					click(butondone);
					
					
					
					
					click(Materiales);
					retryingFindClick(bluebromo);
					click(buttonamount);
					click(modal2);
					type ("3", enteramount);
					click(add);
					
					click(Materiales);
					retryingFindClick(bluebromo);
					click(buttonamount);
					click(modal1);
					type ("3", enteramount);
					click(add);
					
					click(Materiales);
					retryingFindClick(bluebromo);
					click(buttonamount);
					click(modal6);
					type ("3", enteramount);
					click(add);
					
					click(Instruments);
					click(phmeter);
					click(add);
					click(modal2);
					click(add);
					

					click(Instruments);
					retryingFindClick(phmeter);
					click(add);
					click(modal3);
					click(add);
					
					click(Instruments);
					retryingFindClick(phmeter);
					click(add);
					click(modal7);
					click(add);
					
					
			    }
	    
	 @Test
	public void CL13TestMeasurethepHofBases ()  {
			
		
			//URL
			visit("https://savi-cdn-dev.saplinglearning.com/hmlabsims/cl13/cl13-1.0.0/index.html");
			//Enter Laboratory
			click(enterlab);
			click(opcion1);
			click(opcion2);
			click(opcion3);
			click(skipanimation);
			//Experiments
			click(Containers);
			retryingFindClick(smalltesttube);
			click(add);
			click(tirarbench);
			click(add);
			
			click(Containers);
			retryingFindClick(smalltesttube);
			click(add);
			click(tirarbench);
			click(add);
			
			click(Containers);
			retryingFindClick(smalltesttube);
			click(add);
			click(tirarbench);
			click(add);
			
			click(Containers);
			retryingFindClick(smalltesttube);
			click(add);
			click(tirarbench);
			click(add);
			
			click(Containers);
			retryingFindClick(smalltesttube);
			click(add);
			click(tirarbench);
			click(add);
			
			click(Containers);
			retryingFindClick(smalltesttube);
			click(add);
			click(tirarbench);
			click(add);
			
			click(Containers);
			retryingFindClick(smalltesttube);
			click(add);
			click(tirarbench);
			click(add);
			
			
			//Material 1
			click(Materiales);
			retryingFindClick(sodiumhydorixide);
			click(buttonamount);
			click(modal1);
			type ("5", enteramount);
			click(add);
			
			
			//Material 1
					click(Materiales);
					retryingFindClick(water);
					click(buttonamount);
					click(modal1);
					type ("5", enteramount);
					click(add);
			
					//Material 1
					click(Materiales);
					retryingFindClick(water);
					click(buttonamount);
					click(modal2);
					type ("9", enteramount);
					click(add);
					
					//Material 1
					click(Materiales);
					retryingFindClick(water);
					click(buttonamount);
					click(modal7);
					type ("9", enteramount);
					click(add);
					
				
					
					Drag(benchtube1);
					Move(benchtube2);
					Move(benchtube2);
					Drop(benchtube2);
					Waitfor(input);
					type("5", input2);
					click(butondone);
					
					
					
					
					click(Materiales);
					retryingFindClick(bluebromo);
					click(buttonamount);
					click(modal2);
					type ("3", enteramount);
					click(add);
					
					click(Materiales);
					retryingFindClick(bluebromo);
					click(buttonamount);
					click(modal1);
					type ("3", enteramount);
					click(add);
					
					click(Materiales);
					retryingFindClick(bluebromo);
					click(buttonamount);
					click(modal6);
					type ("3", enteramount);
					click(add);
					
					click(Instruments);
					click(phmeter);
					click(add);
					click(modal2);
					click(add);
					

					click(Instruments);
					retryingFindClick(phmeter);
					click(add);
					click(modal3);
					click(add);
					
					click(Instruments);
					retryingFindClick(phmeter);
					click(add);
					click(modal7);
					click(add);
					
			    }
	@Test
	    
	public void CL13TestpHIndicators ()  {
		
		
		//URL
		visit("https://savi-cdn-dev.saplinglearning.com/hmlabsims/cl13/cl13-1.0.0/index.html");
		//Enter Laboratory
		click(enterlab);
		click(opcion1);
		click(opcion2);
		click(opcion3);
		click(skipanimation);
		//Experiments
		click(Containers);
		retryingFindClick(smalltesttube);
		click(add);
		click(tirarbench);
		click(add);
		
		click(Containers);
		retryingFindClick(smalltesttube);
		click(add);
		click(tirarbench);
		click(add);
		
		click(Containers);
		retryingFindClick(smalltesttube);
		click(add);
		click(tirarbench);
		click(add);
		
		click(Containers);
		retryingFindClick(smalltesttube);
		click(add);
		click(tirarbench);
		click(add);
		
		click(Containers);
		retryingFindClick(smalltesttube);
		click(add);
		click(tirarbench);
		click(add);
		
		click(Containers);
		retryingFindClick(smalltesttube);
		click(add);
		click(tirarbench);
		click(add);
		
		
		
		
		//Material 1
		click(Materiales);
		retryingFindClick(water);
		click(buttonamount);
		click(modal1);
		type ("10", enteramount);
		click(add);
		
		
		//Material 1
				click(Materiales);
				retryingFindClick(acetone);
				click(buttonamount);
				click(modal2);
				type ("10", enteramount);
				click(add);
		
				//Material 2
				click(Materiales);
				retryingFindClick(citricacid);
				click(buttonamount);
				click(modal3);
				type ("10", enteramount);
				click(add);
				
				//Material 3
				click(Materiales);
				retryingFindClick(vinegar);
				click(buttonamount);
				click(modal7);
				type ("10", enteramount);
				click(add);
				
				//Material 4
				click(Materiales);
				retryingFindClick(ammonia4);
				click(buttonamount);
				click(modal4);
				type ("10", enteramount);
				click(add);
			
				///////THIS WILL FAIL/////////

				click(Materiales);
				retryingFindClick(dilutedbleach);
				click(buttonamount);
				click(modal5);
				type ("100", enteramount);
				click(add);
				
						
				
				click(Instruments);
				click(phmeter);
				click(add);
				click(modal2);
				click(add);
				

				click(Instruments);
				retryingFindClick(phmeter);
				click(add);
				click(modal3);
				click(add);
				
				click(Instruments);
				retryingFindClick(phmeter);
				click(add);
				click(modal4);
				click(add);
				
				
				
		    }

	@Test
	public void CL13TestPhosphateBufferSystem ()  {
		
		
		//URL
		visit("https://savi-cdn-dev.saplinglearning.com/hmlabsims/cl13/cl13-1.0.0/index.html");
		//Enter Laboratory
		click(enterlab);
		click(opcion1);
		click(opcion2);
		click(opcion3);
		click(skipanimation);
		
		//Experiments START
		click(Containers);
		retryingFindClick(smalltesttube);
		click(add);
		click(tirarbench);
		click(add);
		
		click(Containers);
		retryingFindClick(smalltesttube);
		click(add);
		click(tirarbench);
		click(add);
		
		click(Containers);
		retryingFindClick(smalltesttube);
		click(add);
		click(tirarbench);
		click(add);
		
		click(Containers);
		retryingFindClick(smalltesttube);
		click(add);
		click(tirarbench);
		click(add);
		
		
		click(Containers);
		retryingFindClick(beaker50);
		click(add);
		click(tirarbench);
		click(add);
		
		
		
		//Material 1
		click(Materiales);
		retryingFindClick(water);
		click(buttonamount);
		click(modal1);
		type ("5", enteramount);
		click(add);
		
		
		//Material 1
				click(Materiales);
				retryingFindClick(sodiumhydrogen);
				click(buttonamount);
				click(modal2);
				type ("5", enteramount);
				click(add);
		
				//Material 2
				click(Materiales);
				retryingFindClick(sodiumdhydrogen);
				click(buttonamount);
				click(modal3);
				type ("5", enteramount);
				click(add);
				
				//Material 3
				click(Materiales);
				retryingFindClick(sodiumhydrogen);
				click(buttonamount);
				click(modal4);
				type ("10", enteramount);
				click(add);
				
				//Material 4
				click(Materiales);
				retryingFindClick(sodiumdhydrogen);
				click(buttonamount);
				click(modal2);
				type ("5", enteramount);
				click(add);
				
				
						
				//Material 5
				click(Materiales);
				retryingFindClick(hidrocloricacid05);
				click(buttonamount);
				click(modal5);
				type ("10", enteramount);
				click(add);
				
						
				
				click(Instruments);
				click(phmeter);
				click(add);
				click(modal2);
				click(add);
				

				click(Instruments);
				retryingFindClick(phmeter);
				click(add);
				click(modal3);
				click(add);
				
				click(Instruments);
				retryingFindClick(phmeter);
				click(add);
				click(modal2);
				click(add);
				
				
		    }
	@AfterTest
	public void teardown()
	{
		
		driver.close();
	
		
	}

	
	
		
	}


