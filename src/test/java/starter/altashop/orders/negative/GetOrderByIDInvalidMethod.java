package starter.altashop.orders.negative;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class GetOrderByIDInvalidMethod {
    protected static String url = "https://altashop-api.fly.dev/api/orders/12232";
    @Step("I set GET order by ID invalid method")
    public String setGetOrderByIDInvalidMethod(){
        return url;
    }

    @Step("I send GET HTTP request order by ID invalid method")
    public void sendGetHttpRequestOrderByIDInvalidMethod(){
        SerenityRest.given()
                .header("Authorization", "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJGdWxsbmFtZSI6IkZpcnN0bmFtZSBMYXN0bmFtZSIsIkVtYWlsIjoic29tZW9uZWVsc2VAbWFpbC5jb20ifQ.J8OKzFM-6sLno5L32c-jqtJ1FhEX4C3i2E0agKsWvi8")
                .when()
                .put(setGetOrderByIDInvalidMethod());
    }

    @Step("I receive response code 405 for Get order by ID invalid method")
    public void responseCode405ForGetOrderByIDInvalidMethod(){
        restAssuredThat(response -> response.statusCode(405));
    }

}

