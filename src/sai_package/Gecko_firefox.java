package sai_package;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Gecko_firefox {
	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.gecko.driver","E:\\selinium\\selinium\\WebDrivers\\geckodriver.exe");
WebDriver driver=new FirefoxDriver();
WebDriverManager.firefoxdriver().setup();
System.setProperty("webdriver.edge.driver","E:\\selinium\\selinium\\WebDrivers\\msedgedriver.exe");
driver=new EdgeDriver();
WebDriverManager.edgedriver().setup();
System.setProperty("webdriver.chrome.driver","E:\\selinium\\selinium\\WebDrivers\\chromedriver.exe");
 driver=new ChromeDriver();
WebDriverManager.chromedriver().setup();
driver.get("https://www.google.com/");
//driver.wait(1000);
driver.close();
	}
}
