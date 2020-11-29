package MetodosSelenium;

import java.io.File;
import java.nio.file.Paths;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MetodosSelenium2 {

	public static void main(String[] args)   throws InterruptedException  {
		System.out.println("Test1");
		String exePath =  Paths.get("").toAbsolutePath().toString() + File.separator + "drivers" + File.separator;
		System.setProperty("webdriver.chrome.driver",exePath + "chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		
		WebElement userName = driver.findElement(By.id("txtUsername"));
		WebElement password = driver.findElement(By.id("txtPassword"));
		WebElement btnLogin = driver.findElement(By.id("btnLogin"));
		
//login
		userName.sendKeys("Admin");
		Thread.sleep(1000);
		password.sendKeys("admin123");
		Thread.sleep(1000);
		btnLogin.click();
		Thread.sleep(3000);
		
		//click en asigne leave
		WebElement assignleve = driver.findElement(By.className("quickLinkText"));
		assignleve.click();
		Thread.sleep(3000);
		
		//llenar el texto employeeName
		WebElement employeeName  = driver.findElement(By.name("assignleave[txtEmployee][empName]"));
		employeeName.sendKeys("nelly salas");
		Thread.sleep(3000);
		employeeName.clear();
		
		//verificar elementos desplegando en pagina
		boolean assignBtn = driver.findElement(By.id("assignBtn")).isDisplayed();
	
		if(assignBtn) {
			System.out.println("El boton assign esta desplegado");
		}
		
		String welcomeMsj = driver.findElement(By.id("welcome")).getText();
		System.out.println(welcomeMsj);
		boolean userMsj = welcomeMsj.contains("Paul");
		if(userMsj) {
			
			System.out.println("El mensaje de welcome contiene el nombre de Paul");
		}else{
			
			System.out.println("El mensaje no contgiene el nombre de Paul");	
			
			
		}
		
			//interactuar con dropdown
			Select oSelect = new Select(driver.findElement(By.id("assignleave_txtLeaveType")));
			oSelect.selectByVisibleText("US - FMLA");
			Thread.sleep(3000);
			
			//CERARR el navegador
			driver.quit();
			
			
			
			
			
				
		
	
		
			
		}
		
		
	}


