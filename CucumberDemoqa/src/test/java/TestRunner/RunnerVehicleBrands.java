package TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
//import cucumber.api.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features={"./src/test/resources/Features/VehicleBrandsRangeRover.feature"},
					glue={"StepDefinitions.Brands.RangeRover", "hooks"},
					plugin= {"pretty", "html: test-output"},
					strict = true
//					dryRun=false,
//					monochrome=false


)

public class RunnerVehicleBrands {

}
