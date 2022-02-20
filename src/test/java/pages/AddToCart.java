package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class AddToCart {
    //Contents of Account creation page - personal info section
    public @FindBy(how = How.XPATH, using = "/html/body/div/div[1]/header/div[3]/div/div/div[6]/ul/li[2]/a")
    WebElement navBarDress;

    public @FindBy(how = How.XPATH, using = "/html/body/div/div[1]/header/div[3]/div/div/div[6]/ul/li[2]/ul/li[1]/a")
    WebElement navBarDressCasual;

    public @FindBy(how = How.XPATH, using = "/html/body/div/div[2]/div/div[3]/div[2]/ul/li/div/div[1]/div")
    WebElement navBarDressCasualHover;

    public @FindBy(how = How.XPATH, using = "/html/body/div/div[2]/div/div[3]/div[2]/ul/li/div/div[2]/div[2]/a[1]/span")
    WebElement navBarDressCasualAddToCart;

    public @FindBy(how = How.XPATH, using = "/html/body/div/div[1]/header/div[3]/div/div/div[6]/ul/li[3]/a")
    WebElement navBarTShirt;

    public @FindBy(how = How.XPATH, using = "/html/body/div/div[2]/div/div[3]/div[1]/div[1]/div[1]/form/div/div[2]/ul/li[2]/input")
    WebElement navBarTShirtSelectBlueColor;

    public @FindBy(how = How.XPATH, using = "/html/body/div/div[2]/div/div[3]/div[2]/ul/li/div/div[2]/div[2]/a[1]/span")
    WebElement navBarTShirtAddToCart;

    public @FindBy(how = How.XPATH, using = "/html/body/div/div[2]/div/div[3]/div[2]/ul/li/div/div[1]/div")
    WebElement navBarTShirtAddToCartContainer;

    public @FindBy(how = How.XPATH, using = "/html/body/div/div[1]/header/div[3]/div/div/div[4]/div[1]/div[2]/div[4]/a")
    WebElement ProceedToCheckout;

    public @FindBy(how = How.XPATH, using = "/html/body/div/div[2]/div/div[3]/div/p[2]/a[1]")
    WebElement ProceedToCheckoutOne;

    public @FindBy(how = How.XPATH, using = "/html/body/div/div[2]/div/div[3]/div/form/p/button")
    WebElement ProceedToCheckoutThree;

    public @FindBy(how = How.XPATH, using = "/html/body/div/div[2]/div/div[3]/div/div/form/div/p[2]/div/span")
    WebElement TermsAndCondition;


    public @FindBy(how = How.XPATH, using = "/html/body/div/div[2]/div/div[3]/div/div/form/p/button")
    WebElement ProceedToCheckoutFour;

    public @FindBy(how = How.XPATH, using = "/html/body/div/div[2]/div/div[3]/div/div/div[3]/div[2]/div/p/a")
    WebElement PayByCheck;

    public @FindBy(how = How.XPATH, using = "/html/body/div/div[1]/header/div[3]/div/div/div[4]/div[1]/div[1]/span")
    WebElement ClosePopUP;


}
