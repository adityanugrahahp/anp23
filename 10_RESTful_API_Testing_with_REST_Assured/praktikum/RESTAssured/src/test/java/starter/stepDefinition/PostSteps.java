package starter.stepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.user.Post;

public class PostSteps {
    @Steps
    Post post;
    @Given("I set POST endpoints")
    public void setPostEndpoints(){
        post.setPostEndpoints();

    }
    @When("I send POST HTTP request")
    public void postHTTPrequest(){
        post.postHTTPrequest();

    }
    @Then("I receive valid HTTP response code 201")
    public void HTTPresponse201(){
        post.HTTPresponse201();

    }
    @And("I receive valid post data for detail data")
    public void validPostData(){
        post.validPostData();
    }
}
