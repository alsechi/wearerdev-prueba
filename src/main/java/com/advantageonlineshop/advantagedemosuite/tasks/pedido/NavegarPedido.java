package com.advantageonlineshop.advantagedemosuite.tasks.pedido;

import com.advantageonlineshop.advantagedemosuite.tasks.signUp.AcceptPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Clear;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.EnterValue;

import static com.advantageonlineshop.advantagedemosuite.userinterfaces.InicioPageObjects.NORTHWIND_ITEM_MENU;
import static com.advantageonlineshop.advantagedemosuite.userinterfaces.InicioPageObjects.PEDIDOS_ITEM_MENU;
import static com.advantageonlineshop.advantagedemosuite.userinterfaces.PedidosPageObject.*;
import static com.advantageonlineshop.advantagedemosuite.userinterfaces.RegisterPageObjects.ALLOW_OFFERS_CHECKBOX;
import static com.advantageonlineshop.advantagedemosuite.userinterfaces.RegisterPageObjects.CONDITIONS_CHECKBOX;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class NavegarPedido implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(NORTHWIND_ITEM_MENU),
                Click.on(PEDIDOS_ITEM_MENU)

        );
    }

    public static NavegarPedido navegarPedido(){return instrumented(NavegarPedido.class);}
}
