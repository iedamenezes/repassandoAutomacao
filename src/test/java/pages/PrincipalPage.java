package pages;

import maps.PrincipalMap;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class PrincipalPage {
    WebDriver driver;
    PrincipalMap principalMap;

    public PrincipalPage(WebDriver driver) {

        this.driver = driver;
        principalMap =new PrincipalMap();
        PageFactory.initElements(driver,principalMap);
    }



    public String getTitulo() {

       return principalMap.titulo.getText();
    }
    public void clickBotao() {

        principalMap.btnbotao.click();
    }
}
