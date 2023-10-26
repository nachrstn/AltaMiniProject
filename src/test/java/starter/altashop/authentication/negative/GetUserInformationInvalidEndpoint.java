package starter.altashop.authentication.negative;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.Matchers.equalTo;

public class GetUserInformationInvalidEndpoint {
    protected static String url = "https://altashop-api.fly.dev/api/auth/inf0";
    @Step("I set GET user information invalid endpoint")
    public String setPostUserInformationInvalidEndpoint(){
        return url;
    }

    @Step("I send GET HTTP request user information invalid endpoint")
    public void sendPostHttpRequestUserInformationInvalidEndpoint(){
        SerenityRest.given()
                .header("Authorization", "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJGdWxsbmFtZSI6IkZpcnN0bmFtZSBMYXN0bmFtZSIsIkVtYWlsIjoic29tZW9uZUBtYWlsLmNvbSJ9.bGpZNDg6YHtKlTFw7_yuyn3SAICmfvdIV1yX7mIKrTw")
                .when()
                .get(setPostUserInformationInvalidEndpoint());
    }

    @Step("I receive response code 404 for Get user information invalid endpoint")
    public void responseCode404UserInformationInvalidEndpoint(){
        restAssuredThat(response -> response.statusCode(404));
    }

}
