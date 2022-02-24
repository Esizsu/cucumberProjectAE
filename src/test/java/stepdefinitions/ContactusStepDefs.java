package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.TC6_ContactUsForm;
import utilities.Driver;

public class ContactusStepDefs {

    TC6_ContactUsForm contactUsForm = new TC6_ContactUsForm();

    @When("user clicks contact us button")
    public void user_clicks_contact_us_button() {
        contactUsForm.contactUsButton.click();
    }
    @And("user verifies get in touch text is visible")
    public void userVerifiesGetInTouchTextIsVisible() {
        Assert.assertTrue(contactUsForm.getInTouchText.isDisplayed());
    }
    @And("user enters name, email and subject")
    public void userEntersNameEmailAndSubject() {
        Driver.waitAndSendText(contactUsForm.nameText,"oelly" );
        Driver.waitAndSendText(contactUsForm.emailBox,"oz@gmail.com");
        Driver.waitAndSendText(contactUsForm.subjectBox, "return");
        Driver.waitAndSendText(contactUsForm.messageBox, "Hello world");
    }
    @And("user uploads file")
    public void userUploadsFile() {
        //contactUsForm.uploadFile.click();
        String pathOfImage = System.getProperty("user.home")+"/Desktop/bookmarks_12_28_21.html";
        Driver.waitAndSendText(contactUsForm.uploadFile, pathOfImage);
    }
    @And("user clicks submit button")
    public void userClicksSubmitButton() {
        contactUsForm.submitFile.click();
    }
    @And("user clicks on OK button")
    public void userClicksOnOKButton() throws InterruptedException {
        Thread.sleep(5000);
        Driver.getDriver().switchTo().alert().accept();

        Thread.sleep(3000);
    }
    @And("verify success message")
    public void verifySuccessMessage() {
        Assert.assertTrue(contactUsForm.successMessage.isDisplayed());
    }
    @Then("user clicks Home button and verifies that landed to home page successfully")
    public void userClicksHomeButtonAndVerifiesThatLandedToHomePageSuccessfully() {
        contactUsForm.homeButton.click();
        String pageTitle= Driver.getDriver().getTitle();
        Assert.assertEquals("automationexercise", pageTitle);
    }
}
