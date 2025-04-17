package StepDefinitions.Brands.RangeRover;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;


import org.openqa.selenium.WebDriver;

import SeleniumHandlings.SeleniumTools;
import WebPageModel.Home.HomeActions;
import WebPageModel.Home.RangeRover.RangeRoverActions;
import hooks.TestContext;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;


public class RangeRoverBrands {
	

private WebDriver driver;
//	WebDriver driver;
//	TestContext testcontext;
//	public RangeRoverBrands(WebDriver app, TestContext context)
//	{
//		this.testcontext = context;
//		this.driver = app;
//		
//	}
	
	public RangeRoverBrands(TestContext context) {
        this.driver = context.getDriver();
    }
	
	@Given("User opens JLR application RangeRover")
	public void User_opens_JLR_Application() throws IOException, InterruptedException
	{
		
		
		TestContext tc = new TestContext();
		tc.SetstartBrowser();
		
		
	}
	@When("User Hover Brands and navigates to RangeRover")
	public void User_HoverBrandsand_Navigates_toJaguar() throws InterruptedException
	{
		HomeActions ha = new HomeActions(this.driver);
		Thread.sleep(3000);
		ha.Brands();
	}
	@When("User go to Vehicles tab RangeRover")
	public void User_goto_VehiclesTab() throws InterruptedException, IOException
	{
		HomeActions ha = new HomeActions(this.driver);
		ha.RangRover();
		System.out.println(driver.getTitle());
	}
	@Then("Verify the RangeRover models")
	public void Verify_jaguar_models() throws InterruptedException
	{
		RangeRoverActions ra = new RangeRoverActions();
		ra.getvehicleDetails();
	}

}
