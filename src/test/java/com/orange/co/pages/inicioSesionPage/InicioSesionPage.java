package com.orange.co.pages.inicioSesionPage;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class InicioSesionPage extends PageObject {

    @FindBy(xpath = "//input[@name='username']")
    protected WebElementFacade txt_usuario;

    @FindBy(xpath = "//input[@name='password']")
    protected WebElementFacade txt_contrasena;

    @FindBy(xpath = "//button[@class='oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']")
    protected WebElementFacade btn_inicioSesion;


}
