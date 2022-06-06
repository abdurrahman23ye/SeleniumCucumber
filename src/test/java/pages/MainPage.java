package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class MainPage {

    public MainPage(){

        PageFactory.initElements(Driver.getDriver(),this);

    }

    @FindBy(xpath = "//a[@href='/login']")
    public WebElement loginLinki;

    @FindBy(xpath ="//html")
    public WebElement mainPage;


    @FindBy(xpath = "//b")
    public WebElement loggedName;

    @FindBy(xpath = "//a[@href='/logout']")
    public WebElement logOut;

    @FindBy(xpath = "//p[text()='Email Address already exist!']")
    public WebElement emailAlreadyExist;

    @FindBy(xpath = "//a[@href='/delete_account']")
    public WebElement deleteAccount;


}
