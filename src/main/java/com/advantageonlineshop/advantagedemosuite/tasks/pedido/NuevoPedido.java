package com.advantageonlineshop.advantagedemosuite.tasks.pedido;


import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Clear;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.interactions.Keyboard;

import java.awt.*;
import java.awt.event.KeyEvent;

import static com.advantageonlineshop.advantagedemosuite.userinterfaces.InicioPageObjects.NORTHWIND_ITEM_MENU;
import static com.advantageonlineshop.advantagedemosuite.userinterfaces.InicioPageObjects.PEDIDOS_ITEM_MENU;
import static com.advantageonlineshop.advantagedemosuite.userinterfaces.PedidosPageObject.*;
import static com.advantageonlineshop.advantagedemosuite.userinterfaces.PedidosPageObject.GUARDAR_PEDIDO_BOTTON;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class NuevoPedido implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {



        actor.attemptsTo(
                Click.on(NUEVO_PEDIDO_BUTTON),
                Click.on(SELECION_CLIENTE_FORM));
               // Enter.theValue("ana").into(BUSCADOR_CLIENTE_FORM),
                //Click.on(RESULTADO_CLIENTE_FORM),
        try {
            Robot robot = new Robot();

            robot.keyPress(KeyEvent.VK_ENTER); // Simula presionar la tecla
            robot.keyRelease(KeyEvent.VK_ENTER); // Simula soltar la tecla

        } catch (AWTException e) {
            throw new RuntimeException("Error");
        }
        actor.attemptsTo(
                //Clear.field(FECHA_PEDIDO_FORM),
                Enter.theValue("01/03/2024").into(FECHA_PEDIDO_FORM),
                Click.on(CLICK_CLIENTE_FORM),
                Click.on(AGREGAR_DETALLE_BOTTON),
                Click.on(SELECION_PRODUCTO_FORM),
                Click.on(PRODUCTO_ITEM),
                Click.on(GUARDAR_DETALLE_BOTTON),
                Click.on(GUARDAR_PEDIDO_BOTTON)
        );
    }

    public static NuevoPedido nuevoPedido(){return instrumented(NuevoPedido.class);}
}
