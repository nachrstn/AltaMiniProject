package starter.altashop.products.negative;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class DeleteProductInvalidEndpoint {
    protected String url = "https://altashop-api.fly.dev/api/pr0ducts/85540";
    @Step("I set DELETE Delete a product invalid endpoint")
    public String setDeleteProductInvalidEndpoint(){
        return url;
    }
    @Step("I send DELETE HTTP request Delete a product invalid endpoint")
    public void sendHttpRequestDeleteProductInvalidEndpoint(){
        SerenityRest.given().delete(setDeleteProductInvalidEndpoint());
    }
    @Step("I receive response code 404 for Delete a product")
    public void responseCode404ForDeleteProductInvalidEndpoint(){
        restAssuredThat(response -> response.statusCode(404));
    }
}
