package starter.altashop.authentication.negative;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONObject;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class PostLoginInvalidEndpoint {
    protected String url = "https://altashop-api.fly.dev/api/auth/l0gin";

    @Step("I set POST Login invalid endpoint")
    public String setPostLoginInvalidEndpoint(){
        return url;
    }

    @Step("I send POST HTTP request Login invalid endpoint")
    public void sendPostHttpRequestLoginInvalidEndpoint(){
        JSONObject requestBody = new JSONObject();
        requestBody.put("email", "someoneelse@mail.com");
        requestBody.put("password", "123123");

        SerenityRest.given()
                .body(requestBody.toJSONString())
                .post(setPostLoginInvalidEndpoint());
    }

    @Step("I receive response code 404 for Login invalid endpoint")
    public void responseCode404LoginInvalidEndpoint(){
        restAssuredThat(response -> response.statusCode(404));
    }

}
