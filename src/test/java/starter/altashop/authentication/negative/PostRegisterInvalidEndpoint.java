package starter.altashop.authentication.negative;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONObject;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.CoreMatchers.equalTo;

public class PostRegisterInvalidEndpoint {
    protected String url = "https://altashop-api.fly.dev/api/auth/r3gister";

    @Step("I set POST Register invalid endpoint")
    public String setPostRegisterInvalidEndpoint(){
        return url;
    }

    @Step("I send POST HTTP request Register invalid endpoint")
    public void sendPostHttpRequestRegisterInvalidEndpoint(){
        JSONObject requestBody = new JSONObject();
        requestBody.put("email", "akunbaru@gmail.com");
        requestBody.put("password", "123123");
        requestBody.put("fullname", "akun baru");

        SerenityRest.given()
                .body(requestBody.toJSONString())
                .post(setPostRegisterInvalidEndpoint());
    }

    @Step("I receive response code 404 for Register")
    public void responseCode404RegisterInvalidEndpoint(){
        restAssuredThat(response -> response.statusCode(404));
    }


}
