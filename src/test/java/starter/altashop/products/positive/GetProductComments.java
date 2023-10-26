package starter.altashop.products.positive;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class GetProductComments {
    protected static String url = "https://altashop-api.fly.dev/api/products/85531/comments";
    @Step("I set GET endpoints all products")
    public String setGetEndpointsProductComments(){
        return url;
    }

    @Step("I send GET HTTP request all products")
    public void sendGetHttpRequestGetProductComments(){
        SerenityRest.given()
                .when()
                .get(setGetEndpointsProductComments());
    }

    @Step("I receive response code 200 for get all products")
    public void responseCode200ForGetProductComments(){
        restAssuredThat(response -> response.statusCode(200));
    }

}
