package stepdefinitions;

import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.TestCasesPage;

public class TestCasesPageStepDefs {

    TestCasesPage testcasesPage=new TestCasesPage();

    @Then("user clicks test cases button")
    public void user_clicks_test_cases_button() {

        testcasesPage.testCasesButton.click();

    }
    @Then("verify user is navigated to test case page")
    public void verify_user_is_navigated_to_test_case_page() {
        Assert.assertTrue(testcasesPage.testCasesText.isDisplayed());


    }
}
