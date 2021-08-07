package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions( 	features ="C:\\Users\\User\\Desktop\\eclipse\\BDDPOMOctBatch\\src\\main\\java\\features",
					glue = "step_definition",
					plugin = {"pretty", "html:target/HTML/reportHtml.html", "json:target/JSON/reportJson"},
					monochrome = true,
//					tags = "@Regression and @EndToEnd" // scenario with both tags
//					tags = "@Smoke and not @Regression" // scenario with 1st tags not the 2nd one
					tags = "@Smoke or @Regression or @EndToEnd" // scenario with any of these tags
					
		)
public class Runner {
}
//	tags = "@Regression