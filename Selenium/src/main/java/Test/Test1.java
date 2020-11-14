package Test;

import java.io.File;
import java.nio.file.Paths;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {

	public static void main(String[] args) {
		System.out.println("Test1");
		String exePath =  Paths.get("").toAbsolutePath().toString() + File.separator + "drivers" + File.separator;
		System.setProperty("webdriver.chrome.driver",exePath + "chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.cooltesters.com//");

	}

}
