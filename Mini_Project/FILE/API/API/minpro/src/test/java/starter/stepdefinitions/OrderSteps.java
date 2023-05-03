package starter.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.java.Order;
import starter.java.User;

public class OrderSteps {
    @Steps
    Order order;

    @Given("I set POST api endpoint")
    public void setPostApiEndpoint() {
        order.setPostApiEndpoint();
    }

    @Given("I set GET api endpoint")
    public void setGetApiEndpoint() {
        order.setGetApiEndpoint();
    }

    @When("I send POST HTTP requestx")
    public void sentPostHttpRequestx() {
        order.sendPostHTTPRequest();
    }
    @When("I send GET HTTP requesty")
    public void sendGetHttpRequesty() {
        order.sendGetHttpRequesty();
    }
    @When("I send GET HTTP requestz")
    public void sendGetHttpRequestz() {
        order.sendGetHttpRequestz();
    }
    @Then("I receive valid HTTP response code 200x")
    public void receiveValidHttp200x() {
        order.receiveValidHttp200x();
    }
    @Then("I receive valid HTTP response code 200y")
    public void receiveValidHttp200y() {
        order.receiveValidHttp200y();
        }
    @Then("I receive valid HTTP response code 200z")
    public void receiveValidHttp200z() {
        order.receiveValidHttp200z();
    }

    }