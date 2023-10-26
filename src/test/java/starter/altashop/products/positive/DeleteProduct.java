package starter.altashop.products.positive;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class DeleteProduct {
    protected String url = "https://altashop-api.fly.dev/api/products/86376";
    @Step("I set DELETE endpoints Delete a product")
    public String setDeleteEndpointDeleteProduct(){
        return url;
    }

    @Step("I send DELETE HTTP request Delete a product")
    public void sendDeleteHttpRequestDeleteProduct(){
        SerenityRest.given().delete(setDeleteEndpointDeleteProduct());
    }
    @Step("I receive response code 200 Delete a product")
    public void responseCode200DeleteProduct(){
        restAssuredThat(response -> response.statusCode(200));
    }
}
