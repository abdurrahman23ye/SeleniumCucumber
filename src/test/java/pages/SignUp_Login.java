package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class SignUp_Login {

    public SignUp_Login(){

        PageFactory.initElements(Driver.getDriver(),this);

    }

    @FindBy(xpath ="(//h2)[2]")
    public WebElement newUserSignUpLabel;


    @FindBy(xpath ="//input[@data-qa='signup-name']")
    public WebElement newUserSignUpName;

    @FindBy(xpath ="//input[@data-qa='signup-email']")
    public WebElement newUserSignUpEmail;


    @FindBy(xpath ="//button[@data-qa='signup-button']")
    public WebElement newUserSignUpButton;
}
