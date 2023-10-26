package starter.altashop.products.positive;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONObject;
import org.json.simple.JSONArray;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.CoreMatchers.equalTo;

public class PostProduct {
    protected String url = "https://altashop-api.fly.dev/api/products";

    @Step("I set POST endpoints Create a new product")
    public String setPostCreateProductEndpoint(){
        return url;
    }

    @Step("I send POST HTTP request Create a new product")
    public void sendPostHttpRequestCreateProductEndpoint(){
        JSONObject requestBody = new JSONObject();
        requestBody.put("name", "Sony PS5");
        requestBody.put("description", "play has no limits");
        requestBody.put("price", 299);

        JSONArray categoriesArray = new JSONArray();
        categoriesArray.add(29715);

        requestBody.put("categories", categoriesArray);
        SerenityRest.given()
                .header("Authorization", "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJGdWxsbmFtZSI6IkZpcnN0bmFtZSBMYXN0bmFtZSIsIkVtYWlsIjoic29tZW9uZWVsc2VAbWFpbC5jb20ifQ.J8OKzFM-6sLno5L32c-jqtJ1FhEX4C3i2E0agKsWvi8")
                .body(requestBody.toJSONString())
                .post(setPostCreateProductEndpoint());
    }

    @Step("I receive response code 200 Create a new product")
    public void responseCode200CreateProductEndpoint(){
        restAssuredThat(response -> response.statusCode(200));
    }

    @Step("I receive valid data for Create a new product")
    public void receiveValidDataForCreateProduct(){
        restAssuredThat(response -> response.body("data.Name", equalTo("Sony PS5")));
    }
}
