package pages;

import maps.CursoMap;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class CursoPage {
    WebDriver driver;
    CursoMap cursoMap;

    public CursoPage(WebDriver driver) {

        this.driver = driver;
        cursoMap = new CursoMap();
        PageFactory.initElements(driver,cursoMap);
    }
    public String gettitulo2() {

        return cursoMap.titulo.getText();
    }
}
