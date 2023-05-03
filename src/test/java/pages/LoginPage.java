package pages;

import core.Driver;
import maps.LoginMap;
import org.openqa.selenium.support.PageFactory;



public class LoginPage {
    LoginMap loginMap;

    public LoginPage() {
        loginMap = new LoginMap();
        PageFactory.initElements(Driver.getDriver(), loginMap);

    }

    public void clickBtnLogin() {
        Driver.visibilityOf(loginMap.btnlogin);
        loginMap.btnlogin.click();
    }

    public void clickBtnFechar() {
        loginMap.brnfechar.click();
    }

    public void clickDivFechaModal() {
        loginMap.divFechaModal.click();
    }

    public void setInpUserName(String userName) {
        if (userName != null) {
            loginMap.inpUserName.sendKeys(userName);
        }

}
    public void setInpUserpassword(String password){
        if(password != null){
            loginMap.inpUserpassword.sendKeys(password);
        }

    }
    public void clickinpRemember(){ loginMap.inpRemember.click();   }
    public void clickBtnSigIn(){ loginMap.btnSigIn.click();   }
    public void clicklinkCreateAccount(){
        loginMap.linkCreateAccount.click();
    }
    public boolean isbtnSigIn(){
        return loginMap.btnSigIn.isEnabled();

    }
    public void visibilityofbtnFechar() {
        Driver.visibilityOf(loginMap.brnfechar);

            }
 public void invisibilityOfBtnFechar(){
        Driver.invisibilityOf(loginMap.brnfechar);
 }
 public void aguardarLoader(){
        Driver.attributeChange(loginMap.divLoader, "display","none");
 }
 public String getTextLogado(){
        Driver.visibilityOf(loginMap.textLogado);
        return loginMap.textLogado.getText();

 }
 public String getTextErroLogin(){
        Driver.visibilityOf(loginMap.textErroLogin);
        return loginMap.textErroLogin.getText();

 }
}
