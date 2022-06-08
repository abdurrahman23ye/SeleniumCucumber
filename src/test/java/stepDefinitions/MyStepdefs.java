package stepDefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.MainPage;
import pages.SignUpPage;
import pages.SignUp_Login;
import utilities.ConfigReader;
import utilities.Driver;

import java.time.Duration;

public class MyStepdefs {
    MainPage mainPage=new MainPage();
    SignUp_Login signUp_login=new SignUp_Login();
    SignUpPage signUpPage=new SignUpPage();
    JavascriptExecutor js= (JavascriptExecutor) Driver.getDriver();
    Actions action=new Actions(Driver.getDriver());
    Faker fk=new Faker();

    @Given("Launch browser")
    public void launchBrowser() {}



    @And("Verify that home page is visible successfully")
    public void verifyThatHomePageIsVisibleSuccessfully() {

        Assert.assertTrue(mainPage.mainPage.isEnabled());


    }



    @And("Click on Signup \\/ Login button")
    public void clickOnSignupLoginButton() {
        mainPage.loginLinki.click();

    }


    @And("Verify New User Signup! is visible")
    public void verifyNewUserSignupIsVisible() {
        Assert.assertTrue( signUp_login.newUserSignUpLabel.isDisplayed());
    }

    @And("Enter name and email address")
    public void enterNameAndEmailAddress() {

        signUp_login.newUserSignUpName.sendKeys(ConfigReader.getProperty("dogruisim"));

        js.executeScript("window.scrollBy(0,150)");
        signUp_login.newUserSignUpEmail.sendKeys(ConfigReader.getProperty("dogruEmail"));

        js.executeScript("window.scrollBy(0,-150)");
    }

    @And("Click Signup button")
    public void clickSignupButton() {
        signUp_login.newUserSignUpButton.click();
    }


    @And("Verify that ENTER ACCOUNT INFORMATION is visible")
    public void verifyThatENTERACCOUNTINFORMATIONIsVisible() {
        Assert.assertTrue(signUpPage.enterAccountInformation.isDisplayed());
    }

    @And("Fill details: Title, Name, Email, Password, Date of birth")
    public void fillDetailsTitleNameEmailPasswordDateOfBirth() {
        signUpPage.inputTitle.click();
        action.sendKeys(Keys.TAB).perform();
        action.sendKeys(Keys.TAB).perform();
        action.sendKeys(ConfigReader.getProperty("signUpPassword")).perform();
        action.sendKeys(Keys.TAB).perform();
        action.sendKeys(ConfigReader.getProperty("dayOfBirthday")).perform();
        action.sendKeys(Keys.TAB).perform();
        action.sendKeys(ConfigReader.getProperty("monthOfBirthday")).perform();
        action.sendKeys(Keys.TAB).perform();
        action.sendKeys(ConfigReader.getProperty("yearOfBirthday")).perform();

    }


    @And("Select checkbox Sign up for our newsletter!")
    public void selectCheckboxSignUpForOurNewsletter() {
        action.sendKeys(Keys.TAB).sendKeys(Keys.SPACE).perform();
    }

    @And("Select checkbox Receive special offers from our partners!")
    public void selectCheckboxReceiveSpecialOffersFromOurPartners() {
        action.sendKeys(Keys.TAB).sendKeys(Keys.SPACE).perform();
    }

    @And("Select checkbox Receive special offers from our partners!Fill details: First name, Last name, Company, Address,")
    public void selectCheckboxReceiveSpecialOffersFromOurPartnersFillDetailsFirstNameLastNameCompanyAddress() {


        action.sendKeys(Keys.TAB).sendKeys(fk.name().name()).perform();
        action.sendKeys(Keys.TAB).sendKeys( fk.name().lastName()).perform();
        action.sendKeys(Keys.TAB).sendKeys( fk.company().name()).perform();
        action.sendKeys(Keys.TAB).sendKeys( fk.address().fullAddress()).perform();
        action.sendKeys(Keys.TAB).sendKeys( fk.address().fullAddress()).perform();
        action.sendKeys(Keys.TAB).perform();
        action.sendKeys(Keys.TAB).sendKeys(fk.address().country()).perform();
        action.sendKeys(Keys.TAB).sendKeys(fk.address().state()).perform();
        action.sendKeys(Keys.TAB).sendKeys(fk.address().city()).perform();
        action.sendKeys(Keys.TAB).sendKeys(fk.address().zipCode()).perform();
        action.sendKeys(Keys.TAB).sendKeys(fk.phoneNumber().cellPhone()).perform();

    }

    @And("Click Create Account button")
    public void clickCreateAccountButton() {
        signUpPage.createAccount.click();
    }

    @And("Verify that ACCOUNT CREATED! is visible")
    public void verifyThatACCOUNTCREATEDIsVisible() {

        Assert.assertTrue(signUpPage.accountCreated.isDisplayed());
    }



    @And("Click Continue button")
    public void clickContinueButton() {
        signUpPage.accountCreatedContinue.click();
    }


    @And("Verify that Logged in as username is visible")
    public void verifyThatLoggedInAsUsernameIsVisible() {
        Assert.assertTrue(mainPage.loggedName.getText().equals(ConfigReader.getProperty("dogruisim")));

    }

    @And("Click Delete Account button")
    public void clickDeleteAccountButton() {
        mainPage.deleteAccount.click();
    }

    @And("Close the page")
    public void closeThePage() {
        Driver.closeDriver();
    }

    @Then("Navigate to url {string}")
    public void navigateToUrl(String mainPage) {
        Driver.getDriver().get(ConfigReader.getProperty("mainPage"));
    }


    @And("Verify Login to your account is visible")
    public void verifyLoginToYourAccountIsVisible() {
        Assert.assertTrue(signUp_login.loginLabel.isDisplayed());
    }

    @And("Enter correct email address and password")
    public void enterCorrectEmailAddressAndPassword() {

        signUp_login.inputEmail.sendKeys(ConfigReader.getProperty("dogruEmail"));

        action.sendKeys(Keys.TAB).sendKeys(ConfigReader.getProperty("signUpPassword")).perform();
    }

    @And("Click login button")
    public void clickLoginButton() {

        signUp_login.login.click();
    }

    @And("Enter incorrect email address and password")
    public void enterIncorrectEmailAddressAndPassword() {


        signUp_login.inputEmail.sendKeys(ConfigReader.getProperty("incorrectEmail"));

        js.executeScript("window.scrollBy(0,150)");

        action.sendKeys(Keys.TAB).perform();
        action.sendKeys(ConfigReader.getProperty("inCorrectPassword")).perform();

        js.executeScript("window.scrollBy(0,-150)");



    }

    @And("Verify error Your email or password is incorrect! is visible")
    public void verifyErrorYourEmailOrPasswordIsIncorrectIsVisible() {
        Assert.assertTrue(signUp_login.loginerror.isDisplayed());
    }

    @Then("wait {int} seconds")
    public void waitSeconds(int arg0) {

        try {
            Thread.sleep(arg0*1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
