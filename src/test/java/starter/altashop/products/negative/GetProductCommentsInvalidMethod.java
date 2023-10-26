package starter.altashop.products.negative;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class GetProductCommentsInvalidMethod {
    protected static String url = "https://altashop-api.fly.dev/api/products/85525/comments";
    @Step("I set GET product comments invalid method")
    public String setGetMethodsProductCommentsInvalidMethods(){
        return url;
    }

    @Step("I send GET HTTP request product comments invalid method")
    public void sendGetHttpRequestGetProductCommentsInvalidMethods(){
        SerenityRest.given()
                .when()
                .put(setGetMethodsProductCommentsInvalidMethods());
    }

    @Step("I receive response code 405 for Get product comments invalid method")
    public void responseCode405ForGetProductCommentsInvalidMethods(){
        restAssuredThat(response -> response.statusCode(405));
    }

}

