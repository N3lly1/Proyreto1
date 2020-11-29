package MetodosSelenium;

import java.io.File;
import java.nio.file.Paths;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MetodosSelenium {


	public static void main(String[] args) throws InterruptedException {
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
		Thread.sleep(2000);
		password.sendKeys("admin123");
		Thread.sleep(2000);
		btnLogin.click();
		Thread.sleep(5000);
		
		
		//String
		String title = driver.getTitle();
		System.out.println("El titulo es: " + title);
		
		//validacion Homepage
		String urlDashboard = driver.getCurrentUrl();
		boolean loginCorrect = urlDashboard.contains("/dashboard");// metodo de java que verifica si un string contiene otro string
		
		
		
		if(loginCorrect) {
			System.out.println("Login correcto");
		}else {
			System.out.println("Login incorrecto");	
		
			
		}
		//metodos de navegacion
		
		driver.navigate().back();
		Thread.sleep(3000);
		driver.navigate().forward();
		Thread.sleep(3000);
		driver.navigate().refresh();
		Thread.sleep(3000);

		
		//cerrar navegador
		driver.close();
		driver.quit();

		
		

	

	}
	}
