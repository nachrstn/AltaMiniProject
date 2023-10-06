package starter.user;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;


import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class DeleteInvalidURL {
    protected String url = "https://jsonplaceholder.typicode.com/";
    @Step("I set DELETE Invalid endpoints")
    public String setDeleteInvalidEndpoint(){
        return url + "/1";
//        if valid should be => return url + "posts/1";
    }

    @Step("I send DELETE Invalid HTTP request")
    public void sendDeleteInvalidHttpRequest(){
        SerenityRest.given().delete(setDeleteInvalidEndpoint());
    }

    @Step("I receive valid HTTP response code 404")
    public void validateHttpResponseCode404(){
        restAssuredThat(response -> response.statusCode(404));
    }
}
