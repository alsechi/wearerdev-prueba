package com.advantageonlineshop.advantagedemosuite.userinterfaces;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://demo.serenity.is/Account/Login/?ReturnUrl=%2F")
public class StartsharpHomePage extends PageObject{

    public static StartsharpHomePage startsharpHomePage(){ return new StartsharpHomePage();}

}
