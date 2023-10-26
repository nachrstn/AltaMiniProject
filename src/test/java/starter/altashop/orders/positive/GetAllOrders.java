package starter.altashop.orders.positive;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class GetAllOrders {
    protected static String url = "https://altashop-api.fly.dev/api/orders";

    @Step("I set GET endpoints all orders")
    public String setGetEndpointsAllOrders(){
        return url;
    }

    @Step("I send GET HTTP request all orders")
    public void sendGetHttpRequestAllOrders(){
        SerenityRest.given()
                .header("Authorization", "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJGdWxsbmFtZSI6IkZpcnN0bmFtZSBMYXN0bmFtZSIsIkVtYWlsIjoic29tZW9uZWVsc2VAbWFpbC5jb20ifQ.J8OKzFM-6sLno5L32c-jqtJ1FhEX4C3i2E0agKsWvi8")
                .when()
                .get(setGetEndpointsAllOrders());
    }

    @Step("I receive response code 200 for get all orders")
    public void responseCode200ForGetAllOrders(){
        restAssuredThat(response -> response.statusCode(200));
    }

}
