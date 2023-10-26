package starter.altashop.products.positive;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class GetAllProducts {
    protected static String url = "https://altashop-api.fly.dev/api/products";

    @Step("I set GET endpoints all products")
    public String setGetEndpointsAllProducts(){
        return url;
    }

    @Step("I send GET HTTP request all products")
    public void sendGetHttpRequestAllProducts(){
        SerenityRest.given()
                .when()
                .get(setGetEndpointsAllProducts());
    }

    @Step("I receive response code 200 for get all products")
    public void responseCode200ForGetAllProducts(){
        restAssuredThat(response -> response.statusCode(200));
    }

}
