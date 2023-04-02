package starter.user;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.core.IsEqual.equalTo;

public class Get {
    protected static String url = "https://jsonplaceholder.typicode.com/posts";
    @Step("I set GET endpoints")
    public String setGetEndpoints(){
        return url + "users/2";
    }
    @Step("I send GET HTTP request")
    public void getHTTPrequest(){
        SerenityRest.given().when().get(setGetEndpoints());
    }
    @Step("I receive valid HTTP response code 200")
    public void HTTPresponse200(){
        restAssuredThat(response -> response.statusCode(200));

    }
    @Step("I receive valid data for detail data")
    public void validData(){
        restAssuredThat(response -> response.body("'data'.'id'", equalTo(1)));

    }

}
