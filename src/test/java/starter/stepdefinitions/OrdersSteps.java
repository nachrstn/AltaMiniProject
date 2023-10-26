package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.altashop.orders.positive.GetAllOrders;
import starter.altashop.orders.positive.GetOrdersByID;
import starter.altashop.orders.positive.PostOrder;

public class OrdersSteps {
    @Steps
    GetAllOrders GetAllOrders;
    @Steps
    GetOrdersByID GetOrdersByID;
    @Steps
    PostOrder PostOrder;
    @Given("I set GET endpoints all orders")
    public void setGetEndpointsAllOrders(){
        GetAllOrders.setGetEndpointsAllOrders();
    }
    @When("I send GET HTTP request all orders")
    public void sendGetHttpRequestAllOrders(){
        GetAllOrders.sendGetHttpRequestAllOrders();
    }
    @Then("I receive response code 200 for get all orders")
    public void responseCode200ForGetAllOrders(){
        GetAllOrders.responseCode200ForGetAllOrders();
    }

    @Given("I set GET endpoints order by ID")
    public void setGetEndpointsOrderByID(){
        GetOrdersByID.setGetEndpointsOrdersByID();
    }
    @When("I send GET HTTP request order by ID")
    public void sendGetHttpRequestOrderByID(){
        GetOrdersByID.sendGetHttpRequestOrdersByID();
    }
    @Then("I receive response code 200 for get order by ID")
    public void responseCode200ForGetOrderByID(){
        GetOrdersByID.responseCode200ForGetOrdersByID();
    }
    @And("I receive valid data for detail order by ID")
    public void receiveValidDataForDetailOrderByID(){
        GetOrdersByID.receiveValidDataForDetailOrderByID();
    }

    @Given("I set POST endpoints Create a new order")
    public void setPostOrderEndpoints(){
        PostOrder.setPostOrderEndpoints();
    }
    @When("I send POST HTTP request Create a new order")
    public void sendPostHttpRequestPostOrder(){
        PostOrder.sendPostHttpRequestPostOrder();
    }
    @Then("I receive response code 200 Create a new order")
    public void responseCode200ForPostOrder(){
        PostOrder.responseCode200ForPostOrder();
    }
    @And("I receive valid data for Create a new order")
    public void receiveValidDataForPostOrder(){
        PostOrder.receiveValidDataForPostOrder();
    }

}
