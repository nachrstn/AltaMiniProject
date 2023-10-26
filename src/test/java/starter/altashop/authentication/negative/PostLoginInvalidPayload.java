package starter.altashop.authentication.negative;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONObject;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class PostLoginInvalidPayload {
    protected String url = "https://altashop-api.fly.dev/api/auth/login";

    @Step("I set POST Login invalid payload")
    public String setPostLoginInvalidPayload(){
        return url;
    }

    @Step("I send POST HTTP request Login invalid payload")
    public void sendPostHttpRequestLoginInvalidPayload(){
        JSONObject requestBody = new JSONObject();
        requestBody.put("email", "someoneelse@mail.com");
        requestBody.put("password", 123123);

        SerenityRest.given()
                .body(requestBody.toJSONString())
                .post(setPostLoginInvalidPayload());
    }

    @Step("I receive response code 400 for Login invalid payload")
    public void responseCode400LoginInvalidPayload(){
        restAssuredThat(response -> response.statusCode(400));
    }

}
