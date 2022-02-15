package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class DeleteAccountPage {

    public DeleteAccountPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath ="//*[contains(text(),'Continue')]")
    public WebElement continueButton;

    //*[text()=' Logged in as ']
    @FindBy(xpath ="//*[contains(text(),' Logged in as ')]")
    public WebElement verifyLoggedText;

    @FindBy(xpath = "//*[text()=' Delete Account']")
    public WebElement deleteButton;


}
