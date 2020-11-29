package MetodosSelenium;

import java.io.File;
import java.nio.file.Paths;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FineElements {

	private static List<WebElement> firstLevelMenu;

	@SuppressWarnings("unused")
	public static void main(String[] args) throws InterruptedException  {
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
		
		//FinElements
		List<WebElement> firstLevelMenu = driver.findElements(By.className("firstLevelMenu"));
		System.out.println("Numero de elementos" + firstLevelMenu.size());
		WebElement primerMenu = firstLevelMenu.get(0);
		System.out.println(primerMenu);
		String segundoMenu = firstLevelMenu.get(1).getText();
		System.out.println(segundoMenu);
		
		for (int i=0;  i<firstLevelMenu.size(); i++) {
			System.out.println("los menu son;" + firstLevelMenu.get(i).getText());
			
		}
		
		
		
	}

}

