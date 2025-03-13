package StepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

import static pages.HomePage.*;
import static pages.SigniPage.*;

public class MyStepdefs {
    @Given("User navigates to login page")
    public void userNavigatesToLoginPage() throws InterruptedException {
        click();
        click_signIn();

    }

    @When("User enter details")
    public void userEnterDetails() throws InterruptedException {
        sendkey_username();
    }

//    @When("User enter details")
//    public void user_login_user_pages() throws InterruptedException {
//        sendkey_username();
//        sendkey_password();
//        click_login_button();
    }

