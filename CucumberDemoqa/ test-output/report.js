$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/Features/VehicleBrandsRangeRover.feature");
formatter.feature({
  "name": "Verify the RangeRover Vehicle brands",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Check the RangeRover Vehicle Brands",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "User opens JLR application RangeRover",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinitions.Brands.RangeRover.RangeRoverBrands.User_opens_JLR_Application()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User Hover Brands and navigates to RangeRover",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinitions.Brands.RangeRover.RangeRoverBrands.User_HoverBrandsand_Navigates_toJaguar()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User go to Vehicles tab RangeRover",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinitions.Brands.RangeRover.RangeRoverBrands.User_goto_VehiclesTab()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Verify the RangeRover models",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitions.Brands.RangeRover.RangeRoverBrands.Verify_jaguar_models()"
});
formatter.result({
  "status": "passed"
});
});