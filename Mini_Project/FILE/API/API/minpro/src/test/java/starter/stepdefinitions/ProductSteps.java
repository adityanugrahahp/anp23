package starter.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.java.Product;

public class ProductSteps {

    @Steps
    Product product;

    // categories
    //// Positive

    @Given("I set POST api endpoints5")
    public void setPostApiEndpoints5() {
        product.setPostApiEndpoint5();
    }

    @Given("I set GET api endpoints1")
    public void setGetApiEndpoints1() {
        product.setGetApiEndpoint1();
    }

    @When("I send POST HTTP request5")
    public void sendPostHttpRequest5() {
        product.sendPostHttpRequest5();
    }

    @When("I send POST HTTP request6")
    public void sendPostHttpRequest6() {
        product.sendPostHttpRequest6();
    }
    @When("I send POST HTTP request7")
    public void sendPostHttpRequest7() {
        product.sendPostHttpRequest7();
    }
    @When("I send GET HTTP request8")
    public void sentGetHttpRequest8() {
        product.sendGetHttpRequest8();
    }
    @When("I send GET HTTP request9")
    public void sendGetHttpRequest9() {
        product.sendGetHttpRequest9();
    }

    @Then("I receive valid HTTP response code 2005")
    public void receiveValidHttp2005() {
        product.receiveValidHttp2005();
    }

    @Then("I receive valid HTTP response code 4006")
    public void receiveValidHttp4006() {
        product.receiveValidHttp4006();
    }
    @Then("I receive valid HTTP response code 4007")
    public void receiveValidHttp4007() {
        product.receiveValidHttp4007();
    }
    @Then("I receive valid HTTP response code 2008")
    public void receiveValidHttp2008() {
        product.receiveValidHttp2008();
    }
    @Then("I receive valid HTTP response code 2009")
    public void receiveValidHttp2009() {
        product.receiveValidHttp2009();
    }
}