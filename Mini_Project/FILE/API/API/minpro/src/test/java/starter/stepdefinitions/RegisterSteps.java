package starter.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.java.Register;

public class RegisterSteps {

    @Steps
    Register register;

    // Register
    //// Positive

    @Given("I set POST api endpointsa")
    public void setPostApiEndpointsa() {
        register.setPostApiEndpointa();
    }

    @When("I send POST HTTP requesta")
    public void sendPostHttpRequesta() {
        register.sendPostHttpRequesta();
    }

    @When("I send POST HTTP requestb")
    public void sendPostHttpRequestb() {
        register.sendPostHttpRequestb();
    }
    @When("I send POST HTTP requestc")
    public void sendPostHttpRequestc() {
        register.sendPostHttpRequestc();
    }
    @When("I send POST HTTP requestd")
    public void sendPostHttpRequestd() {
        register.sendPostHttpRequestd();
    }
    @When("I send POST HTTP requeste")
    public void sendPostHttpRequeste() {
        register.sendPostHttpRequeste();
    }

    @Then("I receive valid HTTP response code 200a")
    public void receiveValidHttp200a() {
        register.receiveValidHttp200a();
    }

    @Then("I receive valid HTTP response code 400b")
    public void receiveValidHttp400b() {
        register.receiveValidHttp400b();
    }
    // @Then("I receive valid HTTP response code 400c")
    // public void receiveValidHttp400c() {
    //     register.receiveValidHttp400c();
    // }
    // @Then("I receive valid HTTP response code 400d")
    // public void receiveValidHttp400d() {
    //     register.receiveValidHttp400d();
    // }
    // @Then("I receive valid HTTP response code 400e")
    // public void receiveValidHttp400e() {
    //     register.receiveValidHttp400e();
    // }
}
