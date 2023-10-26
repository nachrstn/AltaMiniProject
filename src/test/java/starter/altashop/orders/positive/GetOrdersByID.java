package starter.altashop.orders.positive;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.Matchers.equalTo;

public class GetOrdersByID {
    protected static String url = "https://altashop-api.fly.dev/api/orders/12232";
    @Step("I set GET endpoints order By ID")
    public String setGetEndpointsOrdersByID(){
        return url;
    }
//????
    @Step("I send GET HTTP request order By ID")
    public void sendGetHttpRequestOrdersByID(){
        SerenityRest.given()
                .header("Authorization", "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJGdWxsbmFtZSI6IkZpcnN0bmFtZSBMYXN0bmFtZSIsIkVtYWlsIjoic29tZW9uZWVsc2VAbWFpbC5jb20ifQ.J8OKzFM-6sLno5L32c-jqtJ1FhEX4C3i2E0agKsWvi8")
                .when()
                .get(setGetEndpointsOrdersByID());

    }

    @Step("I receive response code 200 for get order By ID")
    public void responseCode200ForGetOrdersByID(){
        restAssuredThat(response -> response.statusCode(200));
    }

    @Step("I receive valid data for detail order by ID")
    public void receiveValidDataForDetailOrderByID(){
        restAssuredThat(response -> response.body("data.User.Fullname", equalTo("Firstname Lastname")));
        restAssuredThat(response -> response.body("data.Product.Name", equalTo("Sony PS5")));
        restAssuredThat(response -> response.body("data.Quantity", equalTo(1)));
    }
}
