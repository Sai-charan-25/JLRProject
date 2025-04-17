package WebPageModel.Home;

import org.openqa.selenium.WebDriver;

import SeleniumHandlings.SeleniumTools;
import WebPageModel.Home.dataSet;
import hooks.TestContext;

public class HomeActions {
	
	//TestContext testcontext;
	WebDriver driver;
//	
	public HomeActions(WebDriver app)
	{
		this.driver = app;
		//this.testcontext = context;
	}
	


	public void Brands() throws InterruptedException
	{
		
		SeleniumTools sh=new SeleniumTools();
		dataSet ds=new dataSet();
		Thread.sleep(2000);
		//sh.hoverMouse(this.driver, ds.brandsXpath);
		sh.click(ds.brandsXpath);
		
	}
	public void RangRover() throws InterruptedException
	{
		Thread.sleep(2000);
		SeleniumTools sh=new SeleniumTools();
		dataSet ds=new dataSet();
		sh.click(ds.RangeroverBrandXpath);
	}
	
	public void Jaguar() throws InterruptedException
	{
		SeleniumTools sh=new SeleniumTools();
		dataSet ds=new dataSet();
		sh.click(ds.JaguarBranXpath);
	}
	

}
