package steps;

import core.Driver;
import enun.Browser;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import org.junit.Assert;
import pages.LoginPage;
import pages.NewAccountPage;

import java.io.IOException;
import java.util.Map;

public class LoginSteps {
    LoginPage loginPage;
    NewAccountPage newAccountPage;
    String username;


    @Before
    public void inicializaNavagador(Scenario cenario)
    {
        new Driver(Browser.CHROME);
        Driver.setNomeCenario(cenario.getName());
        Driver.criaDiretorio();


    }

    @After
    public void finalizaNavegador(Scenario cenario) throws IOException {
        if(cenario.isFailed()){
            Driver.printScreen("erro no cenario");


       }
        Driver.getDriver().quit();
    }



    @Dado("que a modal esteja sendo exibida")
    public void queAModalEstejaSendoExibida() {
       Driver.getDriver().get("https://www.advantageonlineshopping.com/#/");
        loginPage = new LoginPage();
        loginPage.clickBtnLogin();
        loginPage.visibilityofbtnFechar();
        loginPage.aguardarLoader();
    }
    @Quando("for realizado um clique fora da modal")
    public void forRealizadoUmCliqueForaDaModal() {
        loginPage.clickDivFechaModal();


    }
    @Entao("a janela modal deve ser fechada")
    public void aJanelaModalDeveSerFechada() throws Exception {
try{
    loginPage.invisibilityOfBtnFechar();
}catch(Exception e){
    throw new Exception("A Janela Modal Nao Foi Fechada");
}

    }

    @Quando("for realizado um clique no icone de fechar da modal")
    public void forRealizadoUmCliqueNoIconeDeFecharDaModal() {
        loginPage.clickBtnFechar();

    }

    @Quando("for realizado um clique no link Creat New Account")
    public void forRealizadoUmCliqueNoLinkCreatNewAccount() {
loginPage.clicklinkCreateAccount();
    }

    @Entao("a pagina Creat Account deve ser exibida")
    public void aPaginaCreatAccountDeveSerExibida() {
newAccountPage = new NewAccountPage();
Assert.assertEquals("CREATE ACCOUNT",newAccountPage.gettextNewAccount());

    }

    @Quando("os campos de login sejam preenchidos da seguinte forma")
    public void osCamposDeLoginSejamPreenchidosDaSeguinteForma(Map<String, String>map) throws IOException {
         username = map.get("usuario");
        String password = map.get("senha");
        boolean remember = Boolean.parseBoolean(map.get("remember"));
        loginPage.setInpUserName(username);
        loginPage.setInpUserpassword(password);
        if (remember)
        loginPage.clickinpRemember();
        Driver.printScreen("preenchimento dos campos de login");


    }

    @Quando("for realizado o clique no botao sign in")
    public void forRealizadoOCliqueNoBotaoSignIn() {
        loginPage.clickBtnSigIn();

    }

    @Entao("deve ser possivel logar no sistema")
    public void deveSerPossivelLogarNoSistema() throws IOException {

        Assert.assertEquals(username,loginPage.getTextLogado());
Driver.printScreen("logado no sistema");
    }

    @Entao("os sistema devera exibir uma mensagem de erro")
    public void osSistemaDeveraExibirUmaMensagemDeErro() {
        Assert.assertEquals("Incorrect user name or password.",loginPage.getTextErroLogin());

    }

    @Entao("o botao sign in deve permanecer desabilitado")
    public void oBotaoSignInDevePermanecerDesabilitado() {
        boolean enable = loginPage.isbtnSigIn();
        Assert.assertFalse(enable);


    }

}
