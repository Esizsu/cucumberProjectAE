package stepdefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import pages.HomePage;
import utilities.ConfigurationReader;
import utilities.Driver;

public class CreateAccountStepDefs {

    HomePage homePage = new HomePage();

    @When("user launches the browser")
    public void user_launches_the_browser() {
        Driver.getDriver();

    }

    @When("user navigates to home page")
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

    @Then("user clicks signup_login button")
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
        homePage.nameBox.sendKeys("elly");
       // homePage.nameBox.sendKeys(Faker.instance().name().firstName());
      //   homePage.emailBox.sendKeys(Faker.instance().internet().emailAddress());
       homePage.emailBox.sendKeys("aak@nthrl.com");

    }

    @When("user clicks signup_button")
    public void userClicksSignupButton() {
        JavascriptExecutor jsexecutor = ((JavascriptExecutor) Driver.getDriver());
        jsexecutor.executeScript("arguments[0].click();", homePage.accountCreateSignUpButton);
        //       homePage.accountCreateSignUpButton.click();
    }

    @When("user verifies that enter account information is visible")
    public void userVerifiesThatEnterAccountInformationIsVisible() {
        Assert.assertTrue(homePage.EnterAccountInfoText.isDisplayed());
    }

    @And("user verifies email address is visible is displayed")
    public void userVerifiesEmailAddressIsVisibleIsDisplayed() {

        Assert.assertTrue(homePage.existingEmailVerification.isDisplayed());

    }
}
