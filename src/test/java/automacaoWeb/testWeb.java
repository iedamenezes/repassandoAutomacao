package automacaoWeb;

import core.Driver;
import enun.Browser;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.CursoPage;
import pages.PrincipalPage;

import static org.junit.Assert.assertEquals;

public class testWeb {
    WebDriver driver;
    Driver driverWeb;
    PrincipalPage principalPage;
    CursoPage cursoPage;

    @Before
    public void inicializaTestes(){
        driverWeb = new Driver(Browser.CHROME);
        driver = Driver.getDriver();

        principalPage = new PrincipalPage(driver);
        cursoPage = new CursoPage(driver);


    }
    @Test
    public void primeiroTeste(){


        String titulo = principalPage.getTitulo();
        assertEquals("Porque Tempo É Conhecimento.",titulo);




    }



    @Test
    public void segundoTeste(){
        principalPage.clickBotao();

        String titulo = cursoPage.gettitulo2();

        assertEquals("Conheça todos os nossos cursos.",titulo);



    }





    @After
    public void finalizaTestes(){
        driver.quit();
    }
}
