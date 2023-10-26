package starter.altashop.products.negative;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONObject;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class PostProductRatingInvalidMethod {
    protected String url = "https://altashop-api.fly.dev/api/products/86382/ratings";

    @Step("I set POST Assign a product rating invalid method")
    public String setPostProductRatingInvalidMethod(){
        return url;
    }

    @Step("I send POST HTTP request Assign a product rating invalid method")
    public void sendPostHttpRequestProductRatingInvalidMethod(){
        JSONObject requestBody = new JSONObject();
        requestBody.put("count", 5);

        SerenityRest.given()
                .header("Authorization", "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJGdWxsbmFtZSI6IkZpcnN0bmFtZSBMYXN0bmFtZSIsIkVtYWlsIjoic29tZW9uZWVsc2VAbWFpbC5jb20ifQ.J8OKzFM-6sLno5L32c-jqtJ1FhEX4C3i2E0agKsWvi8")
                .body(requestBody.toJSONString())
                .put(setPostProductRatingInvalidMethod());
    }

    @Step("I receive response code 405 for Assign a product rating invalid method")
    public void responseCode405ProductRatingInvalidMethod(){
        restAssuredThat(response -> response.statusCode(405));
    }

}

