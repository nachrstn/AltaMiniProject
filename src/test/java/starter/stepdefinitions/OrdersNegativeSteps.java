package starter.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.altashop.orders.negative.*;


public class OrdersNegativeSteps {
    @Steps
    GetAllOrdersInvalidEndpoint GetAllOrdersInvalidEndpoint;
    @Steps
    GetOrderByIDInvalidEndpoint GetOrderByIDInvalidEndpoint;
    @Steps
    PostOrderInvalidEndpoint PostOrderInvalidEndpoint;

    @Steps
    GetAllOrdersInvalidMethod GetAllOrdersInvalidMethod;
    @Steps
    GetOrderByIDInvalidMethod GetOrderByIDInvalidMethod;
    @Steps
    PostOrderInvalidMethod PostOrderInvalidMethod;
    @Steps
    PostOrderInvalidPayload PostOrderInvalidPayload;

    @Given("I set GET all orders invalid endpoint")
    public void setGetAllOrdersInvalidEndpoint(){
        GetAllOrdersInvalidEndpoint.setGetAllOrdersInvalidEndpoint();
    }
    @When("I send GET HTTP request all orders invalid endpoint")
    public void sendGetHttpRequestAllOrdersInvalidEndpoint(){
        GetAllOrdersInvalidEndpoint.sendGetHttpRequestAllOrdersInvalidEndpoint();
    }
    @Then("I receive response code 404 for Get all orders invalid endpoint")
    public void responseCode404ForGetAllOrdersInvalidEndpoint(){
        GetAllOrdersInvalidEndpoint.responseCode404ForGetAllOrdersInvalidEndpoint();
    }

    @Given("I set GET order by ID invalid endpoint")
    public void setGetOrderByIDInvalidEndpoint(){
        GetOrderByIDInvalidEndpoint.setGetOrderByIDInvalidEndpoint();
    }
    @When("I send GET HTTP request order by ID invalid endpoint")
    public void sendGetHttpRequestOrderByIDInvalidEndpoint(){
        GetOrderByIDInvalidEndpoint.sendGetHttpRequestOrderByIDInvalidEndpoint();
    }
    @Then("I receive response code 404 for Get order by ID invalid endpoint")
    public void responseCode404ForGetOrderByIDInvalidEndpoint(){
        GetOrderByIDInvalidEndpoint.responseCode404ForGetOrderByIDInvalidEndpoint();
    }
    @Given("I set POST Create a new order invalid endpoint")
    public void setPostOrderInvalidEndpoint(){
        PostOrderInvalidEndpoint.setPostOrderInvalidEndpoint();
    }
    @When("I send POST HTTP request Create a new order invalid endpoint")
    public void sendPostHttpRequestPostOrderInvalidEndpoint(){
        PostOrderInvalidEndpoint.sendPostHttpRequestPostOrderInvalidEndpoint();
    }
    @Then("I receive response code 404 for Create a new order")
    public void responseCode404ForPostOrderInvalidEndpoint(){
        PostOrderInvalidEndpoint.responseCode404ForPostOrderInvalidEndpoint();
    }




    @Given("I set GET all orders invalid method")
    public void setGetAllOrdersInvalidMethod(){
        GetAllOrdersInvalidMethod.setGetAllOrdersInvalidMethod();
    }
    @When("I send GET HTTP request all orders invalid method")
    public void sendGetHttpRequestAllOrdersInvalidMethod(){
        GetAllOrdersInvalidMethod.sendGetHttpRequestAllOrdersInvalidMethod();
    }
    @Then("I receive response code 405 for Get all orders invalid method")
    public void responseCode405ForGetAllOrdersInvalidMethod(){
        GetAllOrdersInvalidMethod.responseCode405ForGetAllOrdersInvalidMethod();
    }

    @Given("I set GET order by ID invalid method")
    public void setGetOrderByIDInvalidMethod(){
        GetOrderByIDInvalidMethod.setGetOrderByIDInvalidMethod();
    }
    @When("I send GET HTTP request order by ID invalid method")
    public void sendGetHttpRequestOrderByIDInvalidMethod(){
        GetOrderByIDInvalidMethod.sendGetHttpRequestOrderByIDInvalidMethod();
    }
    @Then("I receive response code 405 for Get order by ID invalid method")
    public void responseCode405ForGetOrderByIDInvalidMethod(){
        GetOrderByIDInvalidMethod.responseCode405ForGetOrderByIDInvalidMethod();
    }
    @Given("I set POST Create a new order invalid method")
    public void setPostOrderInvalidMethod(){
        PostOrderInvalidMethod.setPostOrderInvalidMethod();
    }
    @When("I send POST HTTP request Create a new order invalid method")
    public void sendPostHttpRequestPostOrderInvalidMethod(){
        PostOrderInvalidMethod.sendPostHttpRequestPostOrderInvalidMethod();
    }
    @Then("I receive response code 405 for Create a new order invalid method")
    public void responseCode405ForPostOrderInvalidMethod(){
        PostOrderInvalidMethod.responseCode405ForPostOrderInvalidMethod();
    }


    @Given("I set POST Create a new order invalid payload")
    public void setPostOrderInvalidPayload(){
        PostOrderInvalidPayload.setPostOrderInvalidPayload();
    }
    @When("I send POST HTTP request Create a new order invalid payload")
    public void sendPostHttpRequestPostOrderInvalidPayload(){
        PostOrderInvalidPayload.sendPostHttpRequestPostOrderInvalidPayload();
    }
    @Then("I receive response code 400 for Create a new order invalid payload")
    public void responseCode400ForPostOrderInvalidPayload(){
        PostOrderInvalidPayload.responseCode400ForPostOrderInvalidPayload();
    }



}

