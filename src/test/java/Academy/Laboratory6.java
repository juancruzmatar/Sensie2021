package Academy;

import static org.junit.Assert.assertEquals;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.Assert;


import pageObjects.AllMethods;
import pageObjects.Methods;
import resources.base;

public class Laboratory6 extends base{
	  JavascriptExecutor js;



	  /////FULL BREAKPOINT/////

	  By waterfull=By.xpath("/html/body/div[1]/div/div[2]/div[3]/div[3]/div[3]/div[1]/div/div[2]/div[1]/div/div/div[1]/div[3]/div/div[1]/div[8]/div[2]");
	  By cristalvioletfull=By.xpath("/html/body/div[1]/div/div[2]/div[3]/div[3]/div[3]/div[1]/div/div[2]/div[1]/div/div/div[1]/div[3]/div/div[1]/div[2]");

	  By beakerfull=By.xpath("/html/body/div[1]/div/div[2]/div[3]/div[3]/div[3]/div[1]/div/div[2]/div[1]/div/div/div[1]/div[7]/div/div[1]/div[3]");

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
	By module= By.xpath("/html/body/div[1]/div/div[2]/div[3]/table/tbody/tr/td[2]/div/table/tbody/tr[3]/td[2]/ul/li[5]/a");
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
	By stainingpan=By.xpath("/html/body/div[2]/div[3]/div/div/div/section[1]/div[1]/div/button[5]/div[1]/div");
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
	By premodule=By.xpath("/html/body/div[1]/div/div[2]/div[3]/table/tbody/tr/td[2]/div/table/tbody/tr[3]/td[2]/ul/li[4]/a/span");
	By StainingBench=By.xpath("/html/body/div[1]/div/div[2]/div[3]/div[3]/div[3]/div[1]/div/div[2]/div[1]/div/div/div[2]/div/div[3]/div/div[3]/div[2]/div[2]/div");
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
	By auresbench=By.xpath("/html/body/div[1]/div/div[2]/div[3]/div[3]/div[3]/div[1]/div/div[2]/div[1]/div/div/div[2]/div/div[3]/div/div[5]/div[2]/div[2]");
	By nicrodosbench=By.xpath("/html/body/div[1]/div/div[2]/div[3]/div[3]/div[3]/div[1]/div/div[2]/div[1]/div/div/div[2]/div/div[3]/div/div[5]");

	By smalltubebench1=By.xpath("/html/body/div[1]/div/div[2]/div[3]/div[3]/div[3]/div[1]/div/div[2]/div[1]/div/div/div[2]/div/div[3]/div/div[6]/div[2]/div[2]/div/div/div/div/div[1]");
	By smalltubebench2=By.xpath("/html/body/div[1]/div/div[2]/div[3]/div[3]/div[3]/div[1]/div/div[2]/div[1]/div/div/div[2]/div/div[3]/div/div[2]/div[2]/div[2]/div/div/div/div/div[1]");
	By smalltubebench3=By.xpath("/html/body/div[1]/div/div[2]/div[3]/div[3]/div[3]/div[1]/div/div[2]/div[1]/div/div/div[2]/div/div[3]/div/div[3]/div[2]/div[2]/div/div/div/div/div[1]");
	By benchphmeter2=By.xpath("/html/body/div[1]/div/div[2]/div[3]/div[3]/div[3]/div[1]/div/div[2]/div[1]/div/div/div[2]/div/div[3]/div/div[7]/div[2]/div[2]");

 	By beakerbench=By.xpath("/html/body/div[1]/div/div[2]/div[3]/div[3]/div[3]/div[1]/div/div[2]/div[1]/div/div/div[2]/div/div[3]/div/div[7]/div[2]/div[2]");
	By slidebench=By.xpath("/html/body/div[1]/div/div[2]/div[3]/div[3]/div[3]/div[1]/div/div[2]/div[1]/div/div/div[2]/div/div[3]/div/div[3]/div[2]/div[2]/div[2]/div[2]/div[2]/div/div");
	By nicrosbench2=By.xpath("/html/body/div[1]/div/div[2]/div[3]/div[3]/div[3]/div[1]/div/div[2]/div[1]/div/div/div[2]/div/div[3]/div/div[5]/div[2]/div[2]/div/div[2]");
 
 //////Full Breakpoint
 	By beaker=By.xpath("/html/body/div[1]/div/div[2]/div[3]/div[3]/div[3]/div[1]/div/div[2]/div[1]/div/div/div[2]/div/div[3]/div/div[3]/div[2]/div[2]");
	By burnerbench2=By.xpath("/html/body/div[1]/div/div[2]/div[3]/div[3]/div[3]/div[1]/div/div[2]/div[1]/div/div/div[2]/div/div[3]/div/div[4]/div[2]/div[2]/div[1]");
	By nicrosafter=By.xpath("/html/body/div[1]/div/div[2]/div[3]/div[3]/div[3]/div[1]/div/div[2]/div[1]/div/div/div[2]/div/div[3]/div/div[5]/div[2]/div[2]/div/div[1]");
	By cancelbutton=By.xpath("/html/body/div[2]/div[3]/div/div/div/section[2]/button[1]");


	 public static Logger log =LogManager.getLogger(base.class.getName());
	@BeforeTest
	public void initializebl6() throws IOException {
	
		driver =initializeDriver();
		
		driver.get(prop.getProperty("url2"));
	}
	
	@Test
	public void ABL6SmokeTest ()  throws IOException{
	
		Methods m=new Methods(driver);

		//Entorno	
		visit("https://www.saplinglearning.com/ibiscms/course/view.php?id=92967");

		type ("savispark", userLocator);
		type ("savispark", passLocator);
		click (submitButtomSaping);
		retryingFindClick (premodule);
		//URL
		visit("https://savi-cdn-dev.saplinglearning.com/hmlabsims/bl6/bl6-1.0.2/index.html");
		//Enter Laboratory
		click(enterlab);
		click(opcion1);
		click(opcion2);
		click(opcion3);
		click(skipanimation);

		
		//Experiments
		click(Instruments);
		click(stainingpan);
		click(add);
		click(tirarbench);
		click(add);
		click(Instruments);
		click(microscope);
		click(add);
		click(tirarbench);
		click(add);
		click(Containers);
		click(aureus);
		click(add);
		click(tirarbench);
		click(add);
		click(Instruments);
		click(bunsenburner);
		click(add);
		click(tirarbench);
		click(add);
		click(Containers);
		click(nichromewirerod);
		click(add);
		click(tirarbench);
		click(add);

		//Material 1
		click(burner1);
		click(burner1);


		Drag(nicrobench);
		Move(burnerbench);
		Drop(burnerbench);


		
																
					
		log.info("Biology Lab 6 1.0.2");
		System.out.println("Smoke Test completed - V.1.0.2 BL6");
}
	
@Test
//Cambie a CL12 para validacion de materiales contenedores e instrumentos.
	public void BL6Validate() throws IOException
	{
	//URL
		visit("https://savi-cdn-dev.saplinglearning.com/hmlabsims/bl6/bl6-1.0.2/index.html");
		//Enter Laboratory
		click(enterlab);
		click(opcion1);
		click(opcion2);
		click(opcion3);
		click(skipanimation);
		//Experiments
	    driver.findElement(By.xpath("(//button[@type='button'])[7]")).click();
	    System.out.println("**********************BIOLOGY 6*********************************************");  

	    String materiales = driver.findElement(By.xpath("//div[@id='savi-hmlabsims-modal']/div[3]/div/div/div/section")).getText();
	    assertEquals(materiales, driver.findElement(By.xpath("//div[@id='savi-hmlabsims-modal']/div[3]/div/div/div/section")).getText());
	    System.out.println("Lab BL6 Materials: " +materiales);
		System.out.println("*******************************************************************");  

		click(cancelbutton);
		
		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[3]/div[3]/div[3]/div[1]/div/div[2]/div[1]/div/div/ul/li[2]/div/button")).click();
		System.out.println("**********************BIOLOGY 6 - Containers*********************************************");  

		String containers = driver.findElement(By.xpath("/html/body/div[2]/div[3]/div/div/div/section[1]/div[1]/div")).getText();
	    assertEquals(containers, driver.findElement(By.xpath("//div[@id='savi-hmlabsims-modal']/div[3]/div/div/div/section")).getText());
	    System.out.println("Lab BL6 Containers: " +containers);
		System.out.println("*******************************************************************");  
		
		click(cancelbutton);
		
		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[3]/div[3]/div[3]/div[1]/div/div[2]/div[1]/div/div/ul/li[3]/div/button")).click();
		System.out.println("**********************BIOLOGY 6 - Instruments*********************************************");  

		String Instruments = driver.findElement(By.xpath("/html/body/div[2]/div[3]/div/div/div/section[1]/div[1]/div")).getText();
	    assertEquals(Instruments, driver.findElement(By.xpath("/html/body/div[2]/div[3]/div/div/div/section[1]/div[1]/div")).getText());
	    System.out.println("Lab BL6 Instruments: " +Instruments);
	    System.out.println("*******************************************************************");  
	}

	@Test
	public void BL6StainingTest2() throws IOException
	{
	
		//URL
		visit("https://savi-cdn-dev.saplinglearning.com/hmlabsims/bl6/bl6-1.0.2/index.html");
		//Enter Laboratory
		click(enterlab);
		click(opcion1);
		click(opcion2);
		click(opcion3);
		click(skipanimation);
		//Experiments
		click(Instruments);
		click(stainingpan);
		click(add);
		click(tirarbench);
		click(add);
		click(Containers);
		click(microscopeslide);
		click(add);
		click(modal2);
		click(add);
		click(Containers);
		click(aureus);
		click(add);
		click(tirarbench);
		click(add);
		click(Instruments);
		click(bunsenburner);
		click(add);
		click(tirarbench);
		click(add);
		click(Containers);
		click(nichromewirerod);
		click(add);
		click(tirarbench);
		click(add);

		// Burner Burn
		click(burner1);
		click(burner1);

		Drag(nicrosbench2);
		Move(burnerbench2);
		Drop(burnerbench2);

			//Experiments
			click(Containers);
			retryingFindClick(beaker250ml);
			click(add);
			click(tirarbench);
			click(add);
			
			click(Containers);
			retryingFindClick(beaker250ml);
			click(add);
			click(tirarbench);
			click(add);
			
			click(Containers);
			retryingFindClick(beaker250ml);
			click(add);
			click(tirarbench);
			click(add);
			
		
			
			//Material 1
			click(Materiales);
			retryingFindClick(brilliantgreen);
			click(buttonamount);
			click(modal5);
			type ("3000", enteramount);
			click(add);
			
			
			//Material 1
					click(Materiales);
					retryingFindClick(congored);
					click(buttonamount);
					click(modal2);
					type ("5000", enteramount);
					click(add);
			
					//Material 1
					click(Materiales);
					retryingFindClick(water);
					click(buttonamount);
					click(modal6);
					type ("60", enteramount);
					click(add);

					// Burner Burn
			click(burner1);
			click(burner1);

			Drag(beakerbench);
			Move(burnerbench2);
			Drop(burnerbench2);

			pause(1000);
					

	//	Drag(nicrosbench2);
	//	Moveforce(auresbench);
	//	Dropforce(auresbench);

	//	Drag(nicrosbench2);
	//	Move(slidebench);
	//	Drop(slidebench);

	log.info("Biology Lab 6 1.0.2");
	System.out.println("Test completed - V.1.0.2 BL6");
}

@Test
public void BL6ZunsenBurn() throws IOException
{

	//URL
	visit("https://savi-cdn-dev.saplinglearning.com/hmlabsims/bl6/bl6-1.0.2/index.html");
	//Enter Laboratory
	click(enterlab);
	click(opcion1);
	click(opcion2);
	click(opcion3);
	click(skipanimation);
	//Experiments
	click(Instruments);
	click(bunsenburner);
	click(add);
	click(tirarbench);
	click(add);
	click(Containers);
	click(bunsenburner);
	click(add);
	click(tirarbench);
	click(add);

	// Burner Burn
	retryingFindClick(burner1);
	retryingFindClick(burner1);
	retryingFindClick(burner1);

	click(Containers);
	click(bunsenburner);
	click(add);
	click(tirarbench);
	click(add);


	pause(10000);
				

//	Drag(nicrosbench2);
//	Moveforce(auresbench);
//	Dropforce(auresbench);

//	Drag(nicrosbench2);
//	Move(slidebench);
//	Drop(slidebench);

log.info("Biology Lab 6 1.0.2");
System.out.println("Test completed - V.1.0.2 BL6");
}
		   


@Test
public void Aaresize() throws IOException
{

	//URL
	visit("https://savi-cdn-dev.saplinglearning.com/hmlabsims/bl6/bl6-1.0.2/index.html");
    resizeBrowser();
	//Enter Laboratory
	click(enterlab);
	click(opcion1);
	click(opcion2);
	click(opcion3);
	click(skipanimation);
	//Experiments
	click(Instruments);
	click(bunsenburner);
	click(add);
	click(tirarbench);
	click(add);
	click(Containers);
	click(bunsenburner);
	click(add);
	click(tirarbench);
	click(add);

	// Burner Burn
	retryingFindClick(burner1);
	retryingFindClick(burner1);
	retryingFindClick(burner1);

	click(Containers);
	click(bunsenburner);
	click(add);
	click(tirarbench);
	click(add);


	pause(10000);
				

//	Drag(nicrosbench2);
//	Moveforce(auresbench);
//	Dropforce(auresbench);

//	Drag(nicrosbench2);
//	Move(slidebench);
//	Drop(slidebench);

log.info("Biology Lab 6 1.0.2");
System.out.println("Test completed - V.1.0.2 BL6");
}
@AfterTest
public void teardown()




{
	
	//driver.close();

	
}
}

