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

    @FindBy(xpath = "(//h2)[1]")
    public WebElement loginLabel;

    @FindBy(xpath = "(//input[@type='email'])[1]")
    public WebElement inputEmail;

    @FindBy(xpath = "(//button)[1]")
    public WebElement login;


    @FindBy(xpath = "//p[text()='Your email or password is incorrect!']")
    public WebElement loginerror;
}
