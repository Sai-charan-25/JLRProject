package WebPageModel.Home;

import org.openqa.selenium.WebDriver;

import hooks.TestContext;

public class dataSet extends TestContext{
	
//	public dataSet(WebDriver driver) throws InterruptedException {
//		super(driver);
//		// TODO Auto-generated constructor stub
//	}
	
	public String brandsXpath="(//div[@class='nav-2024__item-wrap nav-2024__item-wrap--left']/div/following-sibling::div[@class='tw-relative tw-h-full js-nav-item']/descendant::div/div[@class='nav-2024__item'])[1]";
	public String CompanyXpath="//div[.='Company']";
	public String RangeroverBrandXpath="//div[@class='nav-2024__dropdown-wrap']//a[.='Range Rover']";
	public String JaguarBranXpath="//div[@class='nav-2024__dropdown-wrap']//a[.='Jaguar']";
	

}
