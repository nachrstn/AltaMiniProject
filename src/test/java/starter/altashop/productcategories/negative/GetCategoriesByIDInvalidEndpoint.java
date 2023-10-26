package starter.altashop.productcategories.negative;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.Matchers.equalTo;

public class GetCategoriesByIDInvalidEndpoint {
    protected static String url = "https://altashop-api.fly.dev/api/categ0ries/29716";
    @Step("I set GET category by ID invalid endpoint")
    public String setGetCategoryByIDInvalidEndpoint(){
        return url;
    }

    @Step("I send GET HTTP request category by ID invalid endpoint")
    public void sendGetHttpRequestCategoryByIDInvalidEndpoint(){
        SerenityRest.given()
                .when()
                .get(setGetCategoryByIDInvalidEndpoint());
    }

    @Step("I receive response code 404 for Get category by ID invalid endpoint")
    public void responseCode200ForGetCategoryByIDInvalidEndpoint(){
        restAssuredThat(response -> response.statusCode(404));
    }


}
