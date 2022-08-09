package lecture10;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions (plugin = "pretty",
        features = {"src\\test\\resources\\features\\1a"},
        glue = {"Lecture11\\finalTask\\steps"},
        tags = "@SSlv"

)

public class TestRunner {


}
