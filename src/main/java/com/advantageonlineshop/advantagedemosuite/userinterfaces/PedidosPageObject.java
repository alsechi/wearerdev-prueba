package com.advantageonlineshop.advantagedemosuite.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PedidosPageObject {

    public static final Target NUEVO_PEDIDO_BUTTON = Target.the("Boton de nuevo pedido ").locatedBy("//*[@id=\"GridDiv\"]/div[2]/div[2]/div[1]");
    //NUEVO PEDIDO
    public static final Target SELECION_CLIENTE_FORM = Target.the("Selecionar cliente de pedido").locatedBy("/html/body/main/section/div[2]/div[2]/div[2]/form/div/div/div[1]/div[2]/div[1]/div[2]/div[1]/a/span[1]");
    public static final Target CLICK_CLIENTE_FORM = Target.the("buscar cliente de pedido").locatedBy("/html/body/main/section/div[2]/div[2]/div[2]/form/div/div/div[1]/div[2]/div[1]/div[2]/label");;
    //public static final Target RESULTADO_CLIENTE_FORM  = Target.the("Resultado de busqueda de cliente").locatedBy("///html/body/div[14]/ul/li[1]/div");
    public static final Target FECHA_PEDIDO_FORM = Target.the("Fecha de pedido").locatedBy("/html/body/main/section/div[2]/div[2]/div[2]/form/div/div/div[1]/div[2]/div[1]/div[3]/input");
    public static final Target FECHA_REQUERIDA_FORM = Target.the("Fecha requerida").located(By.id("Serenity_Demo_Northwind_OrderDialog51_RequiredDate"));
    public static final Target AGREGAR_DETALLE_BOTTON  = Target.the("Resultado de busqueda de cliente").locatedBy("/html/body/main/section/div[2]/div[2]/div[2]/form/div/div/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div/div[1]");
    public static final Target GUARDAR_PEDIDO_BOTTON  = Target.the("guardar pedido").locatedBy("//*[@id=\"Serenity_Demo_Northwind_OrderDialog15_Toolbar\"]/div/div[1]");
    //DETALLE//
    public static final Target SELECION_PRODUCTO_FORM = Target.the("Selecionar producto de pedido").locatedBy("/html/body/div[11]/div/div/div[2]/div[2]/form/div/div/div/div[1]/div[1]/a/span[1]");
    public static final Target PRODUCTO_ITEM = Target.the("producto selecionado").locatedBy("/html/body/div[14]/ul/li[1]/div");
    public static final Target GUARDAR_DETALLE_BOTTON  = Target.the("guardar producto").locatedBy("//*[@id=\"Serenity_Demo_Northwind_OrderDetailDialog83_Toolbar\"]/div/div[1]");

}
