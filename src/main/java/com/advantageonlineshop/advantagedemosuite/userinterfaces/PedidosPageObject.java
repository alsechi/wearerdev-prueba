package com.advantageonlineshop.advantagedemosuite.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PedidosPageObject {

    public static final Target NUEVO_PEDIDO_BUTTON = Target.the("Boton de nuevo pedido ").locatedBy("//*[@id=\"GridDiv\"]/div[2]/div[2]/div[1]");
    //NUEVO PEDIDO
    public static final Target SELECION_CLIENTE_FORM = Target.the("Selecionar cliente de pedido").located(By.id("select2-chosen-300"));
    public static final Target BUSCADOR_CLIENTE_FORM = Target.the("buscar cliente de pedido").located(By.id("s2id_autogen300_search"));
    public static final Target RESULTADO_CLIENTE_FORM  = Target.the("Resultado de busqueda de cliente").locatedBy("//*[@id=\"select2-results-300\"]/li[1]");
    public static final Target FECHA_PEDIDO_FORM = Target.the("Fecha de pedido").located(By.id("Serenity_Demo_Northwind_OrderDialog51_OrderDate"));
    public static final Target FECHA_REQUERIDA_FORM = Target.the("Fecha requerida").located(By.id("Serenity_Demo_Northwind_OrderDialog51_RequiredDate"));
    public static final Target AGREGAR_DETALLE_BOTTON  = Target.the("Resultado de busqueda de cliente").locatedBy("//*[@id=\"Serenity_Demo_Northwind_OrderDialog51_DetailList\"]/div[1]/div/div[1]/span");
    public static final Target GUARDAR_PEDIDO_BOTTON  = Target.the("guardar pedido").locatedBy("//*[@id=\"Serenity_Demo_Northwind_OrderDialog15_Toolbar\"]/div/div[1]");
    //DETALLE//
    public static final Target SELECION_PRODUCTO_FORM = Target.the("Selecionar producto de pedido").located(By.id("select2-chosen-1046"));
    public static final Target PRODUCTO_ITEM = Target.the("producto selecionado").located(By.id("select2-result-label-1514"));//producto selecionado quemado solo por ambnistos de velocidad
    public static final Target GUARDAR_DETALLE_BOTTON  = Target.the("guardar producto").locatedBy("//*[@id=\"Serenity_Demo_Northwind_OrderDetailDialog83_Toolbar\"]/div/div[1]");

}
