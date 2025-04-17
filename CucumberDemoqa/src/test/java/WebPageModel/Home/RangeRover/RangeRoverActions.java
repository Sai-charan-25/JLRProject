package WebPageModel.Home.RangeRover;

import SeleniumHandlings.SeleniumTools;


public class RangeRoverActions {

	public void getvehicleDetails() throws InterruptedException
	{
		Thread.sleep(2000);
		SeleniumTools sh =new SeleniumTools();
		DataSet ds = new DataSet();
		Thread.sleep(3000);
		sh.click(ds.VehiclesTabXpath);
		sh.getElementsText(ds.VehicleDetails);
	}
}
