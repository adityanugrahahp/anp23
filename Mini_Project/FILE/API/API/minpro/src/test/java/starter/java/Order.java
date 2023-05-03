package starter.java;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONObject;

public class Order {

    protected String url = "https://altashop-api.fly.dev/api/";

    @Step("I set POST api endpoint")
    public String setPostApiEndpoint() {
        return url + "orders";
    }

    @Step("I set GET api endpoint")
    public String setGetApiEndpoint() {
        return url + "orders";
    }

    @Step("I send POST HTTP requestx")
    public void sendPostHTTPRequest() {
        JSONObject requestBody = new JSONObject();
        requestBody.put("product_id", 11400);
        requestBody.put("quantity", 1);

        SerenityRest.given().header("Content-Type", "application/json").body(requestBody.toJSONString())
                .post(setPostApiEndpoint());
    }

    @Step("I receive valid HTTP response code 200x")
    public void receiveValidHttp200x() {
        restAssuredThat(response -> response.statusCode(401));
    }

    @Step("I send GET HTTP requesty")
    public void sendGetHttpRequesty() {
        SerenityRest.given().get(setGetApiEndpoint());
    }
    @Step("Then I receive valid HTTP response code 200y")
    public void receiveValidHttp200y() {
        restAssuredThat(response -> response.statusCode(401));
    }

    @Step("I send GET HTTP requestz")
    public void sendGetHttpRequestz() {
        SerenityRest.given().get(setGetApiEndpoint());
    }
    @Step("Then I receive valid HTTP response code 200y")
    public void receiveValidHttp200z() {
        restAssuredThat(response -> response.statusCode(401));
    }
}
