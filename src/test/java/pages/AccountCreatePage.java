package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class AccountCreatePage {

    //Contents of Account creation page - personal info section
    public @FindBy(how = How.XPATH, using = "/html/body/div/div[2]/div/div[3]/div/div/form/div[1]/div[1]/div[1]/label/div/span/input")
    WebElement RadioBtnMr;

    public @FindBy(how = How.XPATH, using = "/html/body/div/div[2]/div/div[3]/div/div/form/div[1]/div[1]/div[2]/label/div/span/input")
    WebElement RadioBtnMrs;

    public @FindBy(how = How.XPATH, using = "/html/body/div/div[2]/div/div[3]/div/div/form/div[1]/div[2]/input")
    WebElement piFirstNameTxt;

    public @FindBy(how = How.XPATH, using = "/html/body/div/div[2]/div/div[3]/div/div/form/div[1]/div[3]/input")
    WebElement piLastNameTxt;

    public @FindBy(how = How.XPATH, using = "/html/body/div/div[2]/div/div[3]/div/div/form/div[1]/div[4]/input")
    WebElement piEmailTxt;

    public @FindBy(how = How.XPATH, using = "/html/body/div/div[2]/div/div[3]/div/div/form/div[1]/div[5]/input")
    WebElement piPassTxt;

    public @FindBy(how = How.XPATH, using = "/html/body/div/div[2]/div/div[3]/div/div/form/div[1]/div[6]/div/div[1]/div/select")
    WebElement piDOBDayDrpDwn;

    public @FindBy(how = How.XPATH, using = "/html/body/div/div[2]/div/div[3]/div/div/form/div[1]/div[6]/div/div[2]/div/select")
    WebElement piDOBMonthDrpDwn;

    public @FindBy(how = How.XPATH, using = "/html/body/div/div[2]/div/div[3]/div/div/form/div[1]/div[6]/div/div[3]/div/select")
    WebElement piDOBYearDrpDwn;

    public @FindBy(how = How.XPATH, using = "/html/body/div/div[2]/div/div[3]/div/div/form/div[1]/div[7]/div/span/input")
    WebElement piSignForNewsletterChkBox;

    public @FindBy(how = How.XPATH, using = "/html/body/dFirstNameTxtiv/div[2]/div/div[3]/div/div/form/div[1]/div[8]/div/span/input")
    WebElement piSignForSpclOffrChkBox;

    //Contents of address section
    public @FindBy(how = How.XPATH, using = "/html/body/div/div[2]/div/div[3]/div/div/form/div[2]/p[1]/input")
    WebElement yaFirstNameTxt;

    public @FindBy(how = How.XPATH, using = "/html/body/div/div[2]/div/div[3]/div/div/form/div[2]/p[2]/input")
    WebElement yaLastNameTxt;

    public @FindBy(how = How.XPATH, using = "/html/body/div/div[2]/div/div[3]/div/div/form/div[2]/p[3]/input")
    WebElement yaCompanyTxt;

    public @FindBy(how = How.XPATH, using = "/html/body/div/div[2]/div/div[3]/div/div/form/div[2]/p[4]/input")
    WebElement yaAddressTxt;

    public @FindBy(how = How.XPATH, using = "/html/body/div/div[2]/div/div[3]/div/div/form/div[2]/p[5]/input")
    WebElement yaAddressLine2Txt;

    public @FindBy(how = How.XPATH, using = "/html/body/div/div[2]/div/div[3]/div/div/form/div[2]/p[6]/input")
    WebElement yaCityTxt;

    public @FindBy(how = How.XPATH, using = "/html/body/div/div[2]/div/div[3]/div/div/form/div[2]/p[7]/div/select")
    WebElement yaStateDrpDwn;

    public @FindBy(how = How.XPATH, using = "/html/body/div/div[2]/div/div[3]/div/div/form/div[2]/p[8]/input")
    WebElement yaZipCodeTxt;

    public @FindBy(how = How.XPATH, using = "/html/body/div/div[2]/div/div[3]/div/div/form/div[2]/p[9]/div/select")
    WebElement yaCountryDrpDwn;

    public @FindBy(how = How.XPATH, using = "/html/body/div/div[2]/div/div[3]/div/div/form/div[2]/p[10]/textarea")
    WebElement yaAdditionalInfoTxt;

    public @FindBy(how = How.XPATH, using = "/html/body/div/div[2]/div/div[3]/div/div/form/div[2]/p[12]/input")
    WebElement yaHomePhoneTxt;

    public @FindBy(how = How.XPATH, using = "/html/body/div/div[2]/div/div[3]/div/div/form/div[2]/p[13]/input")
    WebElement yaMobilePhoneTxt;

    public @FindBy(how = How.XPATH, using = "/html/body/div/div[2]/div/div[3]/div/div/form/div[2]/p[14]/input")
    WebElement yaFutureReferenceAddressTxt;

    public @FindBy(how = How.XPATH, using = "/html/body/div/div[2]/div/div[3]/div/div/form/div[4]/button/span")
    WebElement RegisterBtn;

    public void ClickOnRadiotBtnMr() { RadioBtnMr.click(); }
    public void ClickOnRadiotBtnMrs() { RadioBtnMrs.click(); }
    public void ClickOnRegisterBtn() { RegisterBtn.click(); }

}
