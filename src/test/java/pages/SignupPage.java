package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class SignupPage {

    //Contents of SignIn/Up page
    public @FindBy(how = How.XPATH, using = "/html/body/div/div[2]/div/div[3]/div/div/div[1]/form/div/div[2]/input")
    WebElement EmailAddressTxt ;

    @FindBy(how = How.XPATH, using = "/html/body/div/div[2]/div/div[3]/div/div/div[1]/form/div/div[3]/button/span")
    WebElement CreateAnAccountBtn;

    public void ClickOnCreatAccountBtn() { CreateAnAccountBtn.click(); }

}
