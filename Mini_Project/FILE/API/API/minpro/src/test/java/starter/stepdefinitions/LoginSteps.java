package starter.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.java.Login;

public class LoginSteps {

    @Steps
    Login login;

    // Login
    //// Positive

    @Given("I set POST api endpoints")
    public void setPostApiEndpoints() {
        login.setPostApiEndpoint();
    }

    @When("I send POST HTTP request")
    public void sendPostHttpRequest() {
        login.sendPostHttpRequest();
    }

    @When("I send POST HTTP request1")
    public void sendPostHttpRequest1() {
        login.sendPostHttpRequest1();
    }
    @When("I send POST HTTP request2")
    public void sendPostHttpRequest2() {
        login.sendPostHttpRequest2();
    }
    @When("I send POST HTTP request3")
    public void sendPostHttpRequest3() {
        login.sendPostHttpRequest3();
    }
    @When("I send POST HTTP request4")
    public void sendPostHttpRequest4() {
        login.sendPostHttpRequest4();
    }

    @Then("I receive valid HTTP response code 200")
    public void receiveValidHttp200() {
        login.receiveValidHttp200();
    }

    @Then("I receive valid HTTP response code 400")
    public void receiveValidHttp400() {
        login.receiveValidHttp400();
    }
    @Then("I receive valid HTTP response code 4002")
    public void receiveValidHttp4002() {
        login.receiveValidHttp4002();
    }
    @Then("I receive valid HTTP response code 4003")
    public void receiveValidHttp4003() {
        login.receiveValidHttp4003();
    }
    @Then("I receive valid HTTP response code 4004")
    public void receiveValidHttp4004() {
        login.receiveValidHttp4004();
    }
}
