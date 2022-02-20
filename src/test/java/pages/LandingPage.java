package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LandingPage {

    //Contents of landing or home page
    @FindBy(how = How.XPATH, using = "/html/body/div/div[1]/header/div[2]/div/div/nav/div[1]/a")
    WebElement SignInBtn;

    public void ClickOnContent() { SignInBtn.click(); }

}
