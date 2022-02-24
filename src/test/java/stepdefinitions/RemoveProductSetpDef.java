package stepdefinitions;

import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.RemoveProductsPage;

public class RemoveProductSetpDef {
    RemoveProductsPage removeProductsPage=new RemoveProductsPage();
    @Then("user clicks x button corresponding to particular product")
    public void user_clicks_x_button_corresponding_to_particular_product() throws InterruptedException {

        removeProductsPage.deleteButton.click();
        //Buraya waitandclick methodunu kullanabilirsin
        Thread.sleep(1000);
        removeProductsPage.deleteButton2.click();
    }
    @Then("verify that product is removed from the cart")
    public void verify_that_product_is_removed_from_the_cart() throws InterruptedException {
        Thread.sleep(1000);
        Assert.assertTrue(removeProductsPage.cartEmptyText.isDisplayed());

    }
}
