package TestScripts;


import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Script1 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver","C:\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com");
        driver.close();
    	}   

	}
