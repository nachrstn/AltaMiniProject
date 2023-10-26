package starter.altashop.productcategories.negative;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class DeleteCategoryInvalidEndpoint {
    protected String url = "https://altashop-api.fly.dev/api/categ0ries/29723";
    @Step("I set DELETE Delete a product invalid endpoint")
    public String setDeleteCategoryInvalidEndpoint(){
        return url;
    }
    @Step("I send DELETE HTTP request Delete a product invalid endpoint")
    public void sendHttpRequestDeleteCategoryInvalidEndpoint(){
        SerenityRest.given().delete(setDeleteCategoryInvalidEndpoint());
    }
    @Step("I receive response code 404 for Delete a product")
    public void responseCode404ForDeleteCategoryInvalidEndpoint(){
        restAssuredThat(response -> response.statusCode(404));
    }
}
