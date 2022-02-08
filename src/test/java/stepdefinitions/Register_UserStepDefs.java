package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.HomePage;
import utilities.ConfigurationReader;
import utilities.Driver;

public class Register_UserStepDefs {

    HomePage homePage = new HomePage();

    @When("user launches the browser")
    public void user_launches_the_browser() {
        Driver.getDriver();

    }
    @When("user navigate to home page")
    public void user_navigate_to_home_page() {
        Driver.getDriver().navigate().to(ConfigurationReader.getProperty("automation_url"));
       // Driver.getDriver().get(ConfigurationReader.getProperty("automation_url"));

    }
    @Then("user verifies home page is visible")
    public void user_verifies_home_page_is_visible() {
   //     ReusableMethods mehod ile de kullanilabilinir duzenle onlarri tetngden ekle reusable methoda

        String homepageTitle = Driver.getDriver().getTitle();
        Assert.assertEquals("Automation Exercise", homepageTitle);

    }
    @Then("user clicks on signup button")
    public void user_clicks_on_signup_button() {
        homePage.signupButton.click();

    }
    @Then("user verifies new user signup is visible")
    public void user_verifies_new_user_signup_is_visible() {
        Assert.assertTrue(homePage.signupText.isDisplayed());

    }

    //TC01_signup_user

    @When("user enters name and email")
    public void userEntersNameAndEmail() {
    }

    @And("user clicks signup button")
    public void userClicksSignupButton() {
    }

    @And("user verifies that enter account information is visible")
    public void userVerifiesThatEnterAccountInformationIsVisible() {
    }

    @And("user fills details")
    public void userFillsDetails() {
    }

    @And("user selects checkbox signup for our newslater")
    public void userSelectsCheckboxSignupForOurNewslater() {
    }

    @And("user selects checkbox receive special offers")
    public void userSelectsCheckboxReceiveSpecialOffers() {
    }

    @And("user clicks create account button")
    public void userClicksCreateAccountButton() {
    }

    @Then("user verifies that acount is created")
    public void userVerifiesThatAcountIsCreated() {
    }

    @When("user clicks continue button")
    public void userClicksContinueButton() {
    }

    @And("user verifies that logged in")
    public void userVerifiesThatLoggedIn() {
    }

    @And("user clicks delete account button")
    public void userClicksDeleteAccountButton() {
    }

    @Then("user verifies that acount deleted")
    public void userVerifiesThatAcountDeleted() {
    }
}
