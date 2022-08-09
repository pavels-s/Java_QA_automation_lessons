package lecture10.task2_cinema;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions (plugin = "pretty",
        features = {"src\\test\\resources\\Features"},
        glue = {"Lecture10\\Task2_Cinema\\Steps"},
        tags = "@Cinema"

)
public class TestRunner {
}
