package maps;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginMap {

    @FindBy(css = "#menuUser")
    public WebElement btnlogin;

    @FindBy(css =".closeBtn")
    public WebElement brnfechar;

    @FindBy(css = ".PopUp")
    public WebElement divFechaModal;

    @FindBy(css = "*[name='username']")
    public WebElement inpUserName;

    @FindBy(css = "*[name='password']")
    public WebElement inpUserpassword;

    @FindBy(css = "*[name='remember_me']")
    public WebElement inpRemember;

    @FindBy(css ="#sign_in_btnundefined")
    public WebElement btnSigIn;

    @FindBy( linkText = "CREATE NEW ACCOUNT")
    public WebElement linkCreateAccount;

    @FindBy(css =".loader")
    public WebElement divLoader;

    @FindBy(css = ".containMiniTitle")
    public WebElement textLogado;

    @FindBy(xpath ="//label[contains(text(),'Incorrect')]")
    public WebElement textErroLogin;

}
