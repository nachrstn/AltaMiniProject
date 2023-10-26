package starter.altashop.products.positive;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class GetProductByID {
    protected static String url = "https://altashop-api.fly.dev/api/products/85531";
    @Step("I set GET endpoints product By ID")
    public String setGetEndpointsProductByID(){
        return url;
    }

    @Step("I send GET HTTP request product By ID")
    public void sendGetHttpRequestProductByID(){
        SerenityRest.given()
                .when()
                .get(setGetEndpointsProductByID());
    }

    @Step("I receive response code 200 for get product By ID")
    public void responseCode200ForGetProductByID(){
        restAssuredThat(response -> response.statusCode(200));
    }

}
