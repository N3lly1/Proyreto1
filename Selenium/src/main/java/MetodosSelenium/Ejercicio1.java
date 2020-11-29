package MetodosSelenium;

import java.io.File;
import java.nio.file.Paths;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Ejercicio1 {

	public static void main(String[] args)  throws InterruptedException {
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
		
		
		WebElement btnDirectory = driver.findElement(By.id("menu_directory_viewDirectory"));
		
		
		//interaccion con directorio
		btnDirectory.click();
		Thread.sleep(1000);
		
		WebElement nameToSearch = driver.findElement(By.id("searchDirectory_emp_name_empName"));
		//WebElement nameLocationDropdown = driver.findElement(By.id("searchDirectory_job_title"));
		nameToSearch.sendKeys("Nathan");
		
		
		//interactuar dropDown job title
		Select oSelect = new Select(driver.findElement(By.id("searchDirectory_job_title")));
		oSelect.selectByVisibleText("Sales Representative");
		
		//interaccion del DropDawn location
		Select locationSelect = new Select(driver.findElement(By.id("searchDirectory_location")));
		locationSelect.selectByIndex(3);

		WebElement btnSearch = driver.findElement(By.id("searchBtn"));
		Thread.sleep(1000);
		btnSearch.click();
		
		// Búsqueda por Xpath 
		WebElement searchResult = driver.findElement(By.xpath("//*[@id=\"resultTable\"]/tbody/tr[2]/td[2]/ul/li[1]/b"));
		if (searchResult.getText().contains("Nathan")) {//if comparar el nombre
			System.out.println("Men encontrado");
			
			
			
		}	
		
		WebElement searchResult1 = driver.findElement(By.xpath("//*[@id=\"resultTable\"]/tbody/tr[2]/td[2]/ul/li[2]"));
		if (searchResult1.getText().contains("Representative"));
		System.out.println("Job title encontrado");
		
		
		WebElement searchResult2 = driver.findElement(By.xpath("//*[@id=\"resultTable\"]/tbody/tr[2]/td[2]/ul/li[2]"));
		if (searchResult2.getText().equals("Sales Representative"));
		System.out.println("Job title encontrado");
		
	}

}
