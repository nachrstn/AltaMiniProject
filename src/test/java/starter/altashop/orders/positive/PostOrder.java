package starter.altashop.orders.positive;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.CoreMatchers.equalTo;

public class PostOrder {
    protected String url = "https://altashop-api.fly.dev/api/orders";

    @Step("I set POST endpoints Create a new order")
    public String setPostOrderEndpoints(){
        return url;
    }

    @Step("I send POST HTTP request Create a new order")
    public void sendPostHttpRequestPostOrder(){
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
                .post(setPostOrderEndpoints());
    }

    @Step("I receive response code 200 Create a new order")
    public void responseCode200ForPostOrder(){
        restAssuredThat(response -> response.statusCode(200));
    }

    @Step("I receive valid data for Create a new order")
    public void receiveValidDataForPostOrder(){
        restAssuredThat(response -> response.body("data[0].User.Fullname", equalTo("Firstname Lastname")));
    }
}
