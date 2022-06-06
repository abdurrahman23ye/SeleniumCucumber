package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class SignUpPage {
   public SignUpPage() {
      PageFactory.initElements(Driver.getDriver(),this);

}



    @FindBy(xpath ="//b[text()='Enter Account Information']")
    public WebElement enterAccountInformation;



    @FindBy(xpath ="(//input[@name='title'])[1]")
    public WebElement inputTitle;

    @FindBy(xpath = "(//button)[1]")
    public WebElement createAccount;

    @FindBy(xpath = "//b[text()='Account Created!']")
    public WebElement accountCreated;

    @FindBy(xpath = "//a[@data-qa='continue-button']")
    public WebElement accountCreatedContinue;
}
