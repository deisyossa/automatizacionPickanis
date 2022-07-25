package stepdefinitions;


import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import exceptions.NonExistentField;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.Cast;
import net.serenitybdd.screenplay.actors.OnStage;
import net.thucydides.core.annotations.Managed;
import org.hamcrest.Matchers;
import org.openqa.selenium.WebDriver;
import questions.PrincipalPageQuestions;
import tasks.Register;

public class pagePickanisStepDefinition {
    @Managed
    private WebDriver hisBrower;
    @Before
    public void  setUp(){
        OnStage.setTheStage(Cast.ofStandardActors());
        OnStage.theActorCalled("The User");

    }
    @Given("^the user navigates on the web page pickanis$")
    public void theUserNavigatesOnTheWebPagePickanis() {
        OnStage.theActorInTheSpotlight().can(BrowseTheWeb.with(hisBrower)).wasAbleTo(Open.url("http://localhost:4200/landing"));
    }

    @When("^the user is principal page$")
    public void theUserIsPrincipalPage() {
    }

    @Then("^User will logo the pickanis$")
    public void userWillLogoThePickanis() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(PrincipalPageQuestions.landing(),  Matchers.is(Matchers.equalTo(true)))
                .orComplainWith(NonExistentField.class, "Does not require mandatory fields"));
    }
    @When("^the user select register$")
    public void theUserSelectRegister() {
        OnStage.theActorInTheSpotlight().wasAbleTo(Register.inPackanis());
    }

    @Then("^User will register succesful$")
    public void userWillRegisterSuccesful() {
    }
    @When("^the user login$")
    public void theUserLogin() {

    }

    @Then("^User will login successful$")
    public void userWillLoginSuccessful() {
    }

    @When("^the register request$")
    public void theRegisterRequest() {

    }

    @Then("^User will register request successful$")
    public void userWillRegisterRequestSuccessful() {
    }
    @Then("^User see page paseadores$")
    public void userSeePage() {

    }


}
