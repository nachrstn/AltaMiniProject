package starter.user;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;


import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class Delete {
    protected String url = "https://jsonplaceholder.typicode.com/";
    @Step("I set DELETE endpoints")
    public String setDeleteEndpoint(){
        return url + "posts/1";
    }

    @Step("I send DELETE HTTP request")
    public void sendDeleteHttpRequest(){
        SerenityRest.given().delete(setDeleteEndpoint());
    }
    @Step("I receive valid HTTP response code 200")
    public void validHttpresponseCode200(){
        restAssuredThat(response -> response.statusCode(200));
    }
}
