package starter.stepdefinitions;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.altashop.authentication.negative.*;


public class AuthenticationNegativeSteps {
    @Steps
    PostLoginInvalidEndpoint PostLoginInvalidEndpoint;
    @Steps
    PostRegisterInvalidEndpoint PostRegisterInvalidEndpoint;
    @Steps
    GetUserInformationInvalidEndpoint GetUserInformationInvalidEndpoint;

    @Steps
    PostLoginInvalidMethod PostLoginInvalidMethod;
    @Steps
    PostRegisterInvalidMethod PostRegisterInvalidMethod;
    @Steps
    GetUserInformationInvalidMethod GetUserInformationInvalidMethod;

    @Steps
    PostRegisterInvalidPayload PostRegisterInvalidPayload;
    @Steps
    PostLoginInvalidPayload PostLoginInvalidPayload;


    @Given("I set POST Login invalid endpoint")
    public void setPostLoginInvalidEndpoint(){
        PostLoginInvalidEndpoint.setPostLoginInvalidEndpoint();
    }
    @When("I send POST HTTP request Login invalid endpoint")
    public void sendPostHttpRequestLoginInvalidEndpoint(){
        PostLoginInvalidEndpoint.sendPostHttpRequestLoginInvalidEndpoint();
    }
    @Then("I receive response code 404 for Login invalid endpoint")
    public void responseCode404LoginInvalidEndpoint(){
        PostLoginInvalidEndpoint.responseCode404LoginInvalidEndpoint();
    }

    @Given("I set POST Register invalid endpoint")
    public void setPostRegisterInvalidEndpoint(){
        PostRegisterInvalidEndpoint.setPostRegisterInvalidEndpoint();
    }
    @When("I send POST HTTP request Register invalid endpoint")
    public void sendPostHttpRequestRegisterInvalidEndpoint(){
        PostRegisterInvalidEndpoint.sendPostHttpRequestRegisterInvalidEndpoint();
    }
    @Then("I receive response code 404 for Register")
    public void responseCode404RegisterInvalidEndpoint(){
        PostRegisterInvalidEndpoint.responseCode404RegisterInvalidEndpoint();
    }

    @Given("I set GET user information invalid endpoint")
    public void setPostUserInformationInvalidEndpoint(){
        GetUserInformationInvalidEndpoint.setPostUserInformationInvalidEndpoint();
    }
    @When("I send GET HTTP request user information invalid endpoint")
    public void sendPostHttpRequestUserInformationInvalidEndpoint(){
        GetUserInformationInvalidEndpoint.sendPostHttpRequestUserInformationInvalidEndpoint();
    }
    @Then("I receive response code 404 for Get user information invalid endpoint")
    public void responseCode404UserInformationInvalidEndpoint(){
        GetUserInformationInvalidEndpoint.responseCode404UserInformationInvalidEndpoint();
    }





    @Given("I set POST Login invalid method")
    public void setPostLoginInvalidMethod(){
        PostLoginInvalidMethod.setPostLoginInvalidMethod();
    }
    @When("I send POST HTTP request Login invalid method")
    public void sendPostHttpRequestLoginInvalidMethod(){
        PostLoginInvalidMethod.sendPostHttpRequestLoginInvalidMethod();
    }
    @Then("I receive response code 405 for Login invalid method")
    public void responseCode405LoginInvalidMethod(){
        PostLoginInvalidMethod.responseCode405LoginInvalidMethod();
    }

    @Given("I set POST Register invalid method")
    public void setPostRegisterInvalidMethod(){
        PostRegisterInvalidMethod.setPostRegisterInvalidMethod();
    }
    @When("I send POST HTTP request Register invalid method")
    public void sendPostHttpRequestRegisterInvalidMethod(){
        PostRegisterInvalidMethod.sendPostHttpRequestRegisterInvalidMethod();
    }
    @Then("I receive response code 405 for Register invalid method")
    public void responseCode405RegisterInvalidMethod(){
        PostRegisterInvalidMethod.responseCode405RegisterInvalidMethod();
    }

    @Given("I set GET user information invalid method")
    public void setPostUserInformationInvalidMethod(){
        GetUserInformationInvalidMethod.setPostUserInformationInvalidMethod();
    }
    @When("I send GET HTTP request user information invalid method")
    public void sendPostHttpRequestUserInformationInvalidMethod(){
        GetUserInformationInvalidMethod.sendPostHttpRequestUserInformationInvalidMethod();
    }
    @Then("I receive response code 405 for Get user information invalid method")
    public void responseCode405UserInformationInvalidMethod(){
        GetUserInformationInvalidMethod.responseCode405UserInformationInvalidMethod();
    }


    @Given("I set POST Login invalid payload")
    public void setPostLoginInvalidPayload(){
        PostLoginInvalidPayload.setPostLoginInvalidPayload();
    }
    @When("I send POST HTTP request Login invalid payload")
    public void sendPostHttpRequestLoginInvalidPayload(){
        PostLoginInvalidPayload.sendPostHttpRequestLoginInvalidPayload();
    }
    @Then("I receive response code 400 for Login invalid payload")
    public void responseCode400LoginInvalidPayload(){
        PostLoginInvalidPayload.responseCode400LoginInvalidPayload();
    }

    @Given("I set POST Register invalid payload")
    public void setPostRegisterInvalidPayload(){
        PostRegisterInvalidPayload.setPostRegisterInvalidPayload();
    }
    @When("I send POST HTTP request Register invalid payload")
    public void sendPostHttpRequestRegisterInvalidPayload(){
        PostRegisterInvalidPayload.sendPostHttpRequestRegisterInvalidPayload();
    }
    @Then("I receive response code 400 for Register invalid payload")
    public void responseCode400RegisterInvalidPayload(){
        PostRegisterInvalidPayload.responseCode400RegisterInvalidPayload();
    }


}

