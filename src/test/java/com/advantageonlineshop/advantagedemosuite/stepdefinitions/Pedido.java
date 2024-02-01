package com.advantageonlineshop.advantagedemosuite.stepdefinitions;

import com.advantageonlineshop.advantagedemosuite.tasks.pedido.NavegarPedido;
import com.advantageonlineshop.advantagedemosuite.tasks.pedido.NuevoPedido;
import com.advantageonlineshop.advantagedemosuite.tasks.signUp.*;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

import static com.advantageonlineshop.advantagedemosuite.userinterfaces.AdvantageDemoHomePage.advantageDemoHomePage;
import static com.advantageonlineshop.advantagedemosuite.userinterfaces.InicioPageObjects.INICIO_BUTTON;
import static com.advantageonlineshop.advantagedemosuite.userinterfaces.RegisterPageObjects.*;
import static com.advantageonlineshop.advantagedemosuite.userinterfaces.StartsharpHomePage.startsharpHomePage;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class Pedido {
    @Managed(driver = "chrome")
    private WebDriver hisBrowser;

    @Before
    public void set_the_stage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^como (.*) ingreso a la pagina$")
    public void ingresoALaPagina() throws Exception {
        theActorInTheSpotlight().attemptsTo(Open.browserOn(startsharpHomePage()));
        theActorInTheSpotlight().attemptsTo(Click.on(INICIO_BUTTON));
    }

    @And("^al modulo pedidos$")
    public void alModuloDePedido() throws Exception {
        theActorInTheSpotlight().attemptsTo(NavegarPedido.navegarPedido());
    }


    @When("^Creo un nuevo pedido$")
    public void creoNuevoPedido() throws Exception {
         theActorInTheSpotlight().attemptsTo(NuevoPedido.nuevoPedido());

    }

}
