package com.orange.co.definitions;

import com.orange.co.steps.inicioSesion.InicioSesionStep;
import com.orange.co.steps.inicioStep.InicioStep;
import com.orange.co.steps.recruitmentStep.RecruitmentStep;
import com.orange.co.utilities.WebOrange;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class OrageReclutamientoDef {

    @Steps(shared = true)
    WebOrange url;

    @Steps(shared = true)
    InicioSesionStep inicioSesion;

    @Steps(shared = true)
    InicioStep inicio;

    @Steps(shared = true)
    RecruitmentStep recruitment;

    @Given("el usuario ingrese al sitio web")
    public void navegarA(){
        url.navegarA("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
    }

    @And("inicie sesion correctamente")
    public void iniciarSesion(){
        inicioSesion.ingresarNombre("Admin");
        inicioSesion.ingresarContrasena("admin123");
        inicioSesion.clicBotonInicioSesion();
    }

    @When("ingrese al modulo recruitment")
    public void irModuloRecruitment(){
        inicio.clicBotonRecruitment();
    }

    @And("doy clic al boton Add")
    public void clicBotonAdd(){
        recruitment.clicBotonAdd();
    }

    @And("realizo los pasos para contratar un candidato")
    public void procesoRecruitment(){
        recruitment.ingresarNombre("Juan");
        recruitment.ingresarApellido("Perez");
        recruitment.clicListaVacantes();
    }

}


