package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class HomePage {

    public HomePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy (partialLinkText ="Signup")
    public WebElement signupButton;

    @FindBy(xpath ="(//h2)[3]")
    public WebElement signupText;

    @FindBy(name ="name")
    public WebElement nameBox;

    @FindBy (xpath ="(//*[@name='email'])[2]")
    public WebElement emailBox;

    //*[@class='btn btn-default'])[2]")
    //(//*[@type= 'submit'])[2]
    @FindBy (xpath ="//button[contains (text(),'Signup')]")
    public WebElement accountCreateSignUpButton;

    @FindBy (xpath ="//b[contains (text(),'Enter Account Information')]")
    public WebElement EnterAccountInfoText;

    @FindBy(xpath = "(//*[@type= 'submit'])[2]")
    public WebElement accountCreatSignupButton;

    @FindBy(xpath = "//b[contains (text(),'Enter Account Information')]")
    public WebElement createAccountPageVerification;

    @FindBy(xpath="(//p)[1]")
    public WebElement existingEmailVerification;






    //elly
    //   aak@nthrl.com
    //YouAre




}
