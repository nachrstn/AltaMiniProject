package starter.altashop.orders.negative;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class PostOrderInvalidEndpoint {
    protected static String url = "https://altashop-api.fly.dev/api/ord3rs";
    @Step("I set POST Create a new order invalid endpoint")
    public String setPostOrderInvalidEndpoint(){
        return url;
    }

    @Step("I send POST HTTP request Create a new order invalid endpoint")
    public void sendPostHttpRequestPostOrderInvalidEndpoint(){
        JSONArray orderItems = new JSONArray();
        JSONObject orderItem = new JSONObject();
        orderItem.put("product_id", 86220);
        orderItem.put("quantity", 1);
        orderItems.add(orderItem);

        JSONArray requestBody = new JSONArray();
        JSONObject orderCreate = new JSONObject();
        orderCreate.put("order_items", orderItems);
        requestBody.add(orderCreate);

        SerenityRest.given()
                .header("Authorization", "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJGdWxsbmFtZSI6IkZpcnN0bmFtZSBMYXN0bmFtZSIsIkVtYWlsIjoic29tZW9uZWVsc2VAbWFpbC5jb20ifQ.J8OKzFM-6sLno5L32c-jqtJ1FhEX4C3i2E0agKsWvi8")
                .body(requestBody.toJSONString())
                .post(setPostOrderInvalidEndpoint());
    }

    @Step("I receive response code 404 for Create a new order")
    public void responseCode404ForPostOrderInvalidEndpoint(){
        restAssuredThat(response -> response.statusCode(404));
    }

}
