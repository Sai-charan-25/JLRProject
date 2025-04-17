package SeleniumHandlings;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.junit.rules.Timeout;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import hooks.TestContext;

public class SeleniumTools extends TestContext{
	
//public SeleniumTools() throws InterruptedException {
//		super(getDriver());
//		// TODO Auto-generated constructor stub
//	}
	 
	//private WebDriver driver;
	
	public void click(String Xpath)
	{
		waitfortheElementTobeVisible(Xpath);
		getDriver().findElement(By.xpath(Xpath)).click();
		
	}
	public void hoverMouse(WebDriver driver, String Xpath) throws InterruptedException
	{
		
		Actions ac = new Actions(getDriver());
		waitfortheElementTobeVisible(Xpath);
		Thread.sleep(3000);
		ac.moveToElement(getDriver().findElement(By.xpath(Xpath))).perform(); 
		
	}
	public void waitfortheElementTobeVisible(String Xpath)
	{
		
		getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		WebDriverWait ww=new WebDriverWait(getDriver(),10);
//		ww.until(ExpectedConditions.visibilityOf(getDriver().findElement(By.xpath(Xpath))));
		
	}
	public void getElementsText(String Xpath)
	{
		String elename="";
		List<WebElement> elemnts =  getDriver().findElements(By.xpath(Xpath));
		for(WebElement ele:elemnts)
		{
			System.out.println(ele.getText());
					}
		//return elename;
	}
	public String propertyValues(String propname) throws IOException
	{
		FileInputStream flib = new FileInputStream("E:\\cucumberJLR\\CucumberDemoqa\\src\\test\\resources\\input.Properties");
		Properties prop = new Properties();
		prop.load(flib);
		return prop.getProperty(propname);
		
		
	}
	
	
}
