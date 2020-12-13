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

public class Chemestry12 extends base {
	public WebDriver driver;
	JavascriptExecutor js;

	 public static Logger log =LogManager.getLogger(base.class.getName());
	 
	
	 
	 //ALL LABS LOCATORS
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
				
		//OTHRES CROSS
				
		By add=By.cssSelector("#savi-hmlabsims-modal > div:nth-child(3) > div > div > div > section.modal__buttons-container.large > button.button.primary.large");
		By tirarbench= By.cssSelector("#savi-hmlabsims-modal > div:nth-child(3) > div > div > div > section.modal__content.large > div:nth-child(1) > div.lab-interactions-wizard-content-targets-list > div > label > input");
		By enteramount=By.cssSelector("#savi-hmlabsims-modal > div:nth-child(3) > div > div > div > section.modal__content.large > div:nth-child(1) > input");
		By buttonamount=By.cssSelector("#savi-hmlabsims-modal > div:nth-child(3) > div > div > div > section.modal__buttons-container.large > button.button.primary.large");
		By sink=By.className("Sink");
		By waste=By.className("WasteBin-container");
		By input=By.className("lab-simulation-bodyText");
		By input2=By.className("lab-simulation-inputField");	 
		By butondone=By.xpath("(//button[@type='button'])[18]");

			//MATERIALS
		
		By cooper1=By.cssSelector(".lab-interactions-wizard-content-item:nth-child(5)");
		By cooper2=By.xpath("//div[@id='savi-hmlabsims-modal']/div[3]/div/div/div/section/div/div[2]/div[2]/label/input)");

	
	By water1=By.cssSelector("#savi-hmlabsims-modal > div:nth-child(3) > div > div > div > section.modal__content.large > div:nth-child(1) > div > button:nth-child(1)");
	By elodea=By.xpath("/html/body/div[2]/div[3]/div/div/div/section[1]/div[1]/div/button[4]");
	By spectrophotometer=By.cssSelector("#savi-hmlabsims-modal > div:nth-child(3) > div > div > div > section.modal__content.large > div:nth-child(1) > div > button");

	//CONTAINERS

	By beaker400ml=By.cssSelector("#savi-hmlabsims-modal > div:nth-child(3) > div > div > div > section.modal__content.large > div:nth-child(1) > div > button:nth-child(1)");
	By beaker250ml=By.cssSelector("#savi-hmlabsims-modal > div:nth-child(3) > div > div > div > section.modal__content.large > div:nth-child(1) > div > button:nth-child(2)");
	By beaker50ml=By.cssSelector("#savi-hmlabsims-modal > div:nth-child(3) > div > div > div > section.modal__content.large > div:nth-child(1) > div > button.lab-interactions-wizard-content-item.selected");
	By volumetricflask50ml=By.cssSelector("#savi-hmlabsims-modal > div:nth-child(3) > div > div > div > section.modal__content.large > div:nth-child(1) > div > button:nth-child(4)");
	By volumetricflask100ml=By.cssSelector("#savi-hmlabsims-modal > div:nth-child(3) > div > div > div > section.modal__content.large > div:nth-child(1) > div > button:nth-child(5)");
	By graduatedcylinder50ml=By.cssSelector("#savi-hmlabsims-modal > div:nth-child(3) > div > div > div > section.modal__content.large > div:nth-child(1) > div > button.lab-interactions-wizard-content-item.selected");
	By graduatedcylinder10ml=By.cssSelector("#savi-hmlabsims-modal > div:nth-child(3) > div > div > div > section.modal__content.large > div:nth-child(1) > div > button.lab-interactions-wizard-content-item.selected");
	By smalltesttube=By.cssSelector("#savi-hmlabsims-modal > div:nth-child(3) > div > div > div > section.modal__content.large > div:nth-child(1) > div > button.lab-interactions-wizard-content-item.selected");
	By largetesttube=By.cssSelector("#savi-hmlabsims-modal > div:nth-child(3) > div > div > div > section.modal__content.large > div:nth-child(1) > div > button.lab-interactions-wizard-content-item.selected");
	By cuvette2=By.cssSelector("#savi-hmlabsims-modal > div:nth-child(3) > div > div > div > section.modal__content.large > div:nth-child(1) > div > button.lab-interactions-wizard-content-item.selected");
	By cuvette=By.xpath("/html/body/div[2]/div[3]/div/div/div/section[1]/div[1]/div/button[10]");

	//Intruments
	
	        By water=By.xpath("/html/body/div[2]/div[3]/div/div/div/section[1]/div[1]/div/button[1]");
		    By nitricacid1M=By.xpath("/html/body/div[2]/div[3]/div/div/div/section[1]/div[1]/div/button[2]");
			By coppersulfate0060M=By.xpath("/html/body/div[2]/div[3]/div/div/div/section[1]/div[1]/div/button[3");
			By cobaltchloride0025M=By.xpath("/html/body/div[2]/div[3]/div/div/div/section[1]/div[1]/div/button[4]");
			By coppersolution1=By.cssSelector("#savi-hmlabsims-modal > div:nth-child(3) > div > div > div > section.modal__content.large > div:nth-child(1) > div > button.lab-interactions-wizard-content-item.selected");
			By coppersolution2=By.xpath("/html/body/div[2]/div[3]/div/div/div/section[1]/div[1]/div/button[6]");
			By orangedrinkpowder=By.xpath("/html/body/div[2]/div[3]/div/div/div/section[1]/div[1]/div/button[7]");
			By yellow5dyestock0020mM=By.cssSelector("#savi-hmlabsims-modal > div:nth-child(3) > div > div > div > section.modal__content.large > div:nth-child(1) > div > button.lab-interactions-wizard-content-item.selected");
			By red40dyestock0020mM=By.cssSelector("#savi-hmlabsims-modal > div:nth-child(3) > div > div > div > section.modal__content.large > div:nth-child(1) > div > button:nth-child(9)");
			By blue1dyestock0020mM=By.xpath("/html/body/div[2]/div[3]/div/div/div/section[1]/div[1]/div/button[10]");

			By MaterialsCont=By.cssSelector("first-content-container");



			 @BeforeTest
				public void initialize() throws IOException
				{

					 driver =initializeDriver();
					 log.info("Driver is initialized");
						
					driver.get(prop.getProperty("url2"));
					log.info("Navigated to Home page");
				}
			 
			 @Test
				
				public void CL12TestMeasurethepHofAcids ()  {
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
					visit("https://savi-cdn-dev.saplinglearning.com/hmlabsims/cl12/cl12-1.0.1/index.html");
					//Enter Laboratory
					click(enterlab);
					click(opcion1);
					click(opcion2);
					click(opcion3);
					click(skipanimation);
					//Experiments
					click(Containers);
					retryingFindClick(cuvette);
					click(add);
					click(tirarbench);
					click(add);
					
					click(Containers);
					retryingFindClick(cuvette);
					click(add);
					click(tirarbench);
					click(add);
					
					click(Containers);
					retryingFindClick(cuvette);
					click(add);
					click(tirarbench);
					click(add);
					
				
					
					//Material 1
					click(Materiales);
					retryingFindClick(cooper1);
					click(buttonamount);
					click(modal1);
					type ("3", enteramount);
					click(add);
					
					
					//Material 1
							click(Materiales);
							retryingFindClick(cooper2);
							click(buttonamount);
							click(modal2);
							type ("3", enteramount);
							click(add);
					
							//Material 1
							click(Materiales);
							retryingFindClick(water);
							click(buttonamount);
							click(modal3);
							type ("3", enteramount);
							click(add);
																		
							
							click(Instruments);
							click(spectrophotometer);
							click(add);
							click(modal2);
							click(add);
							

							//Materials
							 System.out.println("**********************Chemestry12 - Demo Ana*********************************************");  

							  getText(MaterialsCont);
							    System.out.println("CL2 Materials: " +MaterialsCont);
							    System.out.println("*******************************************************************");  
							//Experiments
							
			    }
			 
			 
			 
			 @Test
				
				public void CL12CU2concentrationSolution ()  {
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
					visit("https://savi-cdn-dev.saplinglearning.com/hmlabsims/cl12/cl12-1.0.1/index.html");
					//Enter Laboratory
					click(enterlab);
					click(opcion1);
					click(opcion2);
					click(opcion3);
					click(skipanimation);
					//Experiments
					click(Containers);
					retryingFindClick(cuvette);
					click(add);
					click(tirarbench);
					click(add);
					
					click(Containers);
					retryingFindClick(cuvette);
					click(add);
					click(tirarbench);
					click(add);
					
					click(Containers);
					retryingFindClick(cuvette);
					click(add);
					click(tirarbench);
					click(add);
					
				
					
					//Material 1
					click(Materiales);
					retryingFindClick(water);
					click(buttonamount);
					click(modal1);
					type ("3", enteramount);
					click(add);
					
					
					//Material 1
							click(Materiales);
							retryingFindClick(water);
							click(buttonamount);
							click(modal2);
							type ("3", enteramount);
							click(add);
					
							//Material 1
							click(Materiales);
							retryingFindClick(cobaltchloride0025M);
							click(buttonamount);
							click(modal3);
							type ("3", enteramount);
							click(add);
																		
							
							click(Instruments);
							click(spectrophotometer);
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

