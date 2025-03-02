package StepDefinitions;

import io.cucumber.java.en.Given;
import static pages.HomePage.*;

public class MyStepdefs {
    @Given("User navigates to login page")
    public void userNavigatesToLoginPage() throws InterruptedException {
        click();
    }
}
