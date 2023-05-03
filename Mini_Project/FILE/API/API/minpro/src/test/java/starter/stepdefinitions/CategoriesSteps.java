package starter.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.java.Categories;

public class CategoriesSteps {

    @Steps
    Categories categories;

    // categories
    //// Positive

    @Given("I set POST api endpointsf")
    public void setPostApiEndpointsf() {
        categories.setPostApiEndpointf();
    }

    @Given("I set GET api endpoints")
    public void setGetApiEndpoints() {
        categories.setGetApiEndpoint();
    }

    @When("I send POST HTTP requestj")
    public void sendPostHttpRequestj() {
        categories.sendPostHttpRequestj();
    }

    @When("I send POST HTTP requestf")
    public void sendPostHttpRequestf() {
        categories.sendPostHttpRequestf();
    }
    @When("I send POST HTTP requestg")
    public void sendPostHttpRequestg() {
        categories.sendPostHttpRequestg();
    }
    @When("I send GET HTTP requesth")
    public void sentGetHttpRequesth() {
        categories.sendGetHttpRequesth();
    }
    @When("I send GET HTTP requesti")
    public void sendGetHttpRequesti() {
        categories.sendGetHttpRequesti();
    }

    @Then("I receive valid HTTP response code 200b")
    public void receiveValidHttp200b() {
        categories.receiveValidHttp200b();
    }

    @Then("I receive valid HTTP response code 400f")
    public void receiveValidHttp400f() {
        categories.receiveValidHttp400f();
    }
    @Then("I receive valid HTTP response code 500g")
    public void receiveValidHttp500g() {
        categories.receiveValidHttp500g();
    }
    @Then("I receive valid HTTP response code 200c")
    public void receiveValidHttp200c() {
        categories.receiveValidHttp200c();
    }
    @Then("I receive valid HTTP response code 200d")
    public void receiveValidHttp200d() {
        categories.receiveValidHttp200d();
    }
}