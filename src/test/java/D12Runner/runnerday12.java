package D12Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "C:\\Users\\tharini.murugesan\\eclipse-workspace\\D12\\src\\test\\resources\\Features\\D12.feature",
		glue={"D12Exe"},
	    tags ="@D12",
		dryRun=false,		
		plugin= {"pretty"},
        monochrome = true
		
		
		)
public class runnerday12 {

}
