package starter.java;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONObject;

public class Product {

    protected String url = "https://altashop-api.fly.dev/api/";

    //// Positive

    @Step("I set POST api endpoints5")
    public String setPostApiEndpoint5() {
        return url + "products";
    }

    @Step("I set GET api endpoints1")
    public String setGetApiEndpoint1() {
        return url + "products/11400";
    }

    @Step("I send POST HTTP request5")
    public void sendPostHttpRequest5() {
        JSONObject requestBody = new JSONObject();
        requestBody.put("name", "gaming");
        requestBody.put("description", "for gaming purposes");
        requestBody.put("price", 299);

        SerenityRest.given().header("Content-Type", "application/json").body(requestBody.toJSONString())
                .post(setPostApiEndpoint5());
    }

    @Step("I receive valid HTTP response code 2005")
    public void receiveValidHttp2005() {
        restAssuredThat(response -> response.statusCode(200));
    }

    @Step("I send POST HTTP request6")
    public void sendPostHttpRequest6() {
        JSONObject requestBody = new JSONObject();
        requestBody.put("description", "for gaming purposes");
        requestBody.put("price", 299);
        requestBody.put("categories", 1);

        SerenityRest.given().header("Content-Type", "application/json").body(requestBody.toJSONString())
                .post(setPostApiEndpoint5());
    }

    @Step("I receive valid HTTP response code 4006")
    public void receiveValidHttp4006() {
        restAssuredThat(response -> response.statusCode(400));
    }

    @Step("I send POST HTTP request7")
    public void sendPostHttpRequest7() {
        JSONObject requestBody = new JSONObject();
        requestBody.put("name", "gaming");
        requestBody.put("price", 299);
        requestBody.put("categories", 1);

        SerenityRest.given().header("Content-Type", "application/json").body(requestBody.toJSONString())
                .post(setPostApiEndpoint5());
    }

    @Step("I receive valid HTTP response code 4007")
    public void receiveValidHttp4007() {
        restAssuredThat(response -> response.statusCode(400));
    }

    @Step("I send GET HTTP request8")
    public void sendGetHttpRequest8() {
        SerenityRest.given().get(setGetApiEndpoint1());
    }
    @Step("I receive valid HTTP response code 2008")
    public void receiveValidHttp2008() {
        restAssuredThat(response -> response.statusCode(200));
    }

    @Step("I send GET HTTP request9")
    public void sendGetHttpRequest9() {
        SerenityRest.given().get(setPostApiEndpoint5());
    }
    @Step("I receive valid HTTP response code 2009")
    public void receiveValidHttp2009() {
        restAssuredThat(response -> response.statusCode(200));
    }
}
