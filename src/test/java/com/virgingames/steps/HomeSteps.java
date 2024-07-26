package com.virgingames.steps;

import com.virgingames.pages.AboutUsPage;
import com.virgingames.pages.HomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class HomeSteps {


    @Given("I am on home page")
    public void iAmOnHomePage() {

    }

    @And("I click on allowcookie button")
    public void iClickOnAllowcookieButton() {
        new HomePage().clickonCookies();
    }

    @Then("I should be on homepage")
    public void iShouldBeOnHomepage() {
    }

    @When("I am on aboutus page")
    public void iAmOnAboutusPage() {
        new HomePage().clickonAboutus();
    }

    @Then("I should be verify aboutus link {string}.")
    public void iShouldBeVerifyAboutusLink(String URL) {
        Assert.assertEquals(new AboutUsPage().getTheCurrentUrl(),URL,"User is on about us page");
    }
}
