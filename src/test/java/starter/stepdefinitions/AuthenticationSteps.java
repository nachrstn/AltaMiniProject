package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.altashop.authentication.positive.GetUserInformation;
import starter.altashop.authentication.positive.PostLogin;
import starter.altashop.authentication.positive.PostRegister;

public class AuthenticationSteps {
    @Steps
    PostLogin PostLogin;
    @Steps
    PostRegister PostRegister;
    @Steps
    GetUserInformation GetUserInformation;

    @Given("I set POST endpoints Login")
    public void setPostLoginEndpoint(){
        PostLogin.setPostLoginEndpoint();
    }
    @When("I send POST HTTP request Login")
    public void sendPostHttpRequestLoginEndpoint(){
        PostLogin.sendPostHttpRequestLoginEndpoint();
    }
    @Then("I receive response code 200 Login")
    public void responseCode200LoginEndpoint(){
        PostLogin.responseCode200LoginEndpoint();
    }

    @Given("I set POST endpoints Register")
    public void setPostRegisterEndpoint(){
        PostRegister.setPostRegisterEndpoint();
    }
    @When("I send POST HTTP request Register")
    public void sendPostHttpRequestRegisterEndpoint(){
        PostRegister.sendPostHttpRequestRegisterEndpoint();
    }
    @Then("I receive response code 200 Register")
    public void responseCode200RegisterEndpoint(){
        PostRegister.responseCode200RegisterEndpoint();
    }
    @And("I receive valid data for Register")
    public void receiveValidDataForRegister(){
        PostRegister.receiveValidDataForRegister();
    }

    @Given("I set GET endpoints user information")
    public void setPostUserInformationEndpoint(){
        GetUserInformation.setPostUserInformationEndpoint();
    }
    @When("I send GET HTTP request user information")
    public void sendPostHttpRequestUserInformationEndpoint(){
        GetUserInformation.sendPostHttpRequestUserInformationEndpoint();
    }
    @Then("I receive response code 200 for get user information")
    public void responseCode200UserInformationEndpoint(){
        GetUserInformation.responseCode200UserInformationEndpoint();
    }
    @And("I receive valid data for user information")
    public void receiveValidDataForUserInformation(){
        GetUserInformation.receiveValidDataForUserInformation();
    }


}
