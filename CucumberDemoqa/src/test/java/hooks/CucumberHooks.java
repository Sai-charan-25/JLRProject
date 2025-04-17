package hooks;

import java.io.IOException;

import org.junit.Before;



public class CucumberHooks {
	
	
	public TestContext testcontext;
	
	public CucumberHooks(TestContext context)
	{
		this.testcontext = context;
	}
	
	@Before
	public void beforeScenario() throws IOException, InterruptedException
	{
		
		//this.testcontext.SetstartBrowser();
		
	}
	
}
