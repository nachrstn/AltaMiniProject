package starter.altashop.authentication.positive;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.CoreMatchers.equalTo;

public class PostLogin {
    protected String url = "https://altashop-api.fly.dev/api/auth/login";

    @Step("I set POST endpoints Login")
    public String setPostLoginEndpoint(){
        return url;
    }

    @Step("I send POST HTTP request Login")
    public void sendPostHttpRequestLoginEndpoint(){
        JSONObject requestBody = new JSONObject();
        requestBody.put("email", "someoneelse@mail.com");
        requestBody.put("password", "123123");

        SerenityRest.given()
                .body(requestBody.toJSONString())
                .post(setPostLoginEndpoint());
    }

    @Step("I receive response code 200 Login")
    public void responseCode200LoginEndpoint(){
        restAssuredThat(response -> response.statusCode(200));
    }

}
