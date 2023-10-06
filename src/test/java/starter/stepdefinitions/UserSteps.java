package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

import starter.user.*;


public class UserSteps {

    @Steps
    Get get;
    @Steps
    Post post;
    @Steps
    PostInvalidURL postinvalidurl;
    @Steps
    GetById getbyid;
    @Steps
    GetByIdInvalidURL getbyidinvalidurl;
    @Steps
    Put put;
    @Steps
    PutInvalidURL putinvalidurl;
    @Steps
    Delete delete;
    @Steps
    DeleteInvalidURL deleteinvalidurl;


    //INVALID
    @Then("I receive valid HTTP response code 404")
    public void validateHttpResponseCode404(){
        deleteinvalidurl.validateHttpResponseCode404();
        getbyidinvalidurl.validateHttpResponseCode404();
        postinvalidurl.validateHttpResponseCode404();
        putinvalidurl.validateHttpResponseCode404();

    }


    // GET List User
    @Given("I set GET endpoints")
    public void setGetApiEndpoint(){
        get.setApiEndpoint();
    }
    @When("I send GET HTTP request")
    public void sendGetHttpRequest(){
        get.sendGetHttpRequest();
        getbyid.sendGetHttpRequest();
    }

    @Then("I receive valid HTTP response code 200")
    public void receiveValidHttpResponseCode(){
        get.validateHttpResponseCode200();
        getbyid.validateHttpResponseCode200();
        delete.validHttpresponseCode200();
    }
    // GET By ID
    @And("I receive valid data for detail user")
    public void receiveValidDataForDetailUser(){
        getbyid.validateDataDetailUser();
    }

    // POST
    @Given("I set POST endpoints")
    public void setPostApiEndpoint(){
        post.setPostApiEndpoint();

    }
    @When("I send POST HTTP request")
    public void sendPostHTTPRequest(){
        post.sendPostHttpRequest();

    }

    @Then("I receive valid HTTP response code 201")
    public void receiveValidHttp201(){
        post.receiveHttpResponseCode201();

    }

    @And("I receive valid data for new user")
    public void validateDataNewUser(){
        post.validateDatanewUser();

    }




    @Given("I set PUT endpoints")
    public void setPutEndpoint(){
        put.setPutEndpoint();

    }

    @When("I send PUT HTTP request")
    public void sendPutHttpRequest(){
        put.sendPutHttpRequest();

    }

    @And("I receive valid data for existing user")
    public void validateDataForExistingUser(){
        put.ValidateDataForExistingUser();

    }


//    Delete
    @Given("I set DELETE endpoints")
    public void setDeleteEndpoint(){
        delete.setDeleteEndpoint();


    }
    @When("I send DELETE HTTP request")
    public void sendDeleteHttpRequest(){
        delete.sendDeleteHttpRequest();

    }

    //delete invalid url
    @Given("I set DELETE Invalid endpoints")
    public void setDeleteInvalidEndpoint(){
        deleteinvalidurl.setDeleteInvalidEndpoint();


    }
    @When("I send DELETE Invalid HTTP request")
    public void sendDeleteInvalidHttpRequest(){
        deleteinvalidurl.sendDeleteInvalidHttpRequest();

    }

    //INVALID Get By ID
    @Given("I set GET Invalid endpoints")
    public void setApiInvalidEndpoint(){
        getbyidinvalidurl.setApiInvalidEndpoint();


    }
    @When("I send GET Invalid HTTP request")
    public void sendGetInvalidHttpRequest(){
        getbyidinvalidurl.sendGetInvalidHttpRequest();

    }

    //POST Invalid URL
    @Given("I set POST Invalid endpoints")
    public void setPostApiInvalidEndpoint(){
        postinvalidurl.setPostApiInvalidEndpoint();
    }
    @When("I send POST Invalid HTTP request")
    public void sendPostInvalidHttpRequest(){
        postinvalidurl.sendPostInvalidHttpRequest();
    }

    //PUT Invalid
    @Given("I set PUT Invalid endpoints")
    public void setPutInvalidEndpoint(){
        putinvalidurl.setPutInvalidEndpoint();
    }
    @When("I send PUT Invalid HTTP request")
    public void sendPutInvalidHttpRequest(){
        putinvalidurl.sendPutInvalidHttpRequest();
    }
}


