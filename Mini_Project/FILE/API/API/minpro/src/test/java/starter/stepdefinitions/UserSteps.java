package starter.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.java.Register;
import starter.java.User;

public class UserSteps {
    @Steps
    User user;

    @Given("I set GET api endpointss")
    public void setGetApiEndpointss() {
        user.setGetApiEndpointt();
    }

    @Given("I set GET api endpointsss")
    public void setGetApiEndpointsss() {
        user.setGetApiEndpointtt();
    }

    @When("I send GET HTTP requestt")
    public void sentGetHttpRequestt() {
        user.sendGetHttpRequestt();
    }
    @When("I send GET HTTP requesttt")
    public void sendGetHttpRequesttt() {
        user.sendGetHttpRequesttt();
    }
    @Then("I receive valid HTTP response code 2000")
    public void receiveValidHttp2000() {
        user.receiveValidHttp2000();
    }
    @Then("I receive valid HTTP response code 4000")
    public void receiveValidHttp4000() {
        user.receiveValidHttp4000();
    }
}