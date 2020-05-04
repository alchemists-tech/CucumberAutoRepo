package com.basic.tagsSD;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

	@RunWith(Cucumber.class)
	@CucumberOptions(
			
			monochrome=true,
			//dryRun=true,
			//tags= {"@Important"},
			//tags= {"@Smoke"},
			//tags= {"@Smoke","@Regression"},
			tags= {"@Smoke,@Regression"},
			features= {"src/test/resources/com/basic/tagsFF/"},
			glue= {"com/basic/tagsSD/"},
			plugin={"pretty",
					"html:target/cucumber-htmlreport",
					"json:target/cucumber-report10.json",
					"com.cucumber.listener.ExtentCucumberFormatter:target/ExtentReport10.html"
					
			}
			
		)
	
		
	public class RunTagsTest {
	
}
