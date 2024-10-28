package com.orange.co.steps.inicioSesion;

import com.orange.co.pages.inicioSesionPage.InicioSesionPage;
import net.thucydides.core.annotations.Step;

public class InicioSesionStep extends InicioSesionPage {

    @Step("Ingresar usuario")
    public void ingresarNombre(String nombre){

        txt_usuario.sendKeys(nombre);

    }

    @Step("Ingresar contraseña")
    public void ingresarContrasena(String contrasena){

        txt_contrasena.sendKeys(contrasena);

    }

    @Step("Click en el boton inicio sesion")
    public void clicBotonInicioSesion(){

        btn_inicioSesion.click();

    }
}
