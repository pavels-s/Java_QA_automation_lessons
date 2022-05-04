package lecture11.finalTask.steps;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions (plugin = "pretty",
        features = {"src\\test\\resources\\features"},
        glue = {"Lecture10\\steps"},
        tags = "@1aFinalTask"

)

public class TestRunner {


}
