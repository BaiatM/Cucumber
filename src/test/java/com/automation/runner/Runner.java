package com.automation.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        //if we want to execute only one cucumber files then we can put that class's path
        //if the package then package's path for feature
        //"features =" is to locate cucumber files
        //"glue =" is used to connect the methods for scenarios
        //tags used to "group" some particular scenarios such as we do for Smoke Test
        //tags also may contain more than 1 group

        features = "src/test/resources/features",
        glue = "com.automation.steps",
        tags = "@Baiat"

)

public class Runner {

}
