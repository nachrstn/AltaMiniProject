package starter.altashop.orders.negative;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class GetAllOrdersInvalidEndpoint {
    protected static String url = "https://altashop-api.fly.dev/api/ord3rs";

    @Step("I set GET all orders invalid endpoint")
    public String setGetAllOrdersInvalidEndpoint(){
        return url;
    }

    @Step("I send GET HTTP request all orders invalid endpoint")
    public void sendGetHttpRequestAllOrdersInvalidEndpoint(){
        SerenityRest.given()
                .header("Authorization", "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJGdWxsbmFtZSI6IkZpcnN0bmFtZSBMYXN0bmFtZSIsIkVtYWlsIjoic29tZW9uZWVsc2VAbWFpbC5jb20ifQ.J8OKzFM-6sLno5L32c-jqtJ1FhEX4C3i2E0agKsWvi8")
                .when()
                .get(setGetAllOrdersInvalidEndpoint());
    }

    @Step("I receive response code 404 for Get all orders invalid endpoint")
    public void responseCode404ForGetAllOrdersInvalidEndpoint(){
        restAssuredThat(response -> response.statusCode(404));
    }

}
