package maps;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PrincipalMap {
    @FindBy(xpath = "//html/body/div/div/div/div/div/section[2]/div[3]/div/div/div/div/div[1]/div/h4")
   public WebElement titulo;

   @FindBy(xpath = "//section[2]/div[3]//a")
   public WebElement btnbotao;
}
