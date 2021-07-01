package sai_package;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sai_1st {
public void sai() {
	System.out.println("this");
}
	public static void main(String[] args) {
	
		// TODO Auto-generated method stub

System.setProperty("webdriver.chrome.driver","C:\\Users\\sai\\Downloads\\chromedriver_win32\\chromedriver.exe");
WebDriver driver= new ChromeDriver();
WebDriverManager.chromedriver().setup();
	driver.get("https://www.google.com/?gws_rd=ssl");

	}

}
