package starter.user;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.core.IsEqual.equalTo;

public class Post {
    protected static String url = "https://jsonplaceholder.typicode.com/posts";
    @Step("I set POST endpoints")
    public String setPostEndpoints(){
        return url + "users/2";
    }
    @Step("I send POST HTTP request")
    public void postHTTPrequest(){
        SerenityRest.given().when().get(setPostEndpoints());
    }
    @Step("I receive valid HTTP response code 201")
    public void HTTPresponse201(){
        restAssuredThat(response -> response.statusCode(201));

    }
    @Step("I receive valid post data for detail data")
    public void validPostData(){
        restAssuredThat(response -> response.body("'data'.'id'", equalTo(1)));

    }

}
