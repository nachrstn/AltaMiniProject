package starter.altashop.authentication.positive;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.Matchers.equalTo;

public class GetUserInformation {
    protected static String url = "https://altashop-api.fly.dev/api/auth/info";
    @Step("I set GET endpoints user information")
    public String setPostUserInformationEndpoint(){
        return url;
    }

    @Step("I send GET HTTP request user information")
    public void sendPostHttpRequestUserInformationEndpoint(){
        SerenityRest.given()
                .header("Authorization", "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJGdWxsbmFtZSI6IkZpcnN0bmFtZSBMYXN0bmFtZSIsIkVtYWlsIjoic29tZW9uZUBtYWlsLmNvbSJ9.bGpZNDg6YHtKlTFw7_yuyn3SAICmfvdIV1yX7mIKrTw")
                .when()
                .get(setPostUserInformationEndpoint());
    }

    @Step("I receive response code 200 for get user information")
    public void responseCode200UserInformationEndpoint(){
        restAssuredThat(response -> response.statusCode(200));
    }

    @Step("I receive valid data for user information")
    public void receiveValidDataForUserInformation(){
        restAssuredThat(response -> response.body("data.ID", equalTo(25145)));
        restAssuredThat(response -> response.body("data.Fullname", equalTo("Firstname Lastname")));
        restAssuredThat(response -> response.body("data.Email", equalTo("someone@mail.com")));
    }
}
