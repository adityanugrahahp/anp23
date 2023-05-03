package starter.java;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONObject;

public class Categories {

    protected String url = "https://altashop-api.fly.dev/api/";



    @Step("I set POST api endpointsf")
    public String setPostApiEndpointf() {
        return url + "categories";
    }

    @Step("I set GET api endpoints")
    public String setGetApiEndpoint() {
        return url + "categories/11400";
    }

    @Step("I send POST HTTP requestj")
    public void sendPostHttpRequestj() {
        JSONObject requestBody = new JSONObject();
        requestBody.put("name", "gamingg");
        requestBody.put("description", "for gaming purposes");

        SerenityRest.given().header("Content-Type", "application/json").body(requestBody.toJSONString())
                .post(setPostApiEndpointf());
    }

    @Step("I receive valid HTTP response code 200b")
    public void receiveValidHttp200b() {
        restAssuredThat(response -> response.statusCode(200));
    }

    @Step("I send POST HTTP requestf")
    public void sendPostHttpRequestf() {
        JSONObject requestBody = new JSONObject();
        requestBody.put("name", "testes");
        requestBody.put("description", "");

        SerenityRest.given().header("Content-Type", "application/json").body(requestBody.toJSONString())
                .post(setPostApiEndpointf());
    }

    @Step("I receive valid HTTP response code 400f")
    public void receiveValidHttp400f() {
        restAssuredThat(response -> response.statusCode(200));
    }

    @Step("I send POST HTTP requestg")
    public void sendPostHttpRequestg() {
        JSONObject requestBody = new JSONObject();
        requestBody.put("nama", "");
        requestBody.put("description", "testes");

        SerenityRest.given().header("Content-Type", "application/json").body(requestBody.toJSONString())
                .post(setPostApiEndpointf());
    }

    @Step("I receive valid HTTP response code 500g")
    public void receiveValidHttp500g() {
        restAssuredThat(response -> response.statusCode(500));
    }

    @Step("I send GET HTTP requesth")
    public void sendGetHttpRequesth() {
        SerenityRest.given().get(setGetApiEndpoint());
    }
    @Step("I receive valid HTTP response code 200c")
    public void receiveValidHttp200c() {
        restAssuredThat(response -> response.statusCode(200));
    }

    @Step("I send GET HTTP requesti")
    public void sendGetHttpRequesti() {
        SerenityRest.given().get(setPostApiEndpointf());
    }
    @Step("I receive valid HTTP response code 200d")
    public void receiveValidHttp200d() {
        restAssuredThat(response -> response.statusCode(200));
    }
}