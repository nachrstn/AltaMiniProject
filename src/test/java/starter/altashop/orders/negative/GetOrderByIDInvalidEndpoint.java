package starter.altashop.orders.negative;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class GetOrderByIDInvalidEndpoint {
    protected static String url = "https://altashop-api.fly.dev/api/ord3rs/12232";
    @Step("I set GET order by ID invalid endpoint")
    public String setGetOrderByIDInvalidEndpoint(){
        return url;
    }

    @Step("I send GET HTTP request order by ID invalid endpoint")
    public void sendGetHttpRequestOrderByIDInvalidEndpoint(){
        SerenityRest.given()
                .header("Authorization", "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJGdWxsbmFtZSI6IkZpcnN0bmFtZSBMYXN0bmFtZSIsIkVtYWlsIjoic29tZW9uZWVsc2VAbWFpbC5jb20ifQ.J8OKzFM-6sLno5L32c-jqtJ1FhEX4C3i2E0agKsWvi8")
                .when()
                .get(setGetOrderByIDInvalidEndpoint());
    }

    @Step("I receive response code 404 for Get order by ID invalid endpoint")
    public void responseCode404ForGetOrderByIDInvalidEndpoint(){
        restAssuredThat(response -> response.statusCode(404));
    }

}
