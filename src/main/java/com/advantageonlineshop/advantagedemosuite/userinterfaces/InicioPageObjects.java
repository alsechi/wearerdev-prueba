package com.advantageonlineshop.advantagedemosuite.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class InicioPageObjects {

    public static final Target INICIO_BUTTON = Target.the("Inicio de sesion button").located(By.id("LoginPanel0_LoginButton"));
    public static final Target NORTHWIND_ITEM_MENU = Target.the("El espacio northwind del menu").locatedBy("//*[@id=\"nav_menu1_2\"]/li[1]/a");
    public static final Target PEDIDOS_ITEM_MENU = Target.the("User Login Modal Component").locatedBy("//*[@id=\"nav_menu1_2_1\"]/li[2]/a");
    //public static final Target CREATE_NEW_ACCOUNT_BUTTON = Target.the("Create new account button").locatedBy(".create-new-account.ng-scope");
}
