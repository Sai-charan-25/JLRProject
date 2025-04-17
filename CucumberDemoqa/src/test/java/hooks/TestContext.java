package hooks;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Wait;

import junit.framework.Assert;

//import io.github.bonigarcia.wdm.WebDriverManager;

public class TestContext {
	

	private static WebDriver driver;
	
//	public TestContext(WebDriver driver) throws InterruptedException
//	{
//		PageFactory.initElements(driver, this);
//		
////		WebDriverManager.chromedriver().setup();
////	    this.driver = new ChromeDriver();
//		System.setProperty("webdriver.chrome.driver", "E:\\cucumberJLR\\CucumberDemoqa\\src\\test\\java\\drivers\\chromedriver.exe");
//		driver = new ChromeDriver();
//		Thread.sleep(30);
//		driver.get("https://www.jlr.com/");
//	}
	
	
	public void SetstartBrowser() throws IOException, InterruptedException
	{
		
//		System.setProperty("webdriver.chrome.driver", "E:\\cucumberJLR\\CucumberDemoqa\\src\\test\\java\\drivers\\chromedriver.exe");
//		driver = new ChromeDriver();
//		Thread.sleep(2000);
//		driver.get("https://www.jlr.com/");
//		driver.manage().window().maximize();
		
		FileInputStream fs = new FileInputStream("E:\\cucumberJLR\\CucumberDemoqa\\src\\test\\resources\\input.Properties");
		Properties prop=new Properties();
		prop.load(fs);
		if(prop.getProperty("browser").equalsIgnoreCase("Chrome"))
		{
			System.setProperty("webdriver.chrome.driver","E:\\cucumberJLR\\CucumberDemoqa\\src\\test\\java\\drivers\\chromedriver.exe");
			this.driver = new ChromeDriver();
		}
		else if(prop.getProperty("browser").equalsIgnoreCase("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", "E:\\cucumberJLR\\CucumberDemoqa\\src\\test\\java\\drivers\\geckodriver.exe");
			this.driver = new  FirefoxDriver();
		}
		
		this.driver.get(prop.getProperty("URL"));
		driver.manage().window().maximize();
		String title = driver.getTitle();
		Assert.assertEquals(prop.getProperty("JLRTittle"), title);
		System.out.println("-----Step1_Pass----");
//		
//		
	}
	public static WebDriver getDriver()
	{
		return driver;
	}
	
	
	
	

}
