package starter.user;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONObject;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.CoreMatchers.equalTo;

public class Put {

    protected String url = "https://jsonplaceholder.typicode.com/";

    @Step("I set PUT endpoints")
    public String setPutEndpoint(){
        return url + "posts/1";
    }

    @Step("I send PUT HTTP request")
    public void sendPutHttpRequest(){
        JSONObject requestBody = new JSONObject();
        requestBody.put("title", "sunt aut facere repellat provident occaecati excepturi optio reprehenderit");
        requestBody.put("body", "quia et suscipit\\nsuscipit recusandae consequuntur expedita et cum\\nreprehenderit molestiae ut ut quas totam\\nnostrum rerum est autem sunt rem eveniet architecto");

        SerenityRest.given().header("Content-Type", "application/json").body(requestBody.toJSONString()).put(setPutEndpoint());
    }

    @Step("I receive valid data for existing user")
    public void ValidateDataForExistingUser(){
        restAssuredThat(response -> response.body("'title'", equalTo("sunt aut facere repellat provident occaecati excepturi optio reprehenderit")));
        restAssuredThat(response -> response.body("'body'", equalTo("quia et suscipit\\nsuscipit recusandae consequuntur expedita et cum\\nreprehenderit molestiae ut ut quas totam\\nnostrum rerum est autem sunt rem eveniet architecto")));
    }

}
