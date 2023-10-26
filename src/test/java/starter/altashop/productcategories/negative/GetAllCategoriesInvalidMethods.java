package starter.altashop.productcategories.negative;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class GetAllCategoriesInvalidMethods {
    protected static String url = "https://altashop-api.fly.dev/api/categories";

    @Step("I set GET all categories invalid method")
    public String setGetAllCategoriesInvalidMethods(){
        return url;
    }

    @Step("I send GET HTTP request all categories invalid method")
    public void sendGetHttpRequestAllCategoriesInvalidMethods(){
        SerenityRest.given()
                .when()
                .put(setGetAllCategoriesInvalidMethods());
    }

    @Step("I receive response code 405 for Get all categories invalid method")
    public void responseCode405ForGetAllCategoriesInvalidMethods(){
        restAssuredThat(response -> response.statusCode(405));
    }

}

