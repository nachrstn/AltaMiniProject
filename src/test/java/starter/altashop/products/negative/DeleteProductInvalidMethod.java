package starter.altashop.products.negative;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class DeleteProductInvalidMethod {
    protected String url = "https://altashop-api.fly.dev/api/products/85542";
    @Step("I set DELETE Delete a product invalid method")
    public String setDeleteProductInvalidMethod(){
        return url;
    }
    @Step("I send DELETE HTTP request Delete a product invalid method")
    public void sendHttpRequestDeleteProductInvalidMethod(){
        SerenityRest.given().put(setDeleteProductInvalidMethod());
    }
    @Step("I receive response code 405 for Delete a product invalid method")
    public void responseCode405ForDeleteProductInvalidMethod(){
        restAssuredThat(response -> response.statusCode(405));
    }
}
