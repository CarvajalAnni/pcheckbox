package co.com.prue.checkbox.runners;


import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/pruecheckbox.feature",
        glue = "co/com/prue/checkbox/stepdefinitions"
)
public class CheckBoxRunner {}
