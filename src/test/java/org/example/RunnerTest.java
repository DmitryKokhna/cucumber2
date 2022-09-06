package org.example;


import io.cucumber.core.snippets.SnippetType;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
 features = "src/test/resources/org/example/example.feature",
         glue = "org.example",
         tags = "@all",
      plugin = "pretty",
      monochrome = true
        )
        public class RunnerTest {
}