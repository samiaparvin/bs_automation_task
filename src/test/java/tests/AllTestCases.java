package tests;

import com.github.javafaker.Faker;
import com.github.javafaker.service.FakeValuesService;
import com.github.javafaker.service.RandomService;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import org.openqa.selenium.support.ui.Select;
import pages.AccountCreatePage;
import pages.AddToCart;
import pages.LandingPage;
import pages.SignupPage;

import java.util.Locale;

import static org.testng.Assert.assertEquals;

public class AllTestCases extends Utilities {

    FakeValuesService fakeValuesService = new FakeValuesService(
            new Locale("en-GB"), new RandomService());
    Faker faker = new Faker(new Locale("en-US"));

    @Test(priority = 1)
    public void SignInBtnClick() throws InterruptedException {
        LandingPage Lp = PageFactory.initElements(driver, LandingPage.class);
        Lp.ClickOnContent();

        String SignUpPageUrl = driver.getCurrentUrl();
        assertEquals("http://automationpractice.com/index.php?controller=authentication&back=my-account", SignUpPageUrl);
    }

    @Test(priority = 2)
    public void SignUpWithEmail() throws InterruptedException {

        String email = fakeValuesService.bothify("???????@gmail.com");
        System.out.println("EMIAL : " + email);
        SignupPage Sp = PageFactory.initElements(driver, SignupPage.class);
        Sp.EmailAddressTxt.click();
        Sp.EmailAddressTxt.sendKeys(email);
        Sp.ClickOnCreatAccountBtn();
        Thread.sleep(5000);

        String CreateNewAccountPageUrl = driver.getCurrentUrl();
        System.out.println(CreateNewAccountPageUrl);
        assertEquals("http://automationpractice.com/index.php?controller=authentication&back=my-account#account-creation", CreateNewAccountPageUrl);

        AccountCreatePage ACp = PageFactory.initElements(driver, AccountCreatePage.class);

        ACp.ClickOnRadiotBtnMrs();

        String firstName = faker.name().firstName();
        ACp.piFirstNameTxt.click();
        ACp.piFirstNameTxt.sendKeys(firstName);

        String lastName = faker.name().lastName();
        ACp.piLastNameTxt.click();
        ACp.piLastNameTxt.sendKeys(lastName);

        String password = fakeValuesService.regexify("[a-z1-9]{6}");
        ACp.piPassTxt.click();
        ACp.piPassTxt.sendKeys(password);
        js.executeScript("arguments[0].scrollIntoView();", ACp.piDOBDayDrpDwn);

        ACp.piDOBDayDrpDwn.click();
        Select DOBDayDrpDwn = new Select(ACp.piDOBDayDrpDwn);
        DOBDayDrpDwn.selectByIndex(2);

        ACp.piDOBMonthDrpDwn.click();
        Select DOBMonDrpDwn = new Select(ACp.piDOBMonthDrpDwn);
        DOBMonDrpDwn.selectByIndex(2);

        ACp.piDOBYearDrpDwn.click();
        Select DOBYrDrpDwn = new Select(ACp.piDOBYearDrpDwn);
        DOBYrDrpDwn.selectByIndex(2);

        ACp.piSignForNewsletterChkBox.click();
        js.executeScript("arguments[0].scrollIntoView();", ACp.yaAddressLine2Txt);

        String yafirstName = faker.name().firstName();
        ACp.yaFirstNameTxt.click();
        ACp.yaFirstNameTxt.sendKeys(firstName);

        String yalastName = faker.name().lastName();
        ACp.yaLastNameTxt.click();
        ACp.yaLastNameTxt.sendKeys(lastName);

        String company = faker.company().name();
        ACp.yaCompanyTxt.click();
        ACp.yaCompanyTxt.sendKeys(company);

        String address = faker.address().fullAddress();
        ACp.yaAddressTxt.click();
        ACp.yaAddressTxt.sendKeys(address);

        String address_line_2 = faker.address().secondaryAddress();
        ACp.yaAddressLine2Txt.click();
        ACp.yaAddressLine2Txt.sendKeys(address_line_2);


        String city = faker.address().cityName();
        ACp.yaCityTxt.click();
        ACp.yaCityTxt.sendKeys(city);


        ACp.yaStateDrpDwn.click();
        Select yaStateDrpDwn = new Select(ACp.yaStateDrpDwn);
        yaStateDrpDwn.selectByIndex(2);

        String zip_code = "14523";
        ACp.yaZipCodeTxt.click();
        ACp.yaZipCodeTxt.sendKeys(zip_code);

        String add_information = faker.lorem().sentence(25);
        ACp.yaAdditionalInfoTxt.click();
        ACp.yaAdditionalInfoTxt.sendKeys(add_information);

        String home_phone = faker.phoneNumber().phoneNumber();
        ACp.yaHomePhoneTxt.click();
        ACp.yaHomePhoneTxt.sendKeys(home_phone);

        String mobile_number = faker.phoneNumber().cellPhone();
        ACp.yaMobilePhoneTxt.click();
        ACp.yaMobilePhoneTxt.sendKeys(mobile_number);

        String loginInputEmail = ACp.piEmailTxt.getText();
        String loginInputPassword = ACp.piPassTxt.getText();

        ACp.ClickOnRegisterBtn();

        String NewUserCreatedUrl = driver.getCurrentUrl();
        assertEquals("http://automationpractice.com/index.php?controller=my-account", NewUserCreatedUrl);

        driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");


        AddToCart ATCart = PageFactory.initElements(driver, AddToCart.class);
        Actions action = new Actions(driver);
        action.moveToElement(ATCart.navBarDress).perform();

        ATCart.navBarDressCasual.click();

        action.moveToElement(ATCart.navBarDressCasualHover).perform();
        ATCart.navBarDressCasualAddToCart.click();
        ATCart.ClosePopUP.click();

        js.executeScript("arguments[0].scrollIntoView();", ATCart.navBarTShirt);
        ATCart.navBarTShirt.click();
        ATCart.navBarTShirtSelectBlueColor.click();
        ATCart.navBarTShirtAddToCart.click();
        action.moveToElement(ATCart.navBarTShirtAddToCartContainer).perform();
        ATCart.navBarTShirtAddToCart.click();
        ATCart.ProceedToCheckout.click();
        ATCart.ProceedToCheckoutOne.click();
        ATCart.ProceedToCheckoutThree.click();
        ATCart.TermsAndCondition.click();
        ATCart.ProceedToCheckoutFour.click();
        ATCart.PayByCheck.click();











    }
}
